package cn.edu360.mybatis.model;

public class OrdersModel {
    private Integer ordersId;
    private Integer count;
    private Integer status;
    private Integer userId;
    private UserModel userModel;

    @Override
    public String toString() {
        return "OrdersModel{" +
                "ordersId=" + ordersId +
                ", count=" + count +
                ", status=" + status +
                ", userId=" + userId +
                ", userModel=" + userModel +
                '}';
    }

    public Integer getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public UserModel getUserModel() {
        return userModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }
}
