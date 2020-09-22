
package views;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil;
import javax.swing.table.DefaultTableModel;
import publicadesafio.*;
public class Interface extends javax.swing.JFrame {


    public Interface() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fundo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaJogos = new javax.swing.JTable();
        txtNovoJogo = new javax.swing.JLabel();
        botaoAdicionarJogo = new javax.swing.JButton();
        txtPlacarFormatado = new javax.swing.JFormattedTextField();
        botaoDeletaJogo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Relatório");
        setResizable(false);

        tabelaJogos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Jogo", "Placar", "Recorde  Mín.", "Recorde Máx.", "Quebras de recorde mín.", "Quebras de recorde máx."
            }
        ));
        tabelaJogos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabelaJogos);
        if (tabelaJogos.getColumnModel().getColumnCount() > 0) {
            tabelaJogos.getColumnModel().getColumn(0).setResizable(false);
            tabelaJogos.getColumnModel().getColumn(1).setResizable(false);
        }

        txtNovoJogo.setText("Novo Jogo");

        botaoAdicionarJogo.setText("Adicionar");
        botaoAdicionarJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarJogoActionPerformed(evt);
            }
        });

        txtPlacarFormatado.setText("Placar");
        txtPlacarFormatado.setToolTipText("");
        txtPlacarFormatado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlacarFormatadoActionPerformed(evt);
            }
        });

        botaoDeletaJogo.setText("Excluir");

        javax.swing.GroupLayout fundoLayout = new javax.swing.GroupLayout(fundo);
        fundo.setLayout(fundoLayout);
        fundoLayout.setHorizontalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
                    .addGroup(fundoLayout.createSequentialGroup()
                        .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNovoJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPlacarFormatado, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(fundoLayout.createSequentialGroup()
                                .addComponent(botaoAdicionarJogo)
                                .addGap(18, 18, 18)
                                .addComponent(botaoDeletaJogo)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        fundoLayout.setVerticalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(txtNovoJogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPlacarFormatado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoAdicionarJogo)
                    .addComponent(botaoDeletaJogo))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoAdicionarJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarJogoActionPerformed
       
       DefaultTableModel dtmdadosTabela = (DefaultTableModel) tabelaJogos.getModel();
       Object[] dados = {txtPlacarFormatado.getText()};
       dtmdadosTabela.addRow(dados);
       
       
        
        
        
    }//GEN-LAST:event_botaoAdicionarJogoActionPerformed

    private void txtPlacarFormatadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlacarFormatadoActionPerformed
       
       
    }//GEN-LAST:event_txtPlacarFormatadoActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdicionarJogo;
    private javax.swing.JButton botaoDeletaJogo;
    private javax.swing.JPanel fundo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaJogos;
    private javax.swing.JLabel txtNovoJogo;
    private javax.swing.JFormattedTextField txtPlacarFormatado;
    // End of variables declaration//GEN-END:variables
}
