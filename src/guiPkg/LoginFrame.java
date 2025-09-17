package guiPkg;


import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LoginFrame extends javax.swing.JFrame
{

    dataPkg.UsersData ud;
    
    public LoginFrame() throws SQLException
    {
        initComponents();
        
        ud = new dataPkg.UsersData();

        this.setLocationRelativeTo(null);
        
        //username requests focus cause theres where we want to enter first
        txfUsername.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lpBackground = new javax.swing.JLayeredPane();
        btnLogin = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblAdminLogin = new javax.swing.JLabel();
        btnHelp = new javax.swing.JButton();
        txfUsername = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txfPassword = new javax.swing.JPasswordField();
        cbShowPassword = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Sunset Oasis Casino");
        setResizable(false);

        lpBackground.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lpBackground.setToolTipText("");
        lpBackground.setOpaque(true);

        btnLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.setToolTipText("Proceed to Table Select");
        btnLogin.setMinimumSize(new java.awt.Dimension(110, 30));
        btnLogin.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnLoginActionPerformed(evt);
            }
        });
        lpBackground.add(btnLogin);
        btnLogin.setBounds(270, 230, 110, 30);

        btnExit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnExit.setText("Exit");
        btnExit.setToolTipText("Close the application");
        btnExit.setMaximumSize(new java.awt.Dimension(110, 30));
        btnExit.setMinimumSize(new java.awt.Dimension(110, 30));
        btnExit.setPreferredSize(new java.awt.Dimension(110, 30));
        btnExit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnExitActionPerformed(evt);
            }
        });
        lpBackground.add(btnExit);
        btnExit.setBounds(30, 230, 110, 30);

        lblAdminLogin.setFont(new java.awt.Font("HP Simplified", 1, 36)); // NOI18N
        lblAdminLogin.setText("Admin Login");
        lpBackground.add(lblAdminLogin);
        lblAdminLogin.setBounds(110, 40, 230, 40);

        btnHelp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnHelp.setText("Help");
        btnHelp.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnHelpActionPerformed(evt);
            }
        });
        lpBackground.add(btnHelp);
        btnHelp.setBounds(350, 10, 80, 30);

        txfUsername.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        txfUsername.setToolTipText("Please enter Username");
        lpBackground.add(txfUsername);
        txfUsername.setBounds(240, 100, 140, 30);

        lblUsername.setFont(new java.awt.Font("HP Simplified", 0, 24)); // NOI18N
        lblUsername.setText("Username:");
        lpBackground.add(lblUsername);
        lblUsername.setBounds(30, 100, 130, 30);

        lblPassword.setFont(new java.awt.Font("HP Simplified", 0, 24)); // NOI18N
        lblPassword.setText("Password:");
        lpBackground.add(lblPassword);
        lblPassword.setBounds(30, 150, 130, 30);

        txfPassword.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        txfPassword.setToolTipText("Please enter Password");
        lpBackground.add(txfPassword);
        txfPassword.setBounds(240, 150, 140, 30);

        cbShowPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbShowPassword.setText("Show Password");
        cbShowPassword.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cbShowPasswordActionPerformed(evt);
            }
        });
        lpBackground.add(cbShowPassword);
        cbShowPassword.setBounds(240, 190, 130, 21);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lpBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lpBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //bring sup the exit frame
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnExitActionPerformed
    {//GEN-HEADEREND:event_btnExitActionPerformed
        //asks the user if they want to close the app and then does so if they click yes. doesnt if they click no 
//        int exit = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit the application?", "Confirm", JOptionPane.YES_NO_OPTION);
//        if (exit == JOptionPane.YES_OPTION)
//        {
//            this.dispose();
//        }
        this.dispose();
        new ExitFrame().setVisible(true);
    }//GEN-LAST:event_btnExitActionPerformed

    //check entered credentials and brings up main menu if valid
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnLoginActionPerformed
    {//GEN-HEADEREND:event_btnLoginActionPerformed
        //we check the user and password and say if anything is invalid. if it is then when show relevant 
        dataPkg.Users u = ud.getUsername(txfUsername.getText().trim());

        if (u.getUsername().equals(txfUsername.getText().trim()))
        {
            if (u.getPassword().equals(txfPassword.getText().trim()))
            {
                //THIS JOPTION MAY GET REPLACED
                //JOptionPane.showMessageDialog(null, "Welcome " + u.getFirstName() + " " + u.getSurname(), "Welcome", JOptionPane.PLAIN_MESSAGE);
                this.dispose();
                //new MainMenuFrame().setVisible(true);
                //new WelcomeScreen(u.getFirstName() + " " + u.getSurname()).setVisible(true);
                new WelcomeFrame(u.getFirstName() + " " + u.getSurname()).setVisible(true);
            } else
            {
                JOptionPane.showMessageDialog(null, "Invalid Password", "ERROR", JOptionPane.ERROR_MESSAGE);
                txfPassword.setText("");
                txfPassword.requestFocus();
            }
        } else
        {
            JOptionPane.showMessageDialog(null, "Invalid Username", "ERROR", JOptionPane.ERROR_MESSAGE);
            txfUsername.setText("");
            txfUsername.requestFocus();
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    //calls the help frame with the relevant txt
    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnHelpActionPerformed
    {//GEN-HEADEREND:event_btnHelpActionPerformed
        new HelpFrame("AdminLogin.txt", "").setVisible(true);
    }//GEN-LAST:event_btnHelpActionPerformed

    //makes the password visible/invisible
    private void cbShowPasswordActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cbShowPasswordActionPerformed
    {//GEN-HEADEREND:event_cbShowPasswordActionPerformed
        //this just shows the password
        if (cbShowPassword.isSelected())
        {
            txfPassword.setEchoChar((char) 0);
        } else
        {
            txfPassword.setEchoChar('•');
        }
    }//GEN-LAST:event_cbShowPasswordActionPerformed

    public static void main(String args[]) throws SQLException
    {
       new LoginFrame().setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnLogin;
    private javax.swing.JCheckBox cbShowPassword;
    private javax.swing.JLabel lblAdminLogin;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLayeredPane lpBackground;
    private javax.swing.JPasswordField txfPassword;
    private javax.swing.JTextField txfUsername;
    // End of variables declaration//GEN-END:variables
}
