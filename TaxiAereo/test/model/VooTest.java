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
public class VooTest {
    
    public VooTest() {
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
     * Test of getNumero method, of class Voo.
     */
    @Test
    public void testGetNumero() {
        System.out.println("getNumero");
        Voo instance = new Voo();
        int expResult = 0;
        int result = instance.getNumero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumero method, of class Voo.
     */
    @Test
    public void testSetNumero_int() {
        System.out.println("setNumero");
        int numero = 0;
        Voo instance = new Voo();
        instance.setNumero(numero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumero method, of class Voo.
     */
    @Test
    public void testSetNumero_String() {
        System.out.println("setNumero");
        String numero = "";
        Voo instance = new Voo();
        instance.setNumero(numero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataAgendada method, of class Voo.
     */
    @Test
    public void testGetDataAgendada() {
        System.out.println("getDataAgendada");
        Voo instance = new Voo();
        DateTime expResult = null;
        DateTime result = instance.getDataAgendada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataAgendada method, of class Voo.
     */
    @Test
    public void testSetDataAgendada_DateTime() {
        System.out.println("setDataAgendada");
        DateTime dataAgendada = null;
        Voo instance = new Voo();
        instance.setDataAgendada(dataAgendada);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataAgendada method, of class Voo.
     */
    @Test
    public void testSetDataAgendada_String() {
        System.out.println("setDataAgendada");
        String dataAgendada = "";
        Voo instance = new Voo();
        instance.setDataAgendada(dataAgendada);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataChegada method, of class Voo.
     */
    @Test
    public void testGetDataChegada() {
        System.out.println("getDataChegada");
        Voo instance = new Voo();
        DateTime expResult = null;
        DateTime result = instance.getDataChegada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataChegada method, of class Voo.
     */
    @Test
    public void testSetDataChegada_DateTime() {
        System.out.println("setDataChegada");
        DateTime dataChegada = null;
        Voo instance = new Voo();
        instance.setDataChegada(dataChegada);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataChegada method, of class Voo.
     */
    @Test
    public void testSetDataChegada_String() {
        System.out.println("setDataChegada");
        String dataChegada = "";
        Voo instance = new Voo();
        instance.setDataChegada(dataChegada);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataSaida method, of class Voo.
     */
    @Test
    public void testGetDataSaida() {
        System.out.println("getDataSaida");
        Voo instance = new Voo();
        DateTime expResult = null;
        DateTime result = instance.getDataSaida();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataSaida method, of class Voo.
     */
    @Test
    public void testSetDataSaida_DateTime() {
        System.out.println("setDataSaida");
        DateTime dataSaida = null;
        Voo instance = new Voo();
        instance.setDataSaida(dataSaida);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataSaida method, of class Voo.
     */
    @Test
    public void testSetDataSaida_String() {
        System.out.println("setDataSaida");
        String dataSaida = "";
        Voo instance = new Voo();
        instance.setDataSaida(dataSaida);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrigem method, of class Voo.
     */
    @Test
    public void testGetOrigem() {
        System.out.println("getOrigem");
        Voo instance = new Voo();
        String expResult = "";
        String result = instance.getOrigem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOrigem method, of class Voo.
     */
    @Test
    public void testSetOrigem() {
        System.out.println("setOrigem");
        String origem = "";
        Voo instance = new Voo();
        instance.setOrigem(origem);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDestino method, of class Voo.
     */
    @Test
    public void testGetDestino() {
        System.out.println("getDestino");
        Voo instance = new Voo();
        String expResult = "";
        String result = instance.getDestino();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDestino method, of class Voo.
     */
    @Test
    public void testSetDestino() {
        System.out.println("setDestino");
        String destino = "";
        Voo instance = new Voo();
        instance.setDestino(destino);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContrato method, of class Voo.
     */
    @Test
    public void testGetContrato() {
        System.out.println("getContrato");
        Voo instance = new Voo();
        Contrato expResult = null;
        Contrato result = instance.getContrato();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContrato method, of class Voo.
     */
    @Test
    public void testSetContrato() {
        System.out.println("setContrato");
        Contrato contrato = null;
        Voo instance = new Voo();
        instance.setContrato(contrato);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPiloto method, of class Voo.
     */
    @Test
    public void testGetPiloto() {
        System.out.println("getPiloto");
        Voo instance = new Voo();
        Piloto expResult = null;
        Piloto result = instance.getPiloto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPiloto method, of class Voo.
     */
    @Test
    public void testSetPiloto() {
        System.out.println("setPiloto");
        Piloto piloto = null;
        Voo instance = new Voo();
        instance.setPiloto(piloto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVeiculo method, of class Voo.
     */
    @Test
    public void testGetVeiculo() {
        System.out.println("getVeiculo");
        Voo instance = new Voo();
        Veiculo expResult = null;
        Veiculo result = instance.getVeiculo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVeiculo method, of class Voo.
     */
    @Test
    public void testSetVeiculo() {
        System.out.println("setVeiculo");
        Veiculo veiculo = null;
        Voo instance = new Voo();
        instance.setVeiculo(veiculo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
