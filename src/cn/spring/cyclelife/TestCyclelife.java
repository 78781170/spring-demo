package cn.spring.cyclelife;

import cn.spring.bean.FmcBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author macFmc
 * @date 2019/10/9-17:50
 */
public class TestCyclelife {
    public static void main(String[] args) {
        System.out.println("--------------【初始化容器】---------------");

        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/beandemo.xml");
        System.out.println("-------------------【容器初始化成功】------------------");
        //得到FmcBean，并显示其信息
        FmcBean fmcBean = context.getBean("fmcBean", FmcBean.class);
        System.out.println(fmcBean);

        System.out.println("--------------------【销毁容器】----------------------");
        ((ClassPathXmlApplicationContext) context).registerShutdownHook();
    }
}