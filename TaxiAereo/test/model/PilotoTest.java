/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author urielbertoche
 */
public class PilotoTest {
    
    public PilotoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getBreve method, of class Piloto.
     */
    @Test
    public void testGetBreve() {
        System.out.println("getBreve");
        Piloto instance = new Piloto();
        int expResult = 0;
        int result = instance.getBreve();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBreve method, of class Piloto.
     */
    @Test
    public void testSetBreve_int() {
        System.out.println("setBreve");
        int breve = 0;
        Piloto instance = new Piloto();
        instance.setBreve(breve);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBreve method, of class Piloto.
     */
    @Test
    public void testSetBreve_String() {
        System.out.println("setBreve");
        String breve = "";
        Piloto instance = new Piloto();
        instance.setBreve(breve);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Piloto.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Piloto instance = new Piloto();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
