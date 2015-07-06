package org.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CalculatorTest {
    
    Calculator calc = new Calculator();
    
    @Test
    public void subtracts2Numbers() {
        assertEquals(0, calc.subtract(2, 2));
        
        assertEquals(1, calc.subtract(2, 1));
    }
}
