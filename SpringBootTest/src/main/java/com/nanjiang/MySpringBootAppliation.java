package com.nanjiang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 南江
 * @Description: ${todo}
 * @date 2019/12/2 21:30
 */
//声明该类是一个SpringBoot的引导类
@SpringBootApplication
public class MySpringBootAppliation {

    //main是Java程序的入口
    public static void main(String[] args) {
        //run方法 标识运行SpringBoot的引导类  run参数就是Spring Boot引导类的字节码对象
        SpringApplication.run(MySpringBootAppliation.class);
    }
}
