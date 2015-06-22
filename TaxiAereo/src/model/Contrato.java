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
public class Contrato {

	private int protocolo;
	private BigDecimal valor;
	private BigDecimal desconto;
	private DateTime dataContrato;
	private Cliente cliente;
	private Vendedor vendedor;

	public int getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(int protocolo) {
		Common.check( protocolo > 0, String.format( Common.CAMPO_INTEIRO_POSITIVO_INVALIDO, "protocolo" ) );

		this.protocolo = protocolo;
	}

	public void setProtocolo(String protocolo) {
		Common.check( Common.isNumericInt(protocolo), String.format(Common.CAMPO_INTEIRO_INVALIDO, "protocolo") );

		setProtocolo( Common.parseInt( protocolo, -1 ) );
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		Common.check( valor.compareTo(BigDecimal.ZERO) >= 0, String.format(Common.CAMPO_DECIMAL_POSITIVO_INVALIDO, "valor") );
		
		this.valor = valor;
	}

	public void setValor(String valor) {
		Common.check( Common.isDecimal(valor), String.format(Common.CAMPO_DECIMAL_INVALIDO, "valor") );
		
		setValor( new BigDecimal(valor) );
	}

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

	public BigDecimal getDesconto() {
		return desconto;
	}

	public void setDesconto(BigDecimal desconto) {
		if( desconto != null )
			Common.check( desconto.compareTo(BigDecimal.ZERO) >= 0, String.format(Common.CAMPO_DECIMAL_POSITIVO_INVALIDO, "desconto") );

		this.desconto = desconto;
	}

	public void setDesconto(String desconto) {
		Common.check( Common.isDecimal(desconto), String.format(Common.CAMPO_DECIMAL_INVALIDO, "desconto") );
		setDesconto( new BigDecimal(desconto) );
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	@Override
	public String toString() {
		return "Nº Protoc: " + getProtocolo() + " (" + Common.dtFormatPadrao(getDataContrato()) + ")";
	}
}
