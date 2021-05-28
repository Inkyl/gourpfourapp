package group.four.todo.controller;

import group.four.todo.model.User;
import group.four.todo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @className: UserController
 * @description: TODO 类描述
 * @author: zxk
 * @date: 2021-05-28
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Object login(@RequestParam String username, @RequestParam String password) {
        User user = userService.queryUser(username, password);
        if (user == null) {
            return false;
        }
        return true;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Object register(@RequestParam String username, @RequestParam String password,
                           @RequestParam String mailAddress) {
        User user = new User(username, password, mailAddress);
        user.setUserIntro("这个人很懒没有个人介绍");
        if (userService.register(user) == 1) {
            return true;
        } else {
            return false;
        }
    }

    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
    public Object updateUser(@RequestParam int id, @RequestParam String username,
                             @RequestParam String mailAddress, @RequestParam String userIntro) {
        if (userService.updateUser(id, username, mailAddress, userIntro) == 1) {
            return true;
        } else {
            return false;
        }
    }

    @RequestMapping(value = "/updatePwd", method = RequestMethod.POST)
    public Object updatePwd(@RequestParam int id, @RequestParam String password) {
        if (userService.updatePwd(id,password) == 1){
            return true;
        }else {
            return false;
        }
    }
}
