package guiPkg;

import com.toedter.calendar.JTextFieldDateEditor;
import dataPkg.DbManager;
import dataPkg.Validation;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class PatronsTable extends javax.swing.JFrame
{

    private dataPkg.PatronsData pd;
    private dataPkg.DbManager dbm;

    public PatronsTable() throws SQLException
    {
        initComponents();

        dbm = new DbManager();

        pd = new dataPkg.PatronsData();
        pd.populateJTable(tblPatrons, 0);
        pd.populateJComboBoxCardLevel(cmbCardLevel);
        pd.populateJComboBoxGender(cmbGender);

        //
        JTextFieldDateEditor dobEditor = (JTextFieldDateEditor) jdcDateOfBirth.getDateEditor();
        dobEditor.setEditable(false);

        //
        JTextFieldDateEditor joinDateEditor = (JTextFieldDateEditor) jdcJoinDate.getDateEditor();
        joinDateEditor.setEditable(false);

        //
//        jdcDateOfBirth.setDate(new Date());
//        jdcJoinDate.setDate(new Date());        
        //
        populateDetails();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        rbgSearch = new javax.swing.ButtonGroup();
        lpBackground = new javax.swing.JLayeredPane();
        lblUsers = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        pnlNavigation = new javax.swing.JPanel();
        btnFirst = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatrons = new javax.swing.JTable();
        pnlSearch = new javax.swing.JPanel();
        rbAll = new javax.swing.JRadioButton();
        rbPatronID = new javax.swing.JRadioButton();
        rbFirstName = new javax.swing.JRadioButton();
        txfSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        rbCardLevel = new javax.swing.JRadioButton();
        rbGender = new javax.swing.JRadioButton();
        pnlDetails = new javax.swing.JPanel();
        lblFirstName = new javax.swing.JLabel();
        lblSurname = new javax.swing.JLabel();
        lblCardLevel = new javax.swing.JLabel();
        txfFirstName = new javax.swing.JTextField();
        txfSurname = new javax.swing.JTextField();
        cmbCardLevel = new javax.swing.JComboBox<>();
        lblGender = new javax.swing.JLabel();
        lblDateOfBirth = new javax.swing.JLabel();
        lblHomeAddress = new javax.swing.JLabel();
        txfHomeAddress = new javax.swing.JTextField();
        lblEmailAddress = new javax.swing.JLabel();
        txfEmailAddress = new javax.swing.JTextField();
        lblJoinDate = new javax.swing.JLabel();
        lblPatronID = new javax.swing.JLabel();
        txfPatronID = new javax.swing.JTextField();
        jdcJoinDate = new com.toedter.calendar.JDateChooser();
        jdcDateOfBirth = new com.toedter.calendar.JDateChooser();
        cmbGender = new javax.swing.JComboBox<>();
        cbManualEdit = new javax.swing.JCheckBox();
        btnHelp = new javax.swing.JButton();
        pnlDataHandling = new javax.swing.JPanel();
        pnlSave = new javax.swing.JPanel();
        btnSaveNew = new javax.swing.JButton();
        btnSaveEdit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        pnlOptions = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblDataOptions = new javax.swing.JLabel();
        lblSaveOptions = new javax.swing.JLabel();
        lblDetails = new javax.swing.JLabel();
        lblDetails1 = new javax.swing.JLabel();
        lblDateHandling = new javax.swing.JLabel();
        lblNavigation = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Sunset Oasis Casino ");
        setFocusable(false);
        setResizable(false);

        lpBackground.setBackground(new java.awt.Color(0, 0, 0));
        lpBackground.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblUsers.setFont(new java.awt.Font("HP Simplified", 1, 36)); // NOI18N
        lblUsers.setText("Patrons Table");

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

        btnFirst.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnFirst.setText("First");
        btnFirst.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnFirstActionPerformed(evt);
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

        btnNext.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLast.setText("Last");
        btnLast.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnLastActionPerformed(evt);
            }
        });

        tblPatrons.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        tblPatrons.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "PatronID", "FirstName", "Surname", "Gender", "DateOfBirth", "HomeAddress", "EmailAddress", "CardLevel", "JoinDate"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false, false, false
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
        tblPatrons.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblPatrons.getTableHeader().setReorderingAllowed(false);
        tblPatrons.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                tblPatronsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPatrons);
        if (tblPatrons.getColumnModel().getColumnCount() > 0)
        {
            tblPatrons.getColumnModel().getColumn(0).setResizable(false);
            tblPatrons.getColumnModel().getColumn(1).setResizable(false);
            tblPatrons.getColumnModel().getColumn(2).setResizable(false);
            tblPatrons.getColumnModel().getColumn(3).setResizable(false);
            tblPatrons.getColumnModel().getColumn(4).setResizable(false);
            tblPatrons.getColumnModel().getColumn(5).setResizable(false);
            tblPatrons.getColumnModel().getColumn(6).setResizable(false);
            tblPatrons.getColumnModel().getColumn(7).setResizable(false);
            tblPatrons.getColumnModel().getColumn(8).setResizable(false);
        }

        javax.swing.GroupLayout pnlNavigationLayout = new javax.swing.GroupLayout(pnlNavigation);
        pnlNavigation.setLayout(pnlNavigationLayout);
        pnlNavigationLayout.setHorizontalGroup(
            pnlNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNavigationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(pnlNavigationLayout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlNavigationLayout.setVerticalGroup(
            pnlNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNavigationLayout.createSequentialGroup()
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

        rbgSearch.add(rbPatronID);
        rbPatronID.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        rbPatronID.setText("Patron ID");
        rbPatronID.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rbPatronIDActionPerformed(evt);
            }
        });

        rbgSearch.add(rbFirstName);
        rbFirstName.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        rbFirstName.setText("First Name");
        rbFirstName.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rbFirstNameActionPerformed(evt);
            }
        });

        txfSearch.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
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

        rbgSearch.add(rbCardLevel);
        rbCardLevel.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        rbCardLevel.setText("Card Level");
        rbCardLevel.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rbCardLevelActionPerformed(evt);
            }
        });

        rbgSearch.add(rbGender);
        rbGender.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        rbGender.setText("Gender");
        rbGender.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rbGenderActionPerformed(evt);
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
                        .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rbAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rbPatronID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rbFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(rbCardLevel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rbGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(pnlSearchLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(btnSearch)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        pnlSearchLayout.setVerticalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbAll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbPatronID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbFirstName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbCardLevel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbGender)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlDetails.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblFirstName.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        lblFirstName.setText("First Name");

        lblSurname.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        lblSurname.setText("Surname");

        lblCardLevel.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        lblCardLevel.setText("Card Level");

        txfFirstName.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        txfFirstName.setEnabled(false);

        txfSurname.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        txfSurname.setEnabled(false);

        cmbCardLevel.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        cmbCardLevel.setEnabled(false);

        lblGender.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        lblGender.setText("Gender");

        lblDateOfBirth.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        lblDateOfBirth.setText("Date of Birth");

        lblHomeAddress.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        lblHomeAddress.setText("Home Address");

        txfHomeAddress.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        txfHomeAddress.setEnabled(false);

        lblEmailAddress.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        lblEmailAddress.setText("Email Address");

        txfEmailAddress.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        txfEmailAddress.setEnabled(false);

        lblJoinDate.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        lblJoinDate.setText("Join Date");

        lblPatronID.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        lblPatronID.setText("PatronID");

        txfPatronID.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        txfPatronID.setEnabled(false);

        jdcJoinDate.setEnabled(false);
        jdcJoinDate.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N

        jdcDateOfBirth.setEnabled(false);
        jdcDateOfBirth.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        jdcDateOfBirth.setMaxSelectableDate(new Date());

        cmbGender.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        cmbGender.setEnabled(false);

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
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblGender, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPatronID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFirstName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSurname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDateOfBirth, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                .addGap(13, 13, 13)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDetailsLayout.createSequentialGroup()
                        .addComponent(cbManualEdit)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlDetailsLayout.createSequentialGroup()
                        .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cmbGender, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txfSurname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfFirstName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfPatronID, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdcDateOfBirth, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDetailsLayout.createSequentialGroup()
                                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblCardLevel, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                    .addComponent(lblJoinDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbCardLevel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jdcJoinDate, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                            .addGroup(pnlDetailsLayout.createSequentialGroup()
                                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblEmailAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblHomeAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txfHomeAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txfEmailAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(6, 6, 6))))
        );
        pnlDetailsLayout.setVerticalGroup(
            pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetailsLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlDetailsLayout.createSequentialGroup()
                        .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txfPatronID)
                            .addComponent(lblPatronID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addComponent(cbManualEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txfFirstName)
                            .addComponent(lblFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSurname)
                            .addComponent(txfSurname)))
                    .addGroup(pnlDetailsLayout.createSequentialGroup()
                        .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txfHomeAddress)
                            .addComponent(lblHomeAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txfEmailAddress)
                            .addComponent(lblEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbCardLevel)
                            .addComponent(lblCardLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGender)
                    .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jdcJoinDate, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addComponent(lblJoinDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jdcDateOfBirth, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(lblDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        pnlDataHandling.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pnlSave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnSaveNew.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnSaveNew.setText("Save New");
        btnSaveNew.setEnabled(false);
        btnSaveNew.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSaveNewActionPerformed(evt);
            }
        });

        btnSaveEdit.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnSaveEdit.setText("Save Edit");
        btnSaveEdit.setEnabled(false);
        btnSaveEdit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSaveEditActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
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
            .addGroup(pnlSaveLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSaveNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSaveEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        pnlSaveLayout.setVerticalGroup(
            pnlSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSaveLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSaveNew)
                .addGap(18, 18, 18)
                .addComponent(btnSaveEdit)
                .addGap(18, 18, 18)
                .addComponent(btnCancel)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pnlOptions.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnAdd.setText("Add Record");
        btnAdd.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnEdit.setText("Edit Record");
        btnEdit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
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
                .addGroup(pnlOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnEdit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        pnlOptionsLayout.setVerticalGroup(
            pnlOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAdd)
                .addGap(18, 18, 18)
                .addComponent(btnEdit)
                .addGap(18, 18, 18)
                .addComponent(btnDelete)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        lblDataOptions.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDataOptions.setText("Data Options");

        lblSaveOptions.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSaveOptions.setText("Save Options");

        javax.swing.GroupLayout pnlDataHandlingLayout = new javax.swing.GroupLayout(pnlDataHandling);
        pnlDataHandling.setLayout(pnlDataHandlingLayout);
        pnlDataHandlingLayout.setHorizontalGroup(
            pnlDataHandlingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDataHandlingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDataHandlingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDataOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDataHandlingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSaveOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDataHandlingLayout.setVerticalGroup(
            pnlDataHandlingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDataHandlingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDataHandlingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSaveOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDataHandlingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        lblDetails.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDetails.setText("Details");

        lblDetails1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDetails1.setText("Search and Sort");

        lblDateHandling.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDateHandling.setText("Data Handling");

        lblNavigation.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNavigation.setText("Navigation");

        lpBackground.setLayer(lblUsers, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(btnBack, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(pnlNavigation, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(pnlSearch, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(pnlDetails, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(btnHelp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(pnlDataHandling, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(lblDetails, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(lblDetails1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(lblDateHandling, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(lblNavigation, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout lpBackgroundLayout = new javax.swing.GroupLayout(lpBackground);
        lpBackground.setLayout(lpBackgroundLayout);
        lpBackgroundLayout.setHorizontalGroup(
            lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lpBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlNavigation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(lpBackgroundLayout.createSequentialGroup()
                        .addComponent(lblNavigation, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(375, 375, 375)
                        .addComponent(lblUsers)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHelp))
                    .addGroup(lpBackgroundLayout.createSequentialGroup()
                        .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(lpBackgroundLayout.createSequentialGroup()
                                .addComponent(lblDetails1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 31, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lpBackgroundLayout.createSequentialGroup()
                                .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDateHandling, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pnlDataHandling, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11))
                            .addComponent(btnBack, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        lpBackgroundLayout.setVerticalGroup(
            lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lpBackgroundLayout.createSequentialGroup()
                .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lpBackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblNavigation, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(lpBackgroundLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsers)
                            .addComponent(btnHelp))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlNavigation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDetails1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDateHandling, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(lpBackgroundLayout.createSequentialGroup()
                        .addComponent(pnlDataHandling, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack))
                    .addComponent(pnlDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    //populates the table
    private void populateDetails() //alright
    {

        txfPatronID.setText((String) tblPatrons.getValueAt(tblPatrons.getSelectedRow(), 0));
        txfFirstName.setText((String) tblPatrons.getValueAt(tblPatrons.getSelectedRow(), 1));       //three lines of code for 3 rows in the table. The lines of code are dependant on how many rows are int he table
        txfSurname.setText((String) tblPatrons.getValueAt(tblPatrons.getSelectedRow(), 2));         //0, 1 and 2 are the column number from the row

        cmbGender.setSelectedItem((String) tblPatrons.getValueAt(tblPatrons.getSelectedRow(), 3));

        jdcDateOfBirth.setDate(((Date) tblPatrons.getValueAt(tblPatrons.getSelectedRow(), 4)));

        txfHomeAddress.setText((String) tblPatrons.getValueAt(tblPatrons.getSelectedRow(), 5));
        txfEmailAddress.setText((String) tblPatrons.getValueAt(tblPatrons.getSelectedRow(), 6));

        cmbCardLevel.setSelectedItem(tblPatrons.getValueAt(tblPatrons.getSelectedRow(), 7));        //diff line for setting the combo box

        jdcJoinDate.setDate(((Date) tblPatrons.getValueAt(tblPatrons.getSelectedRow(), 8)));

    }

    //the following method handle component enabling and disabling for the navigation section
    private void navigation(boolean enabled) //dealing with the navigation section
    {
        tblPatrons.setEnabled(enabled);
        btnFirst.setEnabled(enabled);
        btnNext.setEnabled(enabled);
        btnPrevious.setEnabled(enabled);
        btnLast.setEnabled(enabled);
    }

    //the following method handle component enabling and disabling for the search section
    private void search(boolean enabled)
    {
        rbAll.setEnabled(enabled);
        rbPatronID.setEnabled(enabled);
        rbFirstName.setEnabled(enabled);
        rbCardLevel.setEnabled(enabled);
        rbGender.setEnabled(enabled);
        if (rbPatronID.isSelected() || rbFirstName.isSelected() || rbCardLevel.isSelected() || rbGender.isSelected())
        {
            btnSearch.setEnabled(enabled);
        }
    }

    //the following method handle component enabling and disabling for the options section
    private void options(boolean enabled)
    {
        btnAdd.setEnabled(enabled);
        btnEdit.setEnabled(enabled);
        btnDelete.setEnabled(enabled);
    }

    //the following method handle component enabling and disabling for the details section
    public void details(boolean enabled)
    {
        txfPatronID.setEnabled(enabled);
        txfFirstName.setEnabled(enabled);
        txfSurname.setEnabled(enabled);
        jdcDateOfBirth.setEnabled(enabled);
        cmbGender.setEnabled(enabled);
        txfHomeAddress.setEnabled(enabled);
        txfEmailAddress.setEnabled(enabled);
        jdcJoinDate.setEnabled(enabled);

        cmbCardLevel.setEnabled(enabled); //for the combo box

    }

    //after searching the table must be populated again, its its blank then we set everything to blank
    private void searchPopulate()
    {
        pd.populateJTable(tblPatrons, 0);

        if (tblPatrons.getRowCount() == 0) //if there are no rows then we clear out all the stuff in the details panel
        {

            txfPatronID.setText("");
            txfFirstName.setText("");
            txfSurname.setText("");
            jdcDateOfBirth.setDate(null);
            cmbGender.setSelectedItem("");
            txfHomeAddress.setText("");
            txfEmailAddress.setText("");
            jdcJoinDate.setDate(null);

            JOptionPane.showMessageDialog(null, "Sorry, no Patrons found", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
        } else
        {
            populateDetails();
        }
    }

    //the following methods handle component enabling and disabling when the corresponding rbs
    private void rbPatronIDActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rbPatronIDActionPerformed
    {//GEN-HEADEREND:event_rbPatronIDActionPerformed
        txfSearch.setEnabled(true);     //activate both buttons 
        btnSearch.setEnabled(true);         //active both buttons
        txfSearch.setText("");              //clear the text box
        txfSearch.requestFocus();             //request focus so they can type in here            
    }//GEN-LAST:event_rbPatronIDActionPerformed

    private void rbFirstNameActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rbFirstNameActionPerformed
    {//GEN-HEADEREND:event_rbFirstNameActionPerformed
        txfSearch.setEnabled(true);     //same as the previous button. The one right above this man
        btnSearch.setEnabled(true);
        txfSearch.setText("");
        txfSearch.requestFocus();
    }//GEN-LAST:event_rbFirstNameActionPerformed

    //search txf is cleared and the full table data is displayed
    private void rbAllActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rbAllActionPerformed
    {//GEN-HEADEREND:event_rbAllActionPerformed
        try                                                //its when we're done searching and just want the whole table again
        {
            txfSearch.setEnabled(false);             //disabling the other buttons
            btnSearch.setEnabled(false);                 //diabling the other buttons
            txfSearch.setText("");                       //clearing out the textbox
            pd.getAllPatrons();                            //calling the getAllUsers method. shows all the users
            pd.populateJTable(tblPatrons, 0);
            populateDetails();
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_rbAllActionPerformed

    //closes the frame and brings up main menu
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnBackActionPerformed
    {//GEN-HEADEREND:event_btnBackActionPerformed

        try
        {
            this.dispose();                                 //close this frame
            new MainMenuFrame().setVisible(true);         //open main menu
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }

    }//GEN-LAST:event_btnBackActionPerformed

    
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSearchActionPerformed
    {//GEN-HEADEREND:event_btnSearchActionPerformed
        try //they could potetnially have errors with connecting to the database. So we use a trycatch
        {
            if (rbPatronID.isSelected() && Validation.v2IntialCharacters(1, "P", txfSearch.getText().trim()) && Validation.vStringAZ09range(txfSearch.getText().trim(), "", "", "", 6)) //checking what button was selected, dont need to worry about the all button. Just check the other two
            {
                pd.getAllPatronsPatronID(txfSearch.getText().trim()); //calling the method in EmployeesData called getAllEmployees, the one with the string as a parameter. That is made for the EmployeePIN
                searchPopulate();
            } else
            {
                //if (dataPkg.Validation.vInteger(txfSearch.getText().trim(), "Invalid Employee PIN.  Employee PIN must be a String"))
                if (rbFirstName.isSelected() && Validation.vStringAZ(txfSearch.getText(), "", "")) //check for firstName
                {
                    pd.getAllPatronsFirstName(txfSearch.getText().trim()); //this is looking via EmployeeGroup
                    searchPopulate();
                } else
                {
                    if (rbCardLevel.isSelected() && Validation.vVirtualCombo4(txfSearch.getText().trim(), "Gold", "Silver", "Black", "Platinum")) //checking for cardLevel
                    {
                        pd.getAllPatronsCardLevel(txfSearch.getText().trim());
                        searchPopulate();
                    } else
                    {
                        if (rbGender.isSelected() && Validation.vVirtualCombo3(txfSearch.getText().trim(), "Male", "Female", "Other"))
                        {
                            pd.getAllPatronsGender(txfSearch.getText().trim());
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
        }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDeleteActionPerformed
    {//GEN-HEADEREND:event_btnDeleteActionPerformed
        //confirmation message should be shown b4 deleting
        String patronID = txfPatronID.getText().trim();
        try
        {
            int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete patron " + txfPatronID.getText().trim(), "Warning", JOptionPane.YES_NO_OPTION);
            if (dialogResult == 0)
            {
                pd.deletePatron(patronID);
                pd.populateJTable(tblPatrons, 0);
                populateDetails();

            }
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }                                                                                               //THIS METHOD IS ALRIGHT

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblPatronsMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tblPatronsMouseClicked
    {//GEN-HEADEREND:event_tblPatronsMouseClicked
        if (tblPatrons.isEnabled())
        {
            populateDetails();
        }
    }//GEN-LAST:event_tblPatronsMouseClicked

    //the following methods direct you to and select the following record position. it takes you to the first record or corresponding record as per the method name
    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnFirstActionPerformed
    {//GEN-HEADEREND:event_btnFirstActionPerformed
        tblPatrons.setRowSelectionInterval(0, 0);  //select the row
        tblPatrons.scrollRectToVisible(tblPatrons.getCellRect(0, 0, true)); //move the vertical scroll bar so we can actually see the first row
        populateDetails(); //calling the method to get the details
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnLastActionPerformed
    {//GEN-HEADEREND:event_btnLastActionPerformed
        tblPatrons.setRowSelectionInterval(tblPatrons.getRowCount() - 1, tblPatrons.getRowCount() - 1);  //select the row
        tblPatrons.scrollRectToVisible(tblPatrons.getCellRect(tblPatrons.getRowCount() - 1, 0, true));  //move the vertical scroll
        populateDetails();
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPreviousActionPerformed
    {//GEN-HEADEREND:event_btnPreviousActionPerformed
        if (tblPatrons.getSelectedRow() - 1 > -1)
        {
            tblPatrons.setRowSelectionInterval(tblPatrons.getSelectedRow() - 1, tblPatrons.getSelectedRow() - 1);   //select the row
            tblPatrons.scrollRectToVisible(tblPatrons.getCellRect(tblPatrons.getSelectedRow() - 1, 0, true));       //move the vertical scroll
            populateDetails();
        } else
        {
            JOptionPane.showMessageDialog(null, "You are at the FIRST Employee", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnNextActionPerformed
    {//GEN-HEADEREND:event_btnNextActionPerformed
        if (tblPatrons.getSelectedRow() + 1 < tblPatrons.getRowCount()) //if statement is to check if we at the last row or not
        {
            tblPatrons.setRowSelectionInterval(tblPatrons.getSelectedRow() + 1, tblPatrons.getSelectedRow() + 1); //select the row
            tblPatrons.scrollRectToVisible(tblPatrons.getCellRect(tblPatrons.getSelectedRow() + 1, 0, true)); //move the vertical scroll
            populateDetails();
        } else
        {
            JOptionPane.showMessageDialog(null, "You are at the LAST patron", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnNextActionPerformed

    //handles data enabling 
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAddActionPerformed
    {//GEN-HEADEREND:event_btnAddActionPerformed
        try
        {
            //the ManualEdit checkbox should be ENABLED
            cbManualEdit.setEnabled(true);
            //the ManualEdit checkbox should be UNTICKED
            cbManualEdit.setSelected(false);

            //AUTOSETTING THE NEXT PK
            ResultSet newPKrs = dbm.query("SELECT COALESCE(MAX(CAST(RIGHT(PATRONID, 5) AS INT)), 0) + 1 FROM TBLPATRONS;");
            String nextPK = "";
            if (newPKrs.next())
            {
                nextPK = newPKrs.getInt(1) + "";
            }
            //System.out.println(nextPK);
            int numToAdd = 5 - nextPK.length();

            //System.out.println(numToAdd);
            String zeros = "";

            for (int i = 0; i < numToAdd; i++)
            {
                zeros += "0";
            }

            //System.out.println(zeros);
            //System.out.println("E" + zeros + nextPK);
            txfPatronID.setText("P" + zeros + nextPK);
            //NEW PK SET

            navigation(false); //if we tryna add we have to disable everything else. Only things we can do are save and cancel
            search(false);     //This is a method that deactivates and reactivated depending on the boolean we give it. these 3 are methods we can disable. the methods are what disable and reenable the components
            options(false);

            details(true);

            btnSaveNew.setEnabled(true); //we can save things. 
            btnCancel.setEnabled(true); //we can cancel

            //VARIABLES
            txfPatronID.setEnabled(false);
            txfFirstName.setText("");
            txfSurname.setText("");

            jdcDateOfBirth.setDate(new Date());

            cmbGender.setSelectedItem("Male");
            txfHomeAddress.setText("");
            txfEmailAddress.setText("");

            jdcJoinDate.setDate(new Date());

            txfFirstName.requestFocus();
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
        txfPatronID.setEnabled(false); //this cant be edited

        btnSaveEdit.setEnabled(true);
        btnCancel.setEnabled(true);

        txfFirstName.requestFocus(); //draw attention to firstName, can thereafter change the other details excluding EmployeePIN       //ALRIGHT
    }//GEN-LAST:event_btnEditActionPerformed

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

    private void btnSaveEditActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSaveEditActionPerformed
    {//GEN-HEADEREND:event_btnSaveEditActionPerformed
        try                                                                                                         //RENAME 
        {
            //the date formatting line
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            
            String newPatronID = txfPatronID.getText().trim();                  //can check
            String newFirstName = txfFirstName.getText().trim();                //can check
            String newSurname = txfSurname.getText().trim();                    //can check
            String newGender = (String) cmbGender.getSelectedItem();

            //NewDateOfBirth as a Date
            Date newDateOfBirthRaw = jdcDateOfBirth.getDate();
            //NewDateOfBirth as a String
            String newDateOfBirth = df.format(newDateOfBirthRaw);
            
            String newHomeAddress = txfHomeAddress.getText().trim();            //can check
            String newEmailAddress = txfEmailAddress.getText().trim();          //can check
            String newCardLevel = (String) cmbCardLevel.getSelectedItem();

            //NewJoinDate as a Date
            Date newJoinDateRaw = jdcJoinDate.getDate();
            //NewJoinDate as a String
            String newJoinDate = df.format(newJoinDateRaw);  
            

            //check for First Name | Presence check and character check
            if (Validation.vStringAZ(newFirstName, "", ""))
            {   //check for Surname | Presence check and character check
                if (Validation.vStringAZ(newSurname, "", "")) //check for surname
                {   //check for dob | checking that the patron is at least 18
                    if (Validation.vAgeMin(newDateOfBirthRaw, 18))
                    {   //check for Home Address | Can only contain, letters, nums, spaces, commas
                        if (Validation.vStringAZ09SpaceComma(newHomeAddress, "", "")) //check for home address
                        {   //check for Email, the email format as listed in the Validation class
                            if (Validation.vEmail(newEmailAddress, "")) //check for email address
                            {
                                if (Validation.vDateMin(newJoinDateRaw, newDateOfBirthRaw))
                                {
                                    //dataPkg.Patrons p = pd.getPatron(newPatronID); //users is the class. u is the object of the class, RHS- ud is an object of usersData that has the list of users.

                                    pd.editPatron(newPatronID, newFirstName, newSurname, newGender, newDateOfBirth, newHomeAddress, newEmailAddress, newCardLevel, newJoinDate);
                                    pd.populateJTable(tblPatrons, pd.getPatronPosition(newPatronID));
                                    populateDetails();

                                    navigation(true);
                                    search(true);
                                    options(true);

                                    details(false);

                                    btnSaveEdit.setEnabled(false);
                                    btnCancel.setEnabled(false);
                                } else
                                {
                                    JOptionPane.showMessageDialog(null, "Value in the Join Date field invalid");
                                    jdcJoinDate.setDate(new Date());
                                    jdcJoinDate.requestFocus();
                                }
                            } else
                            {
                                JOptionPane.showMessageDialog(null, "Value in the Email Address field invalid");
                                txfEmailAddress.setText("");
                                txfEmailAddress.requestFocus();
                            }
                        } else
                        {
                           JOptionPane.showMessageDialog(null, "Value in the Home Address field invalid");
                            txfHomeAddress.setText("");
                            txfHomeAddress.requestFocus();
                        }

                    } else
                    {
                        JOptionPane.showMessageDialog(null, "Value in the Date of Birth field invalid");
                        jdcDateOfBirth.setDate(df.parse("2000-01-01"));
                        jdcDateOfBirth.requestFocus();
                    }

                } else
                {
                    JOptionPane.showMessageDialog(null, "Value in the Surname field invalid");
                    txfSurname.setText("");
                    txfSurname.requestFocus();
                }
            } else
            {
                JOptionPane.showMessageDialog(null, "Value in the Event Name field invalid");
                txfFirstName.setText("");
                txfFirstName.requestFocus();
            }

        } catch (Exception e)

        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnSaveEditActionPerformed

    private void btnSaveNewActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSaveNewActionPerformed
    {//GEN-HEADEREND:event_btnSaveNewActionPerformed

        try //get the data and try adn call a method from users data. we check that the value used as a primary key can be used as such. MAke sure its unique. Autonumber looks after it. IF its not an autonumber then we must check it manually
        {
            //the ManualEdit checkbox should be DISABLED
            cbManualEdit.setEnabled(false);
            //the ManualEdit checkbox should be UNTICKED
            cbManualEdit.setSelected(false);

            //the date formatting line
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            
            String newPatronID = txfPatronID.getText().trim();                  //can check
            String newFirstName = txfFirstName.getText().trim();                //can check
            String newSurname = txfSurname.getText().trim();                    //can check
            String newGender = (String) cmbGender.getSelectedItem();

            //NewDateOfBirth as a Date
            Date newDateOfBirthRaw = jdcDateOfBirth.getDate();
            //NewDateOfBirth as a String
            String newDateOfBirth = df.format(newDateOfBirthRaw);
            
            String newHomeAddress = txfHomeAddress.getText().trim();            //can check
            String newEmailAddress = txfEmailAddress.getText().trim();          //can check
            String newCardLevel = (String) cmbCardLevel.getSelectedItem();

            //NewJoinDate as a Date
            Date newJoinDateRaw = jdcJoinDate.getDate();
            //NewJoinDate as a String
            String newJoinDate = df.format(newJoinDateRaw);                      


            //check for patronID | initial check | AZ09 + Presence check | length of 6 chars check | PK check
            if (Validation.v2IntialCharacters(1, "P", newPatronID) && Validation.vStringAZ09range(newPatronID, "", "", "", 6) && Validation.vPKCheck(newPatronID, 'P', "PATRONID", "TBLPATRONS")) 
            {   //check for firstName | AZ + Presence check
                if (Validation.vStringAZ(newFirstName, "", "")) //check for newFirstName
                {   //check for surname | AZ + Presence check
                    if (Validation.vStringAZ(newSurname, "", "")) //check for surname
                    {   //check for homeAddress | AZ09SpaceComma + Presence check
                        if (Validation.vStringAZ09SpaceComma(newHomeAddress, "", "")) //check for home address
                        {   //check for email | email format check + Presence check
                            if (Validation.vEmail2(newEmailAddress, "")) //check for email address
                            {

                                pd.addPatron(newPatronID, newFirstName, newSurname, newGender, newDateOfBirth, newHomeAddress, newEmailAddress, newCardLevel, newJoinDate);
                                pd.populateJTable(tblPatrons, pd.getPatronPosition(newPatronID));
                                populateDetails();

                                navigation(true);
                                search(true);
                                options(true);

                                details(false);

                                btnSaveNew.setEnabled(false);
                                btnCancel.setEnabled(false);
                            } else
                            {
                                JOptionPane.showMessageDialog(null, "Value in the Email field invalid");
                                txfEmailAddress.setText("");
                                txfEmailAddress.requestFocus();
                            }
                        } else
                        {
                            JOptionPane.showMessageDialog(null, "Value in the Home Address field invalid");
                            txfHomeAddress.setText("");
                            txfHomeAddress.requestFocus();
                        }
                    } else
                    {
                        JOptionPane.showMessageDialog(null, "Value in the Surname field invalid");
                        txfSurname.setText("");
                        txfSurname.requestFocus();
                    }
                } else
                {
                    JOptionPane.showMessageDialog(null, "Value in the Name field invalid");
                    txfFirstName.setText("");
                    txfFirstName.requestFocus();
                }
            } else
            {
                JOptionPane.showMessageDialog(null, "Value in the PatronID field invalid");
                txfPatronID.setText("");
                txfPatronID.requestFocus();
                cbManualEdit.setSelected(true);
            }

        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnSaveNewActionPerformed

    private void rbCardLevelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rbCardLevelActionPerformed
    {//GEN-HEADEREND:event_rbCardLevelActionPerformed
        txfSearch.setEnabled(true); //same as the previous button. The one right above this man
        btnSearch.setEnabled(true);
        txfSearch.setText("");
        txfSearch.requestFocus();
    }//GEN-LAST:event_rbCardLevelActionPerformed

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnHelpActionPerformed
    {//GEN-HEADEREND:event_btnHelpActionPerformed
        try
        {
            new HelpFrame("PatronsTable.txt").setVisible(true);
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btnHelpActionPerformed

    private void rbGenderActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rbGenderActionPerformed
    {//GEN-HEADEREND:event_rbGenderActionPerformed
        txfSearch.setEnabled(true); //same as the previous button. The one right above this man
        btnSearch.setEnabled(true);
        txfSearch.setText("");
        txfSearch.requestFocus();
    }//GEN-LAST:event_rbGenderActionPerformed

    private void cbManualEditActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cbManualEditActionPerformed
    {//GEN-HEADEREND:event_cbManualEditActionPerformed
        if (cbManualEdit.isSelected())
        {
            txfPatronID.setEnabled(true);
        } else
        {
            txfPatronID.setEnabled(false);
        }
    }//GEN-LAST:event_cbManualEditActionPerformed

    public static void main(String args[]) throws SQLException
    {
        new PatronsTable().setVisible(true);
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
    private javax.swing.JComboBox<String> cmbCardLevel;
    private javax.swing.JComboBox<String> cmbGender;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdcDateOfBirth;
    private com.toedter.calendar.JDateChooser jdcJoinDate;
    private javax.swing.JLabel lblCardLevel;
    private javax.swing.JLabel lblDataOptions;
    private javax.swing.JLabel lblDateHandling;
    private javax.swing.JLabel lblDateOfBirth;
    private javax.swing.JLabel lblDetails;
    private javax.swing.JLabel lblDetails1;
    private javax.swing.JLabel lblEmailAddress;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblHomeAddress;
    private javax.swing.JLabel lblJoinDate;
    private javax.swing.JLabel lblNavigation;
    private javax.swing.JLabel lblPatronID;
    private javax.swing.JLabel lblSaveOptions;
    private javax.swing.JLabel lblSurname;
    private javax.swing.JLabel lblUsers;
    private javax.swing.JLayeredPane lpBackground;
    private javax.swing.JPanel pnlDataHandling;
    private javax.swing.JPanel pnlDetails;
    private javax.swing.JPanel pnlNavigation;
    private javax.swing.JPanel pnlOptions;
    private javax.swing.JPanel pnlSave;
    private javax.swing.JPanel pnlSearch;
    private javax.swing.JRadioButton rbAll;
    private javax.swing.JRadioButton rbCardLevel;
    private javax.swing.JRadioButton rbFirstName;
    private javax.swing.JRadioButton rbGender;
    private javax.swing.JRadioButton rbPatronID;
    private javax.swing.ButtonGroup rbgSearch;
    private javax.swing.JTable tblPatrons;
    private javax.swing.JTextField txfEmailAddress;
    private javax.swing.JTextField txfFirstName;
    private javax.swing.JTextField txfHomeAddress;
    private javax.swing.JTextField txfPatronID;
    private javax.swing.JTextField txfSearch;
    private javax.swing.JTextField txfSurname;
    // End of variables declaration//GEN-END:variables
}
