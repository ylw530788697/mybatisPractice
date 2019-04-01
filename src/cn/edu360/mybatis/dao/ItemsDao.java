package cn.edu360.mybatis.dao;

import cn.edu360.mybatis.model.ItemsModel;

import java.util.List;

public interface ItemsDao {
    public List<ItemsModel> queryItemsByNameAndPrice(ItemsModel itemsModel);
}
