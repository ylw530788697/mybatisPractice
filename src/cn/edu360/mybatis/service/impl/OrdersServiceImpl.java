package cn.edu360.mybatis.service.impl;

import cn.edu360.mybatis.dao.ItemsDao;
import cn.edu360.mybatis.dao.OrdersDao;
import cn.edu360.mybatis.model.OrdersModel;
import cn.edu360.mybatis.service.OrdersService;
import cn.edu360.mybatis.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class OrdersServiceImpl implements OrdersService {

    @Override
    public List<OrdersModel> queryOrdersList(Integer ordersId) {
        SqlSession session = MybatisUtil.getFactory().openSession();
        OrdersDao mapper = session.getMapper(OrdersDao.class);
        List<OrdersModel> ordersModels = mapper.queryOrdersList(ordersId);
        for (OrdersModel ordersModel:ordersModels
             ) {
            System.out.println(ordersModel);
        }

        return  ordersModels;
    }
}
