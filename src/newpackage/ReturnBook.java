/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package newpackage;

import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;


/**
 *
 * @author mrato
 */
public class ReturnBook extends javax.swing.JFrame {

    /**
     * Creates new form IssueBooking
     */
    public ReturnBook() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        dueDate = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        studentName = new javax.swing.JLabel();
        booksName = new javax.swing.JLabel();
        IssuedDate = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        dueDate1 = new javax.swing.JLabel();
        dueDate2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        getBooks = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        getIndexs = new javax.swing.JTextField();
        btnIssue = new rojerusan.RSMaterialButtonCircle();
        btnIssue1 = new rojerusan.RSMaterialButtonCircle();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 102, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI Black", 0, 17)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/AddNewBookIcons/icons8_Rewind_48px.png"))); // NOI18N
        jLabel14.setText("BACK");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel14);

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 50));

        jLabel15.setText("jLabel2");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 160, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI Black", 1, 19)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/AddNewBookIcons/icons8_Literature_100px_1.png"))); // NOI18N
        jLabel16.setText("BOOK DETAILS");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 260, -1));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 218, 280, 10));

        jLabel17.setText("jLabel4");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 100, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("ISSUE ID:");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 120, 30));

        dueDate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dueDate.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(dueDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 540, 130, 20));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Book Name:");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 110, 30));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("ISSUED DATE:");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 120, 30));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("STUDENT NAME");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 110, -1));

        studentName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        studentName.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(studentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 150, 20));

        booksName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        booksName.setForeground(new java.awt.Color(255, 255, 255));
        booksName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                booksNameMouseClicked(evt);
            }
        });
        jPanel4.add(booksName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 200, 20));

        IssuedDate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IssuedDate.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(IssuedDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 160, 20));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 130, 20));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("DUE DATE:");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 120, 30));

        dueDate1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dueDate1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(dueDate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 130, 20));

        dueDate2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dueDate2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(dueDate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, 130, 20));

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/AddNewBookIcons/icons8_Books_52px_1.png"))); // NOI18N
        jLabel1.setText("RETURN BOOK");

        jLabel19.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
        jLabel19.setText("BOOK ID");

        getBooks.setBackground(new java.awt.Color(204, 204, 255));
        getBooks.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        getBooks.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                getBooksFocusLost(evt);
            }
        });
        getBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getBooksActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 102, 102));
        jLabel25.setText("Index Number");

        getIndexs.setBackground(new java.awt.Color(204, 204, 255));
        getIndexs.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        getIndexs.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                getIndexsFocusLost(evt);
            }
        });
        getIndexs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getIndexsActionPerformed(evt);
            }
        });

        btnIssue.setBackground(new java.awt.Color(153, 153, 255));
        btnIssue.setText("FIND");
        btnIssue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIssueMouseClicked(evt);
            }
        });
        btnIssue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIssueActionPerformed(evt);
            }
        });

        btnIssue1.setBackground(new java.awt.Color(255, 51, 51));
        btnIssue1.setText("RETURN BOOK");
        btnIssue1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIssue1MouseClicked(evt);
            }
        });
        btnIssue1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIssue1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnIssue1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(139, 139, 139)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(20, 20, 20)
                                            .addComponent(getBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(20, 20, 20)
                                            .addComponent(getIndexs, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(298, 298, 298)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(227, 227, 227)
                                .addComponent(btnIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(510, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getIndexs, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(btnIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIssue1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 804, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1410, 790));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void displayBookDetail() throws SQLException{
       int bookId =  Integer.parseInt(getBooks.getText());
       String studentID  = getIndexs.getText();
       Connection connection = DbConnection.getConnection();
       String query = "SELECT * FROM details_issue WHERE book_id = ? And student_id = ?";
       PreparedStatement statement = connection.prepareStatement(query);
       statement.setInt(1, bookId);
       statement.setString(2, studentID);
       ResultSet resultSet = statement.executeQuery();
       if(resultSet.next()){
           studentName.setText(resultSet.getString("student_name"));
           booksName.setText(resultSet.getString("book_name"));
           IssuedDate.setText(resultSet.getString("issue_date"));
           jLabel26.setText(resultSet.getString("issue_date"));
           dueDate.setText(resultSet.getString("issueId"));
       }else{
           JOptionPane.showMessageDialog(this, "Student with ID "+ studentID + " and book ID "+ "does not exist");
           studentName.setText("");
           booksName.setText("");
           IssuedDate.setText("");
           jLabel26.setText("");
           dueDate.setText("");
           
           
       }
       
        
    }
   private boolean returnBook() throws SQLException {
    try {
        int bookId = Integer.parseInt(getBooks.getText());
        String studentID = getIndexs.getText();

        // Input validation - Check if bookId and studentID are valid.

        Connection connection = DbConnection.getConnection();
        String query = "UPDATE details_issue SET status = ? WHERE book_id = ? AND student_id = ? AND status = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, "Returned");
        statement.setInt(2, bookId);
        statement.setString(3, studentID);
        statement.setString(4, "pending");
        int updated = statement.executeUpdate();

        // Resource Cleanup
        statement.close();
        connection.close();

        return updated > 0;
    } catch (NumberFormatException e) {
        // Handle the case where parsing bookId or studentID fails (invalid input).
        // You might want to log the error or show an error message to the user.
        return false;
    }
}

    
        
    
    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseClicked

    private void getBooksFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_getBooksFocusLost
       
    }//GEN-LAST:event_getBooksFocusLost

    private void getBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getBooksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getBooksActionPerformed

    private void getIndexsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_getIndexsFocusLost

        
        
    }//GEN-LAST:event_getIndexsFocusLost

    private void getIndexsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getIndexsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getIndexsActionPerformed

    private void btnIssueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIssueMouseClicked
       
        try {
            displayBookDetail();
            getBooks.setText("");
            getIndexs.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(ReturnBook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnIssueMouseClicked

    private void btnIssueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIssueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIssueActionPerformed

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        HomePage pages = new HomePage();
        pages.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel5MouseClicked

    private void btnIssue1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIssue1MouseClicked
        try {
            if(returnBook()){
                 String bookId =  getBooks.getText();
                JOptionPane.showMessageDialog(this, "Book with ID " + bookId + " has been successfully returned");
                
            }else{
                JOptionPane.showMessageDialog(this, "Failed to return book");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReturnBook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnIssue1MouseClicked

    private void btnIssue1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIssue1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIssue1ActionPerformed

    private void booksNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booksNameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_booksNameMouseClicked

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
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IssuedDate;
    private javax.swing.JLabel booksName;
    private rojerusan.RSMaterialButtonCircle btnIssue;
    private rojerusan.RSMaterialButtonCircle btnIssue1;
    private javax.swing.JLabel dueDate;
    private javax.swing.JLabel dueDate1;
    private javax.swing.JLabel dueDate2;
    private javax.swing.JTextField getBooks;
    private javax.swing.JTextField getIndexs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel studentName;
    // End of variables declaration//GEN-END:variables
}
