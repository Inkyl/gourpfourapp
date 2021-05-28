package group.four.todo.service.imp;

import group.four.todo.mapper.UserMapper;
import group.four.todo.model.User;
import group.four.todo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @className: UserServiceImpl
 * @description: TODO 类描述
 * @author: zxk
 * @date: 2021-05-28
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    public User queryUser(String name, String password) {
        System.out.println("111");
        return userMapper.queryUser(name, password);
    }

    @Override
    public Integer register(User user) {
        if (userMapper.queryUserByUsername(user.getUsername()) == null) {
            return userMapper.registerUser(user);
        } else {
            return 0;
        }
    }

    @Override
    public Integer updateUser(int id, String username, String mailAddress, String userIntro) {
        if (userMapper.queryUserByUsername(username) == null) {
            return userMapper.updateUser(id, username, mailAddress, userIntro);
        } else {
            return 0;
        }
    }

    @Override
    public Integer updatePwd(int id, String password) {
        return userMapper.updatePwd(id, password);
    }

    @Override
    public User queryUserById(Long id) {
        return userMapper.queryUserById(id);
    }
}
