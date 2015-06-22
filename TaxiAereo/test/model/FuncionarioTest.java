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
        DateTime expResult = new DateTime("2015-05-22");
        instance.setDataContrato(expResult);
        DateTime result = instance.getDataContrato();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDataContrato method, of class Funcionario.
     */
    @Test
    public void testSetDataContrato_DateTime() {
        System.out.println("setDataContrato");
        DateTime dataContrato = new DateTime("2015-05-22");
        Funcionario instance = new Funcionario();
        instance.setDataContrato(dataContrato);
        assertEquals(dataContrato, instance.getDataContrato());
    }

    /**
     * Test of setDataContrato method, of class Funcionario.
     */
    @Test
    public void testSetDataContrato_String() {
        System.out.println("setDataContrato");
        String dataContrato = "22/06/2015";
        Funcionario instance = new Funcionario();
        instance.setDataContrato(dataContrato);
        DateTime expResult = new DateTime("2015-06-22 00:00:00.00000000");
        assertEquals(expResult, instance.getDataContrato());
    }

    /**
     * Test of getDataSaida method, of class Funcionario.
     */
    @Test
    public void testGetDataSaida() {
        System.out.println("getDataSaida");
        Funcionario instance = new Funcionario();
        DateTime expResult = new DateTime("2015-06-22");
        instance.setDataSaida(expResult);
        DateTime result = instance.getDataSaida();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDataSaida method, of class Funcionario.
     */
    @Test
    public void testSetDataSaida() {
        System.out.println("setDataSaida");
        DateTime dataSaida = new DateTime("2015-06-22");
        Funcionario instance = new Funcionario();
        instance.setDataSaida(dataSaida);
        assertEquals(dataSaida, instance.getDataSaida());
    }

    /**
     * Test of getSalario method, of class Funcionario.
     */
    @Test
    public void testGetSalario() {
        System.out.println("getSalario");
        Funcionario instance = new Funcionario();
        BigDecimal expResult = new BigDecimal("3600.00");
        instance.setSalario("3600.00");
        BigDecimal result = instance.getSalario();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSalario method, of class Funcionario.
     */
    @Test
    public void testSetSalario_BigDecimal() {
        System.out.println("setSalario");
        BigDecimal salario = new BigDecimal("3600");
        Funcionario instance = new Funcionario();
        instance.setSalario(salario);
        
        assertEquals(salario, instance.getSalario());
    }

    /**
     * Test of setSalario method, of class Funcionario.
     */
    @Test
    public void testSetSalario_String() {
        System.out.println("setSalario");
        String salario = "3600.00";
        Funcionario instance = new Funcionario();
        instance.setSalario(salario);
        BigDecimal expResult = new BigDecimal("3600.00");
        assertEquals(expResult, instance.getSalario());
    }
    
}
