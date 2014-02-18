/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.tpassignmentquestion3.config;

import com.alex.tp.tpassignmentquestion3.services.Impl.IntegerServiceImplementation;
import com.alex.tp.tpassignmentquestion3.services.IntegerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Alex
 */
@Configuration
public class IntegerAppConfig {
    
    @Bean(name = "integer")    
    public IntegerService getService(){
        return new IntegerServiceImplementation();
    }
}
