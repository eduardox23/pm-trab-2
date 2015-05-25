/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package camadaDados;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.*;
import javax.swing.ImageIcon;
import oracle.sql.BLOB;

/**
 *
 * @author rsvc
 */
public class RepositorioVeiculo {
    
      private String url = "jdbc:oracle:thin:@//itapissuma.cin.ufpe.br:1521/dbdisc";
      private Connection conn;
       private Statement stmt;
       private ResultSet rset;
       private PreparedStatement pstmt;
       
       public RepositorioVeiculo(String url) throws SQLException, ClassNotFoundException{
               
               Class.forName("oracle.jdbc.driver.OracleDriver");
               this.url = url;
               this.conn = DriverManager.getConnection(url,"g121if685_eq02","vham");
               this.stmt = conn.createStatement();
               this.conn.setAutoCommit(true);
               
       }
       
       public RepositorioVeiculo() throws SQLException, ClassNotFoundException{
               Class.forName("oracle.jdbc.driver.OracleDriver");
               this.conn = DriverManager.getConnection(url,"g121if685_eq02","vham");
               this.stmt = conn.createStatement();
               
       }
       
       public void inserirVeiculo(int chassi, String modelo, int capacidade, int velocidade, int autonomia, String tipo, String path) throws SQLException, FileNotFoundException, IOException, Exception{
           
           this.pstmt = conn.prepareStatement("insert into tb_veiculo_img values ( ?, ?, ?, ?, ?, ?, ? ) ");; 
           pstmt.setInt(1, chassi);
           pstmt.setString(2, modelo);
           pstmt.setInt(3, capacidade);
           pstmt.setInt(4, velocidade);
           pstmt.setInt(5, autonomia);
           pstmt.setString(6, tipo);
           File f = new File(path);
           
           FileInputStream fis =  new FileInputStream(f);
           
           pstmt.setBinaryStream(7, fis, (int) f.length() );
           pstmt.execute();
       } 
       
    
       
       public Veiculo buscarVeiculo(int chassi) throws SQLException, IOException, Exception{
           Veiculo ret = null;
           this.pstmt = conn.prepareStatement("SELECT Chassi , Modelo ,Capacidade , Velocidade , Autonomia , Tipo , imagem FROM tb_veiculo_img WHERE chassi = ? ");
           this.pstmt.setInt(1, chassi);
           
           this.rset = this.pstmt.executeQuery();
           
           if( rset.next()){
              Blob b = this.rset.getBlob("imagem");
              byte[] imgBytes = new byte[(int)b.length()];
              b.getBinaryStream().read(imgBytes); 
              ImageIcon img = new ImageIcon(imgBytes);
              
              ret = new Veiculo(
                      this.rset.getInt("Chassi"), 
                      this.rset.getString("Modelo"), 
                      this.rset.getInt("Capacidade"), 
                      this.rset.getInt("Velocidade"),
                      this.rset.getInt("Autonomia") , 
                      this.rset.getString("Tipo"),
                      img);
           } else {
               throw  new Exception("Veiculo não encontrado");
           }
           return ret;    
       }
       
       public void atualizarVeiculoComImagem(Veiculo v, String path) throws SQLException, FileNotFoundException{      
           
           this.pstmt = conn.prepareStatement("UPDATE tb_veiculo_img  SET Modelo = ?, Capacidade = ?, Velocidade = ?, Autonomia = ?, Tipo = ?, imagem = ? WHERE chassi = ? ");
           
           this.pstmt.setString(1, v.getModelo());
           this.pstmt.setInt(2, v.getCapacidade());
           this.pstmt.setInt(3, v.getVelocidade());
           this.pstmt.setInt(4, v.getAutonomia());
           this.pstmt.setString(5, v.getTipo());
           File f = new File(path);
           FileInputStream fis =  new FileInputStream(f);
           pstmt.setBinaryStream( 6, fis, (int) f.length() );
           this.pstmt.setInt(7, v.getChassi());
           pstmt.execute();
       }
       
       
        public void atualizarVeiculo(Veiculo v) throws SQLException, FileNotFoundException{

           this.pstmt = conn.prepareStatement("UPDATE tb_veiculo_img  SET Modelo = ?, "
                   + "Capacidade = ?, Velocidade = ?, Autonomia = ?, Tipo = ?  WHERE chassi = ? ");
           
           this.pstmt.setString(1, v.getModelo());
           this.pstmt.setInt(2, v.getCapacidade());
           this.pstmt.setInt(3, v.getVelocidade());
           this.pstmt.setInt(4, v.getAutonomia());
           this.pstmt.setString(5, v.getTipo());
           this.pstmt.setInt(6, v.getChassi());
           pstmt.execute();
       }
        
       public void removerVeiculo(int chassi) throws SQLException, FileNotFoundException{

           this.pstmt = conn.prepareStatement("DELETE FROM tb_veiculo_img WHERE chassi = ? ");           
           this.pstmt.setInt(1, chassi);
           pstmt.execute();
          
       } 
}
