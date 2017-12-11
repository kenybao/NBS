package main.java.dubbo.servicesImpl;

import main.java.dubbo.services.UserInfoService;

/**
 * @author 73598.
 * @Date 2017/12/4 0004.
 * @Time 14:18.
 */
public class UserInfoServiceImpl implements UserInfoService {
    @Override
    public String getUserInfo() {
        return "get  UserInfo";
    }
}
