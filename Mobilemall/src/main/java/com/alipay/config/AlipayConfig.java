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
	public static String app_id = "2021000121600602";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQC6GNRGRrgjmrLLzlFejSxv3efrsO23Ls95iFhTlGxgOEZ6tFBJOBpaIfhwBl+NkCM05izpVVSV03Sp5Mo21LYw+/bv++WHbwQ1cZswYY0kxrMCBqTD8tyKjHpeKxpxY3clVNjX64hUwrBUFa7VEUn06gsVkulxpqNbeFIS+lOWchgK/P7qS4FlTHLb7QvemAomXUq27I8wgx6S2NVup3sZ+8I4r+CQeEKxxliY3aDEgu/KS3q6BWwOjCHvpUNRx7JeLl0Fkx1OV/Psczb+zAH0oT1rq7PH4xgTLACnAEosLMYCzk4xsV4uXmEHldUGTl8SVP3A1hNTIJfQb9MHQJVxAgMBAAECggEAQ4iVKDerxUfzkKB7yOtEcAhAjLi1W5/CLSF8pEAdoEFr2kWrSRbyATmIteaqMG5ZSG4raDXOL10AXlMnywQgZeBaObbZEfAIv/hNUB5moSz2c0rD6lQtEp5uHdRYkUN+Tm7fDmRsIg5Q/QKtYqcWhqmUgizBSLwnVh9w8XAke1inLf+fkWgmbwTQL1EKBYm01zVu21b+uPeioEqrDHidIOhne1YwLblhA3h4xUxRqFbPH/U0+HmU2JpKc8i+xZZkNBK/VV3+5+BgWk7/w4K8rZZZ75y5ULz+3gmeIh+3WG8UgV0ARnMt9aNw0QPPp3Lsv4u480p58N+D6n9jgys//QKBgQDu6vZvNqN9gvrKqEsnOClWGDWIPZX1AhOs9OX8Q5RgYjWelJTuyJ9YqBiQYWQ+Tk/evuVkTZpAosc/PnfmHmu08jD4g4H0RjKGjH/amNz4mhuYIF2TeUbjYTfaqfK7QL40byZkIJqZv6+Xf3lYP0wbMR8N9/cyvjTVm+oldQ6XxwKBgQDHZw8wHgHwdAdJU5PXrx81CoZf21MSLcOcoXRbY7fnxuyHujfRliTbY78nD4nt6bPtlyelfbthIZ1OREEWplws181vRVVC2GIiOVjgFxJD2jcH1sGf5gCbF7YU1V4kqqvRARPDPHaCNBcNmSeZcylxp2cqcsEMOdeGSus0MLgZBwKBgQCx0YzS3z61ZqvT84fjy8fwPRpyqSuX7BDK1IbrxzyCs/Wmbn2ebxEyAgIuS145hT2q0jeW/K8G1mAnMQ455oBRb0SFYhNxxGFMhPuPreAg40oQYl5jKYtaJnxUsdJoDdrC2csgEKggMGu2/PhKdunk/x1W3yxLxwc5yM5vTH0s9wKBgAoCmHaX6w0BJiR+N5vKRMzK3HgPcJonBfzk9gxocyEFkXY22PqCiRMibMQvOYNiChBRWEIsj62OnHEDaCkU7OerZbrCRkd2yWZibp3BSr9xQvX3x/yY9UrT4+Yj1/gLQVjarv1MGb7rkoSyPZSsfVYhS0KMRDiy5qjtNeWG1JcdAoGBALin/5YS2NuUa1obyNScCi361yJ7nfWYUX6BiVmJchyYxaGmc34beHX6UKM+rBXyvkOzGYYZJwG19zDF4182bypPHI+LlalTox3Q2LazKZ/WWQj+Uj29TV3p6b8yxMQyfToB3vTVfMXQ+okZt9homOcf88+0mHSGLsMqnUVbUYdO";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAkFhpDlOPKOXwuZxnA50H2Apn9FrZCCuxIHwE1BEhamFPPfrUYZo8oypUq1Qvom5/EJ+xsmAk53cxAW6aezRxhtvQB3AX4imERS00cDV7LYdfMI76SjwGdSAVhiA6YMr+FV8ZjZexsa45h7MEC3p8EmB1V8msesYfJz9HlkjZTUYDbGtLD3e80tcNqWOWU6uKfT4tPWIIT8j1O42VipTV0aUTYRryKo7nlTStamPXP+yUIkA/qGEJoIShGKhsMzTWC8zxSIVwcQ1K+TyAqNl1XuQRshHvLXdZIsTmVB9L+IbQovc/+ZtIR5TyycJzRhZvZZP3Hl4wzLpsLC6E81VRlwIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost:8181/Mobilemall_war_exploded/order/state";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost:8181/Mobilemall_war_exploded/order/state";

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

