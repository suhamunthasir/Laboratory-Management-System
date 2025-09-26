
package Views;

import java.text.SimpleDateFormat;
import java.sql.*; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import java.text.ParseException;
import java.util.Date;


import net.sf.jasperreports.engine.JasperFillManager;

import net.sf.jasperreports.engine.JasperPrint;

import net.sf.jasperreports.engine.JasperReport;

import net.sf.jasperreports.engine.JasperCompileManager;

import net.sf.jasperreports.view.JasperViewer;
        
        

public class Patient extends javax.swing.JFrame {

  
    public Patient() {
        initComponents();
        this.setLocationRelativeTo(null);
        ShowPatient();
    }
    
    //Retrieves Patient data from the database and displays it in the table component.
     private void ShowPatient()
   {
           try (Connection con = DriverManager.getConnection(  
                   "jdbc:mysql://localhost:3306/LaboratoryDb","root","Suha2005Munthasir")) {
               
               Statement stmt=con.createStatement();
               ResultSet rs=stmt.executeQuery("select * from PatientTbl");
               patientTable.setModel(DbUtils.resultSetToTableModel(rs));
           }
            catch(SQLException e){ 
            System.out.println(e);  
        }  
    
   }
  

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lblPatients3 = new javax.swing.JLabel();
        lblLabTests3 = new javax.swing.JLabel();
        lblResults3 = new javax.swing.JLabel();
        lblHome = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        txtPatientName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtPatientNumber = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cmbBoxGender = new javax.swing.JComboBox<>();
        txtContactNumber = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        btnUpdatePatient = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        btnDeletePatient = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientTable = new javax.swing.JTable();
        DateChooser = new com.toedter.calendar.JDateChooser();
        btnAddPatient1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(0, 204, 204));

        lblPatients3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPatients3.setText("Patients");

        lblLabTests3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblLabTests3.setText("Lab Tests");
        lblLabTests3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLabTests3MouseClicked(evt);
            }
        });

        lblResults3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblResults3.setText("Results");
        lblResults3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblResults3MouseClicked(evt);
            }
        });

        lblHome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblHome.setText("Home");
        lblHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHomeMouseClicked(evt);
            }
        });

        jPanel12.setBackground(new java.awt.Color(53, 162, 159));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Log Out");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\suham\\Downloads\\log-out.png")); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel15))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\suham\\Downloads\\health-insurance.png")); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\suham\\Downloads\\healthcare (1).png")); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\suham\\Downloads\\bar-chart.png")); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\suham\\Downloads\\home (1).png")); // NOI18N

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\suham\\Downloads\\user (2).png")); // NOI18N

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setText("Healthcare Lab");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addGap(12, 12, 12))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHome)
                    .addComponent(lblResults3)
                    .addComponent(lblLabTests3)
                    .addComponent(lblPatients3))
                .addGap(56, 56, 56))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel21))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel16)))
                .addGap(124, 124, 124)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPatients3)
                    .addComponent(jLabel2))
                .addGap(47, 47, 47)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblLabTests3)
                    .addComponent(jLabel3))
                .addGap(41, 41, 41)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblResults3)
                    .addComponent(jLabel4))
                .addGap(40, 40, 40)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblHome)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel13.setBackground(new java.awt.Color(11, 102, 106));

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Healthcare Laboratory Management System");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\suham\\Downloads\\exit-full-screen.png")); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 556, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel1))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel14.setBackground(new java.awt.Color(204, 204, 204));
        jPanel14.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1033, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );

        txtPatientName.setName(""); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(53, 162, 159));
        jLabel9.setText("Patient Name");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(53, 162, 159));
        jLabel10.setText("Patient Number");

        txtPatientNumber.setName(""); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(53, 162, 159));
        jLabel11.setText("Gender");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(53, 162, 159));
        jLabel12.setText("Contact Number");

        cmbBoxGender.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbBoxGender.setForeground(new java.awt.Color(102, 102, 102));
        cmbBoxGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(53, 162, 159));
        jLabel13.setText("Address");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(53, 162, 159));
        jLabel22.setText("Date of Birth");

        btnUpdatePatient.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        btnUpdatePatient.setForeground(new java.awt.Color(0, 153, 153));
        btnUpdatePatient.setText("Update Patient");
        btnUpdatePatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdatePatientMouseClicked(evt);
            }
        });

        btnPrint.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        btnPrint.setForeground(new java.awt.Color(0, 153, 153));
        btnPrint.setText(" Print Report");
        btnPrint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrintMouseClicked(evt);
            }
        });
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        btnDeletePatient.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        btnDeletePatient.setForeground(new java.awt.Color(0, 153, 153));
        btnDeletePatient.setText("Delete Patient");
        btnDeletePatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeletePatientMouseClicked(evt);
            }
        });

        patientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Patient Number", "Name", "Gender", "Contact Number", "Address", "Date of Birth"
            }
        ));
        patientTable.setRowHeight(30);
        patientTable.setSelectionBackground(new java.awt.Color(151, 254, 237));
        patientTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patientTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(patientTable);

        btnAddPatient1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        btnAddPatient1.setForeground(new java.awt.Color(0, 153, 153));
        btnAddPatient1.setText("Add Patient");
        btnAddPatient1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddPatient1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(btnDeletePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnUpdatePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtPatientNumber)
                                                    .addComponent(cmbBoxGender, 0, 115, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtContactNumber)
                                                    .addComponent(txtPatientName)
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(0, 0, Short.MAX_VALUE))))
                                            .addComponent(txtAddress)
                                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnAddPatient1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                                            .addComponent(DateChooser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE))
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPatientNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(txtPatientName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbBoxGender, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(txtContactNumber))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAddPatient1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDeletePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdatePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Generates and displays a Jasper report for Patient data from the database.
    private void btnPrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintMouseClicked
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LaboratoryDb","root","Suha2005Munthasir");
            String path = "C:\\Users\\suham\\JaspersoftWorkspace\\MyReports\\Patientlist.jrxml";
            JasperReport jr = JasperCompileManager.compileReport(path);
            JasperPrint jp = JasperFillManager.fillReport(jr,null,con);
            JasperViewer viewer = new JasperViewer(jp, false);
            viewer.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
            viewer.setVisible(true); 

            con.close();
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
               
        

    }//GEN-LAST:event_btnPrintMouseClicked

    //Delete patient
    private void btnDeletePatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeletePatientMouseClicked
        
        
        if(txtPatientNumber.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Select a Patient");
        }
        else
        {
            try
            {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LaboratoryDb","root","Suha2005Munthasir");
                PreparedStatement Add = con.prepareStatement("Delete from PatientTbl where PatientNumber = ?");
                Add.setInt(1,Integer.valueOf(txtPatientNumber.getText()));
              
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this,"Patient Deleted Successfully");
                ShowPatient();
                txtPatientNumber.setEditable(true);
                
                txtPatientNumber.setText("");
                txtPatientName.setText("");
                cmbBoxGender.setSelectedIndex(-1);
                txtAddress.setText("");
                txtContactNumber.setText("");
                DateChooser.setDate(null);
                
            }
            catch(SQLException e)
            {
                        JOptionPane.showMessageDialog(this,e.getMessage());
            }
        }
    }//GEN-LAST:event_btnDeletePatientMouseClicked

    
    //view existing Patient data by clicking on a table row (fills the textboxes)
    private void patientTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientTableMouseClicked
       DefaultTableModel model = (DefaultTableModel) patientTable.getModel();
       int Myindex = patientTable.getSelectedRow();
       txtPatientNumber.setText(model.getValueAt(Myindex,0).toString());
       txtPatientName.setText(model.getValueAt(Myindex,1).toString());
       cmbBoxGender.setSelectedItem(model.getValueAt(Myindex,2).toString());
       txtAddress.setText(model.getValueAt(Myindex,3).toString());
       txtContactNumber.setText(model.getValueAt(Myindex,4).toString());
      
       try {
               DateChooser.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(Myindex, 5).toString()));
           } 
       catch (ParseException e)
           {
                e.printStackTrace();
           }
  
       txtPatientNumber.setEditable(false);
    }//GEN-LAST:event_patientTableMouseClicked

    //Update patient
    private void btnUpdatePatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdatePatientMouseClicked
       
        if(txtPatientNumber.getText().isEmpty() || txtPatientName.getText().isEmpty()||
            cmbBoxGender.getSelectedIndex()== -1 || txtContactNumber.getText().isEmpty() || 
                txtAddress.getText().isEmpty()||DateChooser.getDate() == null)
        {
            JOptionPane.showMessageDialog(this,"Missing Data!!!");
        }
        else
        {
            try
            {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LaboratoryDb","root","Suha2005Munthasir");
                PreparedStatement Add = con.prepareStatement("Update PatientTbl set PatientName = ?, PatientGender = ?,PatientAddress = ?, PatientPhone = ?,PatientDOB = ? where PatientNumber = ?");
                Add.setInt(6,Integer.valueOf(txtPatientNumber.getText()));
                Add.setString(1,txtPatientName.getText());
                Add.setString(2,cmbBoxGender.getSelectedItem().toString());
                Add.setString(3,txtAddress.getText());
                Add.setString(4,txtContactNumber.getText());
                
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String formattedDate = dateFormat.format(DateChooser.getDate());
                Add.setString(5, formattedDate);
                
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this,"Patient Updated Successfully");
                ShowPatient();
                txtPatientNumber.setEditable(true);
                
                txtPatientNumber.setText(""); 
                txtPatientName.setText("");
                cmbBoxGender.setSelectedIndex(-1);
                txtAddress.setText("");
                txtContactNumber.setText("");
                DateChooser.setDate(null);
                
            }
            catch(SQLException e)
            {
                        JOptionPane.showMessageDialog(this,e.getMessage());
            }
        }
    }//GEN-LAST:event_btnUpdatePatientMouseClicked

    private void lblLabTests3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLabTests3MouseClicked
        new Test().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblLabTests3MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
       System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void lblResults3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblResults3MouseClicked
       new Results().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_lblResults3MouseClicked

    //Add patient
    private void btnAddPatient1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddPatient1MouseClicked
        if(txtPatientNumber.getText().isEmpty() || txtPatientName.getText().isEmpty()||
            cmbBoxGender.getSelectedIndex()== -1 || txtContactNumber.getText().isEmpty() || 
                txtAddress.getText().isEmpty()||DateChooser.getDate() == null)
        {
            JOptionPane.showMessageDialog(this,"Missing Data!!!");
        }
         else if (!txtPatientNumber.getText().matches("^[0-9]+$")) 
         {
            JOptionPane.showMessageDialog(this, "Patient Number must contain only numbers!");
         }
         else if (DateChooser.getDate().after(new Date())) 
         {
             JOptionPane.showMessageDialog(this, "Date cannot be in the future!");
         }
        else
        {
            try  
            {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LaboratoryDb","root","Suha2005Munthasir");
                PreparedStatement Add = con.prepareStatement("Insert into PatientTbl values (?,?,?,?,?,?)");
                Add.setInt(1,Integer.valueOf(txtPatientNumber.getText()));
                Add.setString(2,txtPatientName.getText());
                Add.setString(3,cmbBoxGender.getSelectedItem().toString());
                Add.setString(4,txtAddress.getText());
                Add.setString(5,txtContactNumber.getText());
                
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String formattedDate = dateFormat.format(DateChooser.getDate());
                Add.setString(6, formattedDate);
                
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this,"Patient Added Successfully");
                ShowPatient();
                
                txtPatientNumber.setText("");
                txtPatientName.setText("");
                cmbBoxGender.setSelectedIndex(-1);
                txtAddress.setText("");
                txtContactNumber.setText("");
                DateChooser.setDate(null);

                
            }
            catch(SQLException e)
            {
                        JOptionPane.showMessageDialog(this,e.getMessage());
            }
        }
    }//GEN-LAST:event_btnAddPatient1MouseClicked

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        
    }//GEN-LAST:event_btnPrintActionPerformed

    private void lblHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseClicked
       new HomePage().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_lblHomeMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        //using Lambda
        java.awt.EventQueue.invokeLater(()-> {new Patient().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateChooser;
    private javax.swing.JButton btnAddPatient1;
    private javax.swing.JButton btnDeletePatient;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnUpdatePatient;
    private javax.swing.JComboBox<String> cmbBoxGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblLabTests3;
    private javax.swing.JLabel lblPatients3;
    private javax.swing.JLabel lblResults3;
    private javax.swing.JTable patientTable;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContactNumber;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtPatientNumber;
    // End of variables declaration//GEN-END:variables
}
