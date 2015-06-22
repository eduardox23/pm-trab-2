/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

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
public class PessoaTest {
    
    public PessoaTest() {
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
     * Test of getCpf method, of class Pessoa.
     */
    @Test
    public void testGetCpf() {
        System.out.println("getCpf");
        Pessoa instance = new Pessoa();
        instance.setCpf("55364574628");
        String expResult = "55364574628";
        String result = instance.getCpf();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCpfAsLong method, of class Pessoa.
     */
    @Test
    public void testGetCpfAsLong() {
        System.out.println("getCpfAsLong");
        Pessoa instance = new Pessoa();
        instance.setCpf("55364574628");
        long expResult = 55364574628L;
        long result = instance.getCpfAsLong();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCpf method, of class Pessoa.
     */
    @Test
    public void testSetCpf() {
        System.out.println("setCpf");
        String cpf = "55364574628";
        Pessoa instance = new Pessoa();
        instance.setCpf("55364574628");
        assertEquals(cpf, instance.getCpf());
    }

    /**
     * Test of getNome method, of class Pessoa.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Pessoa instance = new Pessoa();
        instance.setNome("João Pereira da Silva");
        String expResult = "João Pereira da Silva";
        String result = instance.getNome();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNome method, of class Pessoa.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "João Pereira da Silva";
        Pessoa instance = new Pessoa();
        instance.setNome("João Pereira da Silva");
        assertEquals(nome, instance.getNome());
    }

    /**
     * Test of getRg method, of class Pessoa.
     */
    @Test
    public void testGetRg() {
        System.out.println("getRg");
        Pessoa instance = new Pessoa();
        instance.setRg("177233340");
        String expResult = "177233340";
        String result = instance.getRg();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRg method, of class Pessoa.
     */
    @Test
    public void testSetRg() {
        System.out.println("setRg");
        String Rg = "177233340";
        Pessoa instance = new Pessoa();
        instance.setRg(Rg);
        assertEquals(Rg, instance.getRg());
    }

    /**
     * Test of getLogradouro method, of class Pessoa.
     */
    @Test
    public void testGetLogradouro() {
        System.out.println("getLogradouro");
        Pessoa instance = new Pessoa();
        instance.setLogradouro("Rua xpto");
        String expResult = "Rua xpto";
        String result = instance.getLogradouro();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLogradouro method, of class Pessoa.
     */
    @Test
    public void testSetLogradouro() {
        System.out.println("setLogradouro");
        String logradouro = "Rua xpto";
        Pessoa instance = new Pessoa();
        instance.setLogradouro(logradouro);
        assertEquals(logradouro, instance.getLogradouro());
    }

    /**
     * Test of getNumCasa method, of class Pessoa.
     */
    @Test
    public void testGetNumCasa() {
        System.out.println("getNumCasa");
        Pessoa instance = new Pessoa();
        instance.setNumeroCasa(256);
        int expResult = 256;
        int result = instance.getNumCasa();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNumeroCasa method, of class Pessoa.
     */
    @Test
    public void testSetNumeroCasa_int() {
        System.out.println("setNumeroCasa");
        int numeroCasa = 256;
        Pessoa instance = new Pessoa();
        instance.setNumeroCasa(numeroCasa);
        assertEquals(numeroCasa, instance.getNumCasa());
    }

    /**
     * Test of setNumeroCasa method, of class Pessoa.
     */
    @Test
    public void testSetNumeroCasa_String() {
        System.out.println("setNumeroCasa");
        String numeroCasa = "256";
        Pessoa instance = new Pessoa();
        instance.setNumeroCasa(numeroCasa);
        assertEquals(256, instance.getNumCasa());
    }

    /**
     * Test of getCep method, of class Pessoa.
     */
    @Test
    public void testGetCep() {
        System.out.println("getCep");
        Pessoa instance = new Pessoa();
        instance.setCep(22231010);
        int expResult = 22231010;
        int result = instance.getCep();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCep method, of class Pessoa.
     */
    @Test
    public void testSetCep_int() {
        System.out.println("setCep");
        int cep = 22231010;
        Pessoa instance = new Pessoa();
        instance.setCep(cep);
        assertEquals(cep, instance.getCep());
    }

    /**
     * Test of setCep method, of class Pessoa.
     */
    @Test
    public void testSetCep_String() {
        System.out.println("setCep");
        String cep = "22231010";
        Pessoa instance = new Pessoa();
        instance.setCep(cep);
        assertEquals(22231010, instance.getCep());
    }

    /**
     * Test of toString method, of class Pessoa.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Pessoa instance = new Pessoa();
        instance.setNome("João Maria");
        instance.setCpf("55364574628");
        String expResult = "João Maria (CPF: 55364574628)";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
