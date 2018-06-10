package cn.itcast.demo;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;

import org.apache.activemq.spring.ActiveMQConnectionFactory;
import org.junit.Test;

public class ActiveMQProducer {
	@Test
	public void actionMQProducer() throws Exception {
		//链接工厂
		//使用默认的用户名，密码，路径
		//路径tcp://host:port
		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
		//获得一个链接
		Connection connection = connectionFactory.createConnection();
		//建立会话
		Session session = connection.createSession(true, Session.AUTO_ACKNOWLEDGE);
		//创建队列或者话题对象
		Queue queue = session.createQueue("Helloworld");//队列
		//创建生产者 或者消费者
		MessageProducer producer = session.createProducer(queue);//生产者
		
		//发送消息
		for (int i = 0; i < 10; i++) {
			producer.send(session.createTextMessage("activeMQ:"+i));
		}
		//提交
		session.commit();
	}
}
