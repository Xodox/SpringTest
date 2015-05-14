package com.xod.batch.server;

import com.xod.batch.server.utils.MainApplicationListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by protsenkov on 5/13/2015.
 */


@EnableAutoConfiguration
@ComponentScan
@Controller
public class MainApplicationClass extends WebMvcConfigurerAdapter {



    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(MainApplicationClass.class);
        app.setShowBanner(false);
        app.setAdditionalProfiles("--info");
//        app.setListeners(Arrays.<ApplicationListener<?>>asList((ApplicationListener) (new MainApplicationListener())));
        app.setLogStartupInfo(false);
        app.run(args);
    }


    @Bean
    @Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
    public MySecurity getConfiguration(){
        return new MySecurity();
    }

    public class MySecurity extends WebSecurityConfigurerAdapter {
        @Override
        public void configure(WebSecurity web) throws Exception {
            web.ignoring().antMatchers("/**");


        }
    }

}
