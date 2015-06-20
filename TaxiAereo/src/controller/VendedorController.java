/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.FuncionarioDAO;
import dao.PessoaDAO;
import dao.VendedorDAO;
import java.sql.SQLException;
import java.util.List;
import model.Vendedor;

/**
 *
 * @author
 * PedroLZ
 */
public class VendedorController {
	
	static public void salvar(Vendedor vendedor) throws SQLException {

		if( FuncionarioDAO.existe(vendedor.getCpf()) )
			throw new UnsupportedOperationException("Já existe funcionário com este CPF!");

		PessoaDAO.salvar(vendedor);
		FuncionarioDAO.cadastrar(vendedor);
		VendedorDAO.cadastrar(vendedor);
	}

	static public void alterar(Vendedor vendedor) throws SQLException {

		if( !FuncionarioDAO.existe(vendedor.getCpf()) )
			throw new UnsupportedOperationException("Vendedor não existe!");

		FuncionarioDAO.alterar(vendedor);
		PessoaDAO.alterar(vendedor);
	}

	static public List<Vendedor> listar() throws SQLException {
		return VendedorDAO.findVendedores();
	}

	static public void excluir(int matricula) throws SQLException {
		Vendedor vendedor = VendedorDAO.findByMatricula(matricula);
		FuncionarioDAO.remover(vendedor.getCpf());
	}

	static public Vendedor buscar(int matricula) throws SQLException {
		return VendedorDAO.findByMatricula(matricula);
	}
}
