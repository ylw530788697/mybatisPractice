package cn.edu360.mybatis.service;

import cn.edu360.mybatis.model.ItemsModel;

import java.util.List;

public interface ItemsService {
    public List<ItemsModel> queryItemsByNameAndPrice(ItemsModel itemsModel);
}
