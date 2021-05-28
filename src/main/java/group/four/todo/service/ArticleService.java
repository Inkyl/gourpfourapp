package group.four.todo.service;

import group.four.todo.model.Article;

import java.util.List;

/**
 * @className: ArticleService
 * @description: TODO 类描述
 * @author: zxk
 * @date: 2021-05-28
 **/
public interface ArticleService {
    Integer publish(Article article);

    List<Article> getAllArticle();
}
