package cn.edu360.mybatis.dao;

import cn.edu360.mybatis.model.UserModel;
/**
 * @author EvanYang
 */
public interface UserDao {
    public UserModel findUserByUsernameAndPassword(UserModel userModel);
}
