/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author
 * PedroLZ
 */
public class BaseView extends javax.swing.JFrame
{
	protected String TITULO_MSG_SUCESSO		= "Sucesso!";
	protected String TITULO_MSG_CONFIRMACAO = "Confirmação";
	
	//-------------------------------------------------------------------------
	// funções auxiliares para as outras Views
	//-------------------------------------------------------------------------
	protected void mostrarMensagemSucesso(String msg)
	{
		// TODO ver se quer colocar alguma formatação deste tipo: '<html><font size = 4><b>msg</html></b>'
		JOptionPane.showMessageDialog(this, msg , TITULO_MSG_SUCESSO, JOptionPane.INFORMATION_MESSAGE);
	}
	
	//-------------------------------------------------------------------------
	protected boolean mostrarMensagemConfirmacao(String msg)
	{
		int resposta = JOptionPane.showConfirmDialog(this, msg , TITULO_MSG_CONFIRMACAO, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE );
		
		// TODO substituir esse zero por JOptionPane.YES_OPTION (se for isso mesmo, testar)
		return( resposta == 0 );
	}
	
	//-------------------------------------------------------------------------
	protected void tratarErro(Exception ex)
	{
		if( ex instanceof IllegalArgumentException )
			tratarErroParametroInvalido( (IllegalArgumentException) ex );
		else
		if( ex instanceof UnsupportedOperationException )
			tratarErroOperacaoNaoSuportada( (UnsupportedOperationException) ex );
		else
		if( ex instanceof SQLException )
			tratarErroSQL( (SQLException) ex );
		else
			tratarErroInesperado( ex );
	}
	
	//-------------------------------------------------------------------------
	// funções private
	//-------------------------------------------------------------------------
	private void tratarErroParametroInvalido(IllegalArgumentException ex)
	{
		final String tituloDialogo = "Erro nos dados recebidos";
		final String msgDialogo = ex.getMessage();
		
		JOptionPane.showMessageDialog(this, msgDialogo , tituloDialogo, JOptionPane.WARNING_MESSAGE);
	}

	//-------------------------------------------------------------------------
	private void tratarErroOperacaoNaoSuportada(UnsupportedOperationException ex) 
	{
		final String tituloDialogo = "Operação não suportada";
		final String msgDialogo = ex.getMessage();
		
		JOptionPane.showMessageDialog(this, msgDialogo , tituloDialogo, JOptionPane.WARNING_MESSAGE);
	}

	//-------------------------------------------------------------------------
	private void tratarErroSQL(SQLException ex)
	{
		final String tituloDialogo = "Erro";
		final String msgDialogo = "Ocorreu um erro inesperado de banco de dados! Contacte o administrador do sistema.";
		
		loggarErro(ex);
		JOptionPane.showMessageDialog(this, msgDialogo , tituloDialogo, JOptionPane.ERROR_MESSAGE);
	}

	//-------------------------------------------------------------------------
	private void tratarErroInesperado(Exception ex)
	{
		final String tituloDialogo = "Erro";
		final String msgDialogo = "Ocorreu um erro inesperado! Contacte o administrador do sistema.";
		
		loggarErro(ex);
		JOptionPane.showMessageDialog(this, msgDialogo , tituloDialogo, JOptionPane.ERROR_MESSAGE);
	}
	
	//-------------------------------------------------------------------------
	private void loggarErro(Exception ex)
	{
		String caminhoDaClasse = this.getClass().getName();
		
		Logger.getLogger( caminhoDaClasse ).log( Level.SEVERE, null, ex );
	}
	
	
	//-------------------------------------------------------------------------
	// funções do JFrame
	//-------------------------------------------------------------------------
	public BaseView() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Empresa Taxi Aéreo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	public static void main(String args[]) {
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
		 * If
		 * Nimbus
		 * (introduced
		 * in
		 * Java
		 * SE
		 * 6)
		 * is
		 * not
		 * available,
		 * stay
		 * with
		 * the
		 * default
		 * look
		 * and
		 * feel.
		 * For
		 * details
		 * see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(BaseView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(BaseView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(BaseView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(BaseView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		java.awt.EventQueue.invokeLater(new Runnable() {

			public void run() {
				new BaseView().setVisible(true);
			}
		});
	}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
