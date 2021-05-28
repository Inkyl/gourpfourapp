package group.four.todo.model;

import lombok.Data;

import java.util.Date;

/**
 * @className: Article
 * @description: TODO 类描述
 * @author: zxk
 * @date: 2021-05-28
 **/
@Data
public class Article {
    private Long id;
    private String title;
    private String content;
    private Date createDate;
    private Date updateDate;
    private Long userId;
}
