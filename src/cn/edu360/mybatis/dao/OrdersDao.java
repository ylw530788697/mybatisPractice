package cn.edu360.mybatis.dao;

import cn.edu360.mybatis.model.OrdersModel;

import java.util.List;

public interface OrdersDao {
    public List<OrdersModel> queryOrdersList(Integer ordersId);
}
