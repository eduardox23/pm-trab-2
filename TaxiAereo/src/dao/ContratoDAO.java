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
import model.Cliente;
import model.Contrato;
import model.Vendedor;
import utils.Common;

/**
 *
 * @author Edu3500
 */
public class ContratoDAO extends GenericDAO {

	private static final String 
	CONTRATO_INSERT = "INSERT INTO contratos(data_contrato, valor, desconto, cpf_cliente, matricula_vendedor) VALUES (?, ?, ?, ?, ?)",
	CONTRATO_UPDATE = "UPDATE contratos SET VALOR = ?, data_contrato = ?, desconto = ?, cpf_cliente = ?, matricula_vendedor = ? WHERE protocolo = ?",
	CONTRATO_DELETE = "DELETE FROM contratos WHERE cpf = ?",
	CONTRATO_SELECT = "SELECT * FROM contratos ORDER BY data_contrato",
	CONTRATO_SELECT_BY_PROTOCOLO = "SELECT * FROM contratos WHERE protocolo = ? ORDER BY data_contrato";

	static public void cadastrar(Contrato contrato) throws SQLException {
		save(CONTRATO_INSERT, 
			 Common.parseTimestamp(contrato.getDataContrato()), 
			 contrato.getValor(), 
			 contrato.getDesconto(),
			 contrato.getCliente().getCpfAsLong(),
			 contrato.getVendedor().getMatricula());
	}

	static public void alterar (Contrato contrato) throws SQLException {
		update(CONTRATO_UPDATE, 
			   contrato.getProtocolo(),
			   contrato.getValor(), 
			   Common.parseTimestamp(contrato.getDataContrato()), 
			   contrato.getDesconto(),
			   contrato.getCliente().getCpfAsLong(),
			   contrato.getVendedor().getCpfAsLong());
	}

	static public void remover(int protocolo) throws SQLException {
		delete(CONTRATO_DELETE, protocolo);
	}

	static public List<Contrato> findContratos() throws SQLException {

		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try{
			ps = getConnection().prepareStatement(CONTRATO_SELECT);
			rs = ps.executeQuery();
			
			List<Contrato> contratos = new ArrayList<>();

			while ( rs.next() )
				contratos.add( makeContrato(rs) );

			return contratos;
		
		} finally {
			fecharConexao( rs );
			fecharConexao( ps );
		}
	}

	static public Contrato findByProtocolo(int protocolo) throws SQLException {
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		Contrato contrato = null;
		
		try{
			ps = getConnection().prepareStatement(CONTRATO_SELECT_BY_PROTOCOLO);
			ps.setInt(1, protocolo);

			rs = ps.executeQuery();

			if ( rs.next() )
				contrato = makeContrato( rs );
			
			return contrato;
		}
		finally {
			fecharConexao( rs );
			fecharConexao( ps );
		}
	}
	
	//----------------------------------------------------------------------------------
	// funções private
	//----------------------------------------------------------------------------------
	private static Contrato makeContrato(ResultSet rs) throws SQLException {
		
		Contrato contrato = new Contrato();
		
		contrato.setProtocolo(rs.getInt("protocolo"));
		contrato.setValor(rs.getBigDecimal("valor"));
		contrato.setDataContrato( getValorCampo( rs, "data_contrato", (DateTime)null ) );
		contrato.setDesconto(rs.getBigDecimal("desconto"));
		
		Cliente cliente = ClienteDAO.findByCpf( rs.getString("cpf_cliente") );
		contrato.setCliente( cliente );
		
		Vendedor vendedor = VendedorDAO.findByMatricula( rs.getInt("matricula_vendedor") );
		contrato.setVendedor( vendedor );
		
		return contrato;
	}
}
