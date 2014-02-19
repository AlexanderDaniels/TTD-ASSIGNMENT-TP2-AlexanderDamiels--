/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.tpassignmentquestion3.config;

import com.alex.tp.tpassignmentquestion3.services.Impl.TimeoutIgnoreServiceImplementation;
import com.alex.tp.tpassignmentquestion3.services.TimeoutIgnoreService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Alex
 */
@Configuration
public class TimeoutIgnoreAppConf {
    
    @Bean(name = "timeoutignore")
    public TimeoutIgnoreService getService(){
        return new TimeoutIgnoreServiceImplementation();
    }
            
}
