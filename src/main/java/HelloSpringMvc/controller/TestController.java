package main.java.HelloSpringMvc.controller;

import main.java.dubbo.manager.UserInfoManager;
import main.java.dubbo.services.EmailService;
import main.java.dubbo.services.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Administrator
 * @date 2016/8/29
 */

@Controller
//访问的url地址前缀，可以不写，写了就必须在方法url前面先加上class url 进行区分控制器
@RequestMapping(value = "/Test/*")
public class TestController {
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);
    @Autowired
    UserInfoManager userInfoManager;
    @Autowired
    UserInfoService userInfoService;
    @Autowired
    EmailService emailService;
    //访问地址：http://localhost:8080/Test/returnSuccess
    //实际访问的url地址
    @RequestMapping(value = "returnSuccess")
    public String returnSuccess() {
        return "/Views/success";    //返回Views文件夹下的success.jsp页面
    }

    //访问地址：http://localhost:8080/Test/returnString
    @RequestMapping(value = "returnString", produces = {"text/plain;charset=UTF-8"})
    //produces用于解决返回中文乱码问题，application/json;为json解决中文乱码
    @ResponseBody       //用于返回字符串,不写即返回视图
    public String returnString() {
        return "hello return string 这是中文，并没有乱码";
    }
    @RequestMapping(value = "returnDubbo", produces = {"text/plain;charset=UTF-8"})
    @ResponseBody
    public String returnDubbo() {
        logger.debug("returnDubbo");
        logger.debug("email :" ,emailService.getEmail(""));
        return userInfoService.getUserInfo()+"controller return";
//        return emailService.getEmail("123");
    }
    @RequestMapping(value = "returnManager", produces = {"text/plain;charset=UTF-8"})
    @ResponseBody
    public String returnManager() {
        return userInfoManager.getUserInfo()+"controller return";
//        return emailService.getEmail("123");
    }
}