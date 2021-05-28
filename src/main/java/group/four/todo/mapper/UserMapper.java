package group.four.todo.mapper;

import group.four.todo.model.User;

/**
 * @className: UserMapper
 * @description: TODO 类描述
 * @author: zxk
 * @date: 2021-05-28
 **/
public interface UserMapper {
    User queryUser(String username, String password);

    Integer registerUser(User user);

    User queryUserByUsername(String username);
    User queryUserById(Long id);

    Integer updateUser(int id, String username, String mailAddress, String userIntro);

    Integer updatePwd(int id, String password);
}
