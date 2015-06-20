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
public class Vendedor extends Funcionario{
	private int matricula;

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		Common.check( matricula > 0, String.format( Common.CAMPO_INTEIRO_POSITIVO_INVALIDO, "matricula" ) );

		this.matricula = matricula;
	}

	public void setMatricula(String matricula) {
		Common.check( Common.isNumericInt(matricula), String.format(Common.CAMPO_INTEIRO_INVALIDO, "matricula") );
		
		setMatricula( Common.parseInt( matricula, -1 ) );
	}

	@Override
	public String toString() {
		return getNome() + " (Matrícula: " + getMatricula() + ")";
	}
}
