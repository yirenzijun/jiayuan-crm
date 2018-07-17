package com.jiayuan.crm.basetestjiayuancloud.securityconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
//开启Spring Security功能
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests() //定义哪些url需要保护，哪些url不需要保护
                .antMatchers("/","hello").permitAll() //定义不需要认证就可以访问
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")//定义当需要用户登录时候，转到的登录页面
                .permitAll()
                .and()
        .logout()
        .permitAll();
        http.csrf().disable();
        super.configure(http);
    }
}
