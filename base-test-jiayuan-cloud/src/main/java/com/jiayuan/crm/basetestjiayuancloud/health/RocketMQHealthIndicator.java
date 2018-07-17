package com.jiayuan.crm.basetestjiayuancloud.health;


import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;

/**
 * 实现一个用来采集RocketMQ健康信息的检测器
 * 重新启动应用， 并访问/health接口， 我们在返回的JSON字符串中，将会包含如
 * 下信息：
 */
public class RocketMQHealthIndicator implements HealthIndicator {
    @Override
    public Health health() {
        int errorCode=check();
        if (errorCode!=0){
            return Health.down().withDetail("Error Code",errorCode).build();
        }
        return Health.up().build();
    }

    private int check(){
        //对监控对象的检测操作
        return 0;
    }
}
