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
        DateTime dataCadastro = new DateTime("1998-05-22 06:24:12");
        instance.setDataCadastro(dataCadastro);
        DateTime expResult = dataCadastro;
        DateTime result = instance.getDataCadastro();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDataCadastro method, of class Cliente.
     */
    @Test
    public void testSetDataCadastro_DateTime() {
        System.out.println("setDataCadastro");
        DateTime dataCadastro = new DateTime("2005-03-11 00:00:00");
        Cliente instance = new Cliente();
        instance.setDataCadastro(dataCadastro);
        
        assertEquals(dataCadastro, instance.getDataCadastro());
    }

    /**
     * Test of setDataCadastro method, of class Cliente.
     */
    @Test
    public void testSetDataCadastro_String() {
        System.out.println("setDataCadastro");
        String dataCadastro = "22/06/2015";
        Cliente instance = new Cliente();
        instance.setDataCadastro(dataCadastro);
        DateTime expResult = new DateTime("2015-06-22 00:00:00.000000000");
        assertEquals(expResult, instance.getDataCadastro());
    }

    /**
     * Test of getDataSaida method, of class Cliente.
     */
    @Test
    public void testGetDataSaida() {
        System.out.println("getDataSaida");
        Cliente instance = new Cliente();
        instance.setDataSaida(new DateTime("2015-06-22 16:12:00"));
        DateTime expResult = new DateTime("2015-06-22 16:12:00");
        DateTime result = instance.getDataSaida();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDataSaida method, of class Cliente.
     */
    @Test
    public void testSetDataSaida() {
        System.out.println("setDataSaida");
        DateTime dataSaida = new DateTime("2015-06-22 16:15:00");
        Cliente instance = new Cliente();
        instance.setDataSaida(dataSaida);
        assertEquals(dataSaida, instance.getDataSaida());
    }
    
}
