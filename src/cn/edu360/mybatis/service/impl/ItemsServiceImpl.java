package cn.edu360.mybatis.service.impl;

import cn.edu360.mybatis.dao.ItemsDao;
import cn.edu360.mybatis.model.ItemsModel;
import cn.edu360.mybatis.service.ItemsService;
import cn.edu360.mybatis.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class ItemsServiceImpl implements ItemsService {
    @Override
    public List<ItemsModel> queryItemsByNameAndPrice(ItemsModel itemsModel) {
        SqlSession session = MybatisUtil.getFactory().openSession();
        ItemsDao mapper = session.getMapper(ItemsDao.class);
        List<ItemsModel> itemsModels = mapper.queryItemsByNameAndPrice(itemsModel);
        return itemsModels;
    }
}
