package main.java.dubbo.services.impl;

import main.java.dubbo.manager.UserInfoManager;
import main.java.dubbo.services.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

/**
 * @author 73598.
 * @Date 2017/12/4 0004.
 * @Time 14:18.
 */
@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {
    private static final Logger logger = LoggerFactory.getLogger(UserInfoServiceImpl.class);
    @Autowired
    UserInfoManager userInfoManager;
    @Override
    public String getUserInfo() {
        logger.debug(userInfoManager == null ?"null":"not null" );
       return  userInfoManager.getUserInfo();
    }
}
