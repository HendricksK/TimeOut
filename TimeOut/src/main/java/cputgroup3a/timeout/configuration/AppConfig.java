/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.timeout.configuration;

import cputgroup3a.timeout.service.Impl.TimeOutServiceImpl;
import cputgroup3a.timeout.service.TimeOutService;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author kurvin
 */
public class AppConfig {
    @Bean(name="TM")
    public TimeOutService getService(){
        return new TimeOutServiceImpl();
    }
}
