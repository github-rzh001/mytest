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
	public static String app_id = "2016101100660456";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCHpGl0aCHqqDVivunXE8FppVPUqf7skP/jvejf30+1+WcIPVHhHS47bjVACP06hSvZgzhf4cv2U1Glf6u6LLgQbOb+CJo/VVYKHhRY+JbdAqSwtxkCSPR3gqz7jdraKQV27I8IeVxqcG/ve6bUABnou1al+26sY+AHLXXZR8tdvMD+OINZySJHWgPRq1FRAa0hN/VWHwmYnaUUQ0uycxxiFoAg1vSRUZ6aM/idUyQNvatMbpYFvBSXVGXGwaXoYlMUkrJn6PpfKfq5tVa/BIHUWwf1Epk41wRfVMuDcvU5077eLBcduzt5yHol22NWpP/w8Xxw1BCLHyGtjhtYqvfrAgMBAAECggEAX5CBT6cyBh5+hlSVcZeUk/cMCe+/EDLUZkLdeCTgBwhxA8gYEO87LFnoIHZ02q8KhtPBeyQdTC3Ff0Fk3uU0xTXExMOQ0QAxfy1UDp8NwyZim7JUZ1y5CB5D+3Mk9sEh/XiLCWBfsQoIgwRuNDziBCtAz+5GOiSfqM7pkazYZfBPMqOb8FjP3hBwTc+2ChIuv1yclhfDM4YoZDf5Jb5IZ99+XyFp4gSvm8a6Dqay25FnRZHwVoqoytkIBydpc3dTfFYX9BKEDYzp36ieKEZRQnReh+mVDdU9YheyfkVhsihfw+FeTHFCR7gch5qJq8jG7T42aoUNGXyFBMBP822VYQKBgQDz2zEzRObykQ4I8Yd5Z7Y5FgkeyrfolWQp9kgy+M+7q1nIiCuKOwM338kiPrxBB6mGywgutIrKqQd/hjcufNKbNNtbxhXfJUR9oH78m6lvU9TlF5yZqgZt5Mpkt0kLupd5Ys0KG4Mj9t4k4stSQik+Y94ldmK4SNW3UJrJ6UpuMQKBgQCOZaaWkT1P+EuUKMP82V1S5BIt9Wor0pCwUC7cv23+7U4thBnnRurgXne8CBqsbrR4TDCHjKfnMajs7S84MWFLqSxLkfh/Mj1nQCGLjNLWtRNVqqKWFF2oTrkaon4ynmC0ML5OvPjxa/Wi+ppi0wkFxj4je9Q7Cu2riR1zjnj02wKBgB5ytP740HljIUR+m/LNv1P7a2Ib38C7voj6xmMO7Ck7qPdAAWe+HJXCbIPJH4pjIYjCGyBxzI6nclc68/LrBQT6IZWg8yQsrBOfkZuK+Cn9ZqzAOP5621inY5oVxJohTz6J1p43dzVrYqtqYgbAWhP/NkKpOIRYG89K0jj51yBRAoGAPbYL9iDHg4rFplXsaf4BldTFlClRc+BzWBXH2V8U2nAZe1xOpY50Z/xIw7J3bNclWyUZuwTYFzfMT7GSzzWHRvTv/2gpW2Z4efCvGP1UujwLPwsOHyCAXlqPmd1l96Xvnueo8hKviGETOSiGE+IFfP0nHNWjalsYGUj4/IV4IhUCgYB1bRvkydql7+YjA0i2BNzulFlm4w7R9ALAS4AYkaTKzmmq/HOwsFd2Dcsj3os6rYxi66Dh/ZxvvByYtuLeg+Jqqpz3XpmdteTijXKZlRSWfOb5IobDTiqM/qP0Hd6G9O96bJ41a8QttTlavVCjgkqJSB1pCSTX75LsUk3TSWTQ7g==";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAh6RpdGgh6qg1Yr7p1xPBaaVT1Kn+7JD/473o399PtflnCD1R4R0uO241QAj9OoUr2YM4X+HL9lNRpX+ruiy4EGzm/giaP1VWCh4UWPiW3QKksLcZAkj0d4Ks+43a2ikFduyPCHlcanBv73um1AAZ6LtWpfturGPgBy112UfLXbzA/jiDWckiR1oD0atRUQGtITf1Vh8JmJ2lFENLsnMcYhaAINb0kVGemjP4nVMkDb2rTG6WBbwUl1RlxsGl6GJTFJKyZ+j6Xyn6ubVWvwSB1FsH9RKZONcEX1TLg3L1OdO+3iwXHbs7ech6JdtjVqT/8PF8cNQQix8hrY4bWKr36wIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost/alipay/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost/alipay/return_url.jsp";

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

