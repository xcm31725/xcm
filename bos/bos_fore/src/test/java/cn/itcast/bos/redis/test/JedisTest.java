package cn.itcast.bos.redis.test;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public class JedisTest {
	@Test
	public void testJedis() {
		//链接localhost默认端口6379
		Jedis jedis = new Jedis("localhost");
		
		jedis.setex("xcm", 60, "今天天气好晴朗！");
		
		System.out.println(jedis.get("xcm"));
	}
}
