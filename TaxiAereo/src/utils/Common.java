/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import hirondelle.date4j.DateTime;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.*;
import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author
 * PedroLZ
 */
public class Common {
	
	static public final String
		CAMPO_NUM_DIGITOS_INVALIDO		= "Campo '%s' deve ter %d dígitos.",
		CAMPO_DECIMAL_INVALIDO			= "Campo inválido: '%s'. Preencha com um número decimal.",
		CAMPO_DECIMAL_POSITIVO_INVALIDO	= "Campo inválido: '%s'. Preencha com um número decimal positivo.",
		CAMPO_DEVE_ESTAR_PREENCHIDO		= "Campo '%s' deve estar preenchido.",
		CAMPO_INTEIRO_INVALIDO			= "Campo inválido: '%s'. Preencha com um número inteiro.",
		CAMPO_INTEIRO_POSITIVO_INVALIDO = "Campo inválido: '%s'. Preencha com um número positivo.",
		CAMPO_DATA_INVALIDO				= "Campo inválido: '%s'. Preencha com uma data no formato 'dd/mm/aaaa'";

	static private final String	FORMATO_MONETARIO	 = "###0,00";
	static private final String	FORMATO_STR_DATETIME = "dd/MM/yyyy";
	static private final int	NUM_DIGITOS_CPF = 11;

	//-------------------------------------------------------------------------
	public static void check( boolean isValido, String msg )
	{
		if( !isValido )
			throw new IllegalArgumentException( msg );
	}	
	
	//-------------------------------------------------------------------------
	public static boolean isNullOrEmpty( String str )
	{
		return( str == null || str.trim().isEmpty() );
	}
	
	//-------------------------------------------------------------------------
	public static boolean isNumericInt( String str )
	{
		try
		{
			Long.parseLong( str );
			return( true );
		}
		catch( Exception ex )
		{
			return( false );
		}
	}

	//-------------------------------------------------------------------------
	public static boolean isDecimal( String str )
	{
		try
		{
			new BigDecimal( str );
			return( true );
		}
		catch( Exception ex )
		{
			return( false );
		}
	}

	//-------------------------------------------------------------------------
	public static boolean isDateTime( String str )
	{
		return parseDateTime(str, null) != null;
	}
	
	//-------------------------------------------------------------------------
	public static int parseInt( String str, int valorDefault )
	{
		try
		{
			return( Integer.parseInt( str ) );
		}
		catch( Exception ex )
		{
			return( valorDefault );
		}
	}
	
	//-------------------------------------------------------------------------
	public static DateTime parseDateTime( String str, DateTime valorDefault )
	{
		if( isNullOrEmpty( str ) )
			return( valorDefault );
		
		DateTime data = valorDefault;
		
		try
		{
			data = parseDateTime( str );
		}
		catch( ParseException ex )
		{}
		return( data );
	}

	//-------------------------------------------------------------------------
	public static DateTime parseDateTime( String str ) 
		throws ParseException
	{
		DateFormat format = new SimpleDateFormat( FORMATO_STR_DATETIME );
		Date data = format.parse( str );
		
		return( DateTime.forInstant( data.getTime(), TimeZone.getDefault() ) );
	}
	
	//-------------------------------------------------------------------------
	public static Timestamp parseTimestamp( DateTime data )
	{
		long dataEmMilissegundos = data.getMilliseconds( TimeZone.getDefault() );
		return( new Timestamp( dataEmMilissegundos ) );
	}
	
	//-------------------------------------------------------------------------
	public static String dtFormatPadrao( DateTime dt )
	{
		final String FORMATO_DATA_PADRAO = "DD/MM/YYYY";
		
		return( dtFormat( dt, FORMATO_DATA_PADRAO ) );
	}

	//-------------------------------------------------------------------------
	public static String dtFormat( DateTime dt, String fmt )
	{
		if( dt == null )
			return( "-" );
		else
			return( dt.format( fmt ) );
	}

	//-------------------------------------------------------------------------
	public static String bigDecimalFormat( BigDecimal valor )
	{
		if( valor == null )
			return( "-" );
		else
		{
			NumberFormat formater = new DecimalFormat( FORMATO_MONETARIO );
			return( formater.format( valor ) );
		}
	}
	
//	//-------------------------------------------------------------------------
//	public static String cepFormat( int cep )
//	{
//		if( cep <= 0 )
//			return( "" );
//		else
//			return( String.format( "%05d-%03d",
//							   cep / 1000,
//							   cep % 1000 ) );
//	}

//	//-------------------------------------------------------------------------
//	public static String cpfFormat( String cgcCpf )
//	{
//		StringBuilder	str = new StringBuilder( cgcCpf );
//
//		if( cgcCpf.length() == NUM_DIGITOS_CPF )
//		{
//			str.insert( 9, '-' );
//			str.insert( 6, '.' );
//			str.insert( 3, '.' );
//		}
//		return( str.toString() );
//	}
}
