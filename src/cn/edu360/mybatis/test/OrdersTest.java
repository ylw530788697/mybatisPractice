package cn.edu360.mybatis.test;

import cn.edu360.mybatis.model.OrdersModel;
import cn.edu360.mybatis.service.OrdersService;
import cn.edu360.mybatis.service.impl.OrdersServiceImpl;

import java.util.List;

public class OrdersTest {
    public static void main(String[] args) {
        OrdersService ordersService=new OrdersServiceImpl();
        List<OrdersModel> ordersModels = ordersService.queryOrdersList(1);
    }
}
