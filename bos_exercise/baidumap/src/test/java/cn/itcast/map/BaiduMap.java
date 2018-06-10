package cn.itcast.map;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.codec.Charsets;
import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.junit.Test;
public class BaiduMap {
	
	@Test
	//创建表
	public void postTest() throws Exception {
		//创建httpClient对象
		HttpClient client = HttpClients.createDefault(); 
		
		//请求对象
		HttpPost httpPost = new HttpPost("http://api.map.baidu.com/geodata/v3/geotable/create");
		
		//绑定参数
		List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
		nameValuePairs.add(new BasicNameValuePair("name", "xcm"));
		nameValuePairs.add(new BasicNameValuePair("geotype", "1"));
		nameValuePairs.add(new BasicNameValuePair("is_published", "1"));
		nameValuePairs.add(new BasicNameValuePair("ak", "DfjzDeyTgcMq6Waf3g824kkKjx1Ma171"));
		
		httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs, Charsets.UTF_8));
		
		//发送请求
		HttpResponse httpResponse = client.execute(httpPost);
		
		//打印结果数据
		HttpEntity httpEntity = httpResponse.getEntity();
		System.out.println(EntityUtils.toString(httpEntity));
	}
	
	@Test
	//查询表
	public void getTest() throws Exception {
		HttpClient client = HttpClients.createDefault(); 
		
		HttpGet httpGet = new HttpGet("http://api.map.baidu.com/geodata/v3/geotable/list?ak=DfjzDeyTgcMq6Waf3g824kkKjx1Ma171");
		
		HttpResponse httpResponse = client.execute(httpGet);
		HttpEntity httpEntity = httpResponse.getEntity();
		System.out.println(EntityUtils.toString(httpEntity));
	}
	
}
