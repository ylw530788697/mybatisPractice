package cn.edu360.mybatis.service;

import cn.edu360.mybatis.model.UserModel;
/**
 * @author EvanYang
 */
public interface UserService {
    public UserModel findUserByUsernameAndPassword(UserModel userModel);
}
