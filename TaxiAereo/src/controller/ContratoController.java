/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ContratoDAO;
import java.sql.SQLException;
import java.util.List;
import model.Contrato;

/**
 *
 * @author
 * Edu3500
 */
public class ContratoController {
	
	static public void salvar(Contrato contrato) throws SQLException{
		ContratoDAO.cadastrar(contrato);
	}

	static public void alterar(Contrato contrato) throws SQLException {
		ContratoDAO.alterar(contrato);
	}

	static public List<Contrato> listar() throws SQLException {
		return ContratoDAO.findContratos();
	}

	static public void excluir(int protocolo) throws SQLException {
		ContratoDAO.remover(protocolo);
	}

	static public Contrato buscar(int protocolo) throws SQLException {
		return ContratoDAO.findByProtocolo(protocolo);
	}
}
