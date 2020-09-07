package com.aaa.util.valiPhone;

import com.alibaba.fastjson.JSONObject;
import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.gson.JsonObject;

import java.util.HashMap;
import java.util.Map;

/*
pom.xml
<!-- 阿里云sdk -->
        <dependency>
            <groupId>com.aliyun</groupId>
            <artifactId>aliyun-java-sdk-core</artifactId>
            <version>4.4.6</version>
        </dependency>
        <dependency>
            <groupId>com.aliyun</groupId>
            <artifactId>aliyun-java-sdk-ecs</artifactId>
            <version>4.17.6</version>
        </dependency>
        <dependency>
            <groupId>com.alibaba</groupId>
            <artifactId>fastjson</artifactId>
            <version>1.2.32</version>
        </dependency>
*/
//注册验证
public class SendSms {

    //生成6位数随机验证码
    public static Integer setCode(){
        int i = (int) ((Math.random() * 9 + 1) * 100000);
        return i;
    }

    public static Map<String, Object> verify(String phone){
        DefaultProfile profile = DefaultProfile.getProfile("cn-zhengzhou", "LTAI4GB4zyMh89k2eYrto84v", "JexSyaadr8ZtrL8K8e13YkcJeS8Npd");
        IAcsClient client = new DefaultAcsClient(profile);
        CommonRequest request = new CommonRequest();
        request.setSysMethod(MethodType.POST);
        request.setSysDomain("dysmsapi.aliyuncs.com");
        request.setSysVersion("2017-05-25");
        request.setSysAction("SendSms");
        request.putQueryParameter("RegionId", "cn-zhengzhou");
        //手机号
        request.putQueryParameter("PhoneNumbers", phone);
        request.putQueryParameter("SignName", "东临");
        request.putQueryParameter("TemplateCode", "SMS_198672386");
        //获取随机数
        Integer code = setCode();
        JsonObject param = new JsonObject();
        param.addProperty("code",code);
        //发送随机码
        request.putQueryParameter("TemplateParam", String.valueOf(param));
        try {
            CommonResponse response = client.getCommonResponse(request);
            String data = response.getData();
            JSONObject jsonObject = JSONObject.parseObject(data);
            jsonObject.put("codeResult",code);
            return jsonObject;

        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
        return null;
    }


}
