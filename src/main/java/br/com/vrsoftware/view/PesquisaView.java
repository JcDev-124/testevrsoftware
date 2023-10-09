/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.vrsoftware.view;

import br.com.vrsoftware.model.EnumStatus;
import br.com.vrsoftware.model.OrdemVenda;
import br.com.vrsoftware.model.Produto;
import br.com.vrsoftware.model.Vendas;
import br.com.vrsoftware.controller.ClienteController;
import br.com.vrsoftware.controller.OrdemVendasController;
import br.com.vrsoftware.controller.ProdutoController;
import br.com.vrsoftware.controller.VendasController;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Julio
 */
public class PesquisaView extends javax.swing.JFrame {
    
    private DefaultTableModel model;

    /**
     * Creates new form PesquisaView
     */
    public PesquisaView() {
        
        initComponents();
        formatarCampoData();
        carregarDadosTabela();

        //Ocultando a coluna ID
        tblVendas.getColumnModel().getColumn(4).setMinWidth(0);
        tblVendas.getColumnModel().getColumn(4).setMaxWidth(0);
        tblVendas.getColumnModel().getColumn(4).setWidth(0);
        btnEstornarVenda.setEnabled(false);
        addChangeListenerAtualizaBtnEstorno(txtClienteDetalhado,btnEstornarVenda);
    }
    
    private void formatarCampoData() {
        try {
            MaskFormatter mask = new MaskFormatter("##/##/####");
            mask.install(fmtTxtData);
        } catch (ParseException ex) {
            System.out.println("Erro ao criar a mascara");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblData = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        btbLimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVendas = new javax.swing.JTable();
        btnFechar = new javax.swing.JButton();
        fmtTxtData = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVendasDetalhadas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtClienteDetalhado = new javax.swing.JTextField();
        txtValorDetalhado = new javax.swing.JTextField();
        txtDataDetalhada = new javax.swing.JTextField();
        btnEstornarVenda = new javax.swing.JButton();
        btnLimparCamposDetalhados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblData.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblData.setText("Data");

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btbLimpar.setText("Limpar");
        btbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbLimparActionPerformed(evt);
            }
        });

        tblVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Cliente", "Status", "Valor Total", "Id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVendasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblVendas);
        if (tblVendas.getColumnModel().getColumnCount() > 0) {
            tblVendas.getColumnModel().getColumn(0).setResizable(false);
            tblVendas.getColumnModel().getColumn(1).setResizable(false);
            tblVendas.getColumnModel().getColumn(2).setResizable(false);
            tblVendas.getColumnModel().getColumn(3).setResizable(false);
            tblVendas.getColumnModel().getColumn(4).setResizable(false);
        }

        btnFechar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnFechar.setText("X");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        tblVendasDetalhadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Quantidade", "Preco"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblVendasDetalhadas);
        if (tblVendasDetalhadas.getColumnModel().getColumnCount() > 0) {
            tblVendasDetalhadas.getColumnModel().getColumn(0).setResizable(false);
            tblVendasDetalhadas.getColumnModel().getColumn(1).setResizable(false);
            tblVendasDetalhadas.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel1.setText("Cliente");

        jLabel2.setText("Valor");

        jLabel3.setText("Data");

        txtClienteDetalhado.setEditable(false);
        txtClienteDetalhado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteDetalhadoActionPerformed(evt);
            }
        });

        txtValorDetalhado.setEditable(false);

        txtDataDetalhada.setEditable(false);

        btnEstornarVenda.setText("Estornar");
        btnEstornarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstornarVendaActionPerformed(evt);
            }
        });

        btnLimparCamposDetalhados.setText("Limpar");
        btnLimparCamposDetalhados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCamposDetalhadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnPesquisar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fmtTxtData, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtValorDetalhado)
                                    .addComponent(txtClienteDetalhado)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(303, 303, 303)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnEstornarVenda)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                        .addComponent(btnLimparCamposDetalhados, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(txtDataDetalhada)))))
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnFechar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtClienteDetalhado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtValorDetalhado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDataDetalhada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEstornarVenda)
                            .addComponent(btnLimparCamposDetalhados)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(fmtTxtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblData))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnPesquisar)
                                .addComponent(btbLimpar))
                            .addGap(24, 24, 24))))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
        model = (DefaultTableModel) tblVendas.getModel();
        
        TableRowSorter sorter = new TableRowSorter<TableModel>(model);
        tblVendas.setRowSorter(sorter);
        
        String data = fmtTxtData.getText();
        if (data != null && !data.trim().isEmpty()) {
            sorter.setRowFilter(RowFilter.regexFilter(("(?i)" + data)));
        } else {
            sorter.setRowFilter(null);
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        // TODO add your handling code here:
        this.dispose();
        SistemaView v = new SistemaView();
        v.setVisible(true);
        v.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnFecharActionPerformed

    private void tblVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVendasMouseClicked
        // TODO add your handling code here:

        ListSelectionModel tableSelectionModel = tblVendas.getSelectionModel();
        
        tblVendas.setSelectionModel(tableSelectionModel);
        
        String nomeCliente = tblVendas.getValueAt(tblVendas.getSelectedRow(), 1).toString();
        String dataVenda = tblVendas.getValueAt(tblVendas.getSelectedRow(), 0).toString();
        String valorTotal = tblVendas.getValueAt(tblVendas.getSelectedRow(), 3).toString();
        Integer id = (Integer) tblVendas.getValueAt(tblVendas.getSelectedRow(), 4);
        
        txtClienteDetalhado.setText(nomeCliente);
        txtDataDetalhada.setText(dataVenda);
        txtValorDetalhado.setText(valorTotal);
        carregarDadosTabelaDetalhada(id);
        

    }//GEN-LAST:event_tblVendasMouseClicked

    private void btbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbLimparActionPerformed
        // TODO add your handling code here:
        fmtTxtData.setText(null);
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(model);
        tblVendas.setRowSorter(sorter);
        sorter.setRowFilter(null);
    }//GEN-LAST:event_btbLimparActionPerformed
    
    private void btnEstornarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstornarVendaActionPerformed
        // TODO add your handling code here:
        OrdemVendasController controller = new OrdemVendasController();
        VendasController controllerVenda = new VendasController();
        ProdutoController controllerProduto = new ProdutoController();
        
        ListSelectionModel tableSelectionModel = tblVendas.getSelectionModel();
        tblVendas.setSelectionModel(tableSelectionModel);
        Integer id = (Integer) tblVendas.getValueAt(tblVendas.getSelectedRow(), 4);
        
        controllerVenda.atualizaStatusVenda(id);
        List<OrdemVenda> list = controller.retornaVendasPorId(id);
        
        for (OrdemVenda x : list) {
            String descricao = controllerProduto.retornaProdutoPorId(x.getIdProduto()).getDescricao();
            Integer quantidade = x.getQuantidade();
            Double preco = x.getPreco();
            Produto produto = new Produto(descricao, preco, quantidade);
            controllerProduto.atualizaProduto(produto);
        }
        JOptionPane.showMessageDialog(null, "Venda estornada!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        

    }//GEN-LAST:event_btnEstornarVendaActionPerformed
    private static void addChangeListenerAtualizaBtnEstorno(JTextField textField, JButton btnEstorno) {
        textField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                textChanged();
            }
            
            @Override
            public void removeUpdate(DocumentEvent e) {
                textChanged();
            }
            
            @Override
            public void changedUpdate(DocumentEvent e) {
                textChanged();
            }
            
            private void textChanged() {
                if ("".equals(textField.getText())) {
                    btnEstorno.setEnabled(false);
                } else {
                    btnEstorno.setEnabled(true);
                }
            }
            
        });
    }
    private void txtClienteDetalhadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteDetalhadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteDetalhadoActionPerformed

    private void btnLimparCamposDetalhadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCamposDetalhadosActionPerformed
        // TODO add your handling code here:
        model = (DefaultTableModel) tblVendasDetalhadas.getModel();
        model.setRowCount(0);
        txtClienteDetalhado.setText("");
        txtDataDetalhada.setText("");
        txtValorDetalhado.setText("");

    }//GEN-LAST:event_btnLimparCamposDetalhadosActionPerformed
    
    private void carregarDadosTabela() {
        ClienteController controllerCliente = new ClienteController();
        Integer id_aux;
        Integer id;
        Integer id_cliente;
        String nome_aux;
        Double valorTotal;
        LocalDate date_aux;
        EnumStatus status;
        VendasController controller = new VendasController();
        List<Vendas> vendas = controller.retornaTodasVendas();
        
        model = (DefaultTableModel) tblVendas.getModel();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        for (Vendas x : vendas) {
            id = x.getId();
            id_aux = x.getCliente();
            
            nome_aux = controllerCliente.pegarNomeCliente(id_aux).getNome();
            date_aux = x.getData();
            String formattedDate = date_aux.format(formatter);  // Formatar a data
            valorTotal = x.getValorTotal();
            status = x.pegarStatus();
            model.addRow(new Object[]{formattedDate, nome_aux, status, valorTotal, id});
        }
    }
    
    private void carregarDadosTabelaDetalhada(Integer id) {
        
        OrdemVendasController controller = new OrdemVendasController();
        ProdutoController controllerProduto = new ProdutoController();
        Produto obj = new Produto();
        List<OrdemVenda> list = controller.retornaVendasPorId(id);
        
        model = (DefaultTableModel) tblVendasDetalhadas.getModel();
        model.setRowCount(0);
        for (OrdemVenda x : list) {
            obj = controllerProduto.retornaProdutoPorId(x.getIdProduto());
            
            String descricao = obj.getDescricao();
            Integer qtd = x.getQuantidade();
            Double preco = x.getPreco();
            
            model.addRow(new Object[]{descricao, qtd, preco});
        }
        
    }

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
            java.util.logging.Logger.getLogger(PesquisaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbLimpar;
    private javax.swing.JButton btnEstornarVenda;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnLimparCamposDetalhados;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JFormattedTextField fmtTxtData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblData;
    private javax.swing.JTable tblVendas;
    private javax.swing.JTable tblVendasDetalhadas;
    private javax.swing.JTextField txtClienteDetalhado;
    private javax.swing.JTextField txtDataDetalhada;
    private javax.swing.JTextField txtValorDetalhado;
    // End of variables declaration//GEN-END:variables
}
