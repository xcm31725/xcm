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
  
public class SinaMailUtils {  
  
    public static void email(String email,String authcode)throws Exception {  
        Properties properties = new Properties();  
        properties.setProperty("mail.transport.protocol", "smtp");//发送邮件协议  
        properties.setProperty("mail.smtp.auth", "true");//需要验证  
         //properties.setProperty("mail.debug", "true");//设置debug模式 后台输出邮件发送的过程  
        Session session = Session.getInstance(properties);  
        session.setDebug(true);//debug模式  
        //邮件信息  
        Message messgae = new MimeMessage(session);  
        messgae.setFrom(new InternetAddress("xcm31725@sina.com"));//设置发送人  
        //messgae.setText("你的验证码为："+authcode+"。请注意，验证码有效时间为2分钟！！！");//设置邮件内容  
        messgae.setText("速运快递激活邮箱:"+authcode);//设置邮件内容  
      
        messgae.setSubject("邮箱验证");//设置邮件主题  
        //发送邮件  
        Transport tran = session.getTransport();  
         tran.connect("smtp.sina.com", 25, "xcm31725@sina.com", "XCM31725...");//连接到新浪邮箱服务器  
        // tran.connect("smtp.qq.com",587, "Michael8@qq.vip.com", "xxxx");//连接到QQ邮箱服务器  
        tran.sendMessage(messgae, new Address[]{ new InternetAddress(email)});//设置邮件接收人  
        tran.close();  
    }  
    
    public static void main(String[] args) throws Exception {
    	String uuid = UUID.randomUUID().toString().trim().replaceAll("-", "");    
    	//SinaMailUtils.email("xcm31725@sina.com" , uuid);
    	SinaMailUtils.email("xcm31725@qq.com" , uuid);
	}
}  