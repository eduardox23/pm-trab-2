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
import model.Vendedor;

/**
 *
 * @author Edu3500
 */
public class VendedorDAO extends GenericDAO {

	private static final String
		VENDEDOR_DELETE				 = "DELETE FROM vendedores WHERE cpf = ? ",
		VENDEDOR_INSERT				 = "INSERT INTO vendedores (cpf) VALUES (?) ",
		VENDEDOR_SELECT				 = "SELECT * FROM vendedores v INNER JOIN funcionarios f ON v.cpf=f.cpf INNER JOIN pessoas p ON v.cpf=p.cpf WHERE data_saida IS NULL",
		VENDEDOR_SELECT_BY_MATRICULA = "SELECT * FROM vendedores v INNER JOIN funcionarios f ON v.cpf=f.cpf INNER JOIN pessoas p ON v.cpf=p.cpf WHERE data_saida IS NULL AND matricula = ?";

	static public void cadastrar(Vendedor vendedor) throws SQLException {
		save(VENDEDOR_INSERT, vendedor.getCpfAsLong());
	}

	static public void remover(Vendedor vendedor) throws SQLException {
		delete(VENDEDOR_DELETE, vendedor.getCpfAsLong());
	}

	static public List<Vendedor> findVendedores() throws SQLException {
		
		PreparedStatement ps = null;
		ResultSet rs = null;

		try{
			ps = getConnection().prepareStatement(VENDEDOR_SELECT);
			rs = ps.executeQuery();

			List<Vendedor> vendedores = new ArrayList<Vendedor>();
		
			while (rs.next())
				vendedores.add( makeVendedor(rs) );

			return vendedores;

		} finally {
			fecharConexao( rs );
			fecharConexao( ps );
		}
	}

	static public Vendedor findByMatricula (int matricula) throws SQLException {

		PreparedStatement ps = null;
		ResultSet rs = null;
		Vendedor vendedor = null;
		
		try{
			ps = getConnection().prepareStatement(VENDEDOR_SELECT_BY_MATRICULA);
			ps.setInt(1,matricula);
			
			rs = ps.executeQuery();

			if( rs.next() )
				vendedor = makeVendedor(rs);

			return vendedor;

		} finally {
			fecharConexao( rs );
			fecharConexao( ps );
		}
	}

	//----------------------------------------------------------------------------------
	// funções private
	//----------------------------------------------------------------------------------
	private static Vendedor makeVendedor(ResultSet rs) throws SQLException {

		Vendedor vendedor = new Vendedor();
		
		vendedor.setCpf(rs.getString("cpf"));
		vendedor.setNome(rs.getString("nome"));
		vendedor.setRg(rs.getString("rg"));
		vendedor.setCep(rs.getString("cep"));
		vendedor.setLogradouro(rs.getString("logradouro"));
		vendedor.setNumeroCasa(rs.getInt("numero_casa"));
		vendedor.setMatricula(rs.getInt("matricula"));
		vendedor.setDataContrato(getValorCampo( rs, "data_contrato", (DateTime)null ));
		vendedor.setSalario(rs.getBigDecimal("salario"));
		
		return vendedor;
	}
}
