/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.tpassignmentquestion3.config;

import com.alex.tp.tpassignmentquestion3.services.ExceptionService;
import com.alex.tp.tpassignmentquestion3.services.Impl.ExceptionServiceImplemetation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Alex
 */
@Configuration
public class ExceptionAppConf {
    
    @Bean(name = "exception")
    public ExceptionService getService(){
        return new ExceptionServiceImplemetation();
    }
}
