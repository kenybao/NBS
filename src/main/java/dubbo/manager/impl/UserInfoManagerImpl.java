package main.java.dubbo.manager.impl;

import main.java.dubbo.manager.UserInfoManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author 73598.
 * @Date 2017/12/4 0004.
 * @Time 19:34.
 */
@Service("UserInfoManager")
public class UserInfoManagerImpl implements UserInfoManager {
    private static final Logger logger = LoggerFactory.getLogger(UserInfoManagerImpl.class);
    @Override
    public String getUserInfo() {
        logger.debug("UserInfoManagerImpl------------------");
        return "UserInfoManagerImpl" ;
    }
}
