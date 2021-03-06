package cn.edu360.mybatis.model;

import java.util.List;

/**
 * @author EvanYang
 */
public class UserModel {
    private Integer userId;

    private String userName;

    private Integer age;

    private String passWord;

    private List<OrdersModel> ordersModelList;

    public List<OrdersModel> getOrdersModelList() {
        return ordersModelList;
    }

    public void setOrdersModelList(List<OrdersModel> ordersModelList) {
        this.ordersModelList = ordersModelList;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", age=" + age +
                ", passWord='" + passWord + '\'' +
                '}';
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
