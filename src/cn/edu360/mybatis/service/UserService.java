package cn.edu360.mybatis.service;

import cn.edu360.mybatis.model.UserModel;

import java.util.List;

/**
 * @author EvanYang
 */
public interface UserService {
    public UserModel findUserByUsernameAndPassword(UserModel userModel);

    public List<UserModel> findUserOrdersList(Integer userId);
}
