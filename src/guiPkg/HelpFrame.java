package guiPkg;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class HelpFrame extends javax.swing.JFrame
{
    

    //method will be called with the relevant txt and video for each screen that it is being called from
    public HelpFrame(String filename, String videoname)
    {
        
        initComponents();

        try
        {
            Scanner inputStream = new Scanner(new FileInputStream(filename));

            while (inputStream.hasNextLine())
            {

                txaDisplay.append(inputStream.nextLine() + "\n");
            }

            inputStream.close();

            Desktop.getDesktop().open(new File(videoname));
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }  

    }

    //if we're just calling using a txt file, no video
    public HelpFrame(String filename)
    {
        try
        {
            initComponents();
            
            Scanner inputStream = new Scanner(new FileInputStream(filename));
            
            while (inputStream.hasNextLine())
            {
                txaDisplay.append(inputStream.nextLine() + "\n");
            }

            inputStream.close();
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Text file not found" , "Error", HEIGHT);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lpBackground = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDisplay = new javax.swing.JTextArea();
        btnPrint = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        lblHelpScreen = new javax.swing.JLabel();
        btnHelpVideo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Sunset Oasis Casino");
        setResizable(false);

        lpBackground.setBackground(new java.awt.Color(0, 0, 0));
        lpBackground.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txaDisplay.setEditable(false);
        txaDisplay.setColumns(20);
        txaDisplay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txaDisplay.setRows(5);
        txaDisplay.setMargin(new java.awt.Insets(2, 8, 2, 6));
        jScrollPane1.setViewportView(txaDisplay);

        btnPrint.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPrintActionPerformed(evt);
            }
        });

        btnClose.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCloseActionPerformed(evt);
            }
        });

        lblHelpScreen.setFont(new java.awt.Font("HP Simplified", 0, 36)); // NOI18N
        lblHelpScreen.setText("Help Screen");

        btnHelpVideo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnHelpVideo.setText("Help Video");
        btnHelpVideo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnHelpVideoActionPerformed(evt);
            }
        });

        lpBackground.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(btnPrint, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(btnClose, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(lblHelpScreen, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(btnHelpVideo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout lpBackgroundLayout = new javax.swing.GroupLayout(lpBackground);
        lpBackground.setLayout(lpBackgroundLayout);
        lpBackgroundLayout.setHorizontalGroup(
            lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lpBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(lpBackgroundLayout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(lblHelpScreen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                        .addComponent(btnHelpVideo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lpBackgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        lpBackgroundLayout.setVerticalGroup(
            lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lpBackgroundLayout.createSequentialGroup()
                .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lpBackgroundLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblHelpScreen))
                    .addGroup(lpBackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnHelpVideo)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrint)
                    .addComponent(btnClose))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
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

        setSize(new java.awt.Dimension(738, 488));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    //closes
    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCloseActionPerformed
    {//GEN-HEADEREND:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    //brings up the print dialog
    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPrintActionPerformed
    {//GEN-HEADEREND:event_btnPrintActionPerformed
        try
        {
            txaDisplay.print();

        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Printing Failed", "Error",  JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    //brings up the help video
    private void btnHelpVideoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnHelpVideoActionPerformed
    {//GEN-HEADEREND:event_btnHelpVideoActionPerformed
        try
        {
            Desktop.getDesktop().open(new File("test.mp4"));
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Video not found", "Error",  JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnHelpVideoActionPerformed

    public static void main(String args[])
    {
        new HelpFrame("testHelp.txt", "test.mpg").setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnHelpVideo;
    private javax.swing.JButton btnPrint;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHelpScreen;
    private javax.swing.JLayeredPane lpBackground;
    private javax.swing.JTextArea txaDisplay;
    // End of variables declaration//GEN-END:variables
}
