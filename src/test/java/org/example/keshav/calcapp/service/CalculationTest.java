package org.example.keshav.calcapp.service;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CalculationTest {

    Calculation calc;
    Logger logger = LoggerFactory.getLogger(CalculationTest.class);

    @BeforeEach
    public void setUp(){
        logger.info("setup:- initiated and service instantiated");
        calc = new Calculation();
    }

    @Test
    public void testAdd(){
        Assertions.assertNotNull(calc, "Service object is null");
        Assertions.assertEquals(9,calc.add(4,5));
    }

    @Test
    public void testSub(){
        Assertions.assertNotNull(calc, "Service object is null");
        Assertions.assertEquals(-1,calc.sub(4,5));
    }

    @Test
    public void testMul(){
        Assertions.assertNotNull(calc, "Service object is null");
        Assertions.assertEquals(20,calc.mul(4,5));
    }

    @Test
    public void testDiv(){
        Assertions.assertNotNull(calc, "Service object is null");
        Assertions.assertEquals(5,calc.div(20,4));
    }

    @AfterEach
    public void tearDown(){
        calc = null;
        logger.info("tearDown:- Initiated and Service instance destroyed ");
    }

}
