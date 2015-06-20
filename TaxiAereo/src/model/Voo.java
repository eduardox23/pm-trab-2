/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import hirondelle.date4j.DateTime;
import utils.Common;

/**
 *
 * @author Edu3500
 */
public class Voo {

	private int numero;
	private DateTime dataAgendada;
	private DateTime dataSaida;
	private DateTime dataChegada;
	private String origem;
	private String destino;
	private Veiculo veiculo;
	private Piloto piloto;
	private Contrato contrato;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		Common.check( numero > 0, String.format( Common.CAMPO_INTEIRO_POSITIVO_INVALIDO, "numero do voo" ) );

		this.numero = numero;
	}

	public void setNumero(String numero) {
		Common.check( Common.isNumericInt(numero), String.format(Common.CAMPO_INTEIRO_INVALIDO, "numero do voo") );
	
		setNumero( Common.parseInt( numero, -1 ) );
	}

	public DateTime getDataAgendada() {
		return dataAgendada;
	}

	public void setDataAgendada(DateTime dataAgendada) {
		this.dataAgendada = dataAgendada;
	}

	public void setDataAgendada(String dataAgendada) {
		Common.check( Common.isDateTime(dataAgendada), String.format(Common.CAMPO_DATA_INVALIDO, "data de agendada") );
		
		setDataAgendada( Common.parseDateTime(dataAgendada, null) );
	}

	public DateTime getDataChegada() {
		return dataChegada;
	}

	public void setDataChegada(DateTime dataChegada) {
		this.dataChegada = dataChegada;
	}

	public void setDataChegada(String dataChegada) {
		Common.check( Common.isDateTime(dataChegada), String.format(Common.CAMPO_DATA_INVALIDO, "data de chegada") );
		
		setDataChegada( Common.parseDateTime(dataChegada, null) );
	}

	public DateTime getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(DateTime dataSaida) {
		this.dataSaida = dataSaida;
	}

	public void setDataSaida(String dataSaida) {
		Common.check( Common.isDateTime(dataSaida), String.format(Common.CAMPO_DATA_INVALIDO, "data de saida") );
		
		setDataSaida( Common.parseDateTime(dataSaida, null) );
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Contrato getContrato() {
		return contrato;
	}

	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}

	public Piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
}
