package view.veiculo;

import controller.VeiculoController;
import java.io.File;
import model.Veiculo;
import view.BaseView;

/**
 *
 * @author edu3500
 */
public class CadastrarVeiculo extends BaseView {

    private ViewerVeiculo home;
    File fotos;
    
    public CadastrarVeiculo(ViewerVeiculo home){
        this.home = home;
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jRadioButton1 = new javax.swing.JRadioButton();
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
        cadastrarButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Veículo");
        setMinimumSize(new java.awt.Dimension(385, 275));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                fechar(evt);
            }
        });
        getContentPane().setLayout(null);

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

        cadastrarButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cadastrarButton.setText("Cadastrar");
        cadastrarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrar(evt);
            }
        });
        jPanel1.add(cadastrarButton);
        cadastrarButton.setBounds(160, 180, 90, 23);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelar(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(260, 180, 90, 23);

        jCheckBox1.setText("Avião");
        jPanel1.add(jCheckBox1);
        jCheckBox1.setBounds(210, 110, 150, 23);

        jCheckBox2.setText("Helicóptero");
        jPanel1.add(jCheckBox2);
        jCheckBox2.setBounds(210, 140, 160, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 20, 410, 250);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelar
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelar

    private void fechar(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_fechar
        home.setVisible(true);
    }//GEN-LAST:event_fechar

    private void cadastrar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrar
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
			
			VeiculoController.salvar(veiculo);
			
			mostrarMensagemSucesso("Veículo cadastrado com sucesso!");

			this.dispose();
		}
		catch (Exception ex) {
			tratarErro(ex);
		}
    }//GEN-LAST:event_cadastrar

	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {

			public void run() {
				new CadastrarVeiculo(null).setVisible(true);
			}
		});
	}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel autonomiaLabel;
    private javax.swing.JTextField autonomiaTextField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton cadastrarButton;
    private javax.swing.JLabel capacidadeLabel;
    private javax.swing.JTextField capacidadeTextField;
    private javax.swing.JLabel chassiLabel;
    private javax.swing.JTextField chassiTextField;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JLabel modeloLabel;
    private javax.swing.JTextField modeloTextField;
    private javax.swing.JLabel tipoLabel;
    private javax.swing.JLabel velocidadeLabel;
    private javax.swing.JTextField velocidadeTextField;
    // End of variables declaration//GEN-END:variables
}
