/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.tpassignmentquestion3.config;

import com.alex.tp.tpassignmentquestion3.services.Impl.ObjectServiceImplementation;
import com.alex.tp.tpassignmentquestion3.services.ObjectService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Alex
 */
@Configuration
public class ObjectAppConf {
    
    @Bean(name = "objectIdentify")    
    public ObjectService getService(){
        return new ObjectServiceImplementation();        
    }
}
