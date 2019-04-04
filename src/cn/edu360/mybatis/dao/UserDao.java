package cn.edu360.mybatis.dao;

import cn.edu360.mybatis.model.UserModel;

import java.util.List;

/**
 * @author EvanYang
 */
public interface UserDao {
    public UserModel findUserByUsernameAndPassword(UserModel userModel);

    public List<UserModel> findUserOrdersList(Integer userId);
}
