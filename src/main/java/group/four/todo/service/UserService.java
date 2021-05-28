package group.four.todo.service;

import group.four.todo.model.User;
import org.springframework.stereotype.Service;

/**
 * @className: UserService
 * @description: TODO 类描述
 * @author: zxk
 * @date: 2021-05-28
 **/
public interface UserService {
    User queryUser(String name, String password);

    Integer register(User user);

    Integer updateUser(int id, String username, String mailAddress, String userIntro);

    Integer updatePwd(int id, String password);

    User queryUserById(Long id);
}
