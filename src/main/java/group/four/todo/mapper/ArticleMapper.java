package group.four.todo.mapper;

import group.four.todo.model.Article;

import java.util.List;

/**
 * @className: ArticleMapper
 * @description: TODO 类描述
 * @author: zxk
 * @date: 2021-05-28
 **/
public interface ArticleMapper {

    Integer publish(Article article);

    List<Article> getAllArticles();
}
