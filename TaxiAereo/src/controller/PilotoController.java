/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.FuncionarioDAO;
import dao.PessoaDAO;
import dao.PilotoDAO;
import java.sql.SQLException;
import java.util.List;
import model.Piloto;

/**
 *
 * @author
 * PedroLZ
 */
public class PilotoController {
	
	static public void salvar(Piloto piloto) throws SQLException{
		
		if( FuncionarioDAO.existe(piloto.getCpf()) )
			throw new UnsupportedOperationException("Já existe funcionário com este CPF!");

		PessoaDAO.salvar(piloto);
		FuncionarioDAO.cadastrar(piloto);
		PilotoDAO.cadastrar(piloto);
	}

	static public void alterar(Piloto piloto) throws SQLException {

		if( !FuncionarioDAO.existe(piloto.getCpf()) )
			throw new UnsupportedOperationException("Piloto não existe!");

		FuncionarioDAO.alterar(piloto);
		PessoaDAO.alterar(piloto);
//		nada para alterar aqui: PilotoDAO.alterar(piloto);
	}

	static public List<Piloto> listar() throws SQLException {
		return PilotoDAO.findPilotos();
	}

	static public void excluir(int breve) throws SQLException {
		Piloto piloto = PilotoDAO.findByBreve(breve);
		FuncionarioDAO.remover(piloto.getCpf());
	}

	static public Piloto buscar(int breve) throws SQLException {
		return PilotoDAO.findByBreve(breve);
	}
}
