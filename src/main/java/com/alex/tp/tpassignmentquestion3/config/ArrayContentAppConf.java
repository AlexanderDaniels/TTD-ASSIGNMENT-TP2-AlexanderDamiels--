/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.tpassignmentquestion3.config;

import com.alex.tp.tpassignmentquestion3.services.ArrayContentService;
import com.alex.tp.tpassignmentquestion3.services.Impl.ArrayContentServiceImplementation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Alex
 */
@Configuration
public class ArrayContentAppConf {
    
    @Bean(name="arraycontent")
    public ArrayContentService getService(){
        return new ArrayContentServiceImplementation();        
    }
}
