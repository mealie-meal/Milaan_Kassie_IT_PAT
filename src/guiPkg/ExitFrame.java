package guiPkg;

import java.sql.SQLException;

public class ExitFrame extends javax.swing.JFrame
{

    //public WelcomeScreen(String username)
    public ExitFrame()
    {
        //lblName.setText(username);

        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lpBackground = new javax.swing.JLayeredPane();
        btnReturn = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        lblConfirm = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Sunset Oasis Casino");
        setAlwaysOnTop(true);
        setUndecorated(true);
        setResizable(false);

        lpBackground.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lpBackground.setFocusCycleRoot(true);

        btnReturn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnReturn.setText("Return");
        btnReturn.setToolTipText("Exit application");
        btnReturn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnReturnActionPerformed(evt);
            }
        });

        lblName.setFont(new java.awt.Font("HP Simplified", 0, 24)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("Are you sure?");

        lblConfirm.setFont(new java.awt.Font("HP Simplified", 0, 36)); // NOI18N
        lblConfirm.setText("You are about to exit");

        btnExit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnExit.setText("Exit");
        btnExit.setToolTipText("Back to login screen");
        btnExit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnExitActionPerformed(evt);
            }
        });

        lpBackground.setLayer(btnReturn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(lblName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(lblConfirm, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(btnExit, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout lpBackgroundLayout = new javax.swing.GroupLayout(lpBackground);
        lpBackground.setLayout(lpBackgroundLayout);
        lpBackgroundLayout.setHorizontalGroup(
            lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lpBackgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(lpBackgroundLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lpBackgroundLayout.createSequentialGroup()
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(lpBackgroundLayout.createSequentialGroup()
                        .addComponent(lblConfirm)
                        .addContainerGap(33, Short.MAX_VALUE))))
        );
        lpBackgroundLayout.setVerticalGroup(
            lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lpBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblConfirm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnReturn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lpBackground, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lpBackground)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //takes you back to the login frame
    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnReturnActionPerformed
    {//GEN-HEADEREND:event_btnReturnActionPerformed
        //this.dispose();
        //BYE BYE

        this.dispose();
        try
        {
            new LoginFrame().setVisible(true);
        } catch (SQLException e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnReturnActionPerformed

    //closes the screen and application
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnExitActionPerformed
    {//GEN-HEADEREND:event_btnExitActionPerformed
//        this.dispose();
//        try
//        {
//            new AdminLogin().setVisible(true);
//        } catch (SQLException e)
//        {
//            System.out.println(e.toString());
//        }

        this.dispose();
        //BYE BYE
    }//GEN-LAST:event_btnExitActionPerformed

    public static void main(String args[])
    {
        new ExitFrame().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnReturn;
    private javax.swing.JLabel lblConfirm;
    private javax.swing.JLabel lblName;
    private javax.swing.JLayeredPane lpBackground;
    // End of variables declaration//GEN-END:variables
}
