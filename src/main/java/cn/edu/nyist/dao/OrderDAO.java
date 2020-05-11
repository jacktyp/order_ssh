package cn.edu.nyist.dao;

import org.hibernate.criterion.Order;

/**
 * @ClassName OrderDAO
 * @Description TODO
 * @Date 2020/5/11 11:29
 * @Created by typ
 */
public interface OrderDAO {

    void add(Order order);
}
