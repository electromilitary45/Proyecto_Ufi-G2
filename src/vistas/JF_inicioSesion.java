/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import javax.swing.JOptionPane;
import proyecto_ufi.g2.cls_metodos;

/**
 *
 * @author Derek
 */
public class JF_inicioSesion extends javax.swing.JFrame {
    cls_metodos clsM = new cls_metodos();
    
    
    
    public void setBounds(int x, int y, int width, int height) {
        super.setBounds(750, 400, width, height);
    }
    
    
    /**
     * Creates new form JF_inicioSesion
     */
    public JF_inicioSesion() {
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

        jPanel1 = new javax.swing.JPanel();
        btn_inicioSesion = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jtf_user = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jpf_pass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_inicioSesion.setText("INICIAR SESION");
        btn_inicioSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_inicioSesionMouseClicked(evt);
            }
        });
        btn_inicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inicioSesionActionPerformed(evt);
            }
        });
        btn_inicioSesion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_inicioSesionKeyPressed(evt);
            }
        });
        jPanel1.add(btn_inicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        btn_salir.setText("SALIR");
        btn_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_salirMouseClicked(evt);
            }
        });
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        jPanel1.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, -1, -1));

        jtf_user.setText("USERNAME");
        jtf_user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtf_userFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtf_userFocusLost(evt);
            }
        });
        jtf_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtf_userMouseClicked(evt);
            }
        });
        jtf_user.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jtf_userInputMethodTextChanged(evt);
            }
        });
        jtf_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_userActionPerformed(evt);
            }
        });
        jtf_user.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jtf_userPropertyChange(evt);
            }
        });
        jtf_user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_userKeyTyped(evt);
            }
        });
        jPanel1.add(jtf_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 250, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logohotelguarco.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 360, 130));

        jpf_pass.setText("********");
        jpf_pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jpf_passFocusGained(evt);
            }
        });
        jpf_pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpf_passMouseClicked(evt);
            }
        });
        jPanel1.add(jpf_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 250, 30));

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salirMouseClicked
        // TODO add your handling code here:
        System.exit(0);//cierra el programa por completo
        
    }//GEN-LAST:event_btn_salirMouseClicked

    private void btn_inicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inicioSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_inicioSesionActionPerformed

    private void jtf_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_userActionPerformed

    private void jtf_userInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jtf_userInputMethodTextChanged
        // TODO add your handling code here:
       jtf_user.setText("");
    }//GEN-LAST:event_jtf_userInputMethodTextChanged

    private void jtf_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtf_userMouseClicked
        // TODO add your handling code here:
        jtf_user.setText("");
    }//GEN-LAST:event_jtf_userMouseClicked

    private void btn_inicioSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inicioSesionMouseClicked
        // TODO add your handling code here:
        if(clsM.inicioSesion()==true){
            dispose();//cierra la vista pero no termina el programa
            JF_menu JFM = new JF_menu();
            JFM.setVisible(true);
            JOptionPane.showMessageDialog(null, "Bienvenido");
        }else{
            clsM.limpiarInicioSesion();//limpia espacios con el metodo
        }
    }//GEN-LAST:event_btn_inicioSesionMouseClicked

    private void jpf_passMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpf_passMouseClicked
        // TODO add your handling code here:
        jpf_pass.setText("");
    }//GEN-LAST:event_jpf_passMouseClicked

    private void jpf_passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpf_passFocusGained
        // TODO add your handling code here:
        jpf_pass.setText("");
    }//GEN-LAST:event_jpf_passFocusGained

    private void jtf_userFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtf_userFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_userFocusLost

    private void jtf_userFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtf_userFocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jtf_userFocusGained

    private void jtf_userKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_userKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jtf_userKeyTyped

    private void jtf_userPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jtf_userPropertyChange
        // TODO add your handling code here:
        //jtf_user.setText("");
    }//GEN-LAST:event_jtf_userPropertyChange

    private void btn_inicioSesionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_inicioSesionKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btn_inicioSesionKeyPressed

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
            java.util.logging.Logger.getLogger(JF_inicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_inicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_inicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_inicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_inicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btn_inicioSesion;
    public static javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JPasswordField jpf_pass;
    public static javax.swing.JTextField jtf_user;
    // End of variables declaration//GEN-END:variables
}
