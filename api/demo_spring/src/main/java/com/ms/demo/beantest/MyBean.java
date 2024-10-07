package com.ms.demo.beantest;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MyBean  implements ApplicationContextAware , InitializingBean, DisposableBean {
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        log.info("=== {} invoke","ApplicationContextAware");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("=== afterPropertiesSet invoke");
    }

    @Override
    public void destroy() throws Exception {
        log.info("== destroy invoke");
    }

    public MyBean(){
        log.info("=== Construct invoke");
    }

    @PostConstruct
    public void init(){
        log.info("=== @PostConstruct init invoke");
    }


    @PreDestroy
    public void destr(){
        log.info("=== @PreDestroy");
    }

}
