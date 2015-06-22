/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import hirondelle.date4j.DateTime;
import java.math.BigDecimal;
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
public class FuncionarioTest {
    
    public FuncionarioTest() {
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
     * Test of getDataContrato method, of class Funcionario.
     */
    @Test
    public void testGetDataContrato() {
        System.out.println("getDataContrato");
        Funcionario instance = new Funcionario();
        DateTime expResult = null;
        DateTime result = instance.getDataContrato();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataContrato method, of class Funcionario.
     */
    @Test
    public void testSetDataContrato_DateTime() {
        System.out.println("setDataContrato");
        DateTime dataContrato = null;
        Funcionario instance = new Funcionario();
        instance.setDataContrato(dataContrato);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataContrato method, of class Funcionario.
     */
    @Test
    public void testSetDataContrato_String() {
        System.out.println("setDataContrato");
        String dataContrato = "";
        Funcionario instance = new Funcionario();
        instance.setDataContrato(dataContrato);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataSaida method, of class Funcionario.
     */
    @Test
    public void testGetDataSaida() {
        System.out.println("getDataSaida");
        Funcionario instance = new Funcionario();
        DateTime expResult = null;
        DateTime result = instance.getDataSaida();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataSaida method, of class Funcionario.
     */
    @Test
    public void testSetDataSaida() {
        System.out.println("setDataSaida");
        DateTime dataSaida = null;
        Funcionario instance = new Funcionario();
        instance.setDataSaida(dataSaida);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSalario method, of class Funcionario.
     */
    @Test
    public void testGetSalario() {
        System.out.println("getSalario");
        Funcionario instance = new Funcionario();
        BigDecimal expResult = null;
        BigDecimal result = instance.getSalario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSalario method, of class Funcionario.
     */
    @Test
    public void testSetSalario_BigDecimal() {
        System.out.println("setSalario");
        BigDecimal salario = null;
        Funcionario instance = new Funcionario();
        instance.setSalario(salario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSalario method, of class Funcionario.
     */
    @Test
    public void testSetSalario_String() {
        System.out.println("setSalario");
        String salario = "";
        Funcionario instance = new Funcionario();
        instance.setSalario(salario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
