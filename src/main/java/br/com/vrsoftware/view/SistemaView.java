/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.vrsoftware.view;

import javax.swing.JOptionPane;

/**
 *
 * @author Julio
 */
public class SistemaView extends javax.swing.JFrame {

    /**
     * Creates new form SistemaView
     */
    public SistemaView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCadCliente = new javax.swing.JButton();
        menuMain = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        menuCadCliente = new javax.swing.JMenuItem();
        menuCadProduto = new javax.swing.JMenuItem();
        menuCadVenda = new javax.swing.JMenuItem();
        menuPesquisa = new javax.swing.JMenu();
        menuPesqCliente = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCadCliente.setText("Clientes");

        menuCadastro.setText("Registrar");

        menuCadCliente.setText("Cliente");
        menuCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadClienteActionPerformed(evt);
            }
        });
        menuCadastro.add(menuCadCliente);

        menuCadProduto.setText("Produto");
        menuCadProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadProdutoActionPerformed(evt);
            }
        });
        menuCadastro.add(menuCadProduto);

        menuCadVenda.setText("Venda");
        menuCadVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadVendaActionPerformed(evt);
            }
        });
        menuCadastro.add(menuCadVenda);

        menuMain.add(menuCadastro);

        menuPesquisa.setText("Pesquisar");

        menuPesqCliente.setText("Cliente");
        menuPesqCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPesqClienteActionPerformed(evt);
            }
        });
        menuPesquisa.add(menuPesqCliente);

        menuMain.add(menuPesquisa);

        menuSair.setText("Sair");
        menuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSairMouseClicked(evt);
            }
        });
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        menuMain.add(menuSair);

        setJMenuBar(menuMain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(268, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnCadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuPesqClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPesqClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuPesqClienteActionPerformed

    private void menuCadVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuCadVendaActionPerformed

    private void menuCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadClienteActionPerformed
        this.dispose();
        ClienteView c = new ClienteView();
        c.setVisible(true);
        c.setLocationRelativeTo(null);
    }//GEN-LAST:event_menuCadClienteActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
    
    }//GEN-LAST:event_menuSairActionPerformed

    private void menuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSairMouseClicked
        String msg = "Deseja sair do sistema?";
        int opcao = JOptionPane.showConfirmDialog(null, msg, "Sistema", JOptionPane.YES_NO_OPTION);
        if(opcao == JOptionPane.YES_OPTION)        System.exit(0);

    }//GEN-LAST:event_menuSairMouseClicked

    private void menuCadProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadProdutoActionPerformed
                // TODO add your handling code here:
        this.dispose();
        ProdutoView v = new ProdutoView();
        v.setVisible(true);
        v.setLocationRelativeTo(null);
    }//GEN-LAST:event_menuCadProdutoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SistemaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SistemaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SistemaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SistemaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SistemaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadCliente;
    private javax.swing.JMenuItem menuCadCliente;
    private javax.swing.JMenuItem menuCadProduto;
    private javax.swing.JMenuItem menuCadVenda;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenuBar menuMain;
    private javax.swing.JMenuItem menuPesqCliente;
    private javax.swing.JMenu menuPesquisa;
    private javax.swing.JMenu menuSair;
    // End of variables declaration//GEN-END:variables
}
