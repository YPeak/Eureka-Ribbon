package com.example.order.Listener;

import org.springframework.boot.context.embedded.EmbeddedServletContainerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

/**
 * Created by shuwei.yu.
 * on 2018/5/17.
 */
@Configuration  //注册组件  不要忘记
public class ServiceInfoUtil implements ApplicationListener<EmbeddedServletContainerInitializedEvent> {
    private static EmbeddedServletContainerInitializedEvent event;

    @Override
    public void onApplicationEvent(EmbeddedServletContainerInitializedEvent embeddedServletContainerInitializedEvent) {
        ServiceInfoUtil.event = embeddedServletContainerInitializedEvent;
    }
    public static int port(){
        int port = event.getEmbeddedServletContainer().getPort();
        return port;
    }
}
