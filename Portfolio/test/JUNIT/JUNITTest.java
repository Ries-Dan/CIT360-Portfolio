/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUNIT;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dan
 */
public class JUNITTest {
    
    public JUNITTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of main method, of class JUNIT.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        JUNIT.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compPrice method, of class JUNIT.
     */
    @Test
    public void testCompPrice() {
        System.out.println("compPrice");
        double cPrice = 0.0;
        double sPrice = 0.0;
        boolean expResult = false;
        boolean result = JUNIT.compPrice(cPrice, sPrice);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
