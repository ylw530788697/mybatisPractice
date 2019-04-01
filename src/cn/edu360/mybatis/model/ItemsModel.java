package cn.edu360.mybatis.model;
/**
 * @author EvanYang
 */
public class ItemsModel {
    private Integer itemsId;
    private String itemsName;
    private String price;

    @Override
    public String toString() {
        return "ItemsModel{" +
                "itemsId=" + itemsId +
                ", itemsName='" + itemsName + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public Integer getItemsId() {
        return itemsId;
    }

    public void setItemsId(Integer itemsId) {
        this.itemsId = itemsId;
    }

    public String getItemsName() {
        return itemsName;
    }

    public void setItemsName(String itemsName) {
        this.itemsName = itemsName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
