/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.tpassignmentquestion3.config;

import com.alex.tp.tpassignmentquestion3.services.Impl.TruthFalseServiceImplementation;
import com.alex.tp.tpassignmentquestion3.services.TruthFalseService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Alex
 */
@Configuration
public class TruthFalseAppConf {
    
    @Bean(name = "truthfalse")
    public TruthFalseService getService(){
        return new TruthFalseServiceImplementation();
    }
    
}
