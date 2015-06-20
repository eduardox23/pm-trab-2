package view.veiculo;

import controller.VeiculoController;
import java.awt.event.KeyEvent;
import model.Veiculo;
import view.BaseView;

 /**
 *
 * @author Edu3500
 */
public class RemoverVeiculo extends BaseView {

    private ViewerVeiculo home;

	/** Creates new form RemoverVeiculo */
    public RemoverVeiculo(ViewerVeiculo home) {
        this.home = home;
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buscaLabel = new javax.swing.JLabel();
        buscaTextField = new javax.swing.JTextField();
        removeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Remover Veículo");
        setMinimumSize(new java.awt.Dimension(410, 100));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                fechar(evt);
            }
        });
        getContentPane().setLayout(null);

        buscaLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buscaLabel.setText(" Chassi:");
        getContentPane().add(buscaLabel);
        buscaLabel.setBounds(10, 20, 50, 20);

        buscaTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                removerEnter(evt);
            }
        });
        getContentPane().add(buscaTextField);
        buscaTextField.setBounds(60, 20, 230, 20);

        removeButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        removeButton.setText("Remover");
        removeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                remover(evt);
            }
        });
        getContentPane().add(removeButton);
        removeButton.setBounds(290, 20, 90, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fechar(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_fechar
        home.setVisible(true);
    }//GEN-LAST:event_fechar

    private void remover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_remover
		boolean confirmou = mostrarMensagemConfirmacao("Remover Veículo?");
		
		if(confirmou)
		{
			try {
				Veiculo veiculo = new Veiculo();
				veiculo.setChassi( buscaTextField.getText() );

				VeiculoController.excluir( veiculo.getChassi() );
				mostrarMensagemSucesso("Veículo removido com sucesso!");

				this.dispose();
			}
			catch (Exception ex) {
				tratarErro(ex);
			}
		}
    }//GEN-LAST:event_remover

    private void removerEnter(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_removerEnter
		if(evt.getKeyCode() == KeyEvent.VK_ENTER){
			remover(null);
		}
    }//GEN-LAST:event_removerEnter

	/**
		* @param args the command line arguments
		*/
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {

			public void run() {
				new RemoverVeiculo(null).setVisible(true);
			}
		});
	}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buscaLabel;
    private javax.swing.JTextField buscaTextField;
    private javax.swing.JButton removeButton;
    // End of variables declaration//GEN-END:variables
}
