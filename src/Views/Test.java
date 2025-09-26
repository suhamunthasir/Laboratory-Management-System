
package Views;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

import net.sf.jasperreports.engine.JasperFillManager;

import net.sf.jasperreports.engine.JasperPrint;

import net.sf.jasperreports.engine.JasperReport;

import net.sf.jasperreports.engine.JasperCompileManager;

import net.sf.jasperreports.view.JasperViewer;


public class Test extends javax.swing.JFrame {

    
    public Test() {
        initComponents();
        this.setLocationRelativeTo(null);
        ShowTest();
    }

    //Retrieves test data from the database and displays it in the table component.
     private void ShowTest()
   {
           try (Connection con = DriverManager.getConnection(  
                   "jdbc:mysql://localhost:3306/LaboratoryDb","root","Suha2005Munthasir")) {
               //here sonoo is database name, root is username and password
               Statement stmt=con.createStatement();
               ResultSet rs=stmt.executeQuery("select * from TestTbl");
               tabletest.setModel(DbUtils.resultSetToTableModel(rs));
           }
            catch(SQLException e){ 
            System.out.println(e);  
        }  
    
   }
  
  
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblPatients = new javax.swing.JLabel();
        lblLabTests = new javax.swing.JLabel();
        lblResults = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblHome = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtTestName = new javax.swing.JTextField();
        lblTestName = new javax.swing.JLabel();
        lblTestNumber = new javax.swing.JLabel();
        txtTestCode = new javax.swing.JTextField();
        lblTestCost = new javax.swing.JLabel();
        txtTestCost = new javax.swing.JTextField();
        btnUpdateTest = new javax.swing.JButton();
        btnAddTest = new javax.swing.JButton();
        btnDeleteTest = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabletest = new javax.swing.JTable();
        lblManageTests = new javax.swing.JLabel();
        btnPrintReport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        lblPatients.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPatients.setText("Patients");
        lblPatients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPatientsMouseClicked(evt);
            }
        });

        lblLabTests.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblLabTests.setText("Lab Tests");

        lblResults.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblResults.setText("Results");
        lblResults.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblResultsMouseClicked(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(53, 162, 159));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Log Out");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\suham\\Downloads\\log-out.png")); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel14))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\suham\\Downloads\\health-insurance.png")); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\suham\\Downloads\\healthcare (1).png")); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\suham\\Downloads\\bar-chart.png")); // NOI18N

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\suham\\Downloads\\user (2).png")); // NOI18N

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("Healthcare Lab");

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\suham\\Downloads\\home (1).png")); // NOI18N

        lblHome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblHome.setText("Home");
        lblHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHomeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addGap(12, 12, 12))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblHome))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblResults)
                            .addComponent(lblLabTests)
                            .addComponent(lblPatients))))
                .addGap(56, 56, 56))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel16))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel15)))
                .addGap(124, 124, 124)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPatients)
                    .addComponent(jLabel2))
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblLabTests)
                    .addComponent(jLabel3))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblResults)
                    .addComponent(jLabel4))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblHome)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 251, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(11, 102, 106));

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Healthcare Laboratory Management System");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\suham\\Downloads\\exit-full-screen.png")); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 559, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel1))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );

        txtTestName.setName(""); // NOI18N

        lblTestName.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lblTestName.setForeground(new java.awt.Color(53, 162, 159));
        lblTestName.setText("Test Name");

        lblTestNumber.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lblTestNumber.setForeground(new java.awt.Color(53, 162, 159));
        lblTestNumber.setText("Test Code");

        txtTestCode.setName(""); // NOI18N

        lblTestCost.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lblTestCost.setForeground(new java.awt.Color(53, 162, 159));
        lblTestCost.setText("Test Cost");

        btnUpdateTest.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        btnUpdateTest.setForeground(new java.awt.Color(0, 153, 153));
        btnUpdateTest.setText("Update Test");
        btnUpdateTest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateTestMouseClicked(evt);
            }
        });

        btnAddTest.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        btnAddTest.setForeground(new java.awt.Color(0, 153, 153));
        btnAddTest.setText("Add Test");
        btnAddTest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddTestMouseClicked(evt);
            }
        });

        btnDeleteTest.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        btnDeleteTest.setForeground(new java.awt.Color(0, 153, 153));
        btnDeleteTest.setText("Delete Test");
        btnDeleteTest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteTestMouseClicked(evt);
            }
        });

        tabletest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Test Code", "Test Name", "Test Cost"
            }
        ));
        tabletest.setRowHeight(30);
        tabletest.setSelectionBackground(new java.awt.Color(151, 254, 237));
        tabletest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabletestMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabletest);

        lblManageTests.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblManageTests.setForeground(new java.awt.Color(53, 162, 159));
        lblManageTests.setText("Manage Tests");

        btnPrintReport.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        btnPrintReport.setForeground(new java.awt.Color(0, 153, 153));
        btnPrintReport.setText("Print Report");
        btnPrintReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrintReportMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnAddTest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtTestCost)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblTestCost, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblTestNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtTestCode, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblTestName, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtTestName, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnDeleteTest, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnUpdateTest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(btnPrintReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(115, 115, 115)
                                        .addComponent(lblManageTests, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblManageTests)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTestNumber)
                            .addComponent(lblTestName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTestName)
                            .addComponent(txtTestCode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTestCost)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTestCost, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(btnAddTest, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUpdateTest, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDeleteTest, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPrintReport, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /*Inserts test details to the database
      ADD Test details
    */
    
    private void btnAddTestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddTestMouseClicked
       
        if(txtTestCode.getText().isEmpty()|| txtTestName.getText().isEmpty()|| txtTestCost.getText().isEmpty())
       {
           JOptionPane.showMessageDialog(this,"Missing Data!");
       }
       else
       {
           try (Connection con = DriverManager.getConnection(  
                   "jdbc:mysql://localhost:3306/LaboratoryDb","root","Suha2005Munthasir")) 
           {
               PreparedStatement Add = con.prepareStatement("Insert into TestTbl values (?,?,?)");
               Add.setInt(1,Integer.valueOf(txtTestCode.getText()));
               Add.setString(2,txtTestName.getText());
               Add.setString(3,txtTestCost.getText());
               int row = Add.executeUpdate();
               JOptionPane.showMessageDialog(this,"Succesfully Added");
               ShowTest();
               
                txtTestCode.setText("");
                txtTestName.setText("");
                txtTestCost.setText("");
               
           }
            catch(SQLException e){ 
             JOptionPane.showMessageDialog(this,e.getMessage());  
        } 
       }
        
        
    }//GEN-LAST:event_btnAddTestMouseClicked

    //view  existing test data by clicking on a table row.
    private void tabletestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabletestMouseClicked
       DefaultTableModel model = (DefaultTableModel) tabletest.getModel();
       int Myindex = tabletest.getSelectedRow();
       txtTestCode.setText(model.getValueAt(Myindex,0).toString());
       txtTestName.setText(model.getValueAt(Myindex,1).toString());
       txtTestCost.setText(model.getValueAt(Myindex,2).toString());
       txtTestCode.setEditable(false);
    }//GEN-LAST:event_tabletestMouseClicked

    
    //Update Test data
    private void btnUpdateTestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateTestMouseClicked
       
        if(txtTestCode.getText().isEmpty()|| txtTestName.getText().isEmpty()|| txtTestCost.getText().isEmpty())
       {
           JOptionPane.showMessageDialog(this,"Missing Data!");
       }
       else
       {
           try (Connection con = DriverManager.getConnection(  
                   "jdbc:mysql://localhost:3306/LaboratoryDb","root","Suha2005Munthasir")) 
           {
               PreparedStatement Add = con.prepareStatement("Update TestTbl set TestName = ? , TestCost = ? where TestCode = ?");
               Add.setInt(3,Integer.valueOf(txtTestCode.getText()));
               Add.setString(1,txtTestName.getText());
               Add.setString(2,txtTestCost.getText());
               int row = Add.executeUpdate();
               JOptionPane.showMessageDialog(this,"Succesfully Updated");
               ShowTest();
               
                txtTestCode.setText("");
                txtTestName.setText("");
                txtTestCost.setText("");
               
           }
            catch(SQLException e){ 
             JOptionPane.showMessageDialog(this,e.getMessage());  
        } 
       }
    }//GEN-LAST:event_btnUpdateTestMouseClicked

    
    //Delete Test data
    private void btnDeleteTestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteTestMouseClicked
       
        if(txtTestCode.getText().isEmpty())
       {
           JOptionPane.showMessageDialog(this,"Select a Test");
       }
       else
       {
           try (Connection con = DriverManager.getConnection(  
                   "jdbc:mysql://localhost:3306/LaboratoryDb","root","Suha2005Munthasir")) 
           {
               PreparedStatement Add = con.prepareStatement("Delete from TestTbl  where TestCode = ?");
               Add.setInt(1,Integer.valueOf(txtTestCode.getText()));
               
               int row = Add.executeUpdate();
               JOptionPane.showMessageDialog(this,"Succesfully Deleted");
               ShowTest();
               txtTestCode.setEditable(true);
               
                txtTestCode.setText("");
                txtTestName.setText("");
                txtTestCost.setText("");
            
           }
            catch(SQLException e){ 
             JOptionPane.showMessageDialog(this,e.getMessage());  
        } 
       }
    }//GEN-LAST:event_btnDeleteTestMouseClicked

    private void lblPatientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPatientsMouseClicked
        new Patient().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblPatientsMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
       System.exit(0);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void lblResultsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblResultsMouseClicked
        new Results().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblResultsMouseClicked

    private void lblHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseClicked
         new HomePage().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_lblHomeMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    //Generates and displays a Jasper report for test data from the database.
    private void btnPrintReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintReportMouseClicked
         try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LaboratoryDb","root","Suha2005Munthasir");
            String path = "C:\\Users\\suham\\JaspersoftWorkspace\\MyReports\\Test.jrxml";
            JasperReport jr = JasperCompileManager.compileReport(path);
            JasperPrint jp = JasperFillManager.fillReport(jr,null,con);
            JasperViewer viewer = new JasperViewer(jp, false);
            viewer.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
            viewer.setVisible(true); 

            con.close();
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnPrintReportMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        //Using Lambda
        java.awt.EventQueue.invokeLater(()-> { new Test().setVisible(true);});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddTest;
    private javax.swing.JButton btnDeleteTest;
    private javax.swing.JButton btnPrintReport;
    private javax.swing.JButton btnUpdateTest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblLabTests;
    private javax.swing.JLabel lblManageTests;
    private javax.swing.JLabel lblPatients;
    private javax.swing.JLabel lblResults;
    private javax.swing.JLabel lblTestCost;
    private javax.swing.JLabel lblTestName;
    private javax.swing.JLabel lblTestNumber;
    private javax.swing.JTable tabletest;
    private javax.swing.JTextField txtTestCode;
    private javax.swing.JTextField txtTestCost;
    private javax.swing.JTextField txtTestName;
    // End of variables declaration//GEN-END:variables

    
       
  


  
}
