package cn.edu.nyist.dao.impl;

import cn.edu.nyist.dao.OrderDAO;
import org.hibernate.criterion.Order;
import org.springframework.orm.hibernate3.HibernateTemplate;

/**
 * @ClassName OrderDAOImpl
 * @Description TODO
 * @Date 2020/5/11 11:30
 * @Created by typ
 */
public class OrderDAOImpl extends HibernateTemplate implements OrderDAO {
    @Override
    public void add(Order order) {
        save(order);
    }
}
