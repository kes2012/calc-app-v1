package org.example.keshav.calcapp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculation {

    Logger logger = LoggerFactory.getLogger(Calculation.class);

    public double add(double a, double b){
        logger.debug("Adding {} and {}",a,b);
        return a+b;
    }

    public double sub(double a, double b){
        logger.debug("Suntracting {} and {}",a,b);
        return a-b;
    }

    public double mul(double a, double b){
        logger.debug("Multiplying {} and {}",a,b);
        return a*b;
    }
}
