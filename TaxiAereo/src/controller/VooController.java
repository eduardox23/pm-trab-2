/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.VooDAO;
import java.sql.SQLException;
import java.util.List;
import model.Voo;

/**
 *
 * @author
 * PedroLZ
 */
public class VooController {
	
	static public void salvar(Voo voo) throws SQLException{
		VooDAO.cadastrar(voo);
	}

	static public void alterar(Voo voo) throws SQLException {
		VooDAO.alterar(voo);
	}

	static public List<Voo> listar() throws SQLException {
		return VooDAO.findVoos();
	}

	static public void excluir(int numero) throws SQLException {
		VooDAO.remover(numero);
	}

	static public Voo buscar(int numero) throws SQLException {
		return VooDAO.findByNumero(numero);
	}
}
