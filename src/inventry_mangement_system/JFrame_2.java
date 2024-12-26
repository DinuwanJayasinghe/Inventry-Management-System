/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventry_mangement_system;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author Dinuwan Theekshana
 */
public class JFrame_2 extends javax.swing.JFrame {

    private JFrame frame;

    int attempt = 0;

    /**
     * Creates new form JFrame_2
     */
    public JFrame_2() {
        initComponents();
        jLabel_Show_Password_dont_Delete.setVisible(false);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel_ICO_Username = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jLabel_Val_ID = new javax.swing.JLabel();
        jPasswordField_Password = new javax.swing.JPasswordField();
        jLabel_ICO_PW1 = new javax.swing.JLabel();
        jLabel_ID_Letter = new javax.swing.JLabel();
        jLabel_Val_PWord = new javax.swing.JLabel();
        jLabel_Show_Password_dont_Delete = new javax.swing.JLabel();
        jButton_Clr = new javax.swing.JButton();
        jButton_Log = new javax.swing.JButton();
        jButton_Cnsl = new javax.swing.JButton();
        jLabel3_Forgot_Password = new javax.swing.JLabel();
        jLabel_Create_Act = new javax.swing.JLabel();
        jLabel_Ico_SHOW_Password = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login to Inventry System");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/inventry_mangement_system/Login-icon.png"))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 7));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Login to Inventry System");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 50, 810, 50);

        jLabel_ICO_Username.setBackground(new java.awt.Color(255, 0, 0));
        jLabel_ICO_Username.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_ICO_Username.setForeground(new java.awt.Color(255, 255, 0));
        jLabel_ICO_Username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_ICO_Username.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel_ICO_Username.setOpaque(true);
        jPanel1.add(jLabel_ICO_Username);
        jLabel_ICO_Username.setBounds(230, 180, 40, 40);

        jTextField_ID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField_ID.setForeground(new java.awt.Color(153, 153, 153));
        jTextField_ID.setText("Enter your ID");
        jTextField_ID.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField_ID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_IDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_IDFocusLost(evt);
            }
        });
        jTextField_ID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_IDKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_IDKeyTyped(evt);
            }
        });
        jPanel1.add(jTextField_ID);
        jTextField_ID.setBounds(290, 180, 230, 40);

        jLabel_Val_ID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Val_ID.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jLabel_Val_ID);
        jLabel_Val_ID.setBounds(290, 230, 230, 20);

        jPasswordField_Password.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPasswordField_Password.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField_Password.setText("password");
        jPasswordField_Password.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPasswordField_Password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField_PasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField_PasswordFocusLost(evt);
            }
        });
        jPasswordField_Password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordField_PasswordKeyReleased(evt);
            }
        });
        jPanel1.add(jPasswordField_Password);
        jPasswordField_Password.setBounds(290, 280, 230, 40);

        jLabel_ICO_PW1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel_ICO_PW1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_ICO_PW1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel_ICO_PW1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_ICO_PW1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel_ICO_PW1.setOpaque(true);
        jPanel1.add(jLabel_ICO_PW1);
        jLabel_ICO_PW1.setBounds(230, 280, 40, 40);

        jLabel_ID_Letter.setBackground(new java.awt.Color(255, 0, 0));
        jLabel_ID_Letter.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_ID_Letter.setForeground(new java.awt.Color(51, 153, 0));
        jLabel_ID_Letter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_ID_Letter.setText("V");
        jLabel_ID_Letter.setOpaque(true);
        jPanel1.add(jLabel_ID_Letter);
        jLabel_ID_Letter.setBounds(520, 180, 40, 40);

        jLabel_Val_PWord.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Val_PWord.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jLabel_Val_PWord);
        jLabel_Val_PWord.setBounds(290, 330, 230, 20);

        jLabel_Show_Password_dont_Delete.setText("jLabel3");
        jPanel1.add(jLabel_Show_Password_dont_Delete);
        jLabel_Show_Password_dont_Delete.setBounds(50, 330, 0, 21);

        jButton_Clr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Clr.setText("Clear");
        jButton_Clr.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Clr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Clr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ClrActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Clr);
        jButton_Clr.setBounds(20, 470, 120, 40);

        jButton_Log.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Log.setText("Login");
        jButton_Log.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Log.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LogActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Log);
        jButton_Log.setBounds(340, 470, 120, 40);

        jButton_Cnsl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Cnsl.setText("Cancel");
        jButton_Cnsl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Cnsl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Cnsl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CnslActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Cnsl);
        jButton_Cnsl.setBounds(660, 470, 120, 40);

        jLabel3_Forgot_Password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3_Forgot_Password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3_Forgot_Password.setText("<<Forgot My Password >>");
        jLabel3_Forgot_Password.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3_Forgot_Password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3_Forgot_PasswordMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3_Forgot_PasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3_Forgot_PasswordMouseExited(evt);
            }
        });
        jPanel1.add(jLabel3_Forgot_Password);
        jLabel3_Forgot_Password.setBounds(290, 360, 230, 30);

        jLabel_Create_Act.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Create_Act.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Create_Act.setText("<<Create an Account>>");
        jLabel_Create_Act.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Create_Act.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Create_ActMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_Create_ActMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_Create_ActMouseExited(evt);
            }
        });
        jPanel1.add(jLabel_Create_Act);
        jLabel_Create_Act.setBounds(290, 410, 230, 30);

        jLabel_Ico_SHOW_Password.setBackground(new java.awt.Color(255, 0, 0));
        jLabel_Ico_SHOW_Password.setForeground(new java.awt.Color(255, 255, 0));
        jLabel_Ico_SHOW_Password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Ico_SHOW_Password.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Ico_SHOW_Password.setOpaque(true);
        jLabel_Ico_SHOW_Password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Ico_SHOW_PasswordMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_Ico_SHOW_PasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_Ico_SHOW_PasswordMouseExited(evt);
            }
        });
        jPanel1.add(jLabel_Ico_SHOW_Password);
        jLabel_Ico_SHOW_Password.setBounds(520, 280, 40, 40);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 805, 580);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_IDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_IDFocusGained

        //That is clear the text felds and show "username".
        if (jTextField_ID.getText().trim().toLowerCase().equals("enter your id")) {

            jTextField_ID.setText(null);
            jTextField_ID.setForeground(Color.BLACK);

        }

        //change icon border
        javax.swing.border.Border JPanel_title__Border = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.YELLOW);//me code eken add karanna puluwan RGB colours vitharai.
        jLabel_ICO_Username.setBorder(JPanel_title__Border);
        jLabel_ID_Letter.setBorder(JPanel_title__Border);
    }//GEN-LAST:event_jTextField_IDFocusGained

    private void jTextField_IDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_IDFocusLost

        if (jTextField_ID.getText().trim().equals("") || jTextField_ID.getText().trim().toLowerCase().equals("enter your id")) {

            jTextField_ID.setText("enter your id");
            getToolkit().beep();
            jTextField_ID.setForeground(new Color(153, 153, 153));//me code eken apita kamthi patak add karanna puluwan
        }

        jLabel_ICO_Username.setBorder(null);//Remove the border.
    }//GEN-LAST:event_jTextField_IDFocusLost

    private void jTextField_IDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_IDKeyReleased
        jLabel_Val_ID.setText("");
    }//GEN-LAST:event_jTextField_IDKeyReleased

    private void jPasswordField_PasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField_PasswordFocusGained

        //That is clear the text felds and show "password".
        String pass = String.valueOf(jPasswordField_Password.getPassword());

        if (pass.trim().toLowerCase().equals("password")) {

            jPasswordField_Password.setText(null);
            jPasswordField_Password.setForeground(Color.BLACK);

        }

        //change icon border
        javax.swing.border.Border JPanel_title__Border = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.YELLOW);//me code eken add karanna puluwan RGB colours vitharai.
        jLabel_ICO_PW1.setBorder(JPanel_title__Border);
        jLabel_ID_Letter.setBorder(JPanel_title__Border);
    }//GEN-LAST:event_jPasswordField_PasswordFocusGained

    private void jPasswordField_PasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField_PasswordFocusLost

        String pass = String.valueOf(jPasswordField_Password.getPassword());

        if (pass.trim().equals("") || jPasswordField_Password.getText().trim().toLowerCase().equals("password")) {

            jPasswordField_Password.setText("password");
            getToolkit().beep();
            jPasswordField_Password.setForeground(new Color(153, 153, 153));//me code eken apita kamthi patak add karanna puluwan
        }

        jLabel_ICO_PW1.setBorder(null);//Remove the border

    }//GEN-LAST:event_jPasswordField_PasswordFocusLost

    private void jPasswordField_PasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField_PasswordKeyReleased
        jLabel_Val_PWord.setText("");
    }//GEN-LAST:event_jPasswordField_PasswordKeyReleased

    private void jLabel3_Forgot_PasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3_Forgot_PasswordMouseClicked

        JFrame_3 f3 = new JFrame_3();
        f3.setVisible(true);

    }//GEN-LAST:event_jLabel3_Forgot_PasswordMouseClicked

    private void jLabel3_Forgot_PasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3_Forgot_PasswordMouseEntered

        jLabel3_Forgot_Password.setForeground(Color.blue);

    }//GEN-LAST:event_jLabel3_Forgot_PasswordMouseEntered

    private void jLabel3_Forgot_PasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3_Forgot_PasswordMouseExited

        jLabel3_Forgot_Password.setForeground(Color.black);

    }//GEN-LAST:event_jLabel3_Forgot_PasswordMouseExited

    private void jLabel_Create_ActMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Create_ActMouseClicked

        JFrame_4 f4 = new JFrame_4();
        f4.setVisible(true);

    }//GEN-LAST:event_jLabel_Create_ActMouseClicked

    private void jLabel_Create_ActMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Create_ActMouseEntered

        jLabel_Create_Act.setForeground(new Color(0, 153, 51));

    }//GEN-LAST:event_jLabel_Create_ActMouseEntered

    private void jLabel_Create_ActMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Create_ActMouseExited

        jLabel_Create_Act.setForeground(Color.black);

    }//GEN-LAST:event_jLabel_Create_ActMouseExited

    private void jButton_ClrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ClrActionPerformed

        jPasswordField_Password.setText(null);
        jTextField_ID.setText(null);
        jLabel_Val_PWord.setText(null);
        jLabel_Val_ID.setText(null);


    }//GEN-LAST:event_jButton_ClrActionPerformed

    private void jButton_LogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LogActionPerformed

        if (jTextField_ID.getText().trim().isEmpty() && jPasswordField_Password.getText().trim().isEmpty()) {

            jLabel_Val_ID.setText("Enter your ID Number.");
            jLabel_Val_PWord.setText("Enter Your Password.");
            getToolkit().beep();

        } else if (jTextField_ID.getText().trim().isEmpty()) {
            jLabel_Val_ID.setText("Enter your ID Number.");
            getToolkit().beep();
        } else if (jPasswordField_Password.getText().trim().isEmpty()) {
            jLabel_Val_PWord.setText("Enter Your Password.");
            getToolkit().beep();
        } else {

            try {

                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/";
                String db = "inventry_management_system";
                String user = "root";
                String pword = "123456";

                Connection con = null;
                con = DriverManager.getConnection(url + db, user, pword);

                String query = "SELECT * FROM user WHERE ID=? and Password=?";

                PreparedStatement pst = con.prepareStatement(query);

                pst.setString(1, jTextField_ID.getText());
                pst.setString(2, jPasswordField_Password.getText());

                ResultSet res = pst.executeQuery();

                if (res.next()) {

                    JOptionPane.showMessageDialog(null, "Your Id number and Password is matched.", "Login Succsessfully", JOptionPane.INFORMATION_MESSAGE);
                    JFrame_5 f5 = new JFrame_5();
                    f5.setVisible(true);
                    this.dispose();

                } else {

                    JOptionPane.showMessageDialog(null, "Your Id numberand Password is do not matched.", "Login Unsuccsessfully", JOptionPane.ERROR_MESSAGE);

                    jTextField_ID.setText(null);
                    jPasswordField_Password.setText(null);
                    jLabel_Val_ID.setText(null);
                    jLabel_Val_PWord.setText(null);

                    attempt += 1;

                    if (attempt == 3) {

                        getToolkit().beep();
                        JOptionPane.showMessageDialog(null, "You enter wrong ID number or password three times. There for the system is stoped", "System Error!!!", JOptionPane.ERROR_MESSAGE);
                        System.exit(0);

                    }
                }

                con.close();

            } catch (Exception ex) {

                Logger.getLogger(JFrame_2.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex);

                jTextField_ID.setText(null);
                jPasswordField_Password.setText(null);
                jLabel_Val_ID.setText(null);
                jLabel_Val_PWord.setText(null);
                getToolkit().beep();
            }
        }
    }//GEN-LAST:event_jButton_LogActionPerformed

    private void jButton_CnslActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CnslActionPerformed

        int a;
        a = JOptionPane.showConfirmDialog(null, "Are you sure to you went to close this program now?", "Close Program", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (a == 0) {
            System.exit(a);
        }
    }//GEN-LAST:event_jButton_CnslActionPerformed

    private void jLabel_Ico_SHOW_PasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Ico_SHOW_PasswordMouseClicked

        if (jLabel_Show_Password_dont_Delete.getText().equals("")) {

            jPasswordField_Password.setEchoChar((char) 0);
            jLabel_Show_Password_dont_Delete.setText("set");

        } else {

            jPasswordField_Password.setEchoChar('*');
            jLabel_Show_Password_dont_Delete.setText("");

        }

    }//GEN-LAST:event_jLabel_Ico_SHOW_PasswordMouseClicked

    private void jLabel_Ico_SHOW_PasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Ico_SHOW_PasswordMouseEntered

        Border Lable__Border = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GREEN);
        jLabel_Ico_SHOW_Password.setBorder(Lable__Border);

    }//GEN-LAST:event_jLabel_Ico_SHOW_PasswordMouseEntered

    private void jLabel_Ico_SHOW_PasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Ico_SHOW_PasswordMouseExited

        Border Lable__Border = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.YELLOW);
        jLabel_Ico_SHOW_Password.setBorder(Lable__Border);

    }//GEN-LAST:event_jLabel_Ico_SHOW_PasswordMouseExited

    private void jTextField_IDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_IDKeyTyped
        char c = evt.getKeyChar();

        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)) {

            evt.consume();
            getToolkit().beep();
        }

    }//GEN-LAST:event_jTextField_IDKeyTyped

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
            java.util.logging.Logger.getLogger(JFrame_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Clr;
    private javax.swing.JButton jButton_Cnsl;
    private javax.swing.JButton jButton_Log;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3_Forgot_Password;
    private javax.swing.JLabel jLabel_Create_Act;
    private javax.swing.JLabel jLabel_ICO_PW1;
    private javax.swing.JLabel jLabel_ICO_Username;
    private javax.swing.JLabel jLabel_ID_Letter;
    private javax.swing.JLabel jLabel_Ico_SHOW_Password;
    private javax.swing.JLabel jLabel_Show_Password_dont_Delete;
    private javax.swing.JLabel jLabel_Val_ID;
    private javax.swing.JLabel jLabel_Val_PWord;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField_Password;
    private javax.swing.JTextField jTextField_ID;
    // End of variables declaration//GEN-END:variables
}