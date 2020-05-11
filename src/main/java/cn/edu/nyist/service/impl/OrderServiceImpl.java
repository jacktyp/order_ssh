package cn.edu.nyist.service.impl;

import cn.edu.nyist.dao.OrderDAO;
import cn.edu.nyist.service.OrderService;
import org.hibernate.criterion.Order;


public class OrderServiceImpl implements OrderService {
    OrderDAO orderDAO;
    @Override
    public void add(Order order) {
        orderDAO.add(order);
    }

    public OrderDAO getOrderDAO() {
        return orderDAO;
    }

    public void setOrderDAO(OrderDAO orderDAO) {
        this.orderDAO = orderDAO;
    }
}
