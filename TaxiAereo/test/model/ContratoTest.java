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
        instance.setProtocolo("171");
        int expResult = 171;
        int result = instance.getProtocolo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setProtocolo method, of class Contrato.
     */
    @Test
    public void testSetProtocolo_int() {
        System.out.println("setProtocolo");
        int protocolo = 171;
        Contrato instance = new Contrato();
        instance.setProtocolo(protocolo);
        assertEquals(protocolo, instance.getProtocolo());
    }

    /**
     * Test of setProtocolo method, of class Contrato.
     */
    @Test
    public void testSetProtocolo_String() {
        System.out.println("setProtocolo");
        String protocolo = "171";
        Contrato instance = new Contrato();
        instance.setProtocolo(protocolo);
        assertEquals(171, instance.getProtocolo());
    }

    /**
     * Test of getValor method, of class Contrato.
     */
    @Test
    public void testGetValor() {
        System.out.println("getValor");
        Contrato instance = new Contrato();
        instance.setValor("15.10");
        BigDecimal expResult = new BigDecimal("15.10");
        BigDecimal result = instance.getValor();
        assertEquals(expResult, result);
    }

    /**
     * Test of setValor method, of class Contrato.
     */
    @Test
    public void testSetValor_BigDecimal() {
        System.out.println("setValor");
        BigDecimal valor = new BigDecimal("15.10");
        Contrato instance = new Contrato();
        instance.setValor(valor);
        assertEquals(valor, instance.getValor());
    }

    /**
     * Test of setValor method, of class Contrato.
     */
    @Test
    public void testSetValor_String() {
        System.out.println("setValor");
        String valor = "15.10";
        Contrato instance = new Contrato();
        instance.setValor(valor);
        BigDecimal expResult = new BigDecimal("15.10");
        
        assertEquals(expResult, instance.getValor());
    }

    /**
     * Test of getDataContrato method, of class Contrato.
     */
    @Test
    public void testGetDataContrato() {
        System.out.println("getDataContrato");
        Contrato instance = new Contrato();
        DateTime expResult = new DateTime("2015-06-22");
        instance.setDataContrato(expResult);
        DateTime result = instance.getDataContrato();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDataContrato method, of class Contrato.
     */
    @Test
    public void testSetDataContrato_DateTime() {
        System.out.println("setDataContrato");
        DateTime dataContrato = new DateTime("2015-06-22");
        Contrato instance = new Contrato();
        instance.setDataContrato(dataContrato);
        assertEquals(dataContrato, instance.getDataContrato());
    }

    /**
     * Test of setDataContrato method, of class Contrato.
     */
    @Test
    public void testSetDataContrato_String() {
        System.out.println("setDataContrato");
        String dataContrato = "22/06/2015";
        Contrato instance = new Contrato();
        instance.setDataContrato(dataContrato);
        DateTime expResult = new DateTime("2015-06-22 00:00:00.00000000");
        assertEquals(expResult, instance.getDataContrato());
    }

    /**
     * Test of getDesconto method, of class Contrato.
     */
    @Test
    public void testGetDesconto() {
        System.out.println("getDesconto");
        Contrato instance = new Contrato();
        BigDecimal expResult = new BigDecimal("3.60");
        instance.setDesconto(expResult);
        BigDecimal result = instance.getDesconto();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDesconto method, of class Contrato.
     */
    @Test
    public void testSetDesconto_BigDecimal() {
        System.out.println("setDesconto");
        BigDecimal desconto = new BigDecimal("3.60");
        Contrato instance = new Contrato();
        instance.setDesconto(desconto);
        assertEquals(desconto, instance.getDesconto());
    }

    /**
     * Test of setDesconto method, of class Contrato.
     */
    @Test
    public void testSetDesconto_String() {
        System.out.println("setDesconto");
        String desconto = "3.60";
        Contrato instance = new Contrato();
        instance.setDesconto(desconto);
        BigDecimal expResult = new BigDecimal("3.60");
        assertEquals(expResult, instance.getDesconto());
    }

    /**
     * Test of getCliente method, of class Contrato.
     */
    @Test
    public void testGetCliente() {
        System.out.println("getCliente");
        Contrato instance = new Contrato();
        Cliente expResult = new Cliente();
        instance.setCliente(expResult);
        Cliente result = instance.getCliente();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCliente method, of class Contrato.
     */
    @Test
    public void testSetCliente() {
        System.out.println("setCliente");
        Cliente cliente = new Cliente();
        Contrato instance = new Contrato();
        instance.setCliente(cliente);
        assertEquals(cliente, instance.getCliente());
    }

    /**
     * Test of getVendedor method, of class Contrato.
     */
    @Test
    public void testGetVendedor() {
        System.out.println("getVendedor");
        Contrato instance = new Contrato();
        Vendedor expResult = new Vendedor();
        instance.setVendedor(expResult);
        Vendedor result = instance.getVendedor();
        assertEquals(expResult, result);
    }

    /**
     * Test of setVendedor method, of class Contrato.
     */
    @Test
    public void testSetVendedor() {
        System.out.println("setVendedor");
        Vendedor vendedor = new Vendedor();
        Contrato instance = new Contrato();
        instance.setVendedor(vendedor);
        assertEquals(vendedor, instance.getVendedor());
    }

    /**
     * Test of toString method, of class Contrato.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Contrato instance = new Contrato();
        instance.setProtocolo("171");
        instance.setDataContrato(new DateTime("2015-06-22"));
        String expResult = "Nº Protoc: 171 (22/06/2015)";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
