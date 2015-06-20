/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.ImageIcon;
import utils.Common;

/**
 *
 * @author Edu3500
 */
public class Veiculo {

	public enum Tipo
	{
		AVIAO("Aviao"),
		HELICOPTERO("Helicoptero"),
		INVALIDO("");
		
		private String tipoBD;
		
		Tipo( String tipoBD )
		{
			this.tipoBD = tipoBD;
		}

		public String getTipoBD() {
			return tipoBD;
		}
		
		public static Tipo get( String tipoBD )
		{
			for( Tipo valor : Tipo.values() )
			{
				if( valor.getTipoBD().compareToIgnoreCase( tipoBD ) == 0 )
					return valor;
			}
			return INVALIDO;
		}
	}
	
	private String chassi; 
	private String modelo; 
	private int capacidade; 
	private int velocidade; 
	private int autonomia;
	private Tipo tipo = Tipo.INVALIDO;
	private ImageIcon imagem;

	public int getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(int autonomia) {
		Common.check( autonomia > 0, String.format( Common.CAMPO_INTEIRO_POSITIVO_INVALIDO, "autonomia" ) );

		this.autonomia = autonomia;
	}

	public void setAutonomia(String autonomia) {
		Common.check( Common.isNumericInt(autonomia), String.format(Common.CAMPO_INTEIRO_INVALIDO, "autonomia") );
		
		setAutonomia( Common.parseInt( autonomia, -1 ) );
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		Common.check( capacidade > 0, String.format( Common.CAMPO_INTEIRO_POSITIVO_INVALIDO, "capacidade" ) );

		this.capacidade = capacidade;
	}

	public void setCapacidade(String capacidade) {
		Common.check( Common.isNumericInt(capacidade), String.format(Common.CAMPO_INTEIRO_INVALIDO, "capacidade") );
		
		setCapacidade( Common.parseInt( capacidade, -1 ) );
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public ImageIcon getImagem() {
		return imagem;
	}

	public void setImagem(ImageIcon imagem) {
		this.imagem = imagem;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public String getTipoDescr() {
		return tipo.getTipoBD();
	}

	public void setTipo(Tipo tipo) {
		Common.check(tipo != Tipo.INVALIDO, String.format(Common.CAMPO_DEVE_ESTAR_PREENCHIDO, "tipo do avião") );
		
		this.tipo = tipo;
	}

	public void setTipo(String tipo) {
		setTipo( Tipo.get(tipo) );
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		Common.check( velocidade > 0, String.format( Common.CAMPO_INTEIRO_POSITIVO_INVALIDO, "velocidade" ) );

		this.velocidade = velocidade;
	}

	public void setVelocidade(String velocidade) {
		Common.check( Common.isNumericInt(velocidade), String.format(Common.CAMPO_INTEIRO_INVALIDO, "velocidade") );
		
		setVelocidade( Common.parseInt( velocidade, -1 ) );
	}
	
	@Override
	public String toString() {
		return getTipoDescr() + " - " + getModelo() + " (Chassi: " + getChassi() + ")";
	}
}
