package cn.edu360.mybatis.test;

import cn.edu360.mybatis.model.ItemsModel;
import cn.edu360.mybatis.service.ItemsService;
import cn.edu360.mybatis.service.impl.ItemsServiceImpl;

import java.util.List;

public class ItemTest {
    public static void main(String[] args) {
        ItemsService itemsService=new ItemsServiceImpl();
        ItemsModel itemsModel=new ItemsModel();
        itemsModel.setItemsName("one");
        itemsModel.setPrice("");
        List<ItemsModel> itemsModels = itemsService.queryItemsByNameAndPrice(itemsModel);
        for (ItemsModel itemsModelData:itemsModels
             ) {
            System.out.println(itemsModelData);
        }
    }
}
