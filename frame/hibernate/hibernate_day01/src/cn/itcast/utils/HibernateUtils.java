package cn.itcast.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	private static Configuration cf;
	private static SessionFactory sf;
	
	static{
		cf = new Configuration().configure();
		sf = cf.buildSessionFactory();
	}
	
	public static Session openSession() {
		return sf.openSession();
	}
	
}
