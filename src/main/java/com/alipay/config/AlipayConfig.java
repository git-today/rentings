package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {

//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016101700705977";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCbWDWSZRDyphxfnJxHkL15nCjftcRhboZ9YXpKWnyb0akaCsKDne9RmylBee6d5aLHYPy88QL/+ZuiKwGRmVLeeWzZXnCOw7pzxdmkp0X7XyiIn5l/IDSuyisu1GBIgk7kcipMzVHVvWxtfJIsI5oEb5BJ6ZeohdtHBw9i6aX/YOilNM62xlN9zPAY8Xi0plTzuVNSSUgLAgdTzzv8JKdijwDCzInZN1qtKn64Tlzhw9sks+cWV4hIB7+lD2JBqPPBuNtqpHfhPbc5+DHjgUJgRUk0z65yVTCwKrbHZ2u+v8j4xha1PL2T6NU+ZwuFB+PNNtVdi2QG5hHyCU1eEMXVAgMBAAECggEAZwAf1UeJ6znUyliPDqyb1UyDlYFyCqA8MFo3uaExyidEFm5X9uj7S4Kz4iQ04SDnw4c9TRIIySz50pbtXVrqJXUhhScnPqHsuOLQomn+7uNzftND9ZSnGdYWt+A9TxaHtNU10uK4hh4pDJdyXC3m61YFt9xYoHbQo9G8k/sUA7V2UqKn940vcFWedISDL5Q6zHxL+mXY5wXM9hter5obKT4lj9n5ED/op34HaZm6ID8Df70RUIU5UNvRyY3L0hICOArBSsVmHzwoVD3YtDhpIH9OfBBQokEaAcyrnrCVU6iFlid1okjlh2VMxvwr4Gh88CXbV/X8EHPyQeGUI9yfgQKBgQDZvoiJFXoGtkThUxSTi8SCfK6+4RdjmnrUHWfF/9l1+cs2fDQJytBa/bgIzclD5r174e9EIi36VPql2fGZMVjPxg4gkEbX3QmtcWzpfEpwfH5bpyvMyFt7GOwMUeLCbQpfEUL32u9MCH1yycRYeuAstuR3d/EMO+l1XFnEJFcphQKBgQC2oyEjyg8Ya6UMyulyAg/dv52TlviJ9L9/Tg/FMa0H8DuvVDsbLCvSRFzwt11zaXfQ9U5eXqxytSaPIMQuv4VcWcG+xIFGHJRsGEaVuFSiNky2mmJawAix+uLS+Kg1ltyJSgUnfaovbkzCurZ0JBAYUDFs+sq73BhR8XAEG/g0EQKBgQCWlzR8glLzg2ld4ISRio9so2iDcM8pPrSGMJQNluXBtvF5DCs9PnwdAe4egJwajuErZVWB7JWZ1N3IiFOT3FIM2G/6y22Da0Z/IrvtOt2MsDz/jD05krPaDaFq39MRHjKXDywemNb44cJI+gwGGW0i35ZgnZ4jFOhgF2+pvGxftQKBgBQDCeWPBVpqqRoevbeVTEHC9jQuzaroG3eKiSXVTJ1bEF8kvpk6nM6cWQazQNUdkFhgGKc0fnbPLJtwPq7Uo3s8BoOtqnCRPx4dBtbu7K8dfghgIDjLY+iEkggF4QCGOEH+z1PFbDloP5byuH0/WlgfqVrEnCQ7eJq59skse2TRAoGATUzy/96574igz4XJjHbvqP9Qzc1du2VZcwez/Zop7yTjnEw6UHo0ZEGcDbDTNu0lpj+Fz19u8ShuHNa0tLV/6JSocOF4EX2W0leA5amp5nkewfGWuupI59YZQPQAJ0iAMW8IQ+vDvoctv1BzF11O8tKc+6hLKTHR3sdXL1jCCBs=";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAx7kVce6Z/DnmmDosHCHOJAwnsBsQeKoz6niXoQywf+wgMvQEHA3u4en3Ma6iTkCowaB1Lfg1N7DgiEpxAOuwptsqPX8bQSYid844F5yO8wajS24A/jrbPjC/R9++cXE3xMas9xz3Ixvz9EWZZYe2wIBHXFoZS3qcBAxRg6B9VqxMXxCxrYdLNUqN3D/X7WTN06YmypfOMMNexao80KkKrT5e7l/7SAqaPgzk0vLalwARp/CC4ndJ7CRZQZarGBRuBndUe5/tyK6HaHYdwRGvgnPYt1r1SYItQ5eXYcFXGxFzfdnh2RR0jFAwsZX3qTNWzP7WlPwBB7LO6NZd4LNcDQIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://localhost:8080/zhotel/notify_url.html";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://localhost:8090/renting/user/show";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

