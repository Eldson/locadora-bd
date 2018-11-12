/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao.Excluir;

import DAO.ClienteDAO;
import DAO.Conexao;
import Modelo.Cliente;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class ExcluirCliente extends javax.swing.JFrame {

    /**
     * Creates new form ExcluirCategoria
     */
    public ExcluirCliente() {
        initComponents();
        AtualizaCombo();
    }

    private void AtualizaCombo(){
    Connection con = Conexao.AbrirConecao();
        ClienteDAO sql = new ClienteDAO(con);
        List<Cliente> lista = new ArrayList<>();
        lista = sql.ListarComboCliente();
        jCB_Nome.addItem("");
        
        for (Cliente b : lista) {
          
            jCB_Nome.addItem(b.getNome());
        }
      Conexao.FecharConexao(con);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTF_codigo = new javax.swing.JTextField();
        jCB_Nome = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("                                                             Deletar Cliente");

        jLabel2.setText("Nome");

        jTF_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_codigoActionPerformed(evt);
            }
        });

        jCB_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_NomeActionPerformed(evt);
            }
        });

        jButton1.setText("Deletar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTF_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jCB_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jButton1)
                        .addGap(46, 46, 46)
                        .addComponent(jButton2)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTF_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCB_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTF_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF_codigoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                String Codigo = jTF_codigo.getText();
                String Nome = jCB_Nome.getSelectedItem().toString();
                
                Connection con = Conexao.AbrirConecao();
                 ClienteDAO sql = new ClienteDAO(con);
                 Cliente a = new Cliente();
                 if (Nome.equals("")) {
                     JOptionPane.showMessageDialog(null, "Nenhum nome Selecionado", 
                             "Video Locadora", JOptionPane.WARNING_MESSAGE); 
        }else{
           int b = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir"
                   +"\n ("+Codigo+")("+Nome+")","Video Locadora",
                   JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
           
                     if (b == 0) {
                         int cod = Integer.parseInt(Codigo);
                         a.setCodigo(cod);
                         a.setNome(Nome);
                         sql.Excluir_Cliente(a);
                         Conexao.FecharConexao(con);
                         dispose();
                     }
                 }
                
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCB_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_NomeActionPerformed
        Connection con = Conexao.AbrirConecao();
        ClienteDAO sql = new ClienteDAO(con);
        List<Cliente> lista = new ArrayList<>();
        String nome = jCB_Nome.getSelectedItem().toString();
        
        lista = sql.ConsultaCodigoCliente(nome);
        
        for (Cliente b : lista) {
            int a = b.getCodigo();
            jTF_codigo.setText(""+a);
        }
        Conexao.FecharConexao(con);
        
    }//GEN-LAST:event_jCB_NomeActionPerformed

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
            java.util.logging.Logger.getLogger(ExcluirCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExcluirCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExcluirCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExcluirCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExcluirCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jCB_Nome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTF_codigo;
    // End of variables declaration//GEN-END:variables
}
