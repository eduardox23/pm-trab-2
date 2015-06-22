/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.ImageIcon;
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
public class VeiculoTest {
    
    public VeiculoTest() {
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
     * Test of getAutonomia method, of class Veiculo.
     */
    @Test
    public void testGetAutonomia() {
        System.out.println("getAutonomia");
        Veiculo instance = new Veiculo();
        instance.setAutonomia(10);
        int expResult = 10;
        int result = instance.getAutonomia();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAutonomia method, of class Veiculo.
     */
    @Test
    public void testSetAutonomia_int() {
        System.out.println("setAutonomia");
        int autonomia = 10;
        Veiculo instance = new Veiculo();
        instance.setAutonomia(autonomia);
        assertEquals(10, instance.getAutonomia());
    }

    /**
     * Test of setAutonomia method, of class Veiculo.
     */
    @Test
    public void testSetAutonomia_String() {
        System.out.println("setAutonomia");
        String autonomia = "10";
        Veiculo instance = new Veiculo();
        instance.setAutonomia(autonomia);
        assertEquals(10, instance.getAutonomia());
    }

    /**
     * Test of getCapacidade method, of class Veiculo.
     */
    @Test
    public void testGetCapacidade() {
        System.out.println("getCapacidade");
        Veiculo instance = new Veiculo();
        instance.setCapacidade(10);
        int expResult = 10;
        int result = instance.getCapacidade();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCapacidade method, of class Veiculo.
     */
    @Test
    public void testSetCapacidade_int() {
        System.out.println("setCapacidade");
        int capacidade = 10;
        Veiculo instance = new Veiculo();
        instance.setCapacidade(capacidade);
        assertEquals(10, instance.getCapacidade());
    }

    /**
     * Test of setCapacidade method, of class Veiculo.
     */
    @Test
    public void testSetCapacidade_String() {
        System.out.println("setCapacidade");
        String capacidade = "10";
        Veiculo instance = new Veiculo();
        instance.setCapacidade(capacidade);
        assertEquals(10, instance.getCapacidade());
    }

    /**
     * Test of getChassi method, of class Veiculo.
     */
    @Test
    public void testGetChassi() {
        System.out.println("getChassi");
        Veiculo instance = new Veiculo();
        instance.setChassi("Chassi1");
        String expResult = "Chassi1";
        String result = instance.getChassi();
        assertEquals(expResult, result);
    }

    /**
     * Test of setChassi method, of class Veiculo.
     */
    @Test
    public void testSetChassi() {
        System.out.println("setChassi");
        String chassi = "Chassi1";
        Veiculo instance = new Veiculo();
        instance.setChassi(chassi);
        assertEquals("Chassi1", instance.getChassi());
    }

    /**
     * Test of getModelo method, of class Veiculo.
     */
    @Test
    public void testGetModelo() {
        System.out.println("getModelo");
        Veiculo instance = new Veiculo();
        instance.setModelo("2001");
        String expResult = "2001";
        String result = instance.getModelo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setModelo method, of class Veiculo.
     */
    @Test
    public void testSetModelo() {
        System.out.println("setModelo");
        String modelo = "2001";
        Veiculo instance = new Veiculo();
        instance.setModelo(modelo);
        assertEquals(modelo, instance.getModelo());
    }

    /**
     * Test of getTipo method, of class Veiculo.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        Veiculo instance = new Veiculo();
        instance.setTipo("Aviao");
        Veiculo.Tipo expResult = Veiculo.Tipo.AVIAO;
        Veiculo.Tipo result = instance.getTipo();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTipoDescr method, of class Veiculo.
     */
    @Test
    public void testGetTipoDescr() {
        System.out.println("getTipoDescr");
        Veiculo instance = new Veiculo();
        instance.setTipo(Veiculo.Tipo.AVIAO);
        String expResult = "Aviao";
        String result = instance.getTipoDescr();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTipo method, of class Veiculo.
     */
    @Test
    public void testSetTipo_VeiculoTipo() {
        System.out.println("setTipo");
        Veiculo.Tipo tipo = Veiculo.Tipo.AVIAO;
        Veiculo instance = new Veiculo();
        instance.setTipo(tipo);
        assertEquals(Veiculo.Tipo.AVIAO, instance.getTipo());
    }

    /**
     * Test of setTipo method, of class Veiculo.
     */
    @Test
    public void testSetTipo_String() {
        System.out.println("setTipo");
        String tipo = "Aviao";
        Veiculo instance = new Veiculo();
        instance.setTipo(tipo);
        assertEquals(Veiculo.Tipo.AVIAO, instance.getTipo());
    }

    /**
     * Test of getVelocidade method, of class Veiculo.
     */
    @Test
    public void testGetVelocidade() {
        System.out.println("getVelocidade");
        Veiculo instance = new Veiculo();
        instance.setVelocidade(100);
        int expResult = 100;
        int result = instance.getVelocidade();
        assertEquals(expResult, result);
    }

    /**
     * Test of setVelocidade method, of class Veiculo.
     */
    @Test
    public void testSetVelocidade_int() {
        System.out.println("setVelocidade");
        int velocidade = 100;
        Veiculo instance = new Veiculo();
        instance.setVelocidade(velocidade);
        assertEquals(100, instance.getVelocidade());
    }

    /**
     * Test of setVelocidade method, of class Veiculo.
     */
    @Test
    public void testSetVelocidade_String() {
        System.out.println("setVelocidade");
        String velocidade = "100";
        Veiculo instance = new Veiculo();
        instance.setVelocidade(velocidade);
        assertEquals(100, instance.getVelocidade());
    }

    /**
     * Test of toString method, of class Veiculo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Veiculo instance = new Veiculo();
        instance.setTipo("Aviao");
        instance.setModelo("2001");
        instance.setChassi("Chassi1");
        
        String expResult = "Aviao - 2001 (Chassi: Chassi1)";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
