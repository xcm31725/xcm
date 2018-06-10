package cn.itcast.elasticsearchtemplate.test;

import java.util.List;

import org.elasticsearch.client.Client;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.itcast.domain.Article;
import cn.itcast.service.ArticleService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class ElasticsearchTemplateTest {
	@Autowired
	private ArticleService articleService;
	
	@Autowired
	private Client client;
	
	@Autowired
	private ElasticsearchTemplate elasticsearchTemplate;
	
	@Test
	public void createIndex() {
		elasticsearchTemplate.createIndex(Article.class);//创建索引
		elasticsearchTemplate.putMapping(Article.class);//创建映射
	}
	
	//保存操作
	@Test
	public void testSave() {
		Article article = new Article();
		article.setId(317);
		article.setTitle("面向Java应用为主。当前其支持的语言限于Java、Groovy、Kotlin和Scala，计划未来将支持更多的语言。");
		article.setContent("Gradle是一个基于Apache Ant和Apache Maven概念的项目自动化构建工具。它使用一种基于Groovy的特定领域语言(DSL)来声明项目设置，抛弃了基于XML的各种繁琐配置。");
		
		articleService.save(article);
	}
	
	//删除操作
	@Test
	public void testDelete() {
		Article article = new Article();
		article.setId(317);
		
		articleService.delete(article);
	}
	
	//根据ID查询
	@Test
	public void testFindOne() {
		System.out.println(articleService.findOne(317));
	}
	
	//保存100条数据
	@Test
	public void testSaveBatch() {
		for (int i = 1; i <= 100; i++) {
			Article article = new Article();
			article.setId(i);
			article.setTitle(i+"Apache Maven 3.5.3是所有用户的最新版本和推荐版本。");
			article.setContent(i+"当前选择的下载镜像是 http://mirrors.shu.edu.cn/apache/。如果您遇到此镜像的问题，请选择其他镜像。如果所有镜像都失败， 则应有可用的备份镜像（位于镜像列表末尾）。您也可以查阅 完整的镜像列表。");
			
			articleService.save(article);
		}
	}
	
	//排序分页查询
	@Test
	public void testFindAll() {
		/*Iterable<Article> articles = articleService.findAll();
		for (Article article : articles) {
			System.out.println(article);
		}*/
		
		Pageable pageable = new PageRequest(0, 10); //分页
		Page<Article> pageData = articleService.findAll(pageable);
		for (Article article : pageData.getContent()) {
			System.out.println(article);
		}
	}
	
	//条件查询
	@Test
	public void testConditionQuery() {
		//查询 标题中含有 "所有"
		// List<Article> articles = articleService.findByTitle("所有");
		// for (Article article : articles) {
		// System.out.println(article);
		// }
		
		//查询 标题中含有 "所有" 1-10 条
		Pageable pageable = new PageRequest(1, 10);
		Page<Article> pageData = articleService.findByTitle("所有", pageable);
		System.out.println("总记录数："+ pageData.getTotalElements());
		for (Article article : pageData) {
			System.out.println(article);
		}
	}
	
}
