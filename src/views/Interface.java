package views;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import publicadesafio.Jogos;

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
        setTitle("Desafio Pública");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/2015660.png")).getImage());
        setResizable(false);

        tabelaJogos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Jogo", "Placar", "Recorde  Mín.", "Recorde Máx.", "Quebras de recorde mín.", "Quebras de recorde máx."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaJogos.getTableHeader().setReorderingAllowed(false);
        tabelaJogos.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                tabelaJogosComponentAdded(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaJogos);

        txtNovoJogo.setText("Novo Jogo");

        botaoAdicionarJogo.setText("Adicionar");
        botaoAdicionarJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarJogoActionPerformed(evt);
            }
        });

        txtPlacarFormatado.setText("Placar");
        txtPlacarFormatado.setToolTipText("");
        txtPlacarFormatado.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPlacarFormatado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPlacarFormatadoMouseClicked(evt);
            }
        });
        txtPlacarFormatado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlacarFormatadoActionPerformed(evt);
            }
        });
        txtPlacarFormatado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPlacarFormatadoKeyTyped(evt);
            }
        });

        botaoDeletaJogo.setText("Excluir");
        botaoDeletaJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDeletaJogoActionPerformed(evt);
            }
        });

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoAdicionarJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarJogoActionPerformed
        //Adiciona um novo Jogo na tabela da interface
        Jogos jogo = new Jogos();
        jogo.setPlacar(Integer.parseInt(txtPlacarFormatado.getText()));//estabelece o placar
        Jogos.adicionaJogos(jogo);

        atualizarTabela();
        //limpa o campo de texto
        txtPlacarFormatado.setText("");

    }//GEN-LAST:event_botaoAdicionarJogoActionPerformed

    private void atualizarTabela() {

        DefaultTableModel dtmdadosTabela = (DefaultTableModel) tabelaJogos.getModel();
        dtmdadosTabela.setRowCount(0);
        for (Jogos jogo : Jogos.getJogos()) {
            //todos os parâmetros da tabela
            Object[] dados = {jogo.getNumero(), jogo.getPlacar(), jogo.getMinimoTemporada(), jogo.getMaximoTemporada(), jogo.getQuebraMinimo(), jogo.getQuebraMaximo()};
            dtmdadosTabela.addRow(dados);

        }
    }
    private void txtPlacarFormatadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlacarFormatadoActionPerformed

    }//GEN-LAST:event_txtPlacarFormatadoActionPerformed

    private void botaoDeletaJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDeletaJogoActionPerformed
        //Remove o objeto do Array e a linha da tabela
        DefaultTableModel dtmdadosTabela = (DefaultTableModel) tabelaJogos.getModel();
        for (Jogos jogo : Jogos.getJogos()) {
            //Confirmação
            int resposta = JOptionPane.showConfirmDialog(this, "Você tem certeza que deseja remover o jogo?", "Aviso!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (resposta == JOptionPane.YES_OPTION) {
                if (tabelaJogos.getSelectedRow() >= 0) {
                    jogo.setIndexDeleta(tabelaJogos.getSelectedRow());
                    dtmdadosTabela.removeRow(tabelaJogos.getSelectedRow());
                    Jogos.deletaJogo(jogo);
                    atualizarTabela();
                    tabelaJogos.setModel(dtmdadosTabela);
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Favor selecionar uma linha");//caso nenhuma linha seja selecionada
                    break;
                }
            } else if (resposta == JOptionPane.NO_OPTION) {
                break;
            } else if (resposta == JOptionPane.CLOSED_OPTION) {
                break;
            }
        }
    }//GEN-LAST:event_botaoDeletaJogoActionPerformed

    private void txtPlacarFormatadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPlacarFormatadoMouseClicked
        //Limpa o campo de texto
        txtPlacarFormatado.setText("");
    }//GEN-LAST:event_txtPlacarFormatadoMouseClicked

    private void txtPlacarFormatadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlacarFormatadoKeyTyped
        //Limita apenas números no campo de texto
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPlacarFormatadoKeyTyped

    private void tabelaJogosComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_tabelaJogosComponentAdded


    }//GEN-LAST:event_tabelaJogosComponentAdded

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
