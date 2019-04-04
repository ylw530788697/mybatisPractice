package cn.edu360.mybatis.service.impl;

import cn.edu360.mybatis.dao.UserDao;
import cn.edu360.mybatis.model.UserModel;
import cn.edu360.mybatis.service.UserService;
import cn.edu360.mybatis.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * @author EvanYang
 */
public class UserServiceImpl implements UserService {
    @Override
    public UserModel findUserByUsernameAndPassword(UserModel userModel) {
        SqlSessionFactory factory = MybatisUtil.getFactory();
        SqlSession session = factory.openSession();
        UserDao userDao=session.getMapper(UserDao.class);
        UserModel userByUserModelNameAndPassword = userDao.findUserByUsernameAndPassword(userModel);
        return userByUserModelNameAndPassword;
    }

    @Override
    public List<UserModel> findUserOrdersList(Integer userId) {
        SqlSessionFactory factory = MybatisUtil.getFactory();
        SqlSession session = factory.openSession();
        UserDao userDao=session.getMapper(UserDao.class);
        List<UserModel> userOrdersList = userDao.findUserOrdersList(userId);
        return  userOrdersList;
    }
}
