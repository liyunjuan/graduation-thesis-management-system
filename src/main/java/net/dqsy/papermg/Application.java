package net.dqsy.papermg;

import net.dqsy.papermg.support.CustomRepositoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


/**
 * Hello World!
 * 是Spring Boot项目的核心注解,主要是开启自动配置
 */
@SpringBootApplication
@EnableJpaRepositories(repositoryBaseClass = CustomRepositoryImpl.class)
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    //@Bean
    //public CommonsMultipartResolver commonsMultipartResolver() {
    //    CommonsMultipartResolver resolver = new CommonsMultipartResolver();
    //    resolver.setDefaultEncoding("UTF-8");
    //    resolver.setMaxUploadSize(5 * 1024 * 1024);
    //    return resolver;
    //}

}

