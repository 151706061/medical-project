package com.medicalproj.common.util;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class SMSUtil {
	
	// 查账户信息的http地址
    private static String URI_GET_USER_INFO = "http://yunpian.com/v1/user/get.json";

    //通用发送接口的http地址
    private static String URI_SEND_SMS = "http://yunpian.com/v1/sms/send.json";

    // 模板发送接口的http地址
    private static String URI_TPL_SEND_SMS = "http://yunpian.com/v1/sms/tpl_send.json";

    // 发送语音验证码接口的http地址
    private static String URI_SEND_VOICE = "http://yunpian.com/v1/voice/send.json";

    //编码格式。发送编码格式统一用UTF-8
    private static String ENCODING = "UTF-8";

    private static final String API_KEY = "";
    public static void main(String[] args) throws IOException, URISyntaxException {
        //修改为您的apikey.apikey可在官网（http://www.yuanpian.com)登录后用户中心首页看到
        //修改为您要发送的手机号
        String mobile = "14782394091";

        /**************** 查账户信息调用示例 *****************/
        System.out.println(SMSUtil.getUserInfo(API_KEY));

        /**************** 使用通用接口发短信(推荐) *****************/
        //设置您要发送的内容(内容必须和某个模板匹配。以下例子匹配的是系统提供的1号模板）
        String text = "您的验证码是123123";
        //发短信调用示例
        System.out.println(SMSUtil.sendSms( mobile,text));

    }

    /**
     * 取账户信息
     *
     * @return json格式字符串
     * @throws java.io.IOException
     */
    public static String getUserInfo(String apikey) throws IOException, URISyntaxException {
        Map<String, String> params = new HashMap<String, String>();
        params.put("apikey", apikey);
        return post(URI_GET_USER_INFO, params);
    }

    /**
     * 通用接口发短信
     *
     * @param apikey apikey
     * @param text   　短信内容
     * @param mobile 　接受的手机号
     * @return json格式字符串
     * @throws IOException
     */
    public static String sendSms(String mobile, String text) throws IOException {
        Map<String, String> params = new HashMap<String, String>();
        params.put("apikey", API_KEY);
        params.put("mobile", mobile);
        params.put("text", "【】" + text);
        return post(URI_SEND_SMS, params);
    }

    /**
     * 通过模板发送短信(不推荐)
     *
     * @param apikey    apikey
     * @param tpl_id    　模板id
     * @param tpl_value 　模板变量值
     * @param mobile    　接受的手机号
     * @return json格式字符串
     * @throws IOException
     */
    public static String tplSendSms(String apikey, long tpl_id, String tpl_value, String mobile) throws IOException {
        Map<String, String> params = new HashMap<String, String>();
        params.put("apikey", apikey);
        params.put("tpl_id", String.valueOf(tpl_id));
        params.put("tpl_value", tpl_value);
        params.put("mobile", mobile);
        return post(URI_TPL_SEND_SMS, params);
    }

    /**
     * 通过接口发送语音验证码
     * @param apikey apikey
     * @param mobile 接收的手机号
     * @param code   验证码
     * @return
     */
    public static String sendVoice(String apikey, String mobile, String code) {
        Map<String, String> params = new HashMap<String, String>();
        params.put("apikey", apikey);
        params.put("mobile", mobile);
        params.put("code", code);
        return post(URI_SEND_VOICE, params);
    }

    /**
     * 基于HttpClient 4.3的通用POST方法
     *
     * @param url       提交的URL
     * @param paramsMap 提交<参数，值>Map
     * @return 提交响应
     */
    public static String post(String url, Map<String, String> paramsMap) {
        CloseableHttpClient client = HttpClients.createDefault();
        String responseText = "";
        CloseableHttpResponse response = null;
        try {
            HttpPost method = new HttpPost(url);
            if (paramsMap != null) {
                List<NameValuePair> paramList = new ArrayList<NameValuePair>();
                for (Map.Entry<String, String> param : paramsMap.entrySet()) {
                    NameValuePair pair = new BasicNameValuePair(param.getKey(), param.getValue());
                    paramList.add(pair);
                }
                method.setEntity(new UrlEncodedFormEntity(paramList, ENCODING));
            }
            response = client.execute(method);
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                responseText = EntityUtils.toString(entity);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                response.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return responseText;
    }
    
    
	/*public final static String URL = "http://222.73.117.158/msg/index.jsp";
	public final static String ACCOUNT = "jiekou-clcs-05";
	public final static String PASSWORD = "Tch1886688";
	
	public static void main(String[] args) {
		String uri = "http://222.73.117.158/msg/";//应用地址
		String account = "询问对接人";//账号
		String pswd = "询问对接人";//密码
		String mobiles = "13800210021,13800138000";//手机号码，多个号码使用","分割
		String content = "亲爱的用户，您的验证码是123456，5分钟内有效。";//短信内容
		boolean needstatus = true;//是否需要状态报告，需要true，不需要false
		String product = null;//产品ID
		String extno = null;//扩展码
		 
		try {
			String returnString = batchSend(uri, account, pswd, mobiles, content, needstatus, product, extno);
			System.out.println(returnString);
			//TODO 处理返回值,参见HTTP协议文档
		} catch (Exception e) {
			//TODO 处理异常
			e.printStackTrace();
		}
	}
	public static void main(String[] args ) throws Exception{
		System.out.println(sendSMS("14782394091","To Eden测试短信发送，1,2,3..."));
	}
	
	public static String sendSMS(String mobiles,String content) throws Exception{
		return batchSend(URL,ACCOUNT,PASSWORD,mobiles,content,true,null,null);
	}
	
	
	private static String send(String uri, String account, String pswd,
			String mobiles, String content, boolean needstatus, String product,
			String extno) throws Exception {
		HttpClient client = new HttpClient();
		GetMethod method = new GetMethod();
		try {
			URI base = new URI(uri, false);
			method.setURI(new URI(base, "HttpSendSM", false));
			method.setQueryString(new NameValuePair[] {
					new NameValuePair("account", account),
					new NameValuePair("pswd", pswd),
					new NameValuePair("mobile", mobiles),
					new NameValuePair("needstatus", String.valueOf(needstatus)),
					new NameValuePair("msg", content),
					new NameValuePair("product", product),
					new NameValuePair("extno", extno) });

			int result = client.executeMethod(method);
			if (result == 200) {
				InputStream in = method.getResponseBodyAsStream();
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				byte[] buffer = new byte[1024];
				int len = 0;
				while ((len = in.read(buffer)) != -1) {
					baos.write(buffer, 0, len);
				}
				return URLDecoder.decode(baos.toString(), "UTF-8");
			}
			throw new Exception("HTTP ERROR Status: " + method.getStatusCode()
					+ ":" + method.getStatusText());
		} finally {
			method.releaseConnection();
		}
	}

	private static String batchSend(String uri, String account, String pswd,
			String mobiles, String content, boolean needstatus, String product,
			String extno) throws Exception {
		HttpClient client = new HttpClient();
		GetMethod method = new GetMethod();
		try {
			URI base = new URI(uri, false);
			method.setURI(new URI(base, "HttpBatchSendSM", false));
			method.setQueryString(new NameValuePair[] {
					new NameValuePair("account", account),
					new NameValuePair("pswd", pswd),
					new NameValuePair("mobile", mobiles),
					new NameValuePair("needstatus", String.valueOf(needstatus)),
					new NameValuePair("msg", content),
					new NameValuePair("product", product),
					new NameValuePair("extno", extno) });

			int result = client.executeMethod(method);
			if (result == 200) {
				InputStream in = method.getResponseBodyAsStream();
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				byte[] buffer = new byte[1024];
				int len = 0;
				while ((len = in.read(buffer)) != -1) {
					baos.write(buffer, 0, len);
				}
				return URLDecoder.decode(baos.toString(), "UTF-8");
			}
			throw new Exception("HTTP ERROR Status: " + method.getStatusCode()
					+ ":" + method.getStatusText());
		} finally {
			method.releaseConnection();
		}
	}*/
	
}
