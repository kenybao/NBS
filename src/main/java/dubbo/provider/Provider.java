package dubbo.provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 73598.
 * @Date 2017/12/4 0004.
 * @Time 14:09.
 */
public class Provider {
    private static final Logger logger = LoggerFactory.getLogger(Provider.class);
    public static void main(String[] args) throws Exception {

        logger.error("Provider  start-------------------------------------- start");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("main/resources/dubbo/provider/provider.xml");
        context.start();
        System.in.read(); // 按任意键退出
        logger.error("Provider  end-------------------------------------- end");
    }
}