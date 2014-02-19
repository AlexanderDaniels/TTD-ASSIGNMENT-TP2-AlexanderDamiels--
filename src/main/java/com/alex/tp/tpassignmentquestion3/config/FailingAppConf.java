/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.tpassignmentquestion3.config;

import com.alex.tp.tpassignmentquestion3.services.FailingService;
import com.alex.tp.tpassignmentquestion3.services.Impl.FailingServiceImplemetation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Alex
 */
@Configuration
public class FailingAppConf {
    
    @Bean(name = "failing")
    public FailingService getService(){
        return new FailingServiceImplemetation();
    }
}
