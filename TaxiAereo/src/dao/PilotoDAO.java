/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import hirondelle.date4j.DateTime;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Piloto;

/**
 *
 * @author Edu3500
 */
public class PilotoDAO extends GenericDAO {

	private static final String 
		PILOTO_INSERT			= "INSERT INTO pilotos(breve, cpf) VALUES (?, ?) ",
//		PILOTO_DELETE			= "DELETE FROM pilotos WHERE breve = ?",
		PILOTO_SELECT			= "SELECT * FROM pilotos pl JOIN funcionarios f ON pl.cpf=f.cpf JOIN pessoas p  ON f.cpf=p.cpf WHERE data_saida IS NULL",
		PILOTO_SELECT_BY_BREVE	= "SELECT * FROM pilotos pl JOIN funcionarios f ON pl.cpf=f.cpf JOIN pessoas p  ON f.cpf=p.cpf WHERE data_saida IS NULL AND breve = ?";

	static public void cadastrar(Piloto piloto) throws SQLException {
		save(PILOTO_INSERT, piloto.getBreve(), piloto.getCpfAsLong());
	}

//	static public void remover(String breve) throws SQLException {
//		delete(PILOTO_DELETE, breve);
//	}

	static public List<Piloto> findPilotos() throws SQLException {

		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try{
			ps = getConnection().prepareStatement(PILOTO_SELECT);
			rs = ps.executeQuery();

			List<Piloto> pilotos = new ArrayList<Piloto>();

			while (rs.next())
				pilotos.add( makePiloto(rs) );

			return pilotos;

		} finally {
			fecharConexao( rs );
			fecharConexao( ps );
		}
	}

	static public Piloto findByBreve(int breve) throws SQLException {
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		Piloto piloto = null;
		
		try{
			ps = getConnection().prepareStatement(PILOTO_SELECT_BY_BREVE);
			ps.setInt(1, breve);
			
			rs = ps.executeQuery();

			if (rs.next())
				piloto = makePiloto(rs);

			return piloto;

		} finally {
			fecharConexao( rs );
			fecharConexao( ps );
		}
	}

	//----------------------------------------------------------------------------------
	// funções private
	//----------------------------------------------------------------------------------
	private static Piloto makePiloto(ResultSet rs) throws SQLException {
		Piloto piloto = new Piloto();
		piloto.setCpf(rs.getString("cpf"));
		piloto.setNome(rs.getString("nome"));
		piloto.setRg(rs.getString("rg"));
		piloto.setCep(rs.getString("cep"));
		piloto.setLogradouro(rs.getString("logradouro"));
		piloto.setNumeroCasa(rs.getInt("numero_casa"));
		piloto.setBreve(rs.getInt("breve"));
		piloto.setSalario(rs.getBigDecimal("salario"));
		piloto.setDataContrato(getValorCampo( rs, "data_contrato", (DateTime)null ));
		return piloto;
	}
}
