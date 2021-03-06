package com.zk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

//@EnableAutoConfiguration()  //启用自动配置 该框架就能够进行行为的配置，以引导应用程序的启动与运行, 根据导入的starter-pom 自动加载配置
//@EnableJpaRepositories(basePackages={"com.zk.dao.*Mapper"})
//@EnableJpaRepositories(basePackages={"dao层对应的包路径"})
@ComponentScan(value="com.zk.*")//扫描组件 @ComponentScan(value = "com.spriboot.controller") 配置扫描组件的路径
//@SpringBootApplication
//@EntityScan("entity对应的包路径")
//@EntityScan("com.zk.pojo")
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
