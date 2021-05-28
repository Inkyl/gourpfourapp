package group.four.todo.service.imp;

import group.four.todo.mapper.ArticleMapper;
import group.four.todo.model.Article;
import group.four.todo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @className: ArticleServiceImpl
 * @description: TODO 类描述
 * @author: zxk
 * @date: 2021-05-28
 **/
@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    ArticleMapper articleMapper;

    @Override
    public Integer publish(Article article) {
        article.setCreateDate(new Date());
        article.setUpdateDate(new Date());
        return articleMapper.publish(article);
    }

    @Override
    public List<Article> getAllArticle() {
        return articleMapper.getAllArticles();
    }
}
