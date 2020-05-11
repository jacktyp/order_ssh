package cn.edu.nyist.action;

import cn.edu.nyist.pojo.User;
import cn.edu.nyist.service.UserService;

/**
 * @ClassName UserAction
 * @Description TODO
 * @Date 2020/5/11 11:20
 * @Created by typ
 */
public class UserAction {
    UserService userService;
    User user;

    public String add() {
        userService.add(user);
        return "listProduct";
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
