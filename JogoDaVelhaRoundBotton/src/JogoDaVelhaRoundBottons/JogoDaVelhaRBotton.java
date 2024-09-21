/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JogoDaVelhaRoundBottons;

import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JOptionPane;
import javax.swing.JFrame;


public class JogoDaVelhaRBotton extends javax.swing.JFrame {

    private String startGame = "X";
    private int xCounter = 0;
    private int oCounter = 0;
    
    public JogoDaVelhaRBotton() {
        initComponents();
        gameScore();
    }
    
    public void gameScore() {
        jlblJogadorX.setText(String.valueOf(xCounter));
        jlblJogadorO.setText(String.valueOf(oCounter));
    }
    
    private void chooseaPlayer() {
        
        if(startGame.equalsIgnoreCase("X")) {
            startGame = "O";
        } else {
            startGame = "X";
        }
    }
    
    private void WinningGame() {
        
        String b1 = jButton1.getText();
        String b2 = jButton2.getText();
        String b3 = jButton3.getText();
        
        String b4 = jButton4.getText();
        String b5 = jButton5.getText();
        String b6 = jButton6.getText();
        
        String b7 = jButton7.getText();
        String b8 = jButton8.getText();
        String b9 = jButton9.getText();
        
        
        if ((b1 == ("X") && b2 == ("X") && b3 == ("X")) || (b1 == ("X") && b4 == ("X") && b7 == ("X")) ) {
            
            JOptionPane.showMessageDialog(this, "Jogador X Vence", "Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
            xCounter++;
            gameScore();
            if (b1 == ("X") && b2 == ("X") && b3 == ("X")) {
                jButton1.setBackground(Color.red);
                jButton2.setBackground(Color.red);
                jButton3.setBackground(Color.red);
            } else {
                jButton1.setBackground(Color.cyan);
                jButton4.setBackground(Color.cyan);
                jButton7.setBackground(Color.cyan);
            }
            } else if ((b1 == ("O") && b2 == ("O") && b3 == ("O")) || (b1 == ("O") && b4 == ("O") && b7 == ("O")) ) {
            
            JOptionPane.showMessageDialog(this, "Jogador O Vence", "Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
            oCounter++;
            gameScore();
            if (b1 == ("O") && b2 == ("O") && b3 == ("O")) {
                jButton1.setBackground(Color.MAGENTA);
                jButton2.setBackground(Color.MAGENTA);
                jButton3.setBackground(Color.MAGENTA);
            } else {
                jButton1.setBackground(Color.PINK);
                jButton4.setBackground(Color.PINK);
                jButton7.setBackground(Color.PINK);
            }
            } else if ((b4 == ("X") && b5 == ("X") && b6 == ("X")) || (b2 == ("X") && b5 == ("X") && b8 == ("X")) ) {
            
            JOptionPane.showMessageDialog(this, "Jogador X Vence", "Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
            xCounter++;
            gameScore();
            if (b4 == ("X") && b5 == ("X") && b6 == ("X")) {
                jButton4.setBackground(Color.red);
                jButton5.setBackground(Color.red);
                jButton6.setBackground(Color.red);
            } else {
                jButton2.setBackground(Color.cyan);
                jButton5.setBackground(Color.cyan);
                jButton8.setBackground(Color.cyan);
            }
            } else if ((b4 == ("O") && b5 == ("O") && b6 == ("O")) || (b2 == ("O") && b5 == ("O") && b8 == ("O")) ) {
            
            JOptionPane.showMessageDialog(this, "Jogador O Vence", "Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
            oCounter++;
            gameScore();
            if (b4 == ("O") && b5 == ("O") && b6 == ("O")) {
                jButton4.setBackground(Color.MAGENTA);
                jButton5.setBackground(Color.MAGENTA);
                jButton6.setBackground(Color.MAGENTA);
            } else {
                jButton2.setBackground(Color.PINK);
                jButton5.setBackground(Color.PINK);
                jButton8.setBackground(Color.PINK);
            }
            } else if ((b7 == ("X") && b8 == ("X") && b9 == ("X")) || (b3 == ("X") && b6 == ("X") && b9 == ("X")) ) {
            
            JOptionPane.showMessageDialog(this, "Jogador X Vence", "Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
            xCounter++;
            gameScore();
            if (b7 == ("X") && b8 == ("X") && b9 == ("X")) {
                jButton7.setBackground(Color.red);
                jButton8.setBackground(Color.red);
                jButton9.setBackground(Color.red);
            } else {
                jButton3.setBackground(Color.cyan);
                jButton6.setBackground(Color.cyan);
                jButton9.setBackground(Color.cyan);
            }
            } else if ((b7 == ("O") && b8 == ("O") && b9 == ("O")) || (b3 == ("O") && b6 == ("O") && b9 == ("O")) ) {
            
            JOptionPane.showMessageDialog(this, "Jogador O Vence", "Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
            oCounter++;
            gameScore();
            if (b7 == ("O") && b8 == ("O") && b9 == ("O")) {
                jButton7.setBackground(Color.MAGENTA);
                jButton8.setBackground(Color.MAGENTA);
                jButton9.setBackground(Color.MAGENTA);
            } else {
                jButton3.setBackground(Color.PINK);
                jButton6.setBackground(Color.PINK);
                jButton9.setBackground(Color.PINK);
            } 
            }  else if ((b1 == ("X") && b5 == ("X") && b9 == ("X")) || (b3 == ("X") && b5 == ("X") && b7 == ("X")) ) {
            
            JOptionPane.showMessageDialog(this, "Jogador X Vence", "Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
            xCounter++;
            gameScore();
            if (b1 == ("X") && b5 == ("X") && b9 == ("X")) {
                jButton1.setBackground(Color.YELLOW);
                jButton5.setBackground(Color.YELLOW);
                jButton9.setBackground(Color.YELLOW);
            } else {
                jButton3.setBackground(Color.orange);
                jButton5.setBackground(Color.orange);
                jButton7.setBackground(Color.orange);
            }
            } else if ((b1 == ("O") && b5 == ("O") && b9 == ("O")) || (b3 == ("O") && b5 == ("O") && b7 == ("O")) ) {
            
            JOptionPane.showMessageDialog(this, "Jogador O Vence", "Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
            oCounter++;
            gameScore();
            if (b1 == ("O") && b5 == ("O") && b9 == ("O")) {
                jButton1.setBackground(Color.YELLOW);
                jButton5.setBackground(Color.YELLOW);
                jButton9.setBackground(Color.YELLOW);
            } else {
                jButton3.setBackground(Color.orange);
                jButton5.setBackground(Color.orange);
                jButton7.setBackground(Color.orange);
            }
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlblJogadorX = new javax.swing.JLabel();
        jlblJogadorO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Velha");
        setSize(new java.awt.Dimension(1, 1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("SAIR");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("REINICIAR");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jLabel1.setText("Jogador 0:");

        jLabel2.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jLabel2.setText("Jogador X:");

        jlblJogadorX.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N

        jlblJogadorO.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlblJogadorO))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                .addComponent(jlblJogadorX)))
                        .addGap(184, 184, 184))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jlblJogadorX))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jlblJogadorO))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(199, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        jButton7.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            
            jButton7.setForeground(Color.GREEN);
        
        } else {
            
            jButton7.setForeground(Color.BLUE);
        }
        
        chooseaPlayer();
        WinningGame();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jButton1.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            
            jButton1.setForeground(Color.GREEN);
        
        } else {
            
            jButton1.setForeground(Color.BLUE);
        }
        
        chooseaPlayer();
        WinningGame();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jButton2.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            
            jButton2.setForeground(Color.GREEN);
        
        } else {
            
            jButton2.setForeground(Color.BLUE);
        }
        
        chooseaPlayer();
        WinningGame();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jButton3.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            
            jButton3.setForeground(Color.GREEN);
        
        } else {
            
            jButton3.setForeground(Color.BLUE);
        }
        
        chooseaPlayer();
        WinningGame();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jButton4.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            
            jButton4.setForeground(Color.GREEN);
        
        } else {
            
            jButton4.setForeground(Color.BLUE);
        }
        
        chooseaPlayer();
        WinningGame();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jButton5.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            
            jButton5.setForeground(Color.GREEN);
        
        } else {
            
            jButton5.setForeground(Color.BLUE);
        }
        
        chooseaPlayer();
        WinningGame();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jButton6.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            
            jButton6.setForeground(Color.GREEN);
        
        } else {
            
            jButton6.setForeground(Color.BLUE);
        }
        
        chooseaPlayer();
        WinningGame();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        jButton8.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            
            jButton8.setForeground(Color.GREEN);
        
        } else {
            
            jButton8.setForeground(Color.BLUE);
        }
        
        chooseaPlayer();
        WinningGame();
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        jButton9.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            
            jButton9.setForeground(Color.GREEN);
        
        } else {
            
            jButton9.setForeground(Color.BLUE);
        }
        
        chooseaPlayer();
        WinningGame();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        jButton1.setText(null);
        jButton2.setText(null);
        jButton3.setText(null);
        
        jButton4.setText(null);
        jButton5.setText(null);
        jButton6.setText(null);
        
        jButton7.setText(null);
        jButton8.setText(null);
        jButton9.setText(null);
        
        jButton1.setBackground(Color.lightGray);
        jButton2.setBackground(Color.lightGray);
        jButton3.setBackground(Color.lightGray);
        
        jButton4.setBackground(Color.lightGray);
        jButton5.setBackground(Color.lightGray);
        jButton6.setBackground(Color.lightGray);
        
        jButton7.setBackground(Color.lightGray);
        jButton8.setBackground(Color.lightGray);
        jButton9.setBackground(Color.lightGray);
    }//GEN-LAST:event_jButton11ActionPerformed

    
    private JFrame frame;
    
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        
        frame = new JFrame("Sair");
        if (JOptionPane.showConfirmDialog(frame, "Confirmar se Voce quer Sair", "Jogo da Velha"
                ,JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
                System.exit(0);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
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
            java.util.logging.Logger.getLogger(JogoDaVelhaRBotton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelhaRBotton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelhaRBotton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelhaRBotton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoDaVelhaRBotton().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jlblJogadorO;
    private javax.swing.JLabel jlblJogadorX;
    // End of variables declaration//GEN-END:variables
}
