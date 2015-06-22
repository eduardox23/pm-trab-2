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
public class VendedorTest {
    
    public VendedorTest() {
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
     * Test of getMatricula method, of class Vendedor.
     */
    @Test
    public void testGetMatricula() {
        System.out.println("getMatricula");
        Vendedor instance = new Vendedor();
        int expResult = 0;
        int result = instance.getMatricula();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMatricula method, of class Vendedor.
     */
    @Test
    public void testSetMatricula_int() {
        System.out.println("setMatricula");
        int matricula = 0;
        Vendedor instance = new Vendedor();
        instance.setMatricula(matricula);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMatricula method, of class Vendedor.
     */
    @Test
    public void testSetMatricula_String() {
        System.out.println("setMatricula");
        String matricula = "";
        Vendedor instance = new Vendedor();
        instance.setMatricula(matricula);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Vendedor.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Vendedor instance = new Vendedor();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
