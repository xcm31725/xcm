package cn.itcast.bos.utils;

import org.apache.commons.lang3.RandomStringUtils;

public class SendSmsUtlis {

	//用户名
	private static String Uid = "xcm31725";
	
	//接口安全秘钥
	private static String Key = "d41d8cd98f00b204e980";
	public static String activeUrl = "http://localhost:8081/bos_fore/customer_activeMail";
	
	//手机号码，多个号码如13800000000,13800000001,13800000002
	//smsText：短信内容
	public static Integer sendSms(String smsMob,String smsText) {
		HttpClientUtil client = HttpClientUtil.getInstance();
		//UTF发送
		int result = client.sendMsgUtf8(Uid, Key, smsText, smsMob);
		
		return result;
	}
	
	//测试
	public static void main(String[] args) {
		String randomCode = RandomStringUtils.randomNumeric(4);
		Integer result = SendSmsUtlis.sendSms("15229034152", randomCode);
		System.out.println(result);
	}
}
