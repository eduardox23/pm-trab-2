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
import model.Contrato;
import model.Piloto;
import model.Veiculo;
import model.Voo;
import utils.Common;

/**
 *
 * @author Edu3500
 */
public class VooDAO extends GenericDAO {

	private static final String 
		VOO_INSERT			= "INSERT INTO voos(chassi_aeronave, breve_piloto, protocolo_contrato,data_saida, data_chegada, origem, destino) VALUES ( ?, ?, ?, ?, ?, ?, ?)",
		VOO_UPDATE			= "UPDATE voos  SET origem = ?, destino = ?, data_agendada = ?, data_chegada= ?, data_saida= ?  WHERE numero = ? ",
		VOO_DELETE			= "DELETE FROM voos WHERE numero = ? ",
		VOO_SELECT			= "SELECT * FROM voos",
		VOO_SELECT_BY_NUM	= "SELECT * FROM voos WHERE numero = ? ";
	
	static public void cadastrar(Voo voo) throws SQLException {
		save(VOO_INSERT, 
			 voo.getVeiculo().getChassi(),
			 voo.getPiloto().getBreve(),
			 voo.getContrato().getProtocolo(),
			 Common.parseTimestamp(voo.getDataSaida()),
			 Common.parseTimestamp(voo.getDataChegada()),
			 voo.getOrigem(),
			 voo.getDestino() );
	}

	static public void alterar (Voo voo) throws SQLException {
		update(VOO_UPDATE, 
			   voo.getOrigem(),
			   voo.getNumero(),
			   voo.getDestino(),
			   Common.parseTimestamp(voo.getDataAgendada()),
			   Common.parseTimestamp(voo.getDataChegada()),
			   Common.parseTimestamp(voo.getDataSaida()));
	}

	static public void remover(int numero) throws SQLException {
		delete(VOO_DELETE, numero);
	}

	static public List<Voo> findVoos() throws SQLException {
		
		PreparedStatement ps = null;
		ResultSet rs = null;

		try{
			ps = getConnection().prepareStatement(VOO_SELECT);
			rs = ps.executeQuery();

			List<Voo> voos = new ArrayList<Voo>();

			while ( rs.next() )
				voos.add( makeVoo(rs) );

			return voos;
			
		} finally {
			fecharConexao( rs );
			fecharConexao( ps );
		}
	}

	static public Voo findByNumero(int numero) throws SQLException {

		PreparedStatement ps = null;
		ResultSet rs = null;
		Voo voo = null;
		
		try{
			ps = getConnection().prepareStatement(VOO_SELECT_BY_NUM);
			ps.setInt(1,numero);
			
			rs = ps.executeQuery();

			if (rs.next())
				voo = makeVoo(rs);

			return voo;

		} finally {
			fecharConexao( rs );
			fecharConexao( ps );
		}
	}

	//----------------------------------------------------------------------------------
	// funções private
	//----------------------------------------------------------------------------------
	private static Voo makeVoo(ResultSet rs) throws SQLException {

		Voo voo = new Voo();
		
		voo.setNumero(rs.getInt("numero"));
		voo.setOrigem(rs.getString("origem"));
		voo.setDestino(rs.getString("destino"));
		voo.setDataAgendada( getValorCampo( rs, "data_agendada", (DateTime)null ) );
		voo.setDataSaida( getValorCampo( rs, "data_saida", (DateTime)null ) );
		voo.setDataChegada( getValorCampo( rs, "data_chegada", (DateTime)null ) );
		
		Veiculo veiculo = VeiculoDAO.findByChassi( rs.getString("chassi_aeronave") );
		voo.setVeiculo(veiculo);
		
		Piloto piloto = PilotoDAO.findByBreve( rs.getInt("breve_piloto") );
		voo.setPiloto(piloto);
		
		Contrato contrato = ContratoDAO.findByProtocolo( rs.getInt("protocolo_contrato") );
		voo.setContrato(contrato);
		
		return voo;
	}
}
