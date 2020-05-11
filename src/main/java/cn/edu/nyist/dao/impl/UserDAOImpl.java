package cn.edu.nyist.dao.impl;

import cn.edu.nyist.dao.UserDAO;
import cn.edu.nyist.pojo.User;
import org.springframework.orm.hibernate3.HibernateTemplate;

/**
 * @ClassName UserDAOImpl
 * @Description TODO
 * @Date 2020/5/11 11:23
 * @Created by typ
 */
public class UserDAOImpl extends HibernateTemplate implements UserDAO {
    @Override
    public void add(User user) {
        save(user);
    }
}
