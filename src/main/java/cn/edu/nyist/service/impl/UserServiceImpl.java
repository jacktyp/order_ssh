package cn.edu.nyist.service.impl;

import cn.edu.nyist.dao.UserDAO;
import cn.edu.nyist.pojo.User;
import cn.edu.nyist.service.UserService;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Date 2020/5/11 11:22
 * @Created by typ
 */
public class UserServiceImpl implements UserService {

    UserDAO  userDAO;


    @Override
    public void add(User user) {
        userDAO.add(user);
    }

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
}
