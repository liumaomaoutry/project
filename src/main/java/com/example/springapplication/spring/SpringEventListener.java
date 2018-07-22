package com.example.springapplication.spring;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.support.GenericApplicationContext;

public class SpringEventListener {

    public static void main(String[] args) {
        GenericApplicationContext context = new GenericApplicationContext();
        //添加事件監聽器
        //監聽了兩個事件：1.ContextRefreshedEvent  2.PayloadApplicationEvent
        context.addApplicationListener(new ApplicationListener<ApplicationEvent>() {


            @Override
            public void onApplicationEvent(ApplicationEvent applicationEvent) {
                System.err.println ("監聽事件"+applicationEvent);
            }
        });
        context.refresh();
        context.publishEvent("Hello,this is a event");
        //多了一個自定義事件
        context.publishEvent(new MyEvent("HelloWorld 2018"));
    }

    private static class MyEvent extends ApplicationEvent{
        public MyEvent(Object source) {
            super(source);
        }
    }
}
