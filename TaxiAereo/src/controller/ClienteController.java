/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ClienteDAO;
import dao.PessoaDAO;
import java.sql.SQLException;
import java.util.List;
import model.Cliente;

/**
 *
 * @author
 * Edu3500
 */
public class ClienteController {
	
	static public void salvar(Cliente cliente) throws SQLException{
		
		if( ClienteDAO.existe(cliente.getCpf()) )
			throw new UnsupportedOperationException("Cliente já existe!");
		
		PessoaDAO.salvar(cliente);
		ClienteDAO.cadastrar(cliente);
	}

	static public void alterar(Cliente cliente) throws SQLException {

		if( !ClienteDAO.existe(cliente.getCpf()) )
			throw new UnsupportedOperationException("Cliente não existe!");

		ClienteDAO.alterar(cliente);
		PessoaDAO.alterar(cliente);
	}

	static public List<Cliente> listar() throws SQLException {
		return ClienteDAO.findClientes();
	}

	static public void excluir(String cpf) throws SQLException {
		ClienteDAO.remover(cpf);
	}

	static public Cliente buscar(String cpf) throws SQLException {
		return ClienteDAO.findByCpf(cpf);
	}
}
