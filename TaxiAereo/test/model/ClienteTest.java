/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import hirondelle.date4j.DateTime;
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
public class ClienteTest {
    
    public ClienteTest() {
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
     * Test of getDataCadastro method, of class Cliente.
     */
    @Test
    public void testGetDataCadastro() {
        System.out.println("getDataCadastro");
        Cliente instance = new Cliente();
        DateTime expResult = null;
        DateTime result = instance.getDataCadastro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataCadastro method, of class Cliente.
     */
    @Test
    public void testSetDataCadastro_DateTime() {
        System.out.println("setDataCadastro");
        DateTime dataCadastro = null;
        Cliente instance = new Cliente();
        instance.setDataCadastro(dataCadastro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataCadastro method, of class Cliente.
     */
    @Test
    public void testSetDataCadastro_String() {
        System.out.println("setDataCadastro");
        String dataCadastro = "";
        Cliente instance = new Cliente();
        instance.setDataCadastro(dataCadastro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataSaida method, of class Cliente.
     */
    @Test
    public void testGetDataSaida() {
        System.out.println("getDataSaida");
        Cliente instance = new Cliente();
        DateTime expResult = null;
        DateTime result = instance.getDataSaida();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataSaida method, of class Cliente.
     */
    @Test
    public void testSetDataSaida() {
        System.out.println("setDataSaida");
        DateTime dataSaida = null;
        Cliente instance = new Cliente();
        instance.setDataSaida(dataSaida);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
