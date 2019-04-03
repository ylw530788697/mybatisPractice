package cn.edu360.mybatis.dao;

import cn.edu360.mybatis.model.OrdersModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrdersDao {
    public List<OrdersModel> queryOrdersList(@Param("ordersId") Integer ordersId);
}
