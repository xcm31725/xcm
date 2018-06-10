package cn.itcast.demo;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.spring.ActiveMQConnectionFactory;
import org.junit.Test;

public class ActiveMQConsumer {
	@Test
	public void actionMQConsumer() throws Exception {
		//链接工厂
		//使用默认的用户名，密码，路径
		//路径tcp://host:port
		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
		//获得一个链接
		Connection connection = connectionFactory.createConnection();
		connection.start();
		//建立会话
		//第一个参数，是否使用事物，如果设置true，操作消息队列后，必须使用session.commit();
		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		//创建队列或者话题对象
		Queue queue = session.createQueue("Helloworld");//队列
		//创建消费者
		MessageConsumer messageConsumer = session.createConsumer(queue);
		
		while(true) {
			TextMessage message = (TextMessage) messageConsumer.receive(10000);
			
			if(message != null) {
				System.out.println(message.getText());
			} else {
				break;
			}
		}
	}
	
	@Test
	public void actionMQConsumer1() throws Exception {
		//链接工厂
		//使用默认的用户名，密码，路径
		//路径tcp://host:port
		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
		//获得一个链接
		Connection connection = connectionFactory.createConnection();
		connection.start();
		//建立会话
		//第一个参数，是否使用事物，如果设置true，操作消息队列后，必须使用session.commit();
		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		//创建队列或者话题对象
		Queue queue = session.createQueue("Helloworld");//队列
		//创建消费者
		MessageConsumer messageConsumer = session.createConsumer(queue);
		
		messageConsumer.setMessageListener(new MessageListener() {
			//每次收到消息，自动调用onMessage
			public void onMessage(Message message) {
				TextMessage testMessage = (TextMessage) message;
				try {
					System.out.println(testMessage.getText());
				} catch (JMSException e) {
					e.printStackTrace();
				}
			}
		});
		
		while(true) {
			//不能让Junit死掉
		}
	}
}
