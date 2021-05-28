package group.four.todo.controller;

import com.alibaba.fastjson.JSON;
import group.four.todo.model.Article;
import group.four.todo.model.User;
import group.four.todo.service.ArticleService;
import group.four.todo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @className: ArticleController
 * @description: TODO 类描述
 * @author: zxk
 * @date: 2021-05-28
 **/
@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    ArticleService articleService;
    @Autowired
    UserService userService;

    @RequestMapping("/publish")
    public Object publish(@RequestParam Long userId, @RequestParam String title, @RequestParam String content) {
        Article article = new Article();
        article.setTitle(title);
        article.setContent(content);
        article.setUserId(userId);
        if (articleService.publish(article) == 1) {
            return true;
        } else {
            return false;
        }
    }

    @RequestMapping("/showArticles")
    public Object getAllArticle() {
        List<Article> allArticle = articleService.getAllArticle();
        Map<Article, User> map = new HashMap<>();
        for (int i = 0; i < allArticle.size(); i++) {
            User user = userService.queryUserById(allArticle.get(i).getUserId());
            map.put(allArticle.get(i), user);
        }
        return JSON.toJSONString(map);
    }
}
