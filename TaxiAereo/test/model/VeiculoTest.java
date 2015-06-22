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
        int expResult = 0;
        int result = instance.getAutonomia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAutonomia method, of class Veiculo.
     */
    @Test
    public void testSetAutonomia_int() {
        System.out.println("setAutonomia");
        int autonomia = 0;
        Veiculo instance = new Veiculo();
        instance.setAutonomia(autonomia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAutonomia method, of class Veiculo.
     */
    @Test
    public void testSetAutonomia_String() {
        System.out.println("setAutonomia");
        String autonomia = "";
        Veiculo instance = new Veiculo();
        instance.setAutonomia(autonomia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCapacidade method, of class Veiculo.
     */
    @Test
    public void testGetCapacidade() {
        System.out.println("getCapacidade");
        Veiculo instance = new Veiculo();
        int expResult = 0;
        int result = instance.getCapacidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCapacidade method, of class Veiculo.
     */
    @Test
    public void testSetCapacidade_int() {
        System.out.println("setCapacidade");
        int capacidade = 0;
        Veiculo instance = new Veiculo();
        instance.setCapacidade(capacidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCapacidade method, of class Veiculo.
     */
    @Test
    public void testSetCapacidade_String() {
        System.out.println("setCapacidade");
        String capacidade = "";
        Veiculo instance = new Veiculo();
        instance.setCapacidade(capacidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getChassi method, of class Veiculo.
     */
    @Test
    public void testGetChassi() {
        System.out.println("getChassi");
        Veiculo instance = new Veiculo();
        String expResult = "";
        String result = instance.getChassi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setChassi method, of class Veiculo.
     */
    @Test
    public void testSetChassi() {
        System.out.println("setChassi");
        String chassi = "";
        Veiculo instance = new Veiculo();
        instance.setChassi(chassi);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImagem method, of class Veiculo.
     */
    @Test
    public void testGetImagem() {
        System.out.println("getImagem");
        Veiculo instance = new Veiculo();
        ImageIcon expResult = null;
        ImageIcon result = instance.getImagem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImagem method, of class Veiculo.
     */
    @Test
    public void testSetImagem() {
        System.out.println("setImagem");
        ImageIcon imagem = null;
        Veiculo instance = new Veiculo();
        instance.setImagem(imagem);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModelo method, of class Veiculo.
     */
    @Test
    public void testGetModelo() {
        System.out.println("getModelo");
        Veiculo instance = new Veiculo();
        String expResult = "";
        String result = instance.getModelo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModelo method, of class Veiculo.
     */
    @Test
    public void testSetModelo() {
        System.out.println("setModelo");
        String modelo = "";
        Veiculo instance = new Veiculo();
        instance.setModelo(modelo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipo method, of class Veiculo.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        Veiculo instance = new Veiculo();
        Veiculo.Tipo expResult = null;
        Veiculo.Tipo result = instance.getTipo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoDescr method, of class Veiculo.
     */
    @Test
    public void testGetTipoDescr() {
        System.out.println("getTipoDescr");
        Veiculo instance = new Veiculo();
        String expResult = "";
        String result = instance.getTipoDescr();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipo method, of class Veiculo.
     */
    @Test
    public void testSetTipo_VeiculoTipo() {
        System.out.println("setTipo");
        Veiculo.Tipo tipo = null;
        Veiculo instance = new Veiculo();
        instance.setTipo(tipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipo method, of class Veiculo.
     */
    @Test
    public void testSetTipo_String() {
        System.out.println("setTipo");
        String tipo = "";
        Veiculo instance = new Veiculo();
        instance.setTipo(tipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVelocidade method, of class Veiculo.
     */
    @Test
    public void testGetVelocidade() {
        System.out.println("getVelocidade");
        Veiculo instance = new Veiculo();
        int expResult = 0;
        int result = instance.getVelocidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVelocidade method, of class Veiculo.
     */
    @Test
    public void testSetVelocidade_int() {
        System.out.println("setVelocidade");
        int velocidade = 0;
        Veiculo instance = new Veiculo();
        instance.setVelocidade(velocidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVelocidade method, of class Veiculo.
     */
    @Test
    public void testSetVelocidade_String() {
        System.out.println("setVelocidade");
        String velocidade = "";
        Veiculo instance = new Veiculo();
        instance.setVelocidade(velocidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Veiculo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Veiculo instance = new Veiculo();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
