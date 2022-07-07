/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import static GUI.CrearGame.game;
import java.awt.HeadlessException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import Model.Areajuego;

/**
 *
 * @author ignac
 */
public class Playing extends javax.swing.JFrame {

    /**
     *
     * Creates new form Playing
     */
    public Playing() {
        
        initComponents();
        Turno.setSize(33, 22);
        Turno.setText("Le corresponde jugar a " + CrearGame.game.dequieneselturno());
        Mostrarmazo.setText("Las cartas sobre el área son: \n" + CrearGame.a1.areat_string());
        Estado.setText(CrearGame.game.toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Turno = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Mostrarmazo = new javax.swing.JTextPane();
        Spoit = new javax.swing.JButton();
        Pass = new javax.swing.JButton();
        Finish = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Estado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(Mostrarmazo);

        Spoit.setText("Spoit");
        Spoit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpoitActionPerformed(evt);
            }
        });

        Pass.setText("Pass");
        Pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassActionPerformed(evt);
            }
        });

        Finish.setText("finish");
        Finish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinishActionPerformed(evt);
            }
        });

        jLabel1.setText("¿Qué jugada quieres hacer?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Spoit, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(145, 145, 145)
                            .addComponent(Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Finish, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Turno, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Turno, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 53, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Spoit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Finish, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SpoitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpoitActionPerformed
        // TODO add your handling code here:
        Estado.setText(CrearGame.game.toString());
        ViewSpoit ventanaspoit = new ViewSpoit();
        ventanaspoit.setVisible(true);
        this.setVisible(false);
        
        
    }//GEN-LAST:event_SpoitActionPerformed

    private void PassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassActionPerformed
        // TODO add your handling code here:
        Estado.setText(CrearGame.game.toString());
        CrearGame.game.pass();
        JOptionPane.showMessageDialog(null, "El juego es: \n" + CrearGame.game.toString());
        Turno.setText("Le corresponde jugar a " + CrearGame.game.dequieneselturno());
    }//GEN-LAST:event_PassActionPerformed

    private void FinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinishActionPerformed
        // TODO add your handling code here:
        Estado.setText(CrearGame.game.toString());
        CrearGame.game.finish();
        JOptionPane.showMessageDialog(null, "El juego es: \n" + CrearGame.game.toString());
        Turno.setText("Le corresponde jugar a " + CrearGame.game.dequieneselturno());
    }//GEN-LAST:event_FinishActionPerformed

 
   

   
    
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Estado;
    private javax.swing.JButton Finish;
    private javax.swing.JTextPane Mostrarmazo;
    private javax.swing.JButton Pass;
    private javax.swing.JButton Spoit;
    private javax.swing.JLabel Turno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
