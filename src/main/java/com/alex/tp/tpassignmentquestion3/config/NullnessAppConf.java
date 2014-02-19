/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.tpassignmentquestion3.config;

import com.alex.tp.tpassignmentquestion3.services.Impl.NullnessServiceImplementation;
import com.alex.tp.tpassignmentquestion3.services.NullnessService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Alex
 */
@Configuration
public class NullnessAppConf {
    
    @Bean(name = "nullness")
    public NullnessService getService(){
        return new NullnessServiceImplementation();
    }
}
