package cn.edu.nyist.action;

import cn.edu.nyist.service.OrderService;
import org.hibernate.criterion.Order;


public class OrderAction {

    Order order;
    OrderService orderService;

    public String add() {
        orderService.add(order);
        return "listProduct";
    }


    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public OrderService getOrderService() {
        return orderService;
    }

    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }
}
