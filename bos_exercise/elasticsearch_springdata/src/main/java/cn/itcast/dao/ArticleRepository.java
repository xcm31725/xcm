package cn.itcast.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import cn.itcast.domain.Article;

public interface ArticleRepository extends ElasticsearchRepository<Article, Integer> {
	public List<Article> findByTitle(String title);

	public Page<Article> findByTitle(String title, Pageable pageable);
}
