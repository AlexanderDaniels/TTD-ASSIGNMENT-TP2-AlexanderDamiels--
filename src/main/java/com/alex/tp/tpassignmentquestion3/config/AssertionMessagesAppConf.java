/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.tpassignmentquestion3.config;

import com.alex.tp.tpassignmentquestion3.services.AssertionMessagesService;
import com.alex.tp.tpassignmentquestion3.services.Impl.AssertionMessagesServiceImplementation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Alex
 */
@Configuration
public class AssertionMessagesAppConf {
    
    @Bean(name = "assertionMessages")    
    public AssertionMessagesService getService(){
        return new AssertionMessagesServiceImplementation();        
    }   
}
