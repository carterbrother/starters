package com.ms.demo.config;

import com.ms.demo.beantest.MyBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class InitConfig implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof MyBean){
            log.info("=== postProcessBefore invoke");
        }
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof  MyBean){
            log.info("=== postProcessAfter invoke");
        }
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
