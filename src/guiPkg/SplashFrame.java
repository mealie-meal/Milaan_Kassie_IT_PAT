package guiPkg;

import java.util.Timer;
import java.util.TimerTask;

public class SplashFrame extends javax.swing.JFrame
{

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lpBackground = new javax.swing.JLayeredPane();
        lblPic = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblLoadingPerc = new javax.swing.JLabel();
        pbLoading = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Sunset Oasis Casino");
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        setResizable(false);

        lpBackground.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lpBackground.setOpaque(true);

        lblPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picturesPkg/loading2.gif"))); // NOI18N

        lblTitle.setFont(new java.awt.Font("HP Simplified", 0, 36)); // NOI18N
        lblTitle.setText("Sunset Oasis Casino");

        lblLoadingPerc.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblLoadingPerc.setText("%");

        pbLoading.setBackground(new java.awt.Color(0, 0, 0));
        pbLoading.setForeground(new java.awt.Color(255, 255, 255));

        lpBackground.setLayer(lblPic, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(lblTitle, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(lblLoadingPerc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(pbLoading, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout lpBackgroundLayout = new javax.swing.GroupLayout(lpBackground);
        lpBackground.setLayout(lpBackgroundLayout);
        lpBackgroundLayout.setHorizontalGroup(
            lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lpBackgroundLayout.createSequentialGroup()
                .addComponent(lblPic, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(lpBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lpBackgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lpBackgroundLayout.createSequentialGroup()
                                .addComponent(lblLoadingPerc, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(317, 317, 317))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lpBackgroundLayout.createSequentialGroup()
                                .addComponent(lblTitle)
                                .addGap(236, 236, 236))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lpBackgroundLayout.createSequentialGroup()
                        .addComponent(pbLoading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        lpBackgroundLayout.setVerticalGroup(
            lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lpBackgroundLayout.createSequentialGroup()
                .addComponent(lblPic, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pbLoading, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLoadingPerc, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(lblTitle)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lpBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lpBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public SplashFrame()
    {
        initComponents(); //this initailizes the frame
    }

    static int perc = 0; 
    //percent

    public static void main(String args[])
    {
        final SplashFrame sf = new SplashFrame(); //press the run thing at the top of the screen and change main class to whatever you want to run first
        sf.setVisible(true);

        final Timer t = new Timer();

        TimerTask tt = new TimerTask()
        {
            public void run()
            {
                perc++; //increasing the perc value
                if (perc < 101) //as long as its less than 101, in other words 100 or less
                {
                    sf.pbLoading.setValue(perc);
                    sf.lblLoadingPerc.setText(perc + " %"); //percent sign next to it for professionality
                } else
                {
                    try
                    {
                        t.cancel();
                        sf.dispose();
                        new LoginFrame().setVisible(true);
                    } catch (Exception e)
                    {
                        System.out.println(e.toString());
                    }

                }

            }
        };
        t.scheduleAtFixedRate(tt, 0, 20); //the second number here controls the speed at which the loading bar moves. 20 or 45 is a good speed tho
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblLoadingPerc;
    private javax.swing.JLabel lblPic;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLayeredPane lpBackground;
    private javax.swing.JProgressBar pbLoading;
    // End of variables declaration//GEN-END:variables
}
