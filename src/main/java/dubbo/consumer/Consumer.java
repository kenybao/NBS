package main.java.dubbo.consumer;

import main.java.dubbo.services.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 73598.
 * @Date 2017/12/4 0004.
 * @Time 15:03.
 */
public class Consumer {
    private static final Logger logger = LoggerFactory.getLogger(Consumer.class);
    @Autowired
    public static UserInfoService userInfoService;
    public static void main(String[] args) throws Exception {
        logger.error("Consumer  start-------------------------------------- start");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"/dubbo/consumer/consumer.xml"});
        context.start();
        // 获取远程服务代理
//        UserInfoService userInfoService = (UserInfoService)context.getBean("UserInfoService");
        // 执行远程方法
        String hello = userInfoService.getUserInfo();
        // 显示调用结果
        System.out.println( hello );
        logger.error("Consumer  end--------------------------------------end");
    }
}
