package com.learning.rabbitmq.demo.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by fx on 2018/3/29.
 */
@Configuration
public class RabbitConfig {

    @Bean
    public List<Queue> queue(){

        List<Queue> queues = new ArrayList<>();
        queues.add(new Queue("object"));
        queues.add(new Queue("hello"));
        return queues;
    }
}
