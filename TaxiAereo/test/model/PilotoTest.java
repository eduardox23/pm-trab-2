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
        instance.setBreve(250);
        int expResult = 250;
        int result = instance.getBreve();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBreve method, of class Piloto.
     */
    @Test
    public void testSetBreve_int() {
        System.out.println("setBreve");
        int breve = 250;
        Piloto instance = new Piloto();
        instance.setBreve(breve);
        assertEquals(breve, instance.getBreve());
    }

    /**
     * Test of setBreve method, of class Piloto.
     */
    @Test
    public void testSetBreve_String() {
        System.out.println("setBreve");
        String breve = "250";
        Piloto instance = new Piloto();
        instance.setBreve(breve);
        assertEquals(250, instance.getBreve());
    }

    /**
     * Test of toString method, of class Piloto.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Piloto instance = new Piloto();
        instance.setNome("Carlos Alberto");
        instance.setBreve(250);
        String expResult = "Carlos Alberto (Brevê: 250)";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}
