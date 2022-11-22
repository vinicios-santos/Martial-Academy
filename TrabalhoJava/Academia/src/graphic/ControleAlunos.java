/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package graphic;

import controller.ControleAlunosController;
import dao.AlunoDAO;
import dao.Conexao;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import model.Aluno;

/**
 *
 * @author vitor
 */
public class ControleAlunos extends javax.swing.JFrame {

    private int codAluno;
    private Connection connection;
    private ControleAlunosController controller;
    /**
     * Creates new form ControleAlunos
     */
    public ControleAlunos() throws SQLException {
        initComponents();
        this.criaConexao();
        controller = new ControleAlunosController(connection);
        jTextFieldAlunoInfo.setEnabled(false);
    }
    
    public void criaConexao() throws SQLException{
        connection = new Conexao().getConnection();
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
        jTextFieldAlunoInfo = new javax.swing.JTextField();
        jTextFieldSituacao = new javax.swing.JTextField();
        jScrollPaneModalidade = new javax.swing.JScrollPane();
        jTableModalidade = new javax.swing.JTable();
        jTextFieldCodigo = new javax.swing.JTextField();
        jScrollPaneModalidade1 = new javax.swing.JScrollPane();
        jTableModalidade1 = new javax.swing.JTable();
        jButtonDadosAluno = new javax.swing.JButton();
        jButtonDadosMatricula = new javax.swing.JButton();
        jScrollPaneModalidade2 = new javax.swing.JScrollPane();
        jTableModalidade2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Controle de alunos");
        setBackground(new java.awt.Color(102, 102, 102));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 176, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 174, Short.MAX_VALUE)
        );

        jTextFieldAlunoInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAlunoInfoActionPerformed(evt);
            }
        });

        jTextFieldSituacao.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextFieldSituacao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldSituacao.setText("SITUAÇÃO REGULAR");
        jTextFieldSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSituacaoActionPerformed(evt);
            }
        });

        jTableModalidade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Modalidade", "Graduação", "Plano", "Data Inicio", "Data Fim"
            }
        ));
        jScrollPaneModalidade.setViewportView(jTableModalidade);
        if (jTableModalidade.getColumnModel().getColumnCount() > 0) {
            jTableModalidade.getColumnModel().getColumn(1).setHeaderValue("Valor");
            jTableModalidade.getColumnModel().getColumn(2).setHeaderValue("Pagamento");
            jTableModalidade.getColumnModel().getColumn(3).setHeaderValue("Cancelamento");
            jTableModalidade.getColumnModel().getColumn(4).setHeaderValue("Data Fim");
        }

        jTextFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoActionPerformed(evt);
            }
        });
        jTextFieldCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCodigoKeyPressed(evt);
            }
        });

        jTableModalidade1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Vencimento", "Valor", "Pagamento", "Cancelamento"
            }
        ));
        jScrollPaneModalidade1.setViewportView(jTableModalidade1);
        if (jTableModalidade1.getColumnModel().getColumnCount() > 0) {
            jTableModalidade1.getColumnModel().getColumn(1).setHeaderValue("Valor");
            jTableModalidade1.getColumnModel().getColumn(2).setHeaderValue("Pagamento");
            jTableModalidade1.getColumnModel().getColumn(3).setHeaderValue("Cancelamento");
        }

        jButtonDadosAluno.setText("Acessar dados aluno");

        jButtonDadosMatricula.setText("Acessar dados matricula");

        jTableModalidade2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Assiduidade"
            }
        ));
        jScrollPaneModalidade2.setViewportView(jTableModalidade2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPaneModalidade2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneModalidade1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonDadosAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonDadosMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
                    .addComponent(jScrollPaneModalidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldAlunoInfo))
                    .addComponent(jTextFieldSituacao))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldAlunoInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPaneModalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonDadosAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonDadosMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneModalidade1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPaneModalidade2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldAlunoInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAlunoInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAlunoInfoActionPerformed

    private void jTextFieldSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSituacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSituacaoActionPerformed

    private void jTextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoActionPerformed
        
    }//GEN-LAST:event_jTextFieldCodigoActionPerformed

    private void jTextFieldCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCodigoKeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                AlunoDAO alunoDAO = new AlunoDAO(connection);
                Aluno aluno = alunoDAO.SelectWithCondition(jTextFieldCodigo.getText());
                codAluno = aluno.getCodigoAluno();
                Date todayDate = new Date();
                jTextFieldAlunoInfo.setText(aluno.getCodigoAluno() + " - " + aluno.getAluno());
                
                controller.listarModalidadesMatriculas((DefaultTableModel) jTableModalidade.getModel(),aluno.getCodigoAluno());
                controller.listarFaturas((DefaultTableModel) jTableModalidade1.getModel(),aluno.getCodigoAluno());
                controller.VerificaSituacaoRegular(jTextFieldSituacao, aluno.getCodigoAluno());
                controller.listarAssiduidade((DefaultTableModel) jTableModalidade2.getModel(), aluno.getCodigoAluno());
                
            } catch (SQLException ex) {
                Logger.getLogger(ControleAlunos.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
               Logger.getLogger(ControleAlunos.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
    }//GEN-LAST:event_jTextFieldCodigoKeyPressed

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
            java.util.logging.Logger.getLogger(ControleAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControleAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControleAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControleAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ControleAlunos().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ControleAlunos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDadosAluno;
    private javax.swing.JButton jButtonDadosMatricula;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPaneModalidade;
    private javax.swing.JScrollPane jScrollPaneModalidade1;
    private javax.swing.JScrollPane jScrollPaneModalidade2;
    private javax.swing.JTable jTableModalidade;
    private javax.swing.JTable jTableModalidade1;
    private javax.swing.JTable jTableModalidade2;
    private javax.swing.JTextField jTextFieldAlunoInfo;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldSituacao;
    // End of variables declaration//GEN-END:variables
}
