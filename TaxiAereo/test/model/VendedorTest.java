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
        instance.setMatricula(1001);
        int expResult = 1001;
        int result = instance.getMatricula();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMatricula method, of class Vendedor.
     */
    @Test
    public void testSetMatricula_int() {
        System.out.println("setMatricula");
        int matricula = 1001;
        Vendedor instance = new Vendedor();
        instance.setMatricula(matricula);
        assertEquals(1001, instance.getMatricula());
    }

    /**
     * Test of setMatricula method, of class Vendedor.
     */
    @Test
    public void testSetMatricula_String() {
        System.out.println("setMatricula");
        String matricula = "1001";
        Vendedor instance = new Vendedor();
        instance.setMatricula(matricula);
        assertEquals(1001, instance.getMatricula());
    }

    /**
     * Test of toString method, of class Vendedor.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Vendedor instance = new Vendedor();
        instance.setNome("Sales Man");
        instance.setMatricula(1001);
        String expResult = "Sales Man (Matrícula: 1001)";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
