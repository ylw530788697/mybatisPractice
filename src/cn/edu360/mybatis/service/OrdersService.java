package cn.edu360.mybatis.service;

import cn.edu360.mybatis.model.OrdersModel;

import java.util.List;

public interface OrdersService {
    public List<OrdersModel> queryOrdersList(Integer ordersId);

}
