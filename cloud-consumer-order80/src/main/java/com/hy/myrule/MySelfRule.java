package com.hy.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ：hy
 * @description：TODO
 * @date ：2020/11/2 22:13
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule()
    {
        return new RandomRule();// 定义为随机
    }
}
