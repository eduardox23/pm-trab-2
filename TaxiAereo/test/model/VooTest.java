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
        instance.setNumero(1001);
        int expResult = 1001;
        int result = instance.getNumero();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNumero method, of class Voo.
     */
    @Test
    public void testSetNumero_int() {
        System.out.println("setNumero");
        int numero = 1001;
        Voo instance = new Voo();
        instance.setNumero(numero);
        assertEquals(1001, instance.getNumero());
    }

    /**
     * Test of setNumero method, of class Voo.
     */
    @Test
    public void testSetNumero_String() {
        System.out.println("setNumero");
        String numero = "1001";
        Voo instance = new Voo();
        instance.setNumero(numero);
        assertEquals(1001, instance.getNumero());
    }

    /**
     * Test of getDataAgendada method, of class Voo.
     */
    @Test
    public void testGetDataAgendada() {
        System.out.println("getDataAgendada");
        Voo instance = new Voo();
        DateTime expResult = new DateTime("2015-06-22");
        instance.setDataAgendada(expResult);
        DateTime result = instance.getDataAgendada();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDataAgendada method, of class Voo.
     */
    @Test
    public void testSetDataAgendada_DateTime() {
        System.out.println("setDataAgendada");
        DateTime dataAgendada = new DateTime("2015-06-22");
        Voo instance = new Voo();
        instance.setDataAgendada(dataAgendada);
        assertEquals(dataAgendada, instance.getDataAgendada());
    }

    /**
     * Test of setDataAgendada method, of class Voo.
     */
    @Test
    public void testSetDataAgendada_String() {
        System.out.println("setDataAgendada");
        String dataAgendada = "22/06/2015";
        Voo instance = new Voo();
        instance.setDataAgendada(dataAgendada);
        DateTime expResult = new DateTime("2015-06-22 00:00:00.00000000");
        assertEquals(expResult, instance.getDataAgendada());
    }

    /**
     * Test of getDataChegada method, of class Voo.
     */
    @Test
    public void testGetDataChegada() {
        System.out.println("getDataChegada");
        Voo instance = new Voo();
        DateTime expResult = new DateTime("2015-06-23");
        instance.setDataChegada(expResult);
        DateTime result = instance.getDataChegada();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDataChegada method, of class Voo.
     */
    @Test
    public void testSetDataChegada_DateTime() {
        System.out.println("setDataChegada");
        DateTime dataChegada = new DateTime("2015-06-23 01:15");
        Voo instance = new Voo();
        instance.setDataChegada(dataChegada);
        assertEquals(dataChegada, instance.getDataChegada());
    }

    /**
     * Test of setDataChegada method, of class Voo.
     */
    @Test
    public void testSetDataChegada_String() {
        System.out.println("setDataChegada");
        String dataChegada = "23/06/2015";
        Voo instance = new Voo();
        instance.setDataChegada(dataChegada);
        DateTime expResult = new DateTime("2015-06-23 00:00:00.00000000");
        assertEquals(expResult, instance.getDataChegada());
    }

    /**
     * Test of getDataSaida method, of class Voo.
     */
    @Test
    public void testGetDataSaida() {
        System.out.println("getDataSaida");
        Voo instance = new Voo();
        DateTime expResult = new DateTime("2015-06-22");
        instance.setDataSaida(expResult);
        DateTime result = instance.getDataSaida();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDataSaida method, of class Voo.
     */
    @Test
    public void testSetDataSaida_DateTime() {
        System.out.println("setDataSaida");
        DateTime dataSaida = new DateTime("2015-06-22");
        Voo instance = new Voo();
        instance.setDataSaida(dataSaida);
        assertEquals(dataSaida, instance.getDataSaida());
    }

    /**
     * Test of setDataSaida method, of class Voo.
     */
    @Test
    public void testSetDataSaida_String() {
        System.out.println("setDataSaida");
        String dataSaida = "22/06/2015";
        Voo instance = new Voo();
        instance.setDataSaida(dataSaida);
        DateTime expResult = new DateTime("2015-06-22 00:00:00.00000000");
        assertEquals(expResult, instance.getDataSaida());
    }

    /**
     * Test of getOrigem method, of class Voo.
     */
    @Test
    public void testGetOrigem() {
        System.out.println("getOrigem");
        Voo instance = new Voo();
        instance.setOrigem("Manaus - AM");
        String expResult = "Manaus - AM";
        String result = instance.getOrigem();
        assertEquals(expResult, result);
    }

    /**
     * Test of setOrigem method, of class Voo.
     */
    @Test
    public void testSetOrigem() {
        System.out.println("setOrigem");
        String origem = "Manaus - AM";
        Voo instance = new Voo();
        instance.setOrigem(origem);
        assertEquals("Manaus - AM", instance.getOrigem());
    }

    /**
     * Test of getDestino method, of class Voo.
     */
    @Test
    public void testGetDestino() {
        System.out.println("getDestino");
        Voo instance = new Voo();
        instance.setDestino("Manaus - AM");
        String expResult = "Manaus - AM";
        String result = instance.getDestino();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDestino method, of class Voo.
     */
    @Test
    public void testSetDestino() {
        System.out.println("setDestino");
        String destino = "Manaus - AM";
        Voo instance = new Voo();
        instance.setDestino(destino);
        assertEquals("Manaus - AM", instance.getDestino());
    }

    /**
     * Test of getContrato method, of class Voo.
     */
    @Test
    public void testGetContrato() {
        System.out.println("getContrato");
        Voo instance = new Voo();
        Contrato expResult = new Contrato();
        instance.setContrato(expResult);
        Contrato result = instance.getContrato();
        assertEquals(expResult, result);
    }

    /**
     * Test of setContrato method, of class Voo.
     */
    @Test
    public void testSetContrato() {
        System.out.println("setContrato");
        Contrato contrato = new Contrato();
        Voo instance = new Voo();
        instance.setContrato(contrato);
        assertEquals(contrato, instance.getContrato());
    }

    /**
     * Test of getPiloto method, of class Voo.
     */
    @Test
    public void testGetPiloto() {
        System.out.println("getPiloto");
        Voo instance = new Voo();
        Piloto expResult = new Piloto();
        instance.setPiloto(expResult);
        Piloto result = instance.getPiloto();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPiloto method, of class Voo.
     */
    @Test
    public void testSetPiloto() {
        System.out.println("setPiloto");
        Piloto piloto = new Piloto();
        Voo instance = new Voo();
        instance.setPiloto(piloto);
        assertEquals(piloto, instance.getPiloto());
    }

    /**
     * Test of getVeiculo method, of class Voo.
     */
    @Test
    public void testGetVeiculo() {
        System.out.println("getVeiculo");
        Voo instance = new Voo();
        Veiculo expResult = new Veiculo();
        instance.setVeiculo(expResult);
        Veiculo result = instance.getVeiculo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setVeiculo method, of class Voo.
     */
    @Test
    public void testSetVeiculo() {
        System.out.println("setVeiculo");
        Veiculo veiculo = new Veiculo();
        Voo instance = new Voo();
        instance.setVeiculo(veiculo);
        assertEquals(veiculo, instance.getVeiculo());
    }
    
}
