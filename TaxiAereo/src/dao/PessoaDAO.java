/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Pessoa;

/**
 *
 * @author Edu3500
 */
public class PessoaDAO extends GenericDAO {

	private static final String 
	PESSOA_INSERT		 = "INSERT INTO pessoas(cpf, rg, nome, cep, logradouro, numero_casa) VALUES (?, ?, ?, ?, ?, ?)",
	PESSOA_UPDATE		 = "UPDATE pessoas  SET nome = ?, rg = ?, cep = ?, logradouro = ?, numero_casa = ?  WHERE cpf = ?",
	PESSOA_DELETE		 = "DELETE FROM pessoas WHERE cpf = ? ",
	PESSOA_SELECT		 = "SELECT * FROM pessoas",
	PESSOA_SELECT_BY_CPF = "SELECT * FROM pessoas WHERE cpf = ?";
	
	static public void salvar(Pessoa pessoa) throws SQLException {

		if( PessoaDAO.existe(pessoa.getCpf()) )
			PessoaDAO.alterar(pessoa);
		else
			PessoaDAO.cadastrar(pessoa);
	}
	
	static public boolean existe(String cpf) throws SQLException {
		return( findByCpf(cpf) != null );
	}
	
	static public void cadastrar(Pessoa pessoa) throws SQLException {
		save(PESSOA_INSERT, 
			 pessoa.getCpfAsLong(), 
			 pessoa.getRg(), 
			 pessoa.getNome(), 
			 pessoa.getCep(), 
			 pessoa.getLogradouro(), 
			 pessoa.getNumCasa());
	}

	static public void alterar (Pessoa pessoa) throws SQLException {
		update(PESSOA_UPDATE, 
			   pessoa.getCpfAsLong(),
			   pessoa.getNome(), 
			   pessoa.getRg(), 
			   pessoa.getCep(), 
			   pessoa.getLogradouro(), 
			   pessoa.getNumCasa());
	}

	static public void remover(String cpf) throws SQLException {
		long cpfAsLong = Long.parseLong(cpf);
		delete(PESSOA_DELETE, cpfAsLong);
	}

	static public List<Pessoa> findPessoas() throws SQLException {

		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try{
		
			ps = getConnection().prepareStatement(PESSOA_SELECT);
			rs = ps.executeQuery();

			List<Pessoa> pessoas = new ArrayList<Pessoa>();

			while ( rs.next() )
				pessoas.add( makePessoa(rs) );

			return pessoas;

		} finally {
			fecharConexao( rs );
			fecharConexao( ps );
		}
	}

	static public Pessoa findByCpf(String cpf) throws SQLException {
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		long cpfAsLong = Long.parseLong(cpf);
		Pessoa pessoa = null;
		
		try{
			ps = getConnection().prepareStatement(PESSOA_SELECT_BY_CPF);
			ps.setLong(1, cpfAsLong);

			rs = ps.executeQuery();

			if ( rs.next() )
				pessoa = makePessoa(rs);

			return pessoa;
			
		} finally {
			fecharConexao( rs );
			fecharConexao( ps );
		}
	}

	//----------------------------------------------------------------------------------
	// funções private
	//----------------------------------------------------------------------------------
	private static Pessoa makePessoa(ResultSet rs) throws SQLException {
		Pessoa pessoa = new Pessoa();
		pessoa.setCpf(rs.getString("cpf"));
		pessoa.setNome(rs.getString("nome"));
		pessoa.setRg(rs.getString("rg"));
		pessoa.setCep(rs.getString("cep"));
		pessoa.setLogradouro(rs.getString("logradouro"));
		pessoa.setNumeroCasa(rs.getInt("numero_casa"));
		return pessoa;
	}
}
