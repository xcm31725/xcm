package cn.itcast.bos.freemaker.test;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class FreemarkerTest {
	@Test
	public void test() throws Exception {
		//配置对象，配置模板类型
		Configuration configuration = new Configuration(Configuration.VERSION_2_3_22);
		
		configuration.setDirectoryForTemplateLoading(new File("src/main/webapp/WEB-INF/templates"));
		
		//获取模板对象
		Template template = configuration.getTemplate("hello.ftl");
		
		//动态数据对象
		Map<String , Object> map = new HashMap<String, Object>();
		map.put("title", "第一次使用");
		map.put("msg", "今天好凉爽啊！");
		
		//合并输出
		template.process(map, new PrintWriter(System.out));
	}
}
