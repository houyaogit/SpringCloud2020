package com.hy.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Configuration;

/**
 * @author ：hy
 * @description：TODO
 * @date ：2020/11/3 19:33
 */
@Configuration
public class FeignConfig {
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
