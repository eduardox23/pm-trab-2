
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static dao.GenericDAO.update;
import hirondelle.date4j.DateTime;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;
import utils.Common;

/**
 *
 * @author Edu3500
 */
public class ClienteDAO extends GenericDAO {

	private static final String 
		CLIENTE_DELETE			= "UPDATE clientes SET data_saida = now() WHERE cpf = ? AND data_saida IS NULL",
		CLIENTE_INSERT 			= "INSERT INTO clientes(cpf, data_cadastro) VALUES (?, ?) ",
		CLIENTE_SELECT_ALL		= "SELECT * FROM clientes c INNER JOIN pessoas p ON c.cpf=p.cpf WHERE data_saida IS NULL",
		CLIENTE_SELECT_BY_CPF	= "SELECT * FROM clientes c INNER JOIN pessoas p ON c.cpf=p.cpf WHERE c.cpf = ? AND data_saida IS NULL",
		CLIENTE_UPDATE			= "UPDATE clientes SET data_cadastro = ? WHERE cpf = ? AND data_saida IS NULL";

	public static boolean existe(String cpf) throws SQLException {
		return findByCpf(cpf) != null;
	}

	static public void cadastrar(Cliente cliente) throws SQLException {
		save(CLIENTE_INSERT, cliente.getCpfAsLong(), Common.parseTimestamp(cliente.getDataCadastro()) );
	}

	public static void alterar(Cliente cliente) throws SQLException {
		update(CLIENTE_UPDATE, cliente.getCpfAsLong(), Common.parseTimestamp(cliente.getDataCadastro()) );
	}

	static public void remover(String cpf) throws SQLException {
		long cpfAsLong = Long.parseLong(cpf);
		delete(CLIENTE_DELETE, cpfAsLong);
	}

	static public List<Cliente> findClientes() throws SQLException {
	
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try{
			ps = getConnection().prepareStatement(CLIENTE_SELECT_ALL);
			rs = ps.executeQuery();

			List<Cliente> clientes = new ArrayList<Cliente>();

			while (rs.next())
				clientes.add( makeCliente(rs) );
			
			return clientes;

		} finally {
			fecharConexao( rs );
			fecharConexao( ps );
		}
	}
	
	static public Cliente findByCpf(String cpf) throws SQLException {
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		long cpfAsLong = Long.parseLong(cpf);
		Cliente cliente = null;
		
		try{
			ps = getConnection().prepareStatement(CLIENTE_SELECT_BY_CPF);
			ps.setLong(1, cpfAsLong);
			
			rs = ps.executeQuery();

			if (rs.next())
				cliente = makeCliente(rs);

			return cliente;
		

		}finally {
			fecharConexao( rs );
			fecharConexao( ps );
		}
	}
	
	//----------------------------------------------------------------------------------
	// funções private
	//----------------------------------------------------------------------------------
	private static Cliente makeCliente(ResultSet rs) throws SQLException {
		
		Cliente cliente = new Cliente();
		
		cliente.setCpf(rs.getString("cpf"));
		cliente.setNome(rs.getString("nome"));
		cliente.setRg(rs.getString("rg"));
		cliente.setCep(rs.getString("cep"));        
		cliente.setLogradouro(rs.getString("logradouro"));
		cliente.setNumeroCasa(rs.getInt("numero_casa"));
		cliente.setDataCadastro( getValorCampo( rs, "data_cadastro", (DateTime)null ) );
		cliente.setDataSaida( getValorCampo( rs, "data_saida", (DateTime)null ) );
		
		return( cliente );
	}
}
