package guiPkg;

import java.sql.SQLException;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

public class WelcomeFrame extends javax.swing.JFrame
{

    //public WelcomeScreen(String username)
    public WelcomeFrame(String username)
    {
        //lblName.setText(username);

        initComponents();

        lblName.setText(username);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lpBackground = new javax.swing.JLayeredPane();
        btnClose = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        lblWelcome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Sunset Oasis Casino");
        setAlwaysOnTop(true);
        setUndecorated(true);
        setResizable(false);

        lpBackground.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnClose.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCloseActionPerformed(evt);
            }
        });

        lblName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("Admin name");

        lblWelcome.setFont(new java.awt.Font("HP Simplified", 0, 48)); // NOI18N
        lblWelcome.setText("Welcome");

        lpBackground.setLayer(btnClose, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(lblName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(lblWelcome, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout lpBackgroundLayout = new javax.swing.GroupLayout(lpBackground);
        lpBackground.setLayout(lpBackgroundLayout);
        lpBackgroundLayout.setHorizontalGroup(
            lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lpBackgroundLayout.createSequentialGroup()
                .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lpBackgroundLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(lblWelcome))
                    .addGroup(lpBackgroundLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(lpBackgroundLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        lpBackgroundLayout.setVerticalGroup(
            lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lpBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWelcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnClose)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lpBackground)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lpBackground)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //closes this screen and brings up the main menu frame 
    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCloseActionPerformed
    {//GEN-HEADEREND:event_btnCloseActionPerformed
        this.dispose();
        new MainMenuFrame().setVisible(true);
    }//GEN-LAST:event_btnCloseActionPerformed

    public static void main(String args[])
    {
        //call with admin be default, it gets overriden otherwise
        new WelcomeFrame("Admin").setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JLayeredPane lpBackground;
    // End of variables declaration//GEN-END:variables
}
