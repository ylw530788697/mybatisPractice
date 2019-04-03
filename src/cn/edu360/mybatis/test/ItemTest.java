package cn.edu360.mybatis.test;

import cn.edu360.mybatis.model.ItemsModel;
import cn.edu360.mybatis.model.responseModel.ItemsListResModel;
import cn.edu360.mybatis.service.ItemsService;
import cn.edu360.mybatis.service.impl.ItemsServiceImpl;

import java.util.ArrayList;
import java.util.List;
/**
 * @author EvanYang
 */
public class ItemTest {
    public static void main(String[] args) {
       /* ItemsService itemsService=new ItemsServiceImpl();
        ItemsModel itemsModel=new ItemsModel();
        itemsModel.setItemsName("one");
        itemsModel.setPrice("");
        List<ItemsModel> itemsModels = itemsService.queryItemsByNameAndPrice(itemsModel);
        for (ItemsModel itemsModelData:itemsModels
             ) {
            System.out.println(itemsModelData);
        }*/

        ItemsListResModel itemsListResModel=new ItemsListResModel();
        List<Integer> integerList=new ArrayList<>(4);
        integerList.add(5);
        integerList.add(6);
        integerList.add(7);
        integerList.add(8);
        itemsListResModel.setIntegerList(integerList);
        ItemsService itemsService=new ItemsServiceImpl();
        itemsService.deleteItems(itemsListResModel);
    }
}
