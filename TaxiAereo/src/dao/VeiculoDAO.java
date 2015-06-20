/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Edu3500
 */

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Veiculo;

public class VeiculoDAO extends GenericDAO {

	private static final String 
		VEICULO_INSERT				= "INSERT INTO aeronaves VALUES ( ?, ?, ?, ?, ?, ? )",
		VEICULO_DELETE				= "DELETE FROM aeronaves WHERE chassi = ?",
		VEICULO_UPDATE				= "UPDATE aeronaves  SET modelo = ?, capacidade = ?, velocidade = ?, autonomia = ?, tipo = ?  WHERE chassi = ?",
		VEICULO_SELECT				= "SELECT * FROM aeronaves",
		VEICULO_SELECT_BY_CHASSI	= "SELECT * FROM aeronaves WHERE chassi = ? ";
	
	static public void cadastrar(Veiculo veiculo) throws SQLException {
		save(VEICULO_INSERT, 
			 veiculo.getChassi(), 
			 veiculo.getModelo(), 
			 veiculo.getCapacidade(),
			 veiculo.getVelocidade(),
			 veiculo.getAutonomia(),
			 veiculo.getTipoDescr());
	}

	static public void alterar(Veiculo veiculo) throws SQLException {
		update(VEICULO_UPDATE,
			   veiculo.getChassi(),
			   veiculo.getModelo(),
			   veiculo.getCapacidade(),
			   veiculo.getVelocidade(),
			   veiculo.getAutonomia(),
			   veiculo.getTipoDescr());
	}

	static public void remover(String chassi) throws SQLException {
		delete(VEICULO_DELETE, chassi);
	}

	static public List<Veiculo> findVeiculos() throws SQLException {

		PreparedStatement ps = null;
		ResultSet rs = null;

		try{
			ps = getConnection().prepareStatement(VEICULO_SELECT);
			rs = ps.executeQuery();

			List<Veiculo> veiculos = new ArrayList<Veiculo>();

			while ( rs.next() )
				veiculos.add( makeVeiculo(rs) );

			return veiculos;

		} finally {
			fecharConexao( rs );
			fecharConexao( ps );
		}
	}

	static public Veiculo findByChassi(String chassi) throws SQLException {

		PreparedStatement ps = null;
		ResultSet rs = null;
		Veiculo veiculo = null;
		
		try{
			ps = getConnection().prepareStatement(VEICULO_SELECT_BY_CHASSI);
			ps.setString(1,chassi);
		
			rs = ps.executeQuery();

			while ( rs.next() )
				veiculo = makeVeiculo(rs);

			return veiculo;

		} finally {
			fecharConexao( rs );
			fecharConexao( ps );
		}
	}

	//----------------------------------------------------------------------------------
	// funções private
	//----------------------------------------------------------------------------------
	private static Veiculo makeVeiculo(ResultSet rs) throws SQLException {

		Veiculo veiculo = new Veiculo();
		
		veiculo.setChassi(rs.getString("chassi"));
		veiculo.setModelo(rs.getString("modelo"));
		veiculo.setCapacidade(rs.getInt("capacidade"));
		veiculo.setVelocidade(rs.getInt("velocidade"));
		veiculo.setAutonomia(rs.getInt("autonomia"));
		veiculo.setTipo(rs.getString("tipo"));
		
		return veiculo;
	}
}

