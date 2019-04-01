package cn.edu360.mybatis.service;

import cn.edu360.mybatis.model.ItemsModel;
import cn.edu360.mybatis.model.responseModel.ItemsListResModel;

import java.util.List;
/**
 * @author EvanYang
 */
public interface ItemsService {
    public List<ItemsModel> queryItemsByNameAndPrice(ItemsModel itemsModel);

    public void  deleteItems(ItemsListResModel itemsListResModel);
}
