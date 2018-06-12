package cn.itcast.bos.utils;

import java.util.Properties;
import java.util.UUID;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.commons.lang3.RandomStringUtils;

import com.sun.mail.util.MailSSLSocketFactory;

/**
 *CREATE BY LIGANG
 *使用之前将common_parent中的
 *		<dependency>
			<groupId>javamail</groupId>
			<artifactId>mail</artifactId>
			<version>1.3.2</version>
		</dependency>
	更换成下面
		<dependency>
	  		<groupId>javax.mail</groupId>
	  		<artifactId>mail</artifactId>
	  		<version>1.4.7</version>
	  	</dependency>
 */
public class MailQQUtils1 {
	
	private final static String from="xcm31725@qq.com";
	private final static String pswd="ljaxhgrkzfyebbgj";
	
	public static void sendQQMail(String title,String content,String to){
		try{
			Properties props = new Properties();

	        // 开启debug调试
	        props.setProperty("mail.debug", "true");
	        // 发送服务器需要身份验证
	        props.setProperty("mail.smtp.auth", "true");
	        // 设置邮件服务器主机名
	        props.setProperty("mail.host", "smtp.qq.com");
	        // 发送邮件协议名称
	        props.setProperty("mail.transport.protocol", "smtp");
	        // 开启SSL加密，否则会失败
	        MailSSLSocketFactory sf = new MailSSLSocketFactory();
	        sf.setTrustAllHosts(true);
	        props.put("mail.smtp.ssl.enable", "true");
	        props.put("mail.smtp.ssl.socketFactory", sf);

	        Session session = Session.getInstance(props);

	        Message msg = new MimeMessage(session);
	        msg.setSubject(title);
	        msg.setText(content);
	        msg.setFrom(new InternetAddress(from));

	        Transport transport = session.getTransport();
	        transport.connect("smtp.qq.com",from, pswd);

	        transport.sendMessage(msg, new Address[] { new InternetAddress(to) });
	        transport.close();
		}catch(Exception e){
			System.out.println("邮箱发送失败"+e);
		}
	}
		
	public static void main(String[] args) {
		String activecode1 = RandomStringUtils.randomNumeric(32);
		System.out.println(activecode1);
		String activecode2 = UUID.randomUUID().toString().trim().replace("-", "");
		System.out.println(activecode2);
		MailQQUtils.sendQQMail("小鱼儿", activecode1+activecode2, "xcm31725@qq.com");
	}
}
