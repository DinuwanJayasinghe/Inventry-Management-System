/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventry_mangement_system;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JTextArea;

/**
 *
 * @author Dinuwan Theekshana
 */
public class JFrame_10 extends javax.swing.JFrame {

    /**
     * Creates new form JFrame_10
     */
    public JFrame_10() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);

        javax.swing.border.Border JPanel_title__Border = BorderFactory.createMatteBorder(7, 7, 7, 7, Color.black);
        jPanel1.setBorder(JPanel_title__Border);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton_Back = new javax.swing.JButton();
        jButton_Print = new javax.swing.JButton();
        jButton_Close = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Print Preview");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 7, true));
        jPanel1.setLayout(null);

        jTextArea1.setColumns(50);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jTextArea1.setRows(50);
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(7, 7, 850, 530);

        jButton_Back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_Back.setText("<<Back");
        jButton_Back.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BackActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Back);
        jButton_Back.setBounds(40, 560, 120, 40);

        jButton_Print.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_Print.setText("Print");
        jButton_Print.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PrintActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Print);
        jButton_Print.setBounds(360, 560, 120, 40);

        jButton_Close.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_Close.setText("Close");
        jButton_Close.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CloseActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Close);
        jButton_Close.setBounds(720, 560, 120, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 863, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton_CloseActionPerformed

    private void jButton_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BackActionPerformed

        JFrame_9 f9 = new JFrame_9();
        f9.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton_BackActionPerformed

    private void jButton_PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PrintActionPerformed

        try {
            jTextArea1.print();
        } catch (PrinterException ex) {
            Logger.getLogger(JFrame_10.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton_PrintActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        //mehi t yanu TAB ganada n yanu ENTER gananda wei.
        
        jTextArea1.append("\t\t Celon Petrolum Copperation - Sri Lanka \n\n" + 
        "\t\t\t Details of System Units \n\n" +
        "\t ===================================================== \n\n" +
                
        "Serial Number : \t\t" + JFrame_9.jTextField_Serial_Num.getText() + "\n\n"  +
        "Serial Number : \t\t" + JFrame_9.jTextField_Model.getText() + "\n\n"  +
        "Serial Number : \t\t" + JFrame_9.jTextField_Aset_number.getText() + "\n\n"  +
        "Serial Number : \t\t" + JFrame_9.jTextField_WKS.getText() + "\n\n"  +
        "Serial Number : \t\t" + JFrame_9.jTextField_IP.getText() + "\n\n" + 
                
        "\t ===================================================== \n\n"
                
        );
        

    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(JFrame_10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_10().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Back;
    private javax.swing.JButton jButton_Close;
    private javax.swing.JButton jButton_Print;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
