package com.magic.springboot.rabbit.hello;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public String  send() {
        String context = "hello " + "你好我是单对单测试";
        System.out.println("单对单发送参数 : " + context);
        this.rabbitTemplate.convertAndSend("hello", context);
        return "发送成功";
    }
}
