/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Edu3500
 */

import hirondelle.date4j.DateTime;
import java.math.BigDecimal;
import java.sql.*;
import java.util.TimeZone;

public abstract class GenericDAO {
	
	static PreparedStatement ps = null;
	static ResultSet rs = null;
		
	static private Connection connection = ConexaoBD.getConnection();

	static protected Connection getConnection() {
		return connection;
	}

	static protected void save(String insertSql, Object... parametros) throws SQLException {
		
		PreparedStatement ps = null;
				
		try {
			ps = getConnection().prepareStatement( insertSql, PreparedStatement.RETURN_GENERATED_KEYS );

			int ind = 1;
			for (Object parametro : parametros)
				ps.setObject(ind++, parametro);

			ps.execute();
		} finally {
			ps.close();
		}
	}

	static protected void update(String updateSql, Object id, Object... parametros) throws SQLException {

		PreparedStatement ps = null;
		
		try{
			ps = getConnection().prepareStatement(updateSql);

			int ind = 1;
			for (Object parametro : parametros)
				ps.setObject(ind++, parametro);

			ps.setObject(ind++, id);
			
			ps.execute();

		} finally {
			ps.close();
		}
	}

	static protected void delete(String deleteSql, Object... parametros) throws SQLException {

		PreparedStatement ps = null;
		
		try{
			ps = getConnection().prepareStatement(deleteSql);
			
			int ind = 1;
			for (Object parametro : parametros)
				ps.setObject(ind++, parametro);

			ps.execute();
			
		} finally {
			ps.close();
		}
	}
	
	//-------------------------------------------------------------------------
	static protected void fecharConexao( PreparedStatement ps ) throws SQLException{
		if( ps != null )
			ps.close();
	}

	//-------------------------------------------------------------------------
	static protected void fecharConexao( ResultSet rs ) throws SQLException{
		if( rs != null )
			rs.close();
	}
	
	//-------------------------------------------------------------------------
	public static String getValorCampo( ResultSet rs, String nomeCampo, String valorDefault )
		throws SQLException
	{
		String valor = rs.getString( nomeCampo );
		if( rs.wasNull() )
			return( valorDefault );
		else
			return( valor );
	}

	//-------------------------------------------------------------------------
	public static DateTime getValorCampo( ResultSet rs, String nomeCampo, DateTime valorDefault )
		throws SQLException
	{
		Timestamp	timestamp = rs.getTimestamp( nomeCampo );
		if( rs.wasNull() )
			return( valorDefault );
		else
			return( DateTime.forInstant( timestamp.getTime(), TimeZone.getDefault() ) );
	}

	//-------------------------------------------------------------------------
	public static BigDecimal getValorCampo( ResultSet rs, String nomeCampo, BigDecimal valorDefault )
		throws SQLException
	{
		BigDecimal	valor = rs.getBigDecimal( nomeCampo );
		if( rs.wasNull() )
			return( valorDefault );
		else
			return( valor );
	}

	//----------------------------------------------------------------------------------
	// funções private
	//----------------------------------------------------------------------------------
//	private static int getIdGerado(PreparedStatement ps) throws SQLException {
//		int id = -1;
//		ResultSet rs = ps.getGeneratedKeys();
//		
//		if (rs.next())
//			id = rs.getInt(1);
//		
//		return id;
//	}
}
