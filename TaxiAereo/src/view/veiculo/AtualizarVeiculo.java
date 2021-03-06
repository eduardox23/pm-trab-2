package view.veiculo;


import controller.VeiculoController;
import java.awt.event.KeyEvent;
import java.io.File;
import javax.swing.ImageIcon;
import model.Veiculo;
import view.BaseView;

/**
 *
 * @author Edu3500
 */
public class AtualizarVeiculo extends BaseView {

    private ViewerVeiculo home;
    private ImageIcon foto;
    File fotos;
    /** Creates new form AtualizarVeiculo */
    public AtualizarVeiculo(ViewerVeiculo home) {
        this.home = home;
        initComponents();
        setLocationRelativeTo(null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        buscaButton = new javax.swing.JButton();
        buscaTextField = new javax.swing.JTextField();
        buscaLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        velocidadeLabel = new javax.swing.JLabel();
        capacidadeLabel = new javax.swing.JLabel();
        modeloLabel = new javax.swing.JLabel();
        autonomiaLabel = new javax.swing.JLabel();
        chassiLabel = new javax.swing.JLabel();
        tipoLabel = new javax.swing.JLabel();
        chassiTextField = new javax.swing.JTextField();
        modeloTextField = new javax.swing.JTextField();
        capacidadeTextField = new javax.swing.JTextField();
        velocidadeTextField = new javax.swing.JTextField();
        autonomiaTextField = new javax.swing.JTextField();
        confirmarButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Atualizar Veículo");
        setMinimumSize(new java.awt.Dimension(385, 300));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                fechar(evt);
            }
        });
        getContentPane().setLayout(null);

        buscaButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buscaButton.setText("Buscar");
        buscaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(buscaButton);
        buscaButton.setBounds(290, 30, 80, 20);

        buscaTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscarEnter(evt);
            }
        });
        getContentPane().add(buscaTextField);
        buscaTextField.setBounds(60, 30, 230, 20);

        buscaLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buscaLabel.setText(" Chassi:");
        getContentPane().add(buscaLabel);
        buscaLabel.setBounds(10, 30, 50, 20);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        velocidadeLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        velocidadeLabel.setText("Velocidade:");
        jPanel1.add(velocidadeLabel);
        velocidadeLabel.setBounds(200, 80, 70, 20);

        capacidadeLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        capacidadeLabel.setText("Capacidade:");
        jPanel1.add(capacidadeLabel);
        capacidadeLabel.setBounds(20, 80, 70, 20);

        modeloLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        modeloLabel.setText("Modelo:");
        jPanel1.add(modeloLabel);
        modeloLabel.setBounds(20, 50, 50, 20);

        autonomiaLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        autonomiaLabel.setText("Autonomia:");
        jPanel1.add(autonomiaLabel);
        autonomiaLabel.setBounds(20, 110, 70, 20);

        chassiLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chassiLabel.setText("Chassi:");
        jPanel1.add(chassiLabel);
        chassiLabel.setBounds(20, 20, 40, 20);

        tipoLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tipoLabel.setText("Tipo:");
        jPanel1.add(tipoLabel);
        tipoLabel.setBounds(170, 110, 27, 20);

        chassiTextField.setEditable(false);
        jPanel1.add(chassiTextField);
        chassiTextField.setBounds(70, 20, 270, 20);
        jPanel1.add(modeloTextField);
        modeloTextField.setBounds(70, 50, 270, 20);
        jPanel1.add(capacidadeTextField);
        capacidadeTextField.setBounds(100, 80, 90, 20);
        jPanel1.add(velocidadeTextField);
        velocidadeTextField.setBounds(270, 80, 70, 20);
        jPanel1.add(autonomiaTextField);
        autonomiaTextField.setBounds(100, 110, 60, 20);

        confirmarButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        confirmarButton.setText("Confimar");
        confirmarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmar(evt);
            }
        });
        jPanel1.add(confirmarButton);
        confirmarButton.setBounds(150, 170, 90, 23);

        cancelarButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cancelarButton.setText("Cancelar");
        cancelarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelar(evt);
            }
        });
        jPanel1.add(cancelarButton);
        cancelarButton.setBounds(250, 170, 90, 23);

        jCheckBox1.setText("Avião");
        jPanel1.add(jCheckBox1);
        jCheckBox1.setBounds(200, 110, 140, 23);

        jCheckBox2.setText("Helicóptero");
        jPanel1.add(jCheckBox2);
        jCheckBox2.setBounds(200, 140, 150, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 60, 360, 200);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fechar(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_fechar
        home.setVisible(true);
    }//GEN-LAST:event_fechar

    private void cancelar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelar
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelar

    private void confirmar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmar

		boolean confirmou = mostrarMensagemConfirmacao("Atualizar Veículo?");
		
		if(confirmou)
		{
			try 
			{
				Veiculo veiculo = new Veiculo();
				
				veiculo.setChassi(chassiTextField.getText());
				veiculo.setModelo(modeloTextField.getText());
				veiculo.setCapacidade(capacidadeTextField.getText());
				veiculo.setVelocidade(velocidadeTextField.getText());
				veiculo.setAutonomia(autonomiaTextField.getText());
				
				if(jCheckBox1.isSelected()){
					veiculo.setTipo("Aviao");
				}else if(jCheckBox2.isSelected()){
					veiculo.setTipo("Helicoptero");
				}
				
				VeiculoController.alterar( veiculo );

				mostrarMensagemSucesso("Veículo alterado com sucesso!");

				this.dispose();
			}
			catch (Exception ex) {
				tratarErro(ex);
			}
		}
    }//GEN-LAST:event_confirmar

    private void buscaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaButtonActionPerformed
		try
		{
			Veiculo veiculo = new Veiculo();
			veiculo.setChassi( buscaTextField.getText() );

			veiculo = VeiculoController.buscar( veiculo.getChassi() );

			chassiTextField.setText(veiculo.getChassi());
			modeloTextField.setText(veiculo.getModelo());
			capacidadeTextField.setText( String.valueOf(veiculo.getCapacidade()) );
			velocidadeTextField.setText( String.valueOf(veiculo.getVelocidade()) );
			autonomiaTextField.setText( String.valueOf(veiculo.getAutonomia()) );
			
			if(veiculo.getTipo() == Veiculo.Tipo.AVIAO){
				jCheckBox1.doClick();
			}else{
				jCheckBox2.doClick();
			}
        }
		catch (Exception ex) {
			tratarErro(ex);
		}
    }//GEN-LAST:event_buscaButtonActionPerformed

    private void buscarEnter(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarEnter
		if(evt.getKeyCode() == KeyEvent.VK_ENTER){
			buscaButtonActionPerformed(null);
		}
    }//GEN-LAST:event_buscarEnter

	/**
		* @param args the command line arguments
		*/
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {

			public void run() {
				new AtualizarVeiculo(null).setVisible(true);
			}
		});
	}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel autonomiaLabel;
    private javax.swing.JTextField autonomiaTextField;
    private javax.swing.JButton buscaButton;
    private javax.swing.JLabel buscaLabel;
    private javax.swing.JTextField buscaTextField;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JLabel capacidadeLabel;
    private javax.swing.JTextField capacidadeTextField;
    private javax.swing.JLabel chassiLabel;
    private javax.swing.JTextField chassiTextField;
    private javax.swing.JButton confirmarButton;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel modeloLabel;
    private javax.swing.JTextField modeloTextField;
    private javax.swing.JLabel tipoLabel;
    private javax.swing.JLabel velocidadeLabel;
    private javax.swing.JTextField velocidadeTextField;
    // End of variables declaration//GEN-END:variables
}
