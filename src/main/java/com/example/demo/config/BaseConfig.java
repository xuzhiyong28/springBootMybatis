package com.example.demo.config;/**
 * Created by Administrator on 2018-05-21.
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author xuzhiyong
 * @createDate 2018-05-21-9:58
 */
@Configuration
public class BaseConfig {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }


}
