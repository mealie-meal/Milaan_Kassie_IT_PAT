package guiPkg;

import com.toedter.calendar.JTextFieldDateEditor;
import dataPkg.DbManager;
import dataPkg.Validation;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class EventsTable extends javax.swing.JFrame
{

    private dataPkg.EventsData evd;
    private dataPkg.DbManager dbm;

    public EventsTable() throws SQLException
    {
        initComponents();

        dbm = new DbManager();

        evd = new dataPkg.EventsData();
        //populating the JTable
        evd.populateJTable(tblEvents, 0);      
        //populates the location comboBox
        evd.populateLocationJComboBox(cmbLocation);                           
        //populates the status comboBox 
        evd.populateStatusJComboBox(cmbStatus);                                

        //Cant type into the start date chooser. Can only use the date picker
        JTextFieldDateEditor startDateEditor = (JTextFieldDateEditor) jdcStartDate.getDateEditor();
        startDateEditor.setEditable(false);

        //same for jdcEndDate
        JTextFieldDateEditor endDateEditor = (JTextFieldDateEditor) jdcEndDate.getDateEditor();
        endDateEditor.setEditable(false);

        //and again for registration deadline
        JTextFieldDateEditor regEditor = (JTextFieldDateEditor) jdcRegistrationDeadline.getDateEditor();
        regEditor.setEditable(false);

        populateDetails();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        rbgSearch = new javax.swing.ButtonGroup();
        lpBackground = new javax.swing.JLayeredPane();
        lblTblEvents = new javax.swing.JLabel();
        pnlNavigation = new javax.swing.JPanel();
        btnFirst = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEvents = new javax.swing.JTable();
        pnlSearch = new javax.swing.JPanel();
        rbAll = new javax.swing.JRadioButton();
        rbEventID = new javax.swing.JRadioButton();
        rbEventName = new javax.swing.JRadioButton();
        txfSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        rbLocation = new javax.swing.JRadioButton();
        rbStatus = new javax.swing.JRadioButton();
        pnlDetails = new javax.swing.JPanel();
        lblEventName = new javax.swing.JLabel();
        lblStartDate = new javax.swing.JLabel();
        txfEventName = new javax.swing.JTextField();
        lblLocation = new javax.swing.JLabel();
        lblEndDate = new javax.swing.JLabel();
        lblCapacity = new javax.swing.JLabel();
        txfCapacity = new javax.swing.JTextField();
        lblStatus = new javax.swing.JLabel();
        lblRegistrationDeadline = new javax.swing.JLabel();
        lblEventID = new javax.swing.JLabel();
        txfEventID = new javax.swing.JTextField();
        cmbLocation = new javax.swing.JComboBox<>();
        cmbStatus = new javax.swing.JComboBox<>();
        jdcStartDate = new com.toedter.calendar.JDateChooser();
        jdcEndDate = new com.toedter.calendar.JDateChooser();
        jdcRegistrationDeadline = new com.toedter.calendar.JDateChooser();
        cbManualEdit = new javax.swing.JCheckBox();
        btnHelp = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        pnlDataHandling = new javax.swing.JPanel();
        pnlOptions = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        pnlSave = new javax.swing.JPanel();
        btnSaveNew = new javax.swing.JButton();
        btnSaveEdit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblDateOptions = new javax.swing.JLabel();
        lblSaveOptions = new javax.swing.JLabel();
        lblDetails = new javax.swing.JLabel();
        lblSearchAndSort = new javax.swing.JLabel();
        lblDataHandling = new javax.swing.JLabel();
        lblNavigation = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Sunset Oasis Casino");
        setFocusable(false);
        setResizable(false);

        lpBackground.setBackground(new java.awt.Color(0, 0, 0));
        lpBackground.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lpBackground.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblTblEvents.setFont(new java.awt.Font("HP Simplified", 1, 36)); // NOI18N
        lblTblEvents.setText("Events Table");

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

        tblEvents.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        tblEvents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "EventID", "EventName", "StartDate", "EndDate", "Location", "Capacity", "Status", "RegistrationDeadline"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false, false
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
        tblEvents.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblEvents.getTableHeader().setReorderingAllowed(false);
        tblEvents.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                tblEventsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEvents);
        if (tblEvents.getColumnModel().getColumnCount() > 0)
        {
            tblEvents.getColumnModel().getColumn(0).setResizable(false);
            tblEvents.getColumnModel().getColumn(1).setResizable(false);
            tblEvents.getColumnModel().getColumn(2).setResizable(false);
            tblEvents.getColumnModel().getColumn(3).setResizable(false);
            tblEvents.getColumnModel().getColumn(4).setResizable(false);
            tblEvents.getColumnModel().getColumn(5).setResizable(false);
            tblEvents.getColumnModel().getColumn(6).setResizable(false);
            tblEvents.getColumnModel().getColumn(7).setResizable(false);
        }

        javax.swing.GroupLayout pnlNavigationLayout = new javax.swing.GroupLayout(pnlNavigation);
        pnlNavigation.setLayout(pnlNavigationLayout);
        pnlNavigationLayout.setHorizontalGroup(
            pnlNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNavigationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1158, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlNavigationLayout.createSequentialGroup()
                .addGap(267, 267, 267)
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

        rbgSearch.add(rbEventName);
        rbEventName.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        rbEventName.setText("Event Name");
        rbEventName.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rbEventNameActionPerformed(evt);
            }
        });

        txfSearch.setToolTipText("Enter a value to search for");
        txfSearch.setEnabled(false);

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

        rbgSearch.add(rbLocation);
        rbLocation.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        rbLocation.setText("Location");
        rbLocation.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rbLocationActionPerformed(evt);
            }
        });

        rbgSearch.add(rbStatus);
        rbStatus.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        rbStatus.setText("Status");
        rbStatus.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rbStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSearchLayout = new javax.swing.GroupLayout(pnlSearch);
        pnlSearch.setLayout(pnlSearchLayout);
        pnlSearchLayout.setHorizontalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSearchLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSearch)
                .addGap(49, 49, 49))
            .addGroup(pnlSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSearchLayout.createSequentialGroup()
                        .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbAll, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(rbLocation, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbEventName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                .addComponent(rbEventID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(rbStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlSearchLayout.setVerticalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbAll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbEventID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbEventName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbLocation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbStatus)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(txfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearch)
                .addContainerGap())
        );

        pnlDetails.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblEventName.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        lblEventName.setText("Event Name");

        lblStartDate.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        lblStartDate.setText("Start Date");

        txfEventName.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        txfEventName.setEnabled(false);

        lblLocation.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        lblLocation.setText("Location");

        lblEndDate.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        lblEndDate.setText("End Date");

        lblCapacity.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        lblCapacity.setText("Capacity");

        txfCapacity.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        txfCapacity.setEnabled(false);

        lblStatus.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        lblStatus.setText("Status");

        lblRegistrationDeadline.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        lblRegistrationDeadline.setText("RegistrationDeadline");

        lblEventID.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        lblEventID.setText("EventID");

        txfEventID.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        txfEventID.setEnabled(false);

        cmbLocation.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        cmbLocation.setEnabled(false);

        cmbStatus.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        cmbStatus.setEnabled(false);

        jdcStartDate.setEnabled(false);
        jdcStartDate.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N

        jdcEndDate.setEnabled(false);
        jdcEndDate.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N

        jdcRegistrationDeadline.setEnabled(false);
        jdcRegistrationDeadline.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N

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
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEventName, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(lblEventID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDetailsLayout.createSequentialGroup()
                        .addComponent(cbManualEdit)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txfEventID)
                    .addComponent(txfEventName)
                    .addComponent(jdcStartDate, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(jdcEndDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblStatus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLocation, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                        .addComponent(lblCapacity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblRegistrationDeadline, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbStatus, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbLocation, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfCapacity, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jdcRegistrationDeadline, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDetailsLayout.setVerticalGroup(
            pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetailsLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDetailsLayout.createSequentialGroup()
                        .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txfEventID)
                            .addComponent(lblEventID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbManualEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txfEventName)
                            .addComponent(lblEventName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jdcStartDate, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(lblStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jdcEndDate, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(lblEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlDetailsLayout.createSequentialGroup()
                        .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txfCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblRegistrationDeadline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jdcRegistrationDeadline, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
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

        pnlDataHandling.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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
                .addContainerGap()
                .addGroup(pnlOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlOptionsLayout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlOptionsLayout.createSequentialGroup()
                        .addGroup(pnlOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlOptionsLayout.createSequentialGroup()
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
                .addContainerGap()
                .addGroup(pnlSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSaveEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSaveNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblDateOptions.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDateOptions.setText("Data Options");

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
                    .addComponent(lblDateOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(pnlDataHandlingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSaveOptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlDataHandlingLayout.setVerticalGroup(
            pnlDataHandlingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDataHandlingLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDataHandlingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDateOptions, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSaveOptions, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDataHandlingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        lblDetails.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDetails.setText("Details");

        lblSearchAndSort.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSearchAndSort.setText("Search and Sort");

        lblDataHandling.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDataHandling.setText("Data Handling");

        lblNavigation.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNavigation.setText("Navigation");

        lpBackground.setLayer(lblTblEvents, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(pnlNavigation, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(pnlSearch, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(pnlDetails, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(btnHelp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(btnBack, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(pnlDataHandling, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(lblDetails, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(lblSearchAndSort, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(lblDataHandling, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(lblNavigation, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout lpBackgroundLayout = new javax.swing.GroupLayout(lpBackground);
        lpBackground.setLayout(lpBackgroundLayout);
        lpBackgroundLayout.setHorizontalGroup(
            lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lpBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lpBackgroundLayout.createSequentialGroup()
                        .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDetails))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSearchAndSort))
                        .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lpBackgroundLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(pnlDataHandling, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDataHandling, javax.swing.GroupLayout.Alignment.LEADING))
                                .addContainerGap(24, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lpBackgroundLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBack)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lpBackgroundLayout.createSequentialGroup()
                        .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lpBackgroundLayout.createSequentialGroup()
                                .addComponent(lblNavigation)
                                .addGap(387, 387, 387)
                                .addComponent(lblTblEvents)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnHelp))
                            .addComponent(pnlNavigation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        lpBackgroundLayout.setVerticalGroup(
            lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lpBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(lpBackgroundLayout.createSequentialGroup()
                            .addComponent(btnHelp)
                            .addGap(34, 34, 34))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lpBackgroundLayout.createSequentialGroup()
                            .addComponent(lblNavigation)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lpBackgroundLayout.createSequentialGroup()
                        .addComponent(lblTblEvents)
                        .addGap(18, 18, 18)))
                .addComponent(pnlNavigation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDetails)
                    .addComponent(lblSearchAndSort)
                    .addComponent(lblDataHandling))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lpBackgroundLayout.createSequentialGroup()
                        .addComponent(pnlDataHandling, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack))
                    .addComponent(pnlDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(lpBackground)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void populateDetails()
    {
        //populating the table
        txfEventID.setText((String) tblEvents.getValueAt(tblEvents.getSelectedRow(), 0));
        txfEventName.setText((String) tblEvents.getValueAt(tblEvents.getSelectedRow(), 1)); //three lines of code for 3 rows in the table. The lines of code are dependant on how many rows are int he table
        //txfStartDate.setText((String) tblEvents.getValueAt(tblEvents.getSelectedRow(), 2));

        jdcStartDate.setDate(((Date) tblEvents.getValueAt(tblEvents.getSelectedRow(), 2)));
        jdcEndDate.setDate(((Date) tblEvents.getValueAt(tblEvents.getSelectedRow(), 3)));

        cmbLocation.setSelectedItem((String) tblEvents.getValueAt(tblEvents.getSelectedRow(), 4));

        txfCapacity.setText(String.valueOf((int) tblEvents.getValueAt(tblEvents.getSelectedRow(), 5)));

        cmbStatus.setSelectedItem((String) tblEvents.getValueAt(tblEvents.getSelectedRow(), 6));

        jdcRegistrationDeadline.setDate(((Date) tblEvents.getValueAt(tblEvents.getSelectedRow(), 7)));

    }

    //all these methods enable or disable components. this deals with the navigation section
    private void navigation(boolean enabled) 
    {
        tblEvents.setEnabled(enabled);
        btnFirst.setEnabled(enabled);
        btnNext.setEnabled(enabled);
        btnPrevious.setEnabled(enabled);
        btnLast.setEnabled(enabled);
    }

    //handles the enabling/disabling of components when the search button is ticked
    private void search(boolean enabled) 
    {
        rbAll.setEnabled(enabled);
        rbEventID.setEnabled(enabled);
        rbEventName.setEnabled(enabled);
        rbLocation.setEnabled(enabled);
        rbStatus.setEnabled(enabled);
        if (rbEventID.isSelected() || rbEventName.isSelected() || rbLocation.isSelected() || rbStatus.isSelected()) //checks if any of the other radio buttons is selected
        {
            btnSearch.setEnabled(enabled);
        }
    }

    //component handling for the options section
    private void options(boolean enabled) 
    {
        btnAdd.setEnabled(enabled);
        btnEdit.setEnabled(enabled);
        btnDelete.setEnabled(enabled);
    }

    //component handling for details. the txfs, cmbs and jdcs
    public void details(boolean enabled) 
    {
        txfEventID.setEnabled(enabled);
        txfEventName.setEnabled(enabled);
        jdcStartDate.setEnabled(enabled);
        jdcEndDate.setEnabled(enabled);
        cmbLocation.setEnabled(enabled);
        txfCapacity.setEnabled(enabled);
        cmbStatus.setEnabled(enabled);
        jdcStartDate.setEnabled(enabled);
        jdcRegistrationDeadline.setEnabled(enabled);

    }

    //populating the table once you've searched
    private void searchPopulate() 
    {
        evd.populateJTable(tblEvents, 0);

        if (tblEvents.getRowCount() == 0) //if there are no rows then we clear out all the stuff in the details panel
        {
            txfEventID.setText("");
            txfEventName.setText("");
            jdcStartDate.setDate(null);
            jdcEndDate.setDate(null);
            cmbLocation.setSelectedItem("");
            txfCapacity.setText("");
            cmbStatus.setSelectedItem("");
            jdcRegistrationDeadline.setDate(null);

            JOptionPane.showMessageDialog(null, "Sorry, no Events found", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
        } else
        {
            populateDetails();
        }
    }

    //all of the rb methods are for the enabling of components when the corresponding rb is clicked
    private void rbEventIDActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rbEventIDActionPerformed
    {//GEN-HEADEREND:event_rbEventIDActionPerformed
        txfSearch.setEnabled(true);        
        btnSearch.setEnabled(true);             
        txfSearch.setText("");                  
        txfSearch.requestFocus();                             
    }//GEN-LAST:event_rbEventIDActionPerformed

    private void rbEventNameActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rbEventNameActionPerformed
    {//GEN-HEADEREND:event_rbEventNameActionPerformed
        txfSearch.setEnabled(true); //same as the previous button. The one right above this 
        btnSearch.setEnabled(true);
        txfSearch.setText("");
        txfSearch.requestFocus();
    }//GEN-LAST:event_rbEventNameActionPerformed

    //the all button must display the default table datas
    private void rbAllActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rbAllActionPerformed
    {//GEN-HEADEREND:event_rbAllActionPerformed
        try                                            //this method just pulls up all the data again
        {
            txfSearch.setEnabled(false);        //disabling the other buttons
            btnSearch.setEnabled(false);             //diabling the other buttons
            txfSearch.setText("");                   //clearing out the textbox
            evd.getAllEvents();                        //calling the getAllUsers method. shows all the users
            evd.populateJTable(tblEvents, 0);
            populateDetails();
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_rbAllActionPerformed

    //back to Main Menu
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnBackActionPerformed
    {//GEN-HEADEREND:event_btnBackActionPerformed
        try
        {
            this.dispose();                             //close this frame
            new MainMenuFrame().setVisible(true);       //open main menu
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }

    }//GEN-LAST:event_btnBackActionPerformed

    //searching must have validation
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSearchActionPerformed
    {//GEN-HEADEREND:event_btnSearchActionPerformed

        try //CHECKED as of 09/07/24
        {
            //check for eventID | Initial must be E | AZ09
            if (rbEventID.isSelected() && Validation.v2IntialCharacters(1, "E", txfSearch.getText().trim()) && Validation.vStringAZ09(txfSearch.getText(), "", "")) //checking what button was selected, dont need to worry about the all button. Just check the other two
            {
                evd.getAllEventsEventID(txfSearch.getText().trim()); //calling the method in EmployeesData called getAllEmployees, the one with the string as a parameter. That is made for the EmployeePIN
                searchPopulate();
            } else
            {   //check for eventName | AZ09 
                if (rbEventName.isSelected() && Validation.vStringAZ09space(txfSearch.getText().trim(), "", ""))
                {
                    evd.getAllEventsEventName(txfSearch.getText().trim());
                    searchPopulate();
                } else
                {   //check for location | must be one of the 2 options                   
                    if (rbLocation.isSelected() && Validation.vVirtualCombo(txfSearch.getText().trim(), "Online", "Physical Venue") && Validation.vStringAZ(txfSearch.getText(), "", ""))
                    {
                        evd.getAllEventsLocation(txfSearch.getText().trim());
                        searchPopulate();
                    } else
                    {   //check for status | must be one of the 2 options
                        if (rbStatus.isSelected() && Validation.vVirtualCombo(txfSearch.getText().trim(), "Scheduled", "Cancelled") && Validation.vStringAZ(txfSearch.getText(), "", ""))
                        {
                            evd.getAllEventsStatus(txfSearch.getText().trim());
                            searchPopulate();
                        } else
                        {   //otherwise we request focus and clear the txf
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

    //deletes record
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDeleteActionPerformed
    {//GEN-HEADEREND:event_btnDeleteActionPerformed
        //gives a lil warning before deleting because you gotta make sure before doing a deletion
        try
        {
            String eventID = txfEventID.getText().trim();

            int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete event " + txfEventName.getText().trim(), "Warning", JOptionPane.YES_NO_OPTION);
            if (dialogResult == 0)
            {
                evd.deleteEvent(eventID);
                evd.populateJTable(tblEvents, 0);
                populateDetails();
            }
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }                                                                                               //THIS METHOD IS ALRIGHT

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblEventsMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tblEventsMouseClicked
    {//GEN-HEADEREND:event_tblEventsMouseClicked
        if (tblEvents.isEnabled())
        {
            populateDetails();
        }
    }//GEN-LAST:event_tblEventsMouseClicked

    //takes you to the first record in the table. //following methods do the same for the corresponding record
    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnFirstActionPerformed
    {//GEN-HEADEREND:event_btnFirstActionPerformed
        tblEvents.setRowSelectionInterval(0, 0);                          //select the row
        tblEvents.scrollRectToVisible(tblEvents.getCellRect(0, 0, true)); //move the vertical scroll bar so we can actually see the first row
        populateDetails();                                                //calling the method to get them details
    }//GEN-LAST:event_btnFirstActionPerformed

    
    private void btnLastActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnLastActionPerformed
    {//GEN-HEADEREND:event_btnLastActionPerformed
        tblEvents.setRowSelectionInterval(tblEvents.getRowCount() - 1, tblEvents.getRowCount() - 1);    //select the row
        tblEvents.scrollRectToVisible(tblEvents.getCellRect(tblEvents.getRowCount() - 1, 0, true));     //move the vertical scroll
        populateDetails();
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPreviousActionPerformed
    {//GEN-HEADEREND:event_btnPreviousActionPerformed
        if (tblEvents.getSelectedRow() - 1 > -1)
        {
            tblEvents.setRowSelectionInterval(tblEvents.getSelectedRow() - 1, tblEvents.getSelectedRow() - 1); //select the row
            tblEvents.scrollRectToVisible(tblEvents.getCellRect(tblEvents.getSelectedRow() - 1, 0, true));  //move the vertical scroll
            populateDetails();
        } else
        {
            JOptionPane.showMessageDialog(null, "You are at the FIRST Event", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnNextActionPerformed
    {//GEN-HEADEREND:event_btnNextActionPerformed
        if (tblEvents.getSelectedRow() + 1 < tblEvents.getRowCount()) //if statement is to check if we at the last row or not
        {
            tblEvents.setRowSelectionInterval(tblEvents.getSelectedRow() + 1, tblEvents.getSelectedRow() + 1); //select the row
            tblEvents.scrollRectToVisible(tblEvents.getCellRect(tblEvents.getSelectedRow() + 1, 0, true)); //move the vertical scroll
            populateDetails();
        } else
        {
            JOptionPane.showMessageDialog(null, "You are at the LAST Event", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
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

            //AUTOSETTING THE NEXT PK
            ResultSet newPKrs = dbm.query("SELECT COALESCE(MAX(CAST(RIGHT(EVENTID, 5) AS INT)), 0) + 1 FROM TBLEVENTS;");
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
            txfEventID.setText("E" + zeros + nextPK);
            //NEW PK SET
            
            navigation(false);      //if we tryna add we have to disable everything else. Only things we can do are save and cancel
            search(false);          //This is a method that deactivates and reactivated depending on the boolean we give it. these 3 are methods we can disable. the methods are what disable and reenable the components
            options(false);
            details(true);

            btnSaveNew.setEnabled(true); //we can save things. 
            btnCancel.setEnabled(true);  //we can cancel

            //CLEARING THE VAR FIELDS
            txfEventName.setText("");

            //both startDate and EndDate are set to the current date for convenience sake
            jdcStartDate.setDate(new Date());
            jdcEndDate.setDate(new Date());

            cmbLocation.setSelectedItem("Physical Venue");
            txfCapacity.setText("");
            cmbStatus.setSelectedItem("Scheduled");

            //jdcRegistrationDeadline.setDate(null);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date());

            //Subtract one day
            calendar.add(Calendar.DAY_OF_MONTH, -1);

            //Get the new date (day before today)
            Date dayBeforeToday = calendar.getTime();

            //Set the date to the day before today
            jdcRegistrationDeadline.setDate(dayBeforeToday);

            //jdcRegistrationDeadline.setDate(new Date());
            txfEventName.requestFocus();
            txfEventID.setEnabled(false);
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnAddActionPerformed

    //handling components when the edit button is clicked
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEditActionPerformed
    {//GEN-HEADEREND:event_btnEditActionPerformed
        navigation(false);
        search(false);
        options(false);

        details(true);

        txfEventID.setEnabled(false); //this cant be edited

        btnSaveEdit.setEnabled(true);
        btnCancel.setEnabled(true);

        txfEventName.requestFocus(); //draw attention to firstName, can thereafter change the other details excluding EmployeePIN       //ALRIGHT
    }//GEN-LAST:event_btnEditActionPerformed

    //handling components when the cancel button is clicked
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelActionPerformed
    {//GEN-HEADEREND:event_btnCancelActionPerformed
        //the ManualEdit checkbox should be DISABLED
        cbManualEdit.setEnabled(false);
        //the ManuelEdit checkbox should be UNTICKED
        cbManualEdit.setSelected(false);

        navigation(true);       //sets everything to be true
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
        try  //CHECKED as of 09/07/24
        {
            //the date formatting line
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

            //VARIABLES
            String newEventID = txfEventID.getText().trim();                       //can check 
            String newEventName = txfEventName.getText().trim();                   //can check

            //NewStartDate as a Date
            Date newStartDateRaw = (Date) jdcStartDate.getDate();
            //NewStartDate as a String
            String newStartDate = df.format(newStartDateRaw);

            //NewEndDate as a Date
            Date newEndDateRaw = (Date) jdcEndDate.getDate();
            //NewEndDate as a String
            String newEndDate = df.format(newEndDateRaw);

            String newLocation = (String) cmbLocation.getSelectedItem();
            String newCapacity = txfCapacity.getText().trim();      //can check
            String newStatus = (String) cmbStatus.getSelectedItem();

            //NewRegistrationDeadline as a Date
            Date newRegistrationDeadlineRaw = jdcRegistrationDeadline.getDate();
            //NewRegistrationDeadline as a String
            String newRegistrationDeadline = df.format(newRegistrationDeadlineRaw);

            //Validation.vStringPresenceCheck(newEventName, "Event Name") && 
            //check for Event Name | AZ09space
            if (Validation.vStringAZ09space(newEventName, "", ""))
            {   //check for endDate | EndDate cant be before startDate
                if (Validation.vDateMin(newEndDateRaw, newStartDateRaw)) //this one is for capacity
                {   //check for capacity | must be btwn 100 and 2000
                    if (Validation.vIntegerRange((newCapacity), "", "", 100, 2000))
                    {   //check for newRegistrationDeadline | must be at least a day before startDate
                        if (Validation.vDateMaxDayBefore(newRegistrationDeadlineRaw, newStartDateRaw))
                        {
                            //all is valid so we can edit the event
                            evd.editEvent(newEventID, newEventName, newStartDate, newEndDate, newLocation, Integer.parseInt(newCapacity), newStatus, newRegistrationDeadline);
                            //populate the table again bcs we just edited it and want to show the new edit
                            evd.populateJTable(tblEvents, evd.getEventPosition(newEventID));
                            //data has been edited so we show details again to make sure updated data is shown
                            populateDetails();

                            navigation(true);
                            search(true);
                            options(true);

                            details(false);

                            btnSaveEdit.setEnabled(false);
                            btnCancel.setEnabled(false);

                        } else
                        {
                            JOptionPane.showMessageDialog(null, "Value in Registration Deadline field invalid: Registration Deadline must be at least 1 day before Start Date");
                            Calendar calendar = Calendar.getInstance();
                            calendar.setTime(newStartDateRaw);

                            //Subtract one day
                            calendar.add(Calendar.DAY_OF_MONTH, -1);

                            //Get the date for the day before newStartDateRaw
                            Date dayBeforeNewStartDate = calendar.getTime();

                            //Set jdcRegistrationDeadline to the day before newStartDateRaw
                            jdcRegistrationDeadline.setDate(dayBeforeNewStartDate);
                            jdcRegistrationDeadline.requestFocus();
                        }
                    } else
                    {
                        JOptionPane.showMessageDialog(null, "Value in Capacity field invalid");
                        txfCapacity.setText("");
                        txfCapacity.requestFocus();
                    }

                } else
                {

                    JOptionPane.showMessageDialog(null, "Value in End Date field invalid");
                    jdcEndDate.setDate(newStartDateRaw);
                    jdcEndDate.requestFocus();

                }
            } else
            {
                JOptionPane.showMessageDialog(null, "Value in Event Name field invalid");
                txfEventName.setText("");
                txfEventName.requestFocus();
            }

        } catch (Exception e)

        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnSaveEditActionPerformed

    private void btnSaveNewActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSaveNewActionPerformed
    {//GEN-HEADEREND:event_btnSaveNewActionPerformed

        try //CHECKED as of 09/07/24 
        {
            //the ManualEdit checkbox should be DISABLED
            cbManualEdit.setEnabled(false);
            //the ManualEdit checkbox should be UNTICKED
            cbManualEdit.setSelected(false);

            //the date formatting line
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

            //VARIABLES
            String newEventID = txfEventID.getText().trim();                    //can check
            String newEventName = txfEventName.getText().trim();                //can check

            //NewStartDate as a Date
            Date newStartDateRaw = (Date) jdcStartDate.getDate();
            //NewStartDate as a String
            String newStartDate = df.format(newStartDateRaw);

            //NewEndDate as a Date
            Date newEndDateRaw = (Date) jdcEndDate.getDate();
            //NewEndDate as a String
            String newEndDate = df.format(newEndDateRaw);

            String newLocation = (String) cmbLocation.getSelectedItem();
            String newCapacity = txfCapacity.getText().trim();
            String newStatus = (String) cmbStatus.getSelectedItem();

            //NewRegistrationDeadline as a Date
            Date newRegistrationDeadlineRaw = (Date) jdcRegistrationDeadline.getDate();
            //NewRegistrationDeadline as a String
            String newRegistrationDeadline = df.format(newRegistrationDeadlineRaw);

            //check for EventID | First letter must be E | AZ09 and 6 chars max | SQL method check
            if (Validation.v2IntialCharacters(1, "E", newEventID) && Validation.vStringAZ09range(newEventID, "", "", "", 6) && Validation.vPKCheck(newEventID, 'E', "EVENTID", "TBLEVENTS"))
            {   //check for Event Name | AZ09space 
                if (Validation.vStringAZ09space(newEventName, "", ""))
                {   //check for End Date | EndDate cant be before the StartDate
                    if (Validation.vDateMin(newEndDateRaw, newStartDateRaw))
                    {   //check for Capacity | must be btwn 100 and 2000
                        if (Validation.vIntegerRange((newCapacity), "", "", 100, 2000))
                        {   //check for Reg Date | Registration Deadline must be at least one day before the startDate
                            if (Validation.vDateMaxDayBefore(newRegistrationDeadlineRaw, newStartDateRaw))
                            {
                                evd.addEvent(newEventID, newEventName, newStartDate, newEndDate, newLocation, Integer.parseInt(newCapacity), newStatus, newRegistrationDeadline);
                                evd.populateJTable(tblEvents, evd.getEventPosition(newEventID));
                                populateDetails();

                                navigation(true);
                                search(true);
                                options(true);

                                details(false);

                                btnSaveNew.setEnabled(false);
                                btnSaveEdit.setEnabled(false);
                                btnCancel.setEnabled(false);

                            } else
                            {
                                JOptionPane.showMessageDialog(null, "Value in Registration Deadline field invalid: Registration Deadline must be at least 1 day before Start Date");
                                Calendar calendar = Calendar.getInstance();
                                calendar.setTime(newStartDateRaw);

                                //Subtract one day
                                calendar.add(Calendar.DAY_OF_MONTH, -1);

                                //Get the date for the day before newStartDateRaw
                                Date dayBeforeNewStartDate = calendar.getTime();

                                //Set jdcRegistrationDeadline to the day before newStartDateRaw
                                jdcRegistrationDeadline.setDate(dayBeforeNewStartDate);
                                jdcRegistrationDeadline.requestFocus();
                            }
                        } else
                        {
                            JOptionPane.showMessageDialog(null, "Value in Capacity field invalid");
                            txfCapacity.setText("");
                            txfCapacity.requestFocus();
                        }
                    } else
                    {
                        JOptionPane.showMessageDialog(null, "Value in End Date field invalid");
                        jdcEndDate.setDate(newStartDateRaw);
                        jdcEndDate.requestFocus();
                    }

                } else
                {
                    JOptionPane.showMessageDialog(null, "Value in Event Name field invalid");
                    txfEventName.setText("");
                    txfEventName.requestFocus();
                }
            } else
            {
                JOptionPane.showMessageDialog(null, "Value in EventID field invalid");
                txfEventID.setText("");
                txfEventID.requestFocus();
                cbManualEdit.setSelected(true);
            }
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }

    }//GEN-LAST:event_btnSaveNewActionPerformed

    //component handling when the Location rb is clicked
    private void rbLocationActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rbLocationActionPerformed
    {//GEN-HEADEREND:event_rbLocationActionPerformed
        txfSearch.setEnabled(true);
        btnSearch.setEnabled(true);
        txfSearch.setText("");
        txfSearch.requestFocus();
    }//GEN-LAST:event_rbLocationActionPerformed

    //brings up the help screen with the correct help screen massage
    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnHelpActionPerformed
    {//GEN-HEADEREND:event_btnHelpActionPerformed
        try
        {
            new HelpFrame("EventsTable.txt").setVisible(true);
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }

    }//GEN-LAST:event_btnHelpActionPerformed

    //component handling when the status rb is clicked
    private void rbStatusActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rbStatusActionPerformed
    {//GEN-HEADEREND:event_rbStatusActionPerformed
        txfSearch.setEnabled(true);
        btnSearch.setEnabled(true);
        txfSearch.setText("");
        txfSearch.requestFocus();
    }//GEN-LAST:event_rbStatusActionPerformed

    //enables txfEventID when the manual edit checkbox is enabled. disable in the same fashion
    private void cbManualEditActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cbManualEditActionPerformed
    {//GEN-HEADEREND:event_cbManualEditActionPerformed
        if (cbManualEdit.isSelected())
        {
            txfEventID.setEnabled(true);
        } else
        {
            txfEventID.setEnabled(false);
        }
    }//GEN-LAST:event_cbManualEditActionPerformed

    public static void main(String args[]) throws SQLException
    {
        new EventsTable().setVisible(true);
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
    private javax.swing.JComboBox<String> cmbLocation;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdcEndDate;
    private com.toedter.calendar.JDateChooser jdcRegistrationDeadline;
    private com.toedter.calendar.JDateChooser jdcStartDate;
    private javax.swing.JLabel lblCapacity;
    private javax.swing.JLabel lblDataHandling;
    private javax.swing.JLabel lblDateOptions;
    private javax.swing.JLabel lblDetails;
    private javax.swing.JLabel lblEndDate;
    private javax.swing.JLabel lblEventID;
    private javax.swing.JLabel lblEventName;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblNavigation;
    private javax.swing.JLabel lblRegistrationDeadline;
    private javax.swing.JLabel lblSaveOptions;
    private javax.swing.JLabel lblSearchAndSort;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTblEvents;
    private javax.swing.JLayeredPane lpBackground;
    private javax.swing.JPanel pnlDataHandling;
    private javax.swing.JPanel pnlDetails;
    private javax.swing.JPanel pnlNavigation;
    private javax.swing.JPanel pnlOptions;
    private javax.swing.JPanel pnlSave;
    private javax.swing.JPanel pnlSearch;
    private javax.swing.JRadioButton rbAll;
    private javax.swing.JRadioButton rbEventID;
    private javax.swing.JRadioButton rbEventName;
    private javax.swing.JRadioButton rbLocation;
    private javax.swing.JRadioButton rbStatus;
    private javax.swing.ButtonGroup rbgSearch;
    private javax.swing.JTable tblEvents;
    private javax.swing.JTextField txfCapacity;
    private javax.swing.JTextField txfEventID;
    private javax.swing.JTextField txfEventName;
    private javax.swing.JTextField txfSearch;
    // End of variables declaration//GEN-END:variables
}
