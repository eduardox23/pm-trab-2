/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static dao.GenericDAO.save;
import hirondelle.date4j.DateTime;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Funcionario;
import utils.Common;

/**
 *
 * @author Edu3500
 */
public class FuncionarioDAO extends GenericDAO{

	private static final String 
		FUNCIONARIO_DELETE			= "UPDATE funcionarios SET data_saida = now() WHERE cpf = ? AND data_saida IS NULL",
		FUNCIONARIO_INSERT			= "INSERT INTO funcionarios(cpf, data_contrato, salario) VALUES (?, ?, ?)",
		FUNCIONARIO_SELECT			= "SELECT * FROM funcionarios f JOIN pessoas p ON p.cpf=f.cpf WHERE data_saida IS NULL",
		FUNCIONARIO_SELECT_BY_CPF	= "SELECT * FROM funcionarios f JOIN pessoas p ON p.cpf=f.cpf WHERE f.cpf = ? AND data_saida IS NULL",
		FUNCIONARIO_UPDATE			= "UPDATE funcionarios f SET data_contrato = ?, salario = ? WHERE f.cpf = ? AND data_saida IS NULL";
	
	public static boolean existe(String cpf) throws SQLException {
		return findByCpf(cpf) != null;
	}

	static public void cadastrar(Funcionario funcionario) throws SQLException {
		save(FUNCIONARIO_INSERT, funcionario.getCpfAsLong(), Common.parseTimestamp(funcionario.getDataContrato()), funcionario.getSalario());
	}

	public static void alterar(Funcionario funcionario) throws SQLException {
		update(FUNCIONARIO_UPDATE, funcionario.getCpfAsLong(), Common.parseTimestamp(funcionario.getDataContrato()), funcionario.getSalario() );
	}

	static public void remover(String cpf) throws SQLException {
		long cpfAsLong = Long.parseLong(cpf);
		delete(FUNCIONARIO_DELETE, cpfAsLong);
	}

	static public List<Funcionario> findFuncionarios() throws SQLException {
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try{
			ps = getConnection().prepareStatement(FUNCIONARIO_SELECT);
			rs = ps.executeQuery();

			List<Funcionario> funcionarios = new ArrayList<Funcionario>();

			while ( rs.next() )
				funcionarios.add( makeFuncionario(rs) );
		
			return funcionarios;
		
		} finally {
			fecharConexao( rs );
			fecharConexao( ps );
		}
	}

	static public Funcionario findByCpf(String cpf) throws SQLException {
		PreparedStatement ps = null;
		ResultSet rs = null;
		long cpfAsLong = Long.parseLong(cpf);
		Funcionario funcionario = null;
		
		try{
			ps = getConnection().prepareStatement(FUNCIONARIO_SELECT_BY_CPF);
			ps.setLong(1, cpfAsLong);
		
			rs = ps.executeQuery();

			while ( rs.next() )
				funcionario = makeFuncionario(rs);
			
			return funcionario;

		} finally {
			fecharConexao( rs );
			fecharConexao( ps );
		}
	}

	//----------------------------------------------------------------------------------
	// funções private
	//----------------------------------------------------------------------------------
	private static Funcionario makeFuncionario(ResultSet rs) throws SQLException {
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.setCpf(rs.getString("cpf"));
		funcionario.setNome(rs.getString("nome"));
		funcionario.setRg(rs.getString("rg"));
		funcionario.setCep(rs.getString("cep"));
		funcionario.setLogradouro(rs.getString("logradouro"));
		funcionario.setNumeroCasa(rs.getInt("numero_casa"));
		funcionario.setSalario(rs.getBigDecimal("salario"));
		funcionario.setDataContrato( getValorCampo( rs, "data_contrato", (DateTime)null ) );
		funcionario.setDataSaida( getValorCampo( rs, "data_saida", (DateTime)null ) );
		
		return funcionario;
	}
}
