package main.java.dubbo.services;

import org.springframework.stereotype.Service;

/**
 * @author 73598.
 * @Date 2017/12/4 0004.
 * @Time 14:11.
 */
public interface UserInfoService {
    /**
     * dubbo接口测试 获取用户信息master
     * @return
     */
     String getUserInfo();

}
