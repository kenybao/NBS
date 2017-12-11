package main.java.dubbo.services.impl;

import main.java.dubbo.services.EmailService;
import org.springframework.stereotype.Service;

/**
 * @author 73598.
 * @Date 2017/12/4 0004.
 * @Time 16:59.
 */
@Service("EmailService")
public class EmailServiceImpl implements EmailService {
    @Override
    public String getEmail(String userName) {
        return userName+" : email";
    }
}
