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
public class Cliente extends Pessoa {

	private DateTime dataCadastro;
	private DateTime dataSaida;

	public DateTime getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(DateTime dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		Common.check( Common.isDateTime(dataCadastro), String.format(Common.CAMPO_DATA_INVALIDO, "data de cadastro") );
		
		setDataCadastro( Common.parseDateTime(dataCadastro, null) );
	}

	public DateTime getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(DateTime dataSaida) {
		this.dataSaida = dataSaida;
	}
}
