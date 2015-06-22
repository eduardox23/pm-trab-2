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
public class ContratoTest {
    
    public ContratoTest() {
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
     * Test of getProtocolo method, of class Contrato.
     */
    @Test
    public void testGetProtocolo() {
        System.out.println("getProtocolo");
        Contrato instance = new Contrato();
        int expResult = 0;
        int result = instance.getProtocolo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProtocolo method, of class Contrato.
     */
    @Test
    public void testSetProtocolo_int() {
        System.out.println("setProtocolo");
        int protocolo = 0;
        Contrato instance = new Contrato();
        instance.setProtocolo(protocolo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProtocolo method, of class Contrato.
     */
    @Test
    public void testSetProtocolo_String() {
        System.out.println("setProtocolo");
        String protocolo = "";
        Contrato instance = new Contrato();
        instance.setProtocolo(protocolo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValor method, of class Contrato.
     */
    @Test
    public void testGetValor() {
        System.out.println("getValor");
        Contrato instance = new Contrato();
        BigDecimal expResult = null;
        BigDecimal result = instance.getValor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValor method, of class Contrato.
     */
    @Test
    public void testSetValor_BigDecimal() {
        System.out.println("setValor");
        BigDecimal valor = null;
        Contrato instance = new Contrato();
        instance.setValor(valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValor method, of class Contrato.
     */
    @Test
    public void testSetValor_String() {
        System.out.println("setValor");
        String valor = "";
        Contrato instance = new Contrato();
        instance.setValor(valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataContrato method, of class Contrato.
     */
    @Test
    public void testGetDataContrato() {
        System.out.println("getDataContrato");
        Contrato instance = new Contrato();
        DateTime expResult = null;
        DateTime result = instance.getDataContrato();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataContrato method, of class Contrato.
     */
    @Test
    public void testSetDataContrato_DateTime() {
        System.out.println("setDataContrato");
        DateTime dataContrato = null;
        Contrato instance = new Contrato();
        instance.setDataContrato(dataContrato);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataContrato method, of class Contrato.
     */
    @Test
    public void testSetDataContrato_String() {
        System.out.println("setDataContrato");
        String dataContrato = "";
        Contrato instance = new Contrato();
        instance.setDataContrato(dataContrato);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDesconto method, of class Contrato.
     */
    @Test
    public void testGetDesconto() {
        System.out.println("getDesconto");
        Contrato instance = new Contrato();
        BigDecimal expResult = null;
        BigDecimal result = instance.getDesconto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDesconto method, of class Contrato.
     */
    @Test
    public void testSetDesconto_BigDecimal() {
        System.out.println("setDesconto");
        BigDecimal desconto = null;
        Contrato instance = new Contrato();
        instance.setDesconto(desconto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDesconto method, of class Contrato.
     */
    @Test
    public void testSetDesconto_String() {
        System.out.println("setDesconto");
        String desconto = "";
        Contrato instance = new Contrato();
        instance.setDesconto(desconto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCliente method, of class Contrato.
     */
    @Test
    public void testGetCliente() {
        System.out.println("getCliente");
        Contrato instance = new Contrato();
        Cliente expResult = null;
        Cliente result = instance.getCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCliente method, of class Contrato.
     */
    @Test
    public void testSetCliente() {
        System.out.println("setCliente");
        Cliente cliente = null;
        Contrato instance = new Contrato();
        instance.setCliente(cliente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVendedor method, of class Contrato.
     */
    @Test
    public void testGetVendedor() {
        System.out.println("getVendedor");
        Contrato instance = new Contrato();
        Vendedor expResult = null;
        Vendedor result = instance.getVendedor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVendedor method, of class Contrato.
     */
    @Test
    public void testSetVendedor() {
        System.out.println("setVendedor");
        Vendedor vendedor = null;
        Contrato instance = new Contrato();
        instance.setVendedor(vendedor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Contrato.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Contrato instance = new Contrato();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
