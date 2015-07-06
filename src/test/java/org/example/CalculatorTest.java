package org.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CalculatorTest {
    
    Calculator calc = new Calculator();
    
    @Test
    public void subtracts2Numbers() {
<<<<<<< HEAD
        int result = calc.subtract(3, 2);
=======
        int result = calc.subtract("2", "2");
>>>>>>> tkaczmarzyk/master
        
        assertEquals(1, result);
    }
}
