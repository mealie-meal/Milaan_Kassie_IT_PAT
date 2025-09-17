package guiPkg;

import dataPkg.ReportsData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ReportsFrame extends javax.swing.JFrame
{

    dataPkg.ReportsData rd; //initialise 
    
    
    public ReportsFrame() throws SQLException
    {
        initComponents();

        rd = new ReportsData(); //instantiate
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lpBackground = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lpOutputPane = new javax.swing.JLayeredPane();
        spDisplay = new javax.swing.JScrollPane();
        txaDisplay = new javax.swing.JTextArea();
        lpQueries = new javax.swing.JLayeredPane();
        btnHighestSpender = new javax.swing.JButton();
        btnMostVisits = new javax.swing.JButton();
        btnCardTypes = new javax.swing.JButton();
        btnGender = new javax.swing.JButton();
        btnEventLocation = new javax.swing.JButton();
        btnHighCapacityEvents = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnOutputPane = new javax.swing.JLabel();
        btnOutputPane1 = new javax.swing.JLabel();
        btnPrint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Sunset Oasis Casino ");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusable(false);
        setResizable(false);

        lpBackground.setBackground(new java.awt.Color(0, 0, 0));
        lpBackground.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("HP Simplified", 0, 36)); // NOI18N
        jLabel1.setText("Reports Frame");

        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnBackActionPerformed(evt);
            }
        });

        lpOutputPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txaDisplay.setEditable(false);
        txaDisplay.setColumns(20);
        txaDisplay.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        txaDisplay.setRows(5);
        txaDisplay.setMargin(new java.awt.Insets(2, 8, 2, 6));
        spDisplay.setViewportView(txaDisplay);

        lpOutputPane.setLayer(spDisplay, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout lpOutputPaneLayout = new javax.swing.GroupLayout(lpOutputPane);
        lpOutputPane.setLayout(lpOutputPaneLayout);
        lpOutputPaneLayout.setHorizontalGroup(
            lpOutputPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lpOutputPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                .addContainerGap())
        );
        lpOutputPaneLayout.setVerticalGroup(
            lpOutputPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lpOutputPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addContainerGap())
        );

        lpQueries.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnHighestSpender.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnHighestSpender.setText("Higest Spender");
        btnHighestSpender.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnHighestSpenderActionPerformed(evt);
            }
        });

        btnMostVisits.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnMostVisits.setText("Most Visits");
        btnMostVisits.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnMostVisitsActionPerformed(evt);
            }
        });

        btnCardTypes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCardTypes.setText("Patron Card Types");
        btnCardTypes.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCardTypesActionPerformed(evt);
            }
        });

        btnGender.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnGender.setText("Gender");
        btnGender.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnGenderActionPerformed(evt);
            }
        });

        btnEventLocation.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEventLocation.setText("Event Locations");
        btnEventLocation.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEventLocationActionPerformed(evt);
            }
        });

        btnHighCapacityEvents.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnHighCapacityEvents.setText("High Capacity Events");
        btnHighCapacityEvents.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnHighCapacityEventsActionPerformed(evt);
            }
        });

        lpQueries.setLayer(btnHighestSpender, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpQueries.setLayer(btnMostVisits, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpQueries.setLayer(btnCardTypes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpQueries.setLayer(btnGender, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpQueries.setLayer(btnEventLocation, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpQueries.setLayer(btnHighCapacityEvents, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout lpQueriesLayout = new javax.swing.GroupLayout(lpQueries);
        lpQueries.setLayout(lpQueriesLayout);
        lpQueriesLayout.setHorizontalGroup(
            lpQueriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lpQueriesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lpQueriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnHighCapacityEvents, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addGroup(lpQueriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnEventLocation, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGender, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCardTypes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addComponent(btnMostVisits, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHighestSpender, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lpQueriesLayout.setVerticalGroup(
            lpQueriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lpQueriesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHighestSpender, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMostVisits, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCardTypes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGender, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEventLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnHighCapacityEvents, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnHelp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnHelp.setText("Help");
        btnHelp.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnHelpActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnClear.setText("Clear Text Area");
        btnClear.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnClearActionPerformed(evt);
            }
        });

        btnOutputPane.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnOutputPane.setText("Output Pane");

        btnOutputPane1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnOutputPane1.setText("Queries");

        btnPrint.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPrintActionPerformed(evt);
            }
        });

        lpBackground.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(btnBack, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(lpOutputPane, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(lpQueries, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(btnHelp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(btnClear, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(btnOutputPane, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(btnOutputPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(btnPrint, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout lpBackgroundLayout = new javax.swing.GroupLayout(lpBackground);
        lpBackground.setLayout(lpBackgroundLayout);
        lpBackgroundLayout.setHorizontalGroup(
            lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lpBackgroundLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lpBackgroundLayout.createSequentialGroup()
                        .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnOutputPane1)
                            .addComponent(lpQueries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnOutputPane)
                            .addComponent(lpOutputPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lpBackgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(175, 175, 175)
                        .addComponent(btnHelp))
                    .addGroup(lpBackgroundLayout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lpBackgroundLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBack))
                            .addGroup(lpBackgroundLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lpBackgroundLayout.setVerticalGroup(
            lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lpBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lpBackgroundLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btnOutputPane1))
                    .addGroup(lpBackgroundLayout.createSequentialGroup()
                        .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lpQueries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(lpBackgroundLayout.createSequentialGroup()
                                .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(btnHelp))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnOutputPane)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lpOutputPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPrint)
                            .addComponent(btnClear))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack)
                .addContainerGap(13, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //using trycatch incase it doesnt pull properly
    //all these methods just call the relevant sql method from the reportsData class
    //some methods make use of graphs and display tools which will automatically be called up when the button is clicked
    private void btnHighestSpenderActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnHighestSpenderActionPerformed
    {//GEN-HEADEREND:event_btnHighestSpenderActionPerformed
        try
        {
            txaDisplay.setText(rd.getHighestSpender());
        } catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }

        
        
    }//GEN-LAST:event_btnHighestSpenderActionPerformed

    //closes the frame and takes you back to the main menu
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnBackActionPerformed
    {//GEN-HEADEREND:event_btnBackActionPerformed
        try
        {
            this.dispose();
            new MainMenuFrame().setVisible(true);
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btnBackActionPerformed

    //brings up the hel frame with the relevant txt file
    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnHelpActionPerformed
    {//GEN-HEADEREND:event_btnHelpActionPerformed
        try
        {
            new guiPkg.HelpFrame("ReportsFrame.txt").setVisible(true); //calling second constructor that only needs a filename, no videoname
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btnHelpActionPerformed

    private void btnMostVisitsActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnMostVisitsActionPerformed
    {//GEN-HEADEREND:event_btnMostVisitsActionPerformed
        try
        {
            txaDisplay.setText(rd.getMostVisitsPatron());
        } catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btnMostVisitsActionPerformed

    //clears the txa
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnClearActionPerformed
    {//GEN-HEADEREND:event_btnClearActionPerformed
        txaDisplay.setText("");
        txaDisplay.requestFocus();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnEventLocationActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEventLocationActionPerformed
    {//GEN-HEADEREND:event_btnEventLocationActionPerformed
        try
        {
            txaDisplay.setText(rd.getEventLocation()); 
        } catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btnEventLocationActionPerformed

    private void btnCardTypesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCardTypesActionPerformed
    {//GEN-HEADEREND:event_btnCardTypesActionPerformed
        try
        {
            //txaDisplay.setText(rd.getPatronCardType()); //formatting is off
            //rd.cardTypesBarGraph(); //formatting is off
            txaDisplay.setText(rd.cardTypesBarGraph());
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btnCardTypesActionPerformed

    private void btnGenderActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnGenderActionPerformed
    {//GEN-HEADEREND:event_btnGenderActionPerformed
        try
        {
            txaDisplay.setText(rd.getPatronGender());
            
        } catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btnGenderActionPerformed

    private void btnHighCapacityEventsActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnHighCapacityEventsActionPerformed
    {//GEN-HEADEREND:event_btnHighCapacityEventsActionPerformed
        try
        {
            txaDisplay.setText(rd.getHighCapacityEvents()); //formatting is off
        } catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btnHighCapacityEventsActionPerformed

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

    public static void main(String args[])
    {
        try
        {
            new ReportsFrame().setVisible(true);
        } catch (SQLException ex)
        {
            Logger.getLogger(ReportsFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCardTypes;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnEventLocation;
    private javax.swing.JButton btnGender;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnHighCapacityEvents;
    private javax.swing.JButton btnHighestSpender;
    private javax.swing.JButton btnMostVisits;
    private javax.swing.JLabel btnOutputPane;
    private javax.swing.JLabel btnOutputPane1;
    private javax.swing.JButton btnPrint;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane lpBackground;
    private javax.swing.JLayeredPane lpOutputPane;
    private javax.swing.JLayeredPane lpQueries;
    private javax.swing.JScrollPane spDisplay;
    private javax.swing.JTextArea txaDisplay;
    // End of variables declaration//GEN-END:variables
}
