package guiPkg;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MainMenuFrame extends javax.swing.JFrame
{

    public MainMenuFrame()
    {
        initComponents();

        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lpBackground = new javax.swing.JLayeredPane();
        btnLogout = new javax.swing.JButton();
        lblMainMenu = new javax.swing.JLabel();
        btnTblEvents = new javax.swing.JButton();
        btnTblPatrons = new javax.swing.JButton();
        btnVisits = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();
        btnReportsFrame = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Sunset Oasis Casino");
        setResizable(false);

        lpBackground.setBackground(new java.awt.Color(0, 0, 0));
        lpBackground.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lpBackground.setForeground(new java.awt.Color(204, 204, 255));
        lpBackground.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnLogoutActionPerformed(evt);
            }
        });

        lblMainMenu.setFont(new java.awt.Font("HP Simplified", 1, 36)); // NOI18N
        lblMainMenu.setText("Main Menu Frame");

        btnTblEvents.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnTblEvents.setText("Events Table");
        btnTblEvents.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnTblEventsActionPerformed(evt);
            }
        });

        btnTblPatrons.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnTblPatrons.setText("Patrons Table");
        btnTblPatrons.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnTblPatronsActionPerformed(evt);
            }
        });

        btnVisits.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVisits.setText("Visits Table");
        btnVisits.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnVisitsActionPerformed(evt);
            }
        });

        btnHelp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnHelp.setText("Help");
        btnHelp.setToolTipText("");
        btnHelp.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnHelpActionPerformed(evt);
            }
        });

        btnReportsFrame.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnReportsFrame.setText("Reports Frame");
        btnReportsFrame.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnReportsFrameActionPerformed(evt);
            }
        });

        lpBackground.setLayer(btnLogout, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(lblMainMenu, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(btnTblEvents, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(btnTblPatrons, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(btnVisits, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(btnHelp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(btnReportsFrame, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout lpBackgroundLayout = new javax.swing.GroupLayout(lpBackground);
        lpBackground.setLayout(lpBackgroundLayout);
        lpBackgroundLayout.setHorizontalGroup(
            lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lpBackgroundLayout.createSequentialGroup()
                .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lpBackgroundLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(lblMainMenu)
                        .addGap(18, 18, 18)
                        .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(lpBackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(lpBackgroundLayout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnTblEvents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVisits, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTblPatrons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReportsFrame))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lpBackgroundLayout.setVerticalGroup(
            lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lpBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHelp)
                    .addComponent(lblMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnVisits)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTblEvents)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTblPatrons)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReportsFrame)
                .addGap(18, 18, 18)
                .addComponent(btnLogout)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lpBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lpBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //closes the frame and brings up the login frame
    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnLogoutActionPerformed
    {//GEN-HEADEREND:event_btnLogoutActionPerformed

        this.dispose();                                                         //close the frame

        try
        {
            new LoginFrame().setVisible(true);                                //display the login
        } catch (SQLException e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    //calls the help method with the relevant txt file
    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnHelpActionPerformed
    {//GEN-HEADEREND:event_btnHelpActionPerformed
        new HelpFrame("TableSelect.txt").setVisible(true);
    }//GEN-LAST:event_btnHelpActionPerformed

    //brings up the Events Table screen
    private void btnTblEventsActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnTblEventsActionPerformed
    {//GEN-HEADEREND:event_btnTblEventsActionPerformed
        try
        {
            this.dispose();                                 //close this frame
            new EventsTable().setVisible(true);             //display the events table
        } catch (SQLException ex)
        {
            Logger.getLogger(MainMenuFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTblEventsActionPerformed

    //brings up the Visits Table screen
    private void btnVisitsActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnVisitsActionPerformed
    {//GEN-HEADEREND:event_btnVisitsActionPerformed
        try
        {
            this.dispose();
            new VisitsTable().setVisible(true);
        } catch (SQLException ex)
        {
            Logger.getLogger(MainMenuFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnVisitsActionPerformed

    //brings up the Patrons Table screen
    private void btnTblPatronsActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnTblPatronsActionPerformed
    {//GEN-HEADEREND:event_btnTblPatronsActionPerformed
        try
        {
            this.dispose();
            new PatronsTable().setVisible(true);
        } catch (SQLException ex)
        {
            Logger.getLogger(MainMenuFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTblPatronsActionPerformed

    //brings up the Reports Frame screen
    private void btnReportsFrameActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnReportsFrameActionPerformed
    {//GEN-HEADEREND:event_btnReportsFrameActionPerformed
        try
        {
            this.dispose();
            new ReportsFrame().setVisible(true);
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btnReportsFrameActionPerformed

    public static void main(String args[])
    {
        new MainMenuFrame().setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnReportsFrame;
    private javax.swing.JButton btnTblEvents;
    private javax.swing.JButton btnTblPatrons;
    private javax.swing.JButton btnVisits;
    private javax.swing.JLabel lblMainMenu;
    private javax.swing.JLayeredPane lpBackground;
    // End of variables declaration//GEN-END:variables
}
