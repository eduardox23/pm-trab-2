/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import hirondelle.date4j.DateTime;
import java.math.BigDecimal;
import utils.Common;

/**
 *
 * @author Edu3500
 */
public class Funcionario extends Pessoa {

	private DateTime dataContrato;
	private DateTime dataSaida;
	private BigDecimal salario;

	public DateTime getDataContrato() {
		return dataContrato;
	}

	public void setDataContrato(DateTime dataContrato) {
		this.dataContrato = dataContrato;
	}

	public void setDataContrato(String dataContrato) {
		Common.check( Common.isDateTime(dataContrato), String.format(Common.CAMPO_DATA_INVALIDO, "data de contrato") );
		
		setDataContrato( Common.parseDateTime(dataContrato, null) );
	}

	public DateTime getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(DateTime dataSaida) {
		this.dataSaida = dataSaida;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		Common.check( salario.compareTo(BigDecimal.ZERO) >= 0, String.format(Common.CAMPO_DECIMAL_POSITIVO_INVALIDO, "salario") );

		this.salario = salario;
	}
	
	public void setSalario(String salario) {
		Common.check( Common.isDecimal(salario), String.format(Common.CAMPO_DECIMAL_INVALIDO, "salario") );
		
		setSalario( new BigDecimal(salario) );
	}
}
