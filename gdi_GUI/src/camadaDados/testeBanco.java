/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package camadaDados;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author rsvc
 */
public class testeBanco {
       
    public static void main(String args[]) throws SQLException, ClassNotFoundException, FileNotFoundException, IOException, Exception{
        RepositorioVeiculo rep = new RepositorioVeiculo();
//        Veiculo v= new Veiculo( 90, "Gripen2", 2, 2000, 50, "aviao");
        rep.removerVeiculo(90);
    }
}
