package group.four.todo.model;

import lombok.Data;

/**
 * @className: User
 * @description: TODO 类描述
 * @author: zxk
 * @date: 2021-05-28
 **/
@Data
public class User {
    private Long id;
    private String username;
    private String password;
    private String mailAddress;
    private String userIntro;

    public User(String username, String password, String mailAddress) {
        this.username = username;
        this.password = password;
        this.mailAddress = mailAddress;
    }
}
