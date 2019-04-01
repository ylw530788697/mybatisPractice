package cn.edu360.mybatis.test;

import cn.edu360.mybatis.model.UserModel;
import cn.edu360.mybatis.service.UserService;
import cn.edu360.mybatis.service.impl.UserServiceImpl;
import org.junit.Test;


import java.util.Scanner;

public class UserTest {
    @Test
    public void test()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String userName=scanner.nextLine();
        System.out.println("请入密码:");
        String passWord=scanner.nextLine();
        UserModel userModel =new UserModel();
        userModel.setUserName(userName);
        userModel.setPassWord(passWord);
        //userModel.setUserName("zhangsan");
        //userModel.setPassWord("11");
        UserService userService=new UserServiceImpl();
        UserModel userByUserModelNameAndPassword = userService.findUserByUsernameAndPassword(userModel);
        if (userByUserModelNameAndPassword !=null){
            System.out.println("欢迎"+ userByUserModelNameAndPassword);
        }else{
            System.out.println("用户名错误");
        }
    }
}
