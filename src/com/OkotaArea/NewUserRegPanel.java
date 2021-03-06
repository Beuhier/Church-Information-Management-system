/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.OkotaArea;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.jdesktop.swingx.prompt.PromptSupport;

/**
 *
 * @author chinex
 */
public class NewUserRegPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewUserRegPanel
     */
    private Connection con;
    private PreparedStatement pt;
    private ResultSet st;
    private final String userDb = "root";
    private final String passwordDb = "";
    private final String urlDb = "jdbc:mysql://localhost:3306/dcokota_db";
    private final HomeFront front;
    public NewUserRegPanel(HomeFront front) {
        initComponents();
        textCustomise("Enter First Name", firstTextField);
        textCustomise("Enter Last Name", LastnameTextField);
        textCustomise("Enter User Name", usernameTextField);
        textCustomise("Re-enter Password", jCONFIRMPasswordField);
        textCustomise("Enter Password",jPasswordField );
      this.front = front;  
    }
private void textCustomise(String text, JTextField component)
    {
        PromptSupport.setPrompt(text, component);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.HIDE_PROMPT, component);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, component);
        PromptSupport.setFontStyle(Font.BOLD, component);
        PromptSupport.setForeground(Color.darkGray, component);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        firstTextField = new javax.swing.JTextField();
        usernameTextField = new javax.swing.JTextField();
        LastnameTextField = new javax.swing.JTextField();
        jPasswordField = new javax.swing.JPasswordField();
        jCONFIRMPasswordField = new javax.swing.JPasswordField();
        gender = new javax.swing.JLabel();
        maleRadioButton = new javax.swing.JRadioButton();
        femaleRadioButton = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        UserregExitButton = new javax.swing.JButton();
        RegisterUserButton = new javax.swing.JButton();
        areacordRadioButton = new javax.swing.JRadioButton();
        cellleaderRadioButton = new javax.swing.JRadioButton();
        gender1 = new javax.swing.JLabel();
        areaadminRadioButton = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        createAcct = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        firstTextField.setFont(new java.awt.Font("Bell MT", 1, 32)); // NOI18N

        usernameTextField.setFont(new java.awt.Font("Bell MT", 1, 32)); // NOI18N

        LastnameTextField.setFont(new java.awt.Font("Bell MT", 1, 32)); // NOI18N

        jPasswordField.setFont(new java.awt.Font("Bell MT", 1, 32)); // NOI18N

        jCONFIRMPasswordField.setFont(new java.awt.Font("Bell MT", 1, 32)); // NOI18N

        gender.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        gender.setText("Gender");

        maleRadioButton.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(maleRadioButton);
        maleRadioButton.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        maleRadioButton.setForeground(new java.awt.Color(102, 102, 102));
        maleRadioButton.setText("Male");

        femaleRadioButton.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(femaleRadioButton);
        femaleRadioButton.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        femaleRadioButton.setForeground(new java.awt.Color(102, 102, 102));
        femaleRadioButton.setText("Female");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 50));

        UserregExitButton.setFont(new java.awt.Font("Bell MT", 1, 30)); // NOI18N
        UserregExitButton.setText("EXIT");
        UserregExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserregExitButtonActionPerformed(evt);
            }
        });

        RegisterUserButton.setFont(new java.awt.Font("Bell MT", 1, 30)); // NOI18N
        RegisterUserButton.setText("Register");
        RegisterUserButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegisterUserButtonMouseEntered(evt);
            }
        });
        RegisterUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterUserButtonActionPerformed(evt);
            }
        });

        areacordRadioButton.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup2.add(areacordRadioButton);
        areacordRadioButton.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        areacordRadioButton.setForeground(new java.awt.Color(102, 102, 102));
        areacordRadioButton.setText("Area Cordinator");

        cellleaderRadioButton.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup2.add(cellleaderRadioButton);
        cellleaderRadioButton.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        cellleaderRadioButton.setForeground(new java.awt.Color(102, 102, 102));
        cellleaderRadioButton.setText("Cell Leader");

        gender1.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        gender1.setText("Role");

        areaadminRadioButton.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup2.add(areaadminRadioButton);
        areaadminRadioButton.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        areaadminRadioButton.setForeground(new java.awt.Color(102, 102, 102));
        areaadminRadioButton.setText("Area Admin");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(maleRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(femaleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LastnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(firstTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(gender)
                                .addComponent(gender1)))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(areacordRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cellleaderRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(areaadminRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                            .addComponent(jPasswordField)
                            .addComponent(jCONFIRMPasswordField))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(RegisterUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(UserregExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(114, 114, 114))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(firstTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(LastnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(gender1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(areacordRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cellleaderRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(areaadminRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(femaleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addComponent(jCONFIRMPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(RegisterUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(UserregExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))))
        );

        jPanel2.setBackground(new java.awt.Color(0, 51, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 51, 153));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
        );

        createAcct.setBackground(new java.awt.Color(204, 204, 204));
        createAcct.setFont(new java.awt.Font("Perpetua Titling MT", 1, 32)); // NOI18N
        createAcct.setForeground(new java.awt.Color(204, 204, 204));
        createAcct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createAcct.setText("CREATE NEW USER ACCOUNT");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/OkotaArea/logo smallsma.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(createAcct, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(153, 153, 153)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(createAcct, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void UserregExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserregExitButtonActionPerformed
        // TODO add your handling code here:
         java.awt.EventQueue.invokeLater(new Runnable() {
             public void run() {
                 new HomeFront().setVisible(true);
                 front.dispose();
             }
         });     
                
                
    }//GEN-LAST:event_UserregExitButtonActionPerformed

    private void RegisterUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterUserButtonActionPerformed
        // TODO add your handling code here:
      try 
{
        String fn = firstTextField.getText();
        String ln = LastnameTextField.getText();
        String un = usernameTextField.getText();
        String pwd = jPasswordField.getText();
        String cpwd = jCONFIRMPasswordField.getText();
        String role;
        String usergender;
        if (maleRadioButton.isSelected())
        {
           usergender = "male"; 
        }
        else 
        {
           usergender = "female";
        }
        if (areacordRadioButton.isSelected())
        {
           role = "AreaCordinator"; 
        }
        else if (cellleaderRadioButton.isSelected())
        {
           role = "CellLeader"; 
        }
        else
        {
            role = "AreaAdmin";
        }
        if (!pwd.equals(cpwd))
        {
            //Display
            jCONFIRMPasswordField.setText("");
            JOptionPane.showMessageDialog(this, "Password Mismatch");
        }
        else
        {
            //proceed
             if (fn.isEmpty() || ln.isEmpty() || un.isEmpty() || role.equalsIgnoreCase("select Role"))
            {
                JOptionPane.showMessageDialog(this, "Please Complete the form");  
            }
             else
            {           
            String query = "INSERT INTO user_tb (username,password, firstname, lastname, gender, role) VALUE(?, ?, ?, ?, ?, ?)";
                    
                    con = DriverManager.getConnection(urlDb, userDb, passwordDb);
                    pt = con.prepareStatement(query);
                    
                    pt.setString(1, un);
                    pt.setString(2, pwd);
                    pt.setString(3, fn);
                    pt.setString(4, ln);
                    pt.setString(5, usergender);
                    pt.setString(6, role);
                    
                    int row = pt.executeUpdate();
                    
                    if(row>0)
                    {
                        JOptionPane.showMessageDialog(this, "Registration Successful");
                    }                    
            }            
        }     
    }                                               
catch(NumberFormatException ex)
{
}       catch (SQLException ex) {
            Logger.getLogger(NewUserRegPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
finally{
            try 
            {
                if(pt!=null)
                {
                    pt.close();
                }
                if(con!=null)
                {
                    con.close();
                }
            } 
            catch (SQLException ex) 
            {
                    Logger.getLogger(NewUserRegPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        firstTextField.setText("");
        LastnameTextField.setText("");
        usernameTextField.setText("");
        jPasswordField.setText("");
        jCONFIRMPasswordField.setText("");
     
    }//GEN-LAST:event_RegisterUserButtonActionPerformed

    private void RegisterUserButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterUserButtonMouseEntered
        // TODO add your handling code here:
         Cursor hand = new Cursor (Cursor.HAND_CURSOR);
         RegisterUserButton.setCursor(hand);
    }//GEN-LAST:event_RegisterUserButtonMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField LastnameTextField;
    private javax.swing.JButton RegisterUserButton;
    private javax.swing.JButton UserregExitButton;
    private javax.swing.JRadioButton areaadminRadioButton;
    private javax.swing.JRadioButton areacordRadioButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JRadioButton cellleaderRadioButton;
    private javax.swing.JLabel createAcct;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.JTextField firstTextField;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel gender1;
    private javax.swing.JPasswordField jCONFIRMPasswordField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}