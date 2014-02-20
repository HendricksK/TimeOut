/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.timeout.service.Impl;

import cputgroup3a.timeout.service.TimeOutService;

/**
 *
 * @author kurvin
 */

public class TimeOutServiceImpl implements TimeOutService{
    
    @Override
    public String msg(){
        return "Time Out has occured: ";
    }
}
