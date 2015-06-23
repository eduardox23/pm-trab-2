/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import view.cliente.ViewerCliente;
import view.contrato.ViewerContrato;
import view.piloto.ViewerPiloto;
import view.veiculo.ViewerVeiculo;
import view.vendedor.ViewerVendedor;
import view.voo.ViewerVoo;

/**
 *
 * @author
 * Edu3500
 */
public class TelaPrincipal extends BaseView {

	public TelaPrincipal() {
		initComponents();
		setLocationRelativeTo(null);
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnPilotos = new javax.swing.JButton();
        btnVendedores = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnAeronaves = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnContratos = new javax.swing.JButton();
        btnVoos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações de Cadastros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel1.setLayout(null);

        btnPilotos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPilotos.setText("Pilotos");
        btnPilotos.setToolTipText("");
        btnPilotos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPilotosremover(evt);
            }
        });
        jPanel1.add(btnPilotos);
        btnPilotos.setBounds(200, 90, 130, 23);

        btnVendedores.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnVendedores.setText("Vendedores");
        btnVendedores.setToolTipText("");
        btnVendedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVendedorescadastrar(evt);
            }
        });
        btnVendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendedoresActionPerformed(evt);
            }
        });
        jPanel1.add(btnVendedores);
        btnVendedores.setBounds(40, 50, 130, 23);

        btnClientes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnClientes.setText("Clientes");
        btnClientes.setToolTipText("");
        btnClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClientesatualizar(evt);
            }
        });
        jPanel1.add(btnClientes);
        btnClientes.setBounds(200, 50, 130, 23);

        btnAeronaves.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAeronaves.setText("Aeronaves");
        btnAeronaves.setToolTipText("");
        btnAeronaves.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAeronavesbuscar(evt);
            }
        });
        jPanel1.add(btnAeronaves);
        btnAeronaves.setBounds(40, 90, 130, 23);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações de Registros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel2.setLayout(null);

        btnContratos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnContratos.setText("Contratos");
        btnContratos.setToolTipText("");
        btnContratos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnContratoscadastrar(evt);
            }
        });
        jPanel2.add(btnContratos);
        btnContratos.setBounds(40, 50, 300, 23);

        btnVoos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnVoos.setText("Voos");
        btnVoos.setToolTipText("");
        btnVoos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVoosbuscar(evt);
            }
        });
        jPanel2.add(btnVoos);
        btnVoos.setBounds(40, 90, 300, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	private void btnPilotosremover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPilotosremover
		this.setVisible(false);
		new ViewerPiloto(this).setVisible(true);
	}//GEN-LAST:event_btnPilotosremover

	private void btnVendedorescadastrar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVendedorescadastrar
		this.setVisible(false);
		new ViewerVendedor(this).setVisible(true);
	}//GEN-LAST:event_btnVendedorescadastrar

	private void btnClientesatualizar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesatualizar
		this.setVisible(false);
		new ViewerCliente(this).setVisible(true);
	}//GEN-LAST:event_btnClientesatualizar

	private void btnAeronavesbuscar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAeronavesbuscar
		this.setVisible(false);
		new ViewerVeiculo(this).setVisible(true);
	}//GEN-LAST:event_btnAeronavesbuscar

	private void btnContratoscadastrar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContratoscadastrar
		this.setVisible(false);
		new ViewerContrato(this).setVisible(true);
	}//GEN-LAST:event_btnContratoscadastrar

	private void btnVoosbuscar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoosbuscar
		this.setVisible(false);
		new ViewerVoo(this).setVisible(true);
	}//GEN-LAST:event_btnVoosbuscar

	private void btnVendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendedoresActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_btnVendedoresActionPerformed

	public static void main(String args[]) {

		java.awt.EventQueue.invokeLater(new Runnable() {

			public void run() {
				new TelaPrincipal().setVisible(true);
			}
		});
	}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAeronaves;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnContratos;
    private javax.swing.JButton btnPilotos;
    private javax.swing.JButton btnVendedores;
    private javax.swing.JButton btnVoos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
