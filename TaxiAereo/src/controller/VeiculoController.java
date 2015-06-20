/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Edu3500
 */
import dao.VeiculoDAO;
import java.sql.SQLException;
import java.util.List;
import model.Veiculo;
 
public class VeiculoController {

	static public void salvar(Veiculo veiculo) throws SQLException{
		VeiculoDAO.cadastrar(veiculo);
	}

	static public void alterar(Veiculo veiculo) throws SQLException {
		VeiculoDAO.alterar(veiculo);
	}

	static public List<Veiculo> listar() throws SQLException {
		return VeiculoDAO.findVeiculos();
	}

	static public void excluir(String chassi) throws SQLException {
		VeiculoDAO.remover(chassi);
	}

	static public Veiculo buscar(String chassi) throws SQLException {
		return VeiculoDAO.findByChassi(chassi);
	}
}
