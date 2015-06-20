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
public class Piloto extends Funcionario {

	private int breve;

	public int getBreve() {
		return breve;
	}

	public void setBreve(int breve) {
		Common.check( breve > 0, String.format( Common.CAMPO_INTEIRO_POSITIVO_INVALIDO, "brevê" ) );

		this.breve = breve;
	}

	public void setBreve(String breve) {
		Common.check( Common.isNumericInt(breve), String.format(Common.CAMPO_INTEIRO_INVALIDO, "brevê") );
		
		setBreve(Common.parseInt( breve, -1 ) );
	}

	@Override
	public String toString() {
		return getNome() + " (Brevê: " + getBreve() + ")";
	}
}
