/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.tpassignmentquestion3.config;

import com.alex.tp.tpassignmentquestion3.services.FloatService;
import com.alex.tp.tpassignmentquestion3.services.Impl.FloatServiceImplementation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Alex
 */
@Configuration
public class FloatAppConf {
    
    @Bean(name = "float")    
    public FloatService getService(){
        return new FloatServiceImplementation();        
    }
}
