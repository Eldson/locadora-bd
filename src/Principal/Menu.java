/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Visao.Cadastrar.CadastarCategoria;
import Visao.Cadastrar.CadastarClassificacao;
import Visao.Cadastrar.CadastrarCliente;
import Visao.Cadastrar.CadastrarDVD;
import Visao.Cadastrar.CadastrarFilme;
import Visao.Cadastrar.CadastrarFuncionario;

/**
 *
 * @author aluno
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        setSize(900, 450);
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        cadasCliente = new javax.swing.JMenuItem();
        cadasFlime = new javax.swing.JMenuItem();
        cadasDVD = new javax.swing.JMenuItem();
        cadasCategoria = new javax.swing.JMenuItem();
        cadasClassificacao = new javax.swing.JMenuItem();
        cadasFuncionario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Imagens/dvd-mount2.png"))); // NOI18N
        jButton1.setText("Locação");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Imagens/DVD3.png"))); // NOI18N
        jButton2.setText("Devolução");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Imagens/sair1.png"))); // NOI18N
        jButton3.setText("Sair");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Imagens/1.jpg"))); // NOI18N
        jLabel2.setText("jLabel1");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Imagens/video.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Imagens/Java-logo-YesParK.png"))); // NOI18N
        jLabel3.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 227, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 27, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(0, 15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel1))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jMenu1.setText("cadastar");

        cadasCliente.setText("Cliente");
        cadasCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadasClienteActionPerformed(evt);
            }
        });
        jMenu1.add(cadasCliente);

        cadasFlime.setText("Filme");
        cadasFlime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadasFlimeActionPerformed(evt);
            }
        });
        jMenu1.add(cadasFlime);

        cadasDVD.setText("DVD");
        cadasDVD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadasDVDActionPerformed(evt);
            }
        });
        jMenu1.add(cadasDVD);

        cadasCategoria.setText("Categoria");
        cadasCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadasCategoriaActionPerformed(evt);
            }
        });
        jMenu1.add(cadasCategoria);

        cadasClassificacao.setText("Classificação");
        cadasClassificacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadasClassificacaoActionPerformed(evt);
            }
        });
        jMenu1.add(cadasClassificacao);

        cadasFuncionario.setText("Funcionario");
        cadasFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadasFuncionarioActionPerformed(evt);
            }
        });
        jMenu1.add(cadasFuncionario);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consultar");

        jMenuItem7.setText("Cliente");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem8.setText("Filme");
        jMenu2.add(jMenuItem8);

        jMenuItem9.setText("Funcionario");
        jMenu2.add(jMenuItem9);

        jMenuItem10.setText("DVD");
        jMenu2.add(jMenuItem10);

        jMenuItem11.setText("Categoria");
        jMenu2.add(jMenuItem11);

        jMenuItem12.setText("Classificação");
        jMenu2.add(jMenuItem12);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("alterar");

        jMenuItem13.setText("Cliente");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem13);

        jMenuItem14.setText("Filme");
        jMenu3.add(jMenuItem14);

        jMenuItem15.setText("Funcionario");
        jMenu3.add(jMenuItem15);

        jMenuItem16.setText("DVD");
        jMenu3.add(jMenuItem16);

        jMenuItem17.setText("Categoria");
        jMenu3.add(jMenuItem17);

        jMenuItem18.setText("Classificação");
        jMenu3.add(jMenuItem18);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Excluir");

        jMenuItem19.setText("Cliente");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem19);

        jMenuItem20.setText("Filme");
        jMenu4.add(jMenuItem20);

        jMenuItem21.setText("Funcionario");
        jMenu4.add(jMenuItem21);

        jMenuItem22.setText("DVD");
        jMenu4.add(jMenuItem22);

        jMenuItem23.setText("Categoria");
        jMenu4.add(jMenuItem23);

        jMenuItem24.setText("Classificação");
        jMenu4.add(jMenuItem24);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1419, 1419, 1419)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(287, 287, 287)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadasClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadasClienteActionPerformed
       new CadastrarCliente().setVisible(true);
    }//GEN-LAST:event_cadasClienteActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
         new CadastrarCliente().setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        new CadastrarCliente().setVisible(true);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
         new CadastrarCliente().setVisible(true);
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void cadasFlimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadasFlimeActionPerformed
         
    }//GEN-LAST:event_cadasFlimeActionPerformed

    private void cadasDVDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadasDVDActionPerformed
       new CadastrarDVD().setVisible(true);
    }//GEN-LAST:event_cadasDVDActionPerformed

    private void cadasCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadasCategoriaActionPerformed
       new CadastarCategoria().setVisible(true);
    }//GEN-LAST:event_cadasCategoriaActionPerformed

    private void cadasClassificacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadasClassificacaoActionPerformed
          new CadastarClassificacao().setVisible(true);        
    }//GEN-LAST:event_cadasClassificacaoActionPerformed

    private void cadasFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadasFuncionarioActionPerformed
       new CadastrarFuncionario().setVisible(true);
    }//GEN-LAST:event_cadasFuncionarioActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cadasCategoria;
    private javax.swing.JMenuItem cadasClassificacao;
    private javax.swing.JMenuItem cadasCliente;
    private javax.swing.JMenuItem cadasDVD;
    private javax.swing.JMenuItem cadasFlime;
    private javax.swing.JMenuItem cadasFuncionario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
