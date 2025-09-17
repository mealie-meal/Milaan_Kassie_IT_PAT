package guiPkg;

import com.toedter.calendar.JTextFieldDateEditor;
import dataPkg.Validation;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.Calendar;

public class VisitsTable extends javax.swing.JFrame
{

    private dataPkg.VisitsData vd;
    //
    private dataPkg.DbManager dbm;

    public VisitsTable() throws SQLException
    {
        initComponents();

        //
        dbm = new dataPkg.DbManager();

        vd = new dataPkg.VisitsData();
        vd.populateJTable(tblVisits, 0);
        vd.populateEventIDJComboBox(cmbEventID);
        vd.populatePatronIDJComboBox(cmbPatronID);
        vd.populateUsernameJComboBox(cmbUsername);

        //setting the jdc so it cant be typed into
        JTextFieldDateEditor dovEditor = (JTextFieldDateEditor) jdcDateOfVisit.getDateEditor();
        dovEditor.setEditable(false);

        populateDetails();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        rbgSearch = new javax.swing.ButtonGroup();
        lpBackground = new javax.swing.JLayeredPane();
        lblTblVisits = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        pnlNavigation = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVisits = new javax.swing.JTable();
        btnLast = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();
        pnlDetails = new javax.swing.JPanel();
        lblEventID = new javax.swing.JLabel();
        lblPatronID = new javax.swing.JLabel();
        cmbEventID = new javax.swing.JComboBox<>();
        lblEventID1 = new javax.swing.JLabel();
        txfVisitNo = new javax.swing.JTextField();
        cmbPatronID = new javax.swing.JComboBox<>();
        txfAmountSpent = new javax.swing.JTextField();
        lblAmountSpent = new javax.swing.JLabel();
        cmbUsername = new javax.swing.JComboBox<>();
        lblUsername = new javax.swing.JLabel();
        lblDateOfVisit = new javax.swing.JLabel();
        jdcDateOfVisit = new com.toedter.calendar.JDateChooser();
        cbManualEdit = new javax.swing.JCheckBox();
        pnlSearch = new javax.swing.JPanel();
        rbAll = new javax.swing.JRadioButton();
        rbVisitNo = new javax.swing.JRadioButton();
        rbPatronID = new javax.swing.JRadioButton();
        txfSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        rbEventID = new javax.swing.JRadioButton();
        rbUsername = new javax.swing.JRadioButton();
        pnlDataHandling = new javax.swing.JPanel();
        pnlSave = new javax.swing.JPanel();
        btnSaveNew = new javax.swing.JButton();
        btnSaveEdit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        pnlOptions = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblSaveOptions = new javax.swing.JLabel();
        lblDateOptions = new javax.swing.JLabel();
        lblDataHandling = new javax.swing.JLabel();
        lblDetails = new javax.swing.JLabel();
        lblSearchAndSort = new javax.swing.JLabel();
        lblNavigation = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Sunset Oasis Casino");
        setFocusable(false);
        setResizable(false);

        lpBackground.setBackground(new java.awt.Color(0, 0, 0));
        lpBackground.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblTblVisits.setFont(new java.awt.Font("HP Simplified", 1, 36)); // NOI18N
        lblTblVisits.setText("Visits Table");

        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.setToolTipText("Return to main menu");
        btnBack.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnBackActionPerformed(evt);
            }
        });

        pnlNavigation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblVisits.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        tblVisits.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "VisitNo", "EventID", "PatronID", "AmountSpent", "Username", "DateOfVisit"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tblVisits.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblVisits.getTableHeader().setReorderingAllowed(false);
        tblVisits.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                tblVisitsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblVisits);
        if (tblVisits.getColumnModel().getColumnCount() > 0)
        {
            tblVisits.getColumnModel().getColumn(0).setResizable(false);
            tblVisits.getColumnModel().getColumn(1).setResizable(false);
            tblVisits.getColumnModel().getColumn(2).setResizable(false);
            tblVisits.getColumnModel().getColumn(3).setResizable(false);
            tblVisits.getColumnModel().getColumn(4).setResizable(false);
            tblVisits.getColumnModel().getColumn(5).setResizable(false);
        }

        btnLast.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLast.setText("Last");
        btnLast.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnLastActionPerformed(evt);
            }
        });

        btnNext.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnNextActionPerformed(evt);
            }
        });

        btnPrevious.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPreviousActionPerformed(evt);
            }
        });

        btnFirst.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnFirst.setText("First");
        btnFirst.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnFirstActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlNavigationLayout = new javax.swing.GroupLayout(pnlNavigation);
        pnlNavigation.setLayout(pnlNavigationLayout);
        pnlNavigationLayout.setHorizontalGroup(
            pnlNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNavigationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 979, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNavigationLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177))
        );
        pnlNavigationLayout.setVerticalGroup(
            pnlNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNavigationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFirst)
                    .addComponent(btnPrevious)
                    .addComponent(btnNext)
                    .addComponent(btnLast))
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

        pnlDetails.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlDetails.setFont(new java.awt.Font("HP Simplified", 0, 24)); // NOI18N

        lblEventID.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        lblEventID.setText("EventID");

        lblPatronID.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        lblPatronID.setText("PatronID");

        cmbEventID.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        cmbEventID.setEnabled(false);

        lblEventID1.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        lblEventID1.setText("VisitNo");

        txfVisitNo.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        txfVisitNo.setEnabled(false);

        cmbPatronID.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        cmbPatronID.setEnabled(false);

        txfAmountSpent.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        txfAmountSpent.setEnabled(false);

        lblAmountSpent.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        lblAmountSpent.setText("Amount Spent");

        cmbUsername.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        cmbUsername.setEnabled(false);

        lblUsername.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        lblUsername.setText("Username");

        lblDateOfVisit.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        lblDateOfVisit.setText("Date of Visit");

        jdcDateOfVisit.setDateFormatString("yyyy/MM/dd");
        jdcDateOfVisit.setEnabled(false);
        jdcDateOfVisit.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N

        cbManualEdit.setText("Manual Edit");
        cbManualEdit.setEnabled(false);
        cbManualEdit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cbManualEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDetailsLayout = new javax.swing.GroupLayout(pnlDetails);
        pnlDetails.setLayout(pnlDetailsLayout);
        pnlDetailsLayout.setHorizontalGroup(
            pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblDateOfVisit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPatronID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblEventID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAmountSpent, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                    .addComponent(lblEventID1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbPatronID, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfAmountSpent, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txfVisitNo)
                    .addComponent(cmbUsername, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jdcDateOfVisit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                    .addGroup(pnlDetailsLayout.createSequentialGroup()
                        .addComponent(cbManualEdit)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cmbEventID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlDetailsLayout.setVerticalGroup(
            pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetailsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblEventID1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfVisitNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbManualEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPatronID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbPatronID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEventID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEventID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfAmountSpent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAmountSpent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdcDateOfVisit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDateOfVisit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pnlSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        rbgSearch.add(rbAll);
        rbAll.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        rbAll.setSelected(true);
        rbAll.setText("All");
        rbAll.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rbAllActionPerformed(evt);
            }
        });

        rbgSearch.add(rbVisitNo);
        rbVisitNo.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        rbVisitNo.setText("VisitNo");
        rbVisitNo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rbVisitNoActionPerformed(evt);
            }
        });

        rbgSearch.add(rbPatronID);
        rbPatronID.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        rbPatronID.setText("PatronID");
        rbPatronID.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rbPatronIDActionPerformed(evt);
            }
        });

        txfSearch.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        txfSearch.setToolTipText("Enter a value to search for");
        txfSearch.setEnabled(false);
        txfSearch.setPreferredSize(new java.awt.Dimension(68, 33));

        btnSearch.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.setEnabled(false);
        btnSearch.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSearchActionPerformed(evt);
            }
        });

        rbgSearch.add(rbEventID);
        rbEventID.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        rbEventID.setText("EventID");
        rbEventID.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rbEventIDActionPerformed(evt);
            }
        });

        rbgSearch.add(rbUsername);
        rbUsername.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        rbUsername.setText("Username");
        rbUsername.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rbUsernameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSearchLayout = new javax.swing.GroupLayout(pnlSearch);
        pnlSearch.setLayout(pnlSearchLayout);
        pnlSearchLayout.setHorizontalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlSearchLayout.createSequentialGroup()
                        .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(rbVisitNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbPatronID, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(rbEventID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(rbUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 31, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(pnlSearchLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(btnSearch)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlSearchLayout.setVerticalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(rbAll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbVisitNo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbPatronID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbEventID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbUsername)
                .addGap(17, 17, 17)
                .addComponent(txfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearch)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlDataHandling.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pnlSave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnSaveNew.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSaveNew.setText("Save New");
        btnSaveNew.setEnabled(false);
        btnSaveNew.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSaveNewActionPerformed(evt);
            }
        });

        btnSaveEdit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSaveEdit.setText("Save Edit");
        btnSaveEdit.setEnabled(false);
        btnSaveEdit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSaveEditActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.setEnabled(false);
        btnCancel.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSaveLayout = new javax.swing.GroupLayout(pnlSave);
        pnlSave.setLayout(pnlSaveLayout);
        pnlSaveLayout.setHorizontalGroup(
            pnlSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSaveLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(pnlSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnSaveNew, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSaveEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
        pnlSaveLayout.setVerticalGroup(
            pnlSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSaveLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnSaveNew)
                .addGap(18, 18, 18)
                .addComponent(btnSaveEdit)
                .addGap(18, 18, 18)
                .addComponent(btnCancel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlOptions.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAdd.setText("Add Record");
        btnAdd.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEdit.setText("Edit Record");
        btnEdit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDelete.setText("Delete Record");
        btnDelete.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlOptionsLayout = new javax.swing.GroupLayout(pnlOptions);
        pnlOptions.setLayout(pnlOptionsLayout);
        pnlOptionsLayout.setHorizontalGroup(
            pnlOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOptionsLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDelete)
                    .addGroup(pnlOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        pnlOptionsLayout.setVerticalGroup(
            pnlOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOptionsLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnAdd)
                .addGap(18, 18, 18)
                .addComponent(btnEdit)
                .addGap(18, 18, 18)
                .addComponent(btnDelete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblSaveOptions.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSaveOptions.setText("Save Options");

        lblDateOptions.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDateOptions.setText("Data Options");

        javax.swing.GroupLayout pnlDataHandlingLayout = new javax.swing.GroupLayout(pnlDataHandling);
        pnlDataHandling.setLayout(pnlDataHandlingLayout);
        pnlDataHandlingLayout.setHorizontalGroup(
            pnlDataHandlingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDataHandlingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDataHandlingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDataHandlingLayout.createSequentialGroup()
                        .addComponent(pnlOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDataHandlingLayout.createSequentialGroup()
                        .addComponent(lblDateOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblSaveOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDataHandlingLayout.setVerticalGroup(
            pnlDataHandlingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDataHandlingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDataHandlingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDateOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSaveOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDataHandlingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9))
        );

        lblDataHandling.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDataHandling.setText("Data Handling");

        lblDetails.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDetails.setText("Details");

        lblSearchAndSort.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSearchAndSort.setText("Search and Sort");

        lblNavigation.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNavigation.setText("Navigation");

        lpBackground.setLayer(lblTblVisits, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(btnBack, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(pnlNavigation, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(btnHelp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(pnlDetails, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(pnlSearch, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(pnlDataHandling, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(lblDataHandling, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(lblDetails, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(lblSearchAndSort, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(lblNavigation, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout lpBackgroundLayout = new javax.swing.GroupLayout(lpBackground);
        lpBackground.setLayout(lpBackgroundLayout);
        lpBackgroundLayout.setHorizontalGroup(
            lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lpBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lpBackgroundLayout.createSequentialGroup()
                        .addComponent(pnlDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lpBackgroundLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBack)
                                .addContainerGap())
                            .addGroup(lpBackgroundLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDataHandling, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pnlDataHandling, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(lpBackgroundLayout.createSequentialGroup()
                        .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lpBackgroundLayout.createSequentialGroup()
                                .addComponent(lblNavigation, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(284, 284, 284)
                                .addComponent(lblTblVisits)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(lpBackgroundLayout.createSequentialGroup()
                                .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(lpBackgroundLayout.createSequentialGroup()
                                        .addComponent(lblDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(311, 311, 311)
                                        .addComponent(lblSearchAndSort, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(pnlNavigation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 1, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        lpBackgroundLayout.setVerticalGroup(
            lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lpBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lpBackgroundLayout.createSequentialGroup()
                        .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTblVisits)
                            .addComponent(btnHelp))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE))
                    .addGroup(lpBackgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblNavigation, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlNavigation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataHandling, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSearchAndSort, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDetails, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(lpBackgroundLayout.createSequentialGroup()
                        .addComponent(pnlDataHandling, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(lpBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //populates the 
    private void populateDetails() //alright. //most of this should get auto done because of the name changes on the table. as in the txfs and lbls
    {

        txfVisitNo.setText("" + (int) tblVisits.getValueAt(tblVisits.getSelectedRow(), 0));
        cmbEventID.setSelectedItem((String) tblVisits.getValueAt(tblVisits.getSelectedRow(), 1));
        cmbPatronID.setSelectedItem((String) tblVisits.getValueAt(tblVisits.getSelectedRow(), 2)); //three lines of code for 3 rows in the table. The lines of code are dependant on how many rows are int he table
        txfAmountSpent.setText("" + (double) tblVisits.getValueAt(tblVisits.getSelectedRow(), 3)); //0, 1 and 2 are the column number from the row
        cmbUsername.setSelectedItem((String) tblVisits.getValueAt(tblVisits.getSelectedRow(), 4));

        jdcDateOfVisit.setDate((Date) (tblVisits.getValueAt(tblVisits.getSelectedRow(), 5)));

    }

    private void navigation(boolean enabled)
    {
        tblVisits.setEnabled(enabled);
        btnFirst.setEnabled(enabled);
        btnNext.setEnabled(enabled);
        btnPrevious.setEnabled(enabled);
        btnLast.setEnabled(enabled);
    }

    private void search(boolean enabled)
    {
        rbAll.setEnabled(enabled);
        rbVisitNo.setEnabled(enabled);
        rbPatronID.setEnabled(enabled);
        rbEventID.setEnabled(enabled);
        rbUsername.setEnabled(enabled);

        if (rbVisitNo.isSelected() || rbPatronID.isSelected() || rbEventID.isSelected() || rbUsername.isSelected())
        {
            btnSearch.setEnabled(enabled);
        }
    }

    private void options(boolean enabled)
    {
        btnAdd.setEnabled(enabled);
        btnEdit.setEnabled(enabled);
        btnDelete.setEnabled(enabled);
    }

    public void details(boolean enabled)
    {
        txfVisitNo.setEnabled(enabled);
        cmbEventID.setEnabled(enabled);
        cmbPatronID.setEnabled(enabled);
        txfAmountSpent.setEnabled(enabled);
        cmbUsername.setEnabled(enabled);
        jdcDateOfVisit.setEnabled(enabled);

    }

    private void searchPopulate()
    {
        vd.populateJTable(tblVisits, 0);

        if (tblVisits.getRowCount() == 0) //if there are no rows then we clear out all the stuff in the details panel
        {

            txfVisitNo.setText("");
            cmbEventID.setSelectedItem("");
            cmbPatronID.setSelectedItem("");
            txfAmountSpent.setText("");
            cmbUsername.setSelectedItem("");
            jdcDateOfVisit.setDate(null);

            JOptionPane.showMessageDialog(null, "Sorry, no Visits found", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
            txfSearch.setText("");
            txfSearch.requestFocus();
        } else
        {
            populateDetails();
        }
    }


    private void rbVisitNoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rbVisitNoActionPerformed
    {//GEN-HEADEREND:event_rbVisitNoActionPerformed
        txfSearch.setEnabled(true); //activate both buttons 
        btnSearch.setEnabled(true); //active both buttons
        txfSearch.setText("");      //clear the text box
        txfSearch.requestFocus();   //request focus so they can type in here            
    }//GEN-LAST:event_rbVisitNoActionPerformed

    private void rbPatronIDActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rbPatronIDActionPerformed
    {//GEN-HEADEREND:event_rbPatronIDActionPerformed
        txfSearch.setEnabled(true); //same as the previous button. The one right above this man
        btnSearch.setEnabled(true);
        txfSearch.setText("");
        txfSearch.requestFocus();
    }//GEN-LAST:event_rbPatronIDActionPerformed


    private void rbAllActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rbAllActionPerformed
    {//GEN-HEADEREND:event_rbAllActionPerformed
        try                                     //this method just pulls up all the employees again. its when we're done searching and just want the whole table again
        {
            txfSearch.setEnabled(false);        //disabling the other buttons
            btnSearch.setEnabled(false);        //diabling the other buttons
            txfSearch.setText("");              //clearing out the textbox
            vd.getAllVisits();                  //calling the getAllUsers method. shows all the users
            vd.populateJTable(tblVisits, 0);
            populateDetails();
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_rbAllActionPerformed

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

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSearchActionPerformed
    {//GEN-HEADEREND:event_btnSearchActionPerformed
        //dont use seperate if elses. inefficient
        try //they could potetnially have errors with connecting to the database. So we use a trycatch
        {
            //check for visitNo | must be a positive integer 
            if (rbVisitNo.isSelected() && Validation.vIntegerPositive(txfSearch.getText().trim(), ""))
            {
                vd.getAllVisitsVisitNo(Integer.parseInt(txfSearch.getText().trim())); //calling the method in EmployeesData called getAllEmployees, the one with the string as a parameter. That is made for the EmployeePIN
                searchPopulate();
            } else
            {   //check for patronID | AZ09range - must be 6 chars long and must only be values from A - Z | must start with P 
                if (rbPatronID.isSelected() && Validation.v2IntialCharacters(1, "P", txfSearch.getText().trim()) && Validation.vStringAZ09range(txfSearch.getText().trim(), "", "", "", 6))
                {
                    vd.getAllVisitsPatronID((txfSearch.getText().trim())); //calling the method in EmployeesData called getAllEmployees, the one with the string as a parameter. That is made for the EmployeePIN
                    searchPopulate();
                } else
                {   //check for eventID | AZ09range - must be 6 chars long and must only be values from A - Z | must start with E
                    if (rbEventID.isSelected() && Validation.v2IntialCharacters(1, "E", txfSearch.getText().trim()) && Validation.vStringAZ09range(txfSearch.getText().trim(), "", "", "", 6))
                    {
                        vd.getAllVisitsEventID((txfSearch.getText().trim())); //calling the method in EmployeesData called getAllEmployees, the one with the string as a parameter. That is made for the EmployeePIN
                        searchPopulate();
                    } else
                    {   //check for username | AZ09range - must be 5 chars long and must only be values from A - Z | must start with U
                        if (rbUsername.isSelected() && Validation.v2IntialCharacters(1, "U", txfSearch.getText().trim()) && Validation.vStringAZ09range(txfSearch.getText().trim(), "", "", "", 5))
                        {
                            vd.getAllVisitsUsername((txfSearch.getText().trim())); //calling the method in EmployeesData called getAllEmployees, the one with the string as a parameter. That is made for the EmployeePIN
                            searchPopulate();
                        } else
                        {
                            txfSearch.setText("");
                            txfSearch.requestFocus();
                        }
                    }
                }
            }

        } catch (Exception e)
        {
            System.out.println(e.toString());
        }                                                                                       //THIS METHOD IS ALRIGHT

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDeleteActionPerformed
    {//GEN-HEADEREND:event_btnDeleteActionPerformed

        try
        {
            int visitNo = Integer.parseInt(txfVisitNo.getText().trim());

            int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete event " + visitNo, "Warning", JOptionPane.YES_NO_OPTION);
            if (dialogResult == 0)
            {
                vd.deleteVisit(visitNo);
                vd.populateJTable(tblVisits, 0);
                populateDetails();
            }
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }                                                                                               //THIS METHOD IS ALRIGHT

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblVisitsMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tblVisitsMouseClicked
    {//GEN-HEADEREND:event_tblVisitsMouseClicked
        if (tblVisits.isEnabled())
        {
            populateDetails();
        }
    }//GEN-LAST:event_tblVisitsMouseClicked

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnFirstActionPerformed
    {//GEN-HEADEREND:event_btnFirstActionPerformed
        tblVisits.setRowSelectionInterval(0, 0);  //select the row
        tblVisits.scrollRectToVisible(tblVisits.getCellRect(0, 0, true)); //move the vertical scroll bar so we can actually see the first row
        populateDetails(); //calling the method to get them details
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnLastActionPerformed
    {//GEN-HEADEREND:event_btnLastActionPerformed
        tblVisits.setRowSelectionInterval(tblVisits.getRowCount() - 1, tblVisits.getRowCount() - 1);  //select the row
        tblVisits.scrollRectToVisible(tblVisits.getCellRect(tblVisits.getRowCount() - 1, 0, true)); //move the vertical scroll
        populateDetails();
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPreviousActionPerformed
    {//GEN-HEADEREND:event_btnPreviousActionPerformed
        if (tblVisits.getSelectedRow() - 1 > -1)
        {
            tblVisits.setRowSelectionInterval(tblVisits.getSelectedRow() - 1, tblVisits.getSelectedRow() - 1); //select the row
            tblVisits.scrollRectToVisible(tblVisits.getCellRect(tblVisits.getSelectedRow() - 1, 0, true)); //move the vertical scroll
            populateDetails();
        } else
        {
            JOptionPane.showMessageDialog(null, "You are at the FIRST Visit", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnNextActionPerformed
    {//GEN-HEADEREND:event_btnNextActionPerformed
        if (tblVisits.getSelectedRow() + 1 < tblVisits.getRowCount()) //if statement is to check if we at the last row or not
        {
            tblVisits.setRowSelectionInterval(tblVisits.getSelectedRow() + 1, tblVisits.getSelectedRow() + 1); //select the row
            tblVisits.scrollRectToVisible(tblVisits.getCellRect(tblVisits.getSelectedRow() + 1, 0, true)); //move the vertical scroll
            populateDetails();
        } else
        {
            JOptionPane.showMessageDialog(null, "You are at the LAST Visit", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);        //ALRIGHT
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAddActionPerformed
    {//GEN-HEADEREND:event_btnAddActionPerformed
        try
        {
            //the ManualEdit checkbox should be ENABLED
            cbManualEdit.setEnabled(true);
            //the ManualEdit checkbox should be UNTICKED
            cbManualEdit.setSelected(false);

            navigation(false); //if we tryna add we have to disable everything else. Only things we can do are save and cancel
            search(false);     //This is a method that deactivates and reactivated depending on the boolean we give it. these 3 are methods we can disable. the methods are what disable and reenable the components
            options(false);
            details(true);

            btnSaveNew.setEnabled(true); //we can save things. 
            btnCancel.setEnabled(true); //we can cancel

            txfVisitNo.setEnabled(false);
            //AUTOSETTING THE NEW PK
            ResultSet newPKrs = dbm.query("SELECT Nz(Max(VISITNO), 0) + 1 FROM TBLVISITS");

            int newPK = 0;
            if (newPKrs.next())
            {
                newPK = newPKrs.getInt(1);
            }
            txfVisitNo.setText(newPK + "");
            //NEW PK HAS BEEN SET

            //SETTING FIELDS TO NULL or ""            
            txfAmountSpent.setText("");
            //DateOfVisit is today's date bcs its likely the visit's being logged on the day it happened
            jdcDateOfVisit.setDate(new Date());

            //SETTING the EventID combo box as the first EventID
            ResultSet EventIDPKrs = dbm.query("SELECT EVENTID FROM TBLEVENTS");
            String firstEventID = "";
            if (EventIDPKrs.next())
            {
                firstEventID = EventIDPKrs.getString("EVENTID");
            }
            cmbEventID.setSelectedItem(firstEventID);

            //SETTING the PatronID combo box as the first PatronID
            ResultSet patronIDPKrs = dbm.query("SELECT PATRONID FROM TBLPATRONS");
            String firstPatronID = "";
            if (patronIDPKrs.next())
            {
                firstPatronID = patronIDPKrs.getString("PATRONID");
            }
            cmbPatronID.setSelectedItem(firstPatronID);

            //SETTING the PatronID combo box as the first PatronID
            ResultSet usernamePKrs = dbm.query("SELECT USERNAME FROM TBLUSERS");
            String firstUsername = "";
            if (usernamePKrs.next())
            {
                firstUsername = usernamePKrs.getString("USERNAME");
            }
            cmbUsername.setSelectedItem(firstUsername);

            //AmountSpent is the only one we really need to focus on, everythign else cant be set into focus
            txfAmountSpent.requestFocus();
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEditActionPerformed
    {//GEN-HEADEREND:event_btnEditActionPerformed
        navigation(false);
        search(false);
        options(false);

        details(true);

        txfVisitNo.setEnabled(false); //this cant be edited

        btnSaveEdit.setEnabled(true);
        btnCancel.setEnabled(true);

        cmbEventID.requestFocus(); //draw attention to firstName, can thereafter change the other details excluding EmployeePIN       //ALRIGHT
    }//GEN-LAST:event_btnEditActionPerformed

    private void rbEventIDActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rbEventIDActionPerformed
    {//GEN-HEADEREND:event_rbEventIDActionPerformed
        txfSearch.setEnabled(true); //same as the previous button. The one right above this man
        btnSearch.setEnabled(true);
        txfSearch.setText("");
        txfSearch.requestFocus();
    }//GEN-LAST:event_rbEventIDActionPerformed

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnHelpActionPerformed
    {//GEN-HEADEREND:event_btnHelpActionPerformed
        try
        {
            new HelpFrame("VisitsTable.txt").setVisible(true);
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btnHelpActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelActionPerformed
    {//GEN-HEADEREND:event_btnCancelActionPerformed
        //the ManualEdit checkbox should be DISABLED
        cbManualEdit.setEnabled(false);
        //the ManualEdit checkbox should be UNTICKED
        cbManualEdit.setSelected(false);

        navigation(true);
        search(true);
        options(true);

        details(false);

        btnSaveNew.setEnabled(false);
        btnCancel.setEnabled(false);
        btnSaveEdit.setEnabled(false);

        populateDetails();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSaveNewActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSaveNewActionPerformed
    {//GEN-HEADEREND:event_btnSaveNewActionPerformed
        try
        {
            //the ManualEdit checkbox should be DISABLED
            cbManualEdit.setEnabled(false);
            //the ManualEdit checkbox should be UNTICKED
            cbManualEdit.setSelected(false);

            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

            //SETTING VARIABELS
            String newVisitNo = txfVisitNo.getText().trim();
            String newPatronID = (String) cmbPatronID.getSelectedItem();
            String newEventID = (String) cmbEventID.getSelectedItem();
            String newAmountSpent = txfAmountSpent.getText().trim();
            String newUsername = (String) cmbUsername.getSelectedItem();

            //NewDateOfVisit as a Date
            Date newDateOfVisitRaw = (Date) jdcDateOfVisit.getDate();
            //NewDateOfVisit as a String
            String newDateOfVisit = df.format(newDateOfVisitRaw);

            //Date max for validation
            Calendar calendar = Calendar.getInstance();

            //Set the calendar time to the current date
            calendar.setTime(new Date());

            //Set the hour, minute, second, and millisecond fields to 23:59:00.000
            calendar.set(Calendar.HOUR_OF_DAY, 23);
            calendar.set(Calendar.MINUTE, 59);
            calendar.set(Calendar.SECOND, 0);
            calendar.set(Calendar.MILLISECOND, 0);

            //Get the Date object representing today at 23:59
            Date dateAtMidnight = calendar.getTime();

            //checking visitNo | check that its not a dupe | check that its the right next one, ex. if the previous was 18 the one the user enters cant be 20
            if (Validation.vVisitNoCheck(newVisitNo))
            {   //checking amountSpent | it should be a positive double
                if (Validation.vDoublePositive(newAmountSpent, ""))
                {   //checking dateOfVisit | it must be before the 
                    if (Validation.vDateMax(newDateOfVisitRaw, dateAtMidnight))
                    {   //checking the amountSpent | must be between 00.01 and 1000000
                        if (Validation.vDoubleRange(newAmountSpent, "", "", 00.01, 1000000))
                        {
                            vd.addVisit(Integer.parseInt(newVisitNo), newEventID, newPatronID, Double.parseDouble(txfAmountSpent.getText().trim()), newUsername, newDateOfVisit);
                            vd.populateJTable(tblVisits, vd.getVisitPosition(Integer.parseInt(newVisitNo)));
                            populateDetails();

                            navigation(true);
                            search(true);
                            options(true);

                            details(false);

                            btnSaveNew.setEnabled(false);
                            btnCancel.setEnabled(false);
                        } else
                        {
                            JOptionPane.showMessageDialog(null, "Entry in Amount Spent field is invalid", "Error", JOptionPane.ERROR_MESSAGE);
                            txfAmountSpent.setText("");
                            txfAmountSpent.requestFocus();
                        }
                    } else
                    {
                        JOptionPane.showMessageDialog(null, "Entry in Date of Visit field is invalid", "Error", JOptionPane.ERROR_MESSAGE);
                        jdcDateOfVisit.setDate(new Date());

                    }
                } else
                {
                    JOptionPane.showMessageDialog(null, "Entry in Amount Spent field is invalid", "Error", JOptionPane.ERROR_MESSAGE);
                    txfAmountSpent.setText("");
                    txfAmountSpent.requestFocus();
                }
            } else
            {
                JOptionPane.showMessageDialog(null, "Entry in VisitNo field is invalid", "Error", JOptionPane.ERROR_MESSAGE);
                cbManualEdit.setSelected(true);
                txfVisitNo.setEnabled(true);
                txfVisitNo.setText("");
                txfVisitNo.requestFocus();
            }
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnSaveNewActionPerformed

    private void btnSaveEditActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSaveEditActionPerformed
    {//GEN-HEADEREND:event_btnSaveEditActionPerformed
        try
        {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

            //SETTING VARIABELS
            String newVisitNo = txfVisitNo.getText().trim();
            String newPatronID = (String) cmbPatronID.getSelectedItem();
            String newEventID = (String) cmbEventID.getSelectedItem();
            String newAmountSpent = txfAmountSpent.getText().trim();
            String newUsername = (String) cmbUsername.getSelectedItem();

            //NewDateOfVisit as a Date
            Date newDateOfVisitRaw = (Date) jdcDateOfVisit.getDate();
            //NewDateOfVisit as a String
            String newDateOfVisit = df.format(newDateOfVisitRaw);

            //Date max for validation
            Calendar calendar = Calendar.getInstance();

            //Set the calendar time to the current date
            calendar.setTime(new Date());

            //Set the hour, minute, second, and millisecond fields to 23:59:00.000
            calendar.set(Calendar.HOUR_OF_DAY, 23);
            calendar.set(Calendar.MINUTE, 59);
            calendar.set(Calendar.SECOND, 0);
            calendar.set(Calendar.MILLISECOND, 0);

            //Get the Date object representing today at 23:59
            Date dateAtMidnight = calendar.getTime();
            //Validation.vDoubleRange(newAmountSpent, "", "", 0, 1000000)
            //check for AmountSpent | should be a postive double

            if (Validation.vDoubleRange(newAmountSpent, "", "", 0, 1000000) && Validation.vDoublePositive(newAmountSpent, ""))
            {
                if (Validation.vDateMax(newDateOfVisitRaw, dateAtMidnight))
                {
                    vd.editVisit(Integer.parseInt(newVisitNo), newEventID, newPatronID, Double.parseDouble(newAmountSpent), newUsername, newDateOfVisit);
                    vd.populateJTable(tblVisits, vd.getVisitPosition(Integer.parseInt(newVisitNo)));
                    populateDetails();

                    navigation(true);
                    search(true);
                    options(true);

                    details(false);

                    btnSaveEdit.setEnabled(false);
                    btnCancel.setEnabled(false);
                } else
                {
                    JOptionPane.showMessageDialog(null, "Entry in Date of Visit field is invalid", "Error", JOptionPane.ERROR_MESSAGE);
                    jdcDateOfVisit.setDate(new Date());
                }

            } else
            {
                JOptionPane.showMessageDialog(null, "Entry in Amount Spent field is invalid", "Error", JOptionPane.ERROR_MESSAGE);
                txfAmountSpent.setText("");
                txfAmountSpent.requestFocus();
            }

        } catch (Exception e)

        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnSaveEditActionPerformed

    private void rbUsernameActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rbUsernameActionPerformed
    {//GEN-HEADEREND:event_rbUsernameActionPerformed
        txfSearch.setEnabled(true); //same as the previous button. The one right above this man
        btnSearch.setEnabled(true);
        txfSearch.setText("");
        txfSearch.requestFocus();
    }//GEN-LAST:event_rbUsernameActionPerformed

    private void cbManualEditActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cbManualEditActionPerformed
    {//GEN-HEADEREND:event_cbManualEditActionPerformed
        if (cbManualEdit.isSelected())
        {
            txfVisitNo.setEnabled(true);
        } else
        {
            txfVisitNo.setEnabled(false);
        }
    }//GEN-LAST:event_cbManualEditActionPerformed

    public static void main(String args[]) throws SQLException
    {
        new VisitsTable().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSaveEdit;
    private javax.swing.JButton btnSaveNew;
    private javax.swing.JButton btnSearch;
    private javax.swing.JCheckBox cbManualEdit;
    private javax.swing.JComboBox<String> cmbEventID;
    private javax.swing.JComboBox<String> cmbPatronID;
    private javax.swing.JComboBox<String> cmbUsername;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdcDateOfVisit;
    private javax.swing.JLabel lblAmountSpent;
    private javax.swing.JLabel lblDataHandling;
    private javax.swing.JLabel lblDateOfVisit;
    private javax.swing.JLabel lblDateOptions;
    private javax.swing.JLabel lblDetails;
    private javax.swing.JLabel lblEventID;
    private javax.swing.JLabel lblEventID1;
    private javax.swing.JLabel lblNavigation;
    private javax.swing.JLabel lblPatronID;
    private javax.swing.JLabel lblSaveOptions;
    private javax.swing.JLabel lblSearchAndSort;
    private javax.swing.JLabel lblTblVisits;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLayeredPane lpBackground;
    private javax.swing.JPanel pnlDataHandling;
    private javax.swing.JPanel pnlDetails;
    private javax.swing.JPanel pnlNavigation;
    private javax.swing.JPanel pnlOptions;
    private javax.swing.JPanel pnlSave;
    private javax.swing.JPanel pnlSearch;
    private javax.swing.JRadioButton rbAll;
    private javax.swing.JRadioButton rbEventID;
    private javax.swing.JRadioButton rbPatronID;
    private javax.swing.JRadioButton rbUsername;
    private javax.swing.JRadioButton rbVisitNo;
    private javax.swing.ButtonGroup rbgSearch;
    private javax.swing.JTable tblVisits;
    private javax.swing.JTextField txfAmountSpent;
    private javax.swing.JTextField txfSearch;
    private javax.swing.JTextField txfVisitNo;
    // End of variables declaration//GEN-END:variables
}
