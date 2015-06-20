/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import utils.Common;

/**
 *
 * @author Edu3500
 */
public class Pessoa {
	
	static public final int
		NUM_DIGITOS_CEP = 8,
		NUM_DIGITOS_CPF = 11;
	
	private String cpf;
	private String nome;
	private String rg;
	private String logradouro;
	private int numeroCasa;
	private int cep;

	public String getCpf() {
		return cpf;
	}

	public long getCpfAsLong() {
		return Long.parseLong( cpf );
	}

	public void setCpf(String cpf) {
		boolean cpfTemNumCertoDeDigitos = ( cpf.length() == NUM_DIGITOS_CPF );
				
		Common.check( Common.isNumericInt(cpf), String.format(Common.CAMPO_INTEIRO_INVALIDO, "CPF") );
		Common.check( cpfTemNumCertoDeDigitos, String.format( Common.CAMPO_NUM_DIGITOS_INVALIDO, "CPF", NUM_DIGITOS_CPF ) );
		
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String Rg) {
		this.rg = Rg;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumCasa() {
		return numeroCasa;
	}

	public void setNumeroCasa(int numeroCasa) {
		Common.check( numeroCasa > 0, String.format( Common.CAMPO_INTEIRO_POSITIVO_INVALIDO, "número da casa" ) );

		this.numeroCasa = numeroCasa;
	}

	public void setNumeroCasa(String numeroCasa) {
		Common.check( Common.isNumericInt(numeroCasa), String.format(Common.CAMPO_INTEIRO_INVALIDO, "número da casa") );
		
		setNumeroCasa( Common.parseInt( numeroCasa, -1 ) );
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		boolean cepTemNumCertoDeDigitos = ( String.valueOf(cep).length() == NUM_DIGITOS_CEP );
				
		Common.check( cep > 0, String.format( Common.CAMPO_INTEIRO_POSITIVO_INVALIDO, "CEP" ) );
		Common.check( cepTemNumCertoDeDigitos, String.format( Common.CAMPO_NUM_DIGITOS_INVALIDO, "CEP", NUM_DIGITOS_CEP ) );
		
		this.cep = cep;
	}
	
	public void setCep(String cep) {
		Common.check( Common.isNumericInt(cep), String.format(Common.CAMPO_INTEIRO_INVALIDO, "CEP") );
		
		setCep( Common.parseInt( cep, -1 ) );
	}

	@Override
	public String toString() {
		return getNome() + " (CPF: " + getCpf() + ")";
	}
}
