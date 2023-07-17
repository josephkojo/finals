/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package newpackage;

/**
 *
 * @author mrato
 */
import java.awt.Color;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
public class ManageBooks extends javax.swing.JFrame {

    /**
     * Creates new form ManageBooks
     */
    Color color = new Color(0,0,0);
    Color clicked = new Color(51,51,51);
    DefaultTableModel model;
    public ManageBooks() throws SQLException {
        initComponents();
        saveTableData();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtBookId = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtBookName = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtAuthor = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        rSMaterialButtonCircle2 = new rojerusan.RSMaterialButtonCircle();
        rSMaterialButtonCircle3 = new rojerusan.RSMaterialButtonCircle();
        rSMaterialButtonCircle4 = new rojerusan.RSMaterialButtonCircle();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Book_Details = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/AddNewBookIcons/icons8_Rewind_48px.png"))); // NOI18N
        jLabel1.setText("BACK");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 50));

        jLabel13.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Enter Book Id");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 229, 29));

        txtBookId.setBackground(new java.awt.Color(51, 51, 255));
        txtBookId.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtBookId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBookIdFocusLost(evt);
            }
        });
        txtBookId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBookIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtBookId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 270, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Enter  Book Name");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 229, 29));

        txtBookName.setBackground(new java.awt.Color(51, 51, 255));
        txtBookName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtBookName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBookNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtBookName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 270, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Author Name");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 229, 29));

        txtAuthor.setBackground(new java.awt.Color(51, 51, 255));
        txtAuthor.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtAuthor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAuthorFocusLost(evt);
            }
        });
        txtAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAuthorActionPerformed(evt);
            }
        });
        jPanel1.add(txtAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 270, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Quanty");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 229, 29));

        txtQuantity.setBackground(new java.awt.Color(51, 51, 255));
        txtQuantity.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });
        jPanel1.add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 270, 30));

        rSMaterialButtonCircle2.setBackground(new java.awt.Color(255, 51, 51));
        rSMaterialButtonCircle2.setText("Delete");
        rSMaterialButtonCircle2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSMaterialButtonCircle2MouseClicked(evt);
            }
        });
        rSMaterialButtonCircle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle2ActionPerformed(evt);
            }
        });
        jPanel1.add(rSMaterialButtonCircle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 540, 90, 60));

        rSMaterialButtonCircle3.setBackground(new java.awt.Color(255, 51, 51));
        rSMaterialButtonCircle3.setText("ADD");
        rSMaterialButtonCircle3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSMaterialButtonCircle3MouseClicked(evt);
            }
        });
        rSMaterialButtonCircle3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle3ActionPerformed(evt);
            }
        });
        jPanel1.add(rSMaterialButtonCircle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 90, 60));

        rSMaterialButtonCircle4.setBackground(new java.awt.Color(255, 51, 51));
        rSMaterialButtonCircle4.setText("UpDate");
        rSMaterialButtonCircle4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSMaterialButtonCircle4MouseClicked(evt);
            }
        });
        rSMaterialButtonCircle4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle4ActionPerformed(evt);
            }
        });
        jPanel1.add(rSMaterialButtonCircle4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, 90, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 820));
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 40));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Book_Details.setBackground(new java.awt.Color(204, 204, 255));
        Book_Details.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        Book_Details.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book Id", "Name", "Author Name", "Quanty"
            }
        ));
        Book_Details.setRowHeight(30);
        Book_Details.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Book_DetailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Book_Details);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 820, 410));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/AddNewBookIcons/icons8_Books_52px_1.png"))); // NOI18N
        jLabel2.setText("MANAGE BOOKS");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 330, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 1180, 820));

        setSize(new java.awt.Dimension(1740, 832));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
         HomePage home = new HomePage();
         home.setVisible(true);
         this.dispose();
        
       
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void saveTableData() throws SQLException{
        Connection con = DbConnection.getConnection();
    Statement statement = con.createStatement();
    ResultSet resultSet = statement.executeQuery("SELECT * FROM book_details");

    DefaultTableModel model = (DefaultTableModel) Book_Details.getModel();
    model.setRowCount(0); // Clear existing rows

    while (resultSet.next()) {
        int bookId = resultSet.getInt("book_id");
        String bookName = resultSet.getString("book_name");
        String author = resultSet.getString("author");
        int quantity = resultSet.getInt("quantity");
        Object[] details = {bookId, bookName, author, quantity};
        model.addRow(details);
    }
        
    }
    public void clearTable(){
        DefaultTableModel model = (DefaultTableModel) Book_Details.getModel();
        model.setRowCount(0);
        
    }
    private boolean upDateBook() throws SQLException{
        boolean isUpdated = false;
        int BookId = Integer.parseInt(txtBookId.getText());
        String BookName = txtBookName.getText();
        String Author = txtAuthor.getText();
        int quanty = Integer.parseInt(txtQuantity.getText());
        Connection con = DbConnection.getConnection();
        String Statements = "UPDATE book_details SET book_name = ?, author = ?, Quantity = ? WHERE book_id = ? ";
        PreparedStatement statement = con.prepareStatement(Statements);
        statement.setString(1, BookName);
        statement.setString(2, Author);
        statement.setInt(3, quanty);
        statement.setInt(4, BookId);
       int inserted = statement.executeUpdate();
       if(inserted > 0){
           isUpdated = true;
       }else{
           isUpdated = false;
       }
       return isUpdated;
                
        
    }
    public boolean deleteBook() throws SQLException{
        boolean isdeleted = false;
        int BookId = Integer.parseInt(txtBookId.getText());
        Connection connection = DbConnection.getConnection();
        String Query = "DELETE FROM book_details WHERE book_id = ?";
        PreparedStatement statement =  connection.prepareStatement(Query);
        statement.setInt(1, BookId);
        int result = statement.executeUpdate();
        if(result > 0){
            isdeleted = true;
        }else{
            isdeleted = false;
        }
        return isdeleted;
        
    }
    private void txtBookIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBookIdFocusLost
       
    }//GEN-LAST:event_txtBookIdFocusLost

    private void txtBookIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBookIdActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtBookIdActionPerformed

    private void txtBookNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBookNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBookNameActionPerformed

    private void txtAuthorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAuthorFocusLost
      
    }//GEN-LAST:event_txtAuthorFocusLost

    private void txtAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAuthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAuthorActionPerformed

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityActionPerformed

    private void rSMaterialButtonCircle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle2ActionPerformed
        // TODO add your handling code here:
      

    }//GEN-LAST:event_rSMaterialButtonCircle2ActionPerformed

    private void rSMaterialButtonCircle3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSMaterialButtonCircle3ActionPerformed

    private void rSMaterialButtonCircle4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSMaterialButtonCircle4ActionPerformed

    private void Book_DetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Book_DetailsMouseClicked
        int getSelectedRow =  Book_Details.getSelectedRow();
        TableModel tableModel = Book_Details.getModel();
        txtBookId.setText(tableModel.getValueAt(getSelectedRow,0).toString());
        txtBookName.setText(tableModel.getValueAt(getSelectedRow, 1).toString());
        txtAuthor.setText(tableModel.getValueAt(getSelectedRow, 2).toString());
        txtQuantity.setText(tableModel.getValueAt(getSelectedRow, 3).toString());
    }//GEN-LAST:event_Book_DetailsMouseClicked

    private void rSMaterialButtonCircle3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle3MouseClicked
         try {
        if (isAdded()) {
            JOptionPane.showMessageDialog(this, "Book Added Successfully");
            saveTableData(); // Update table data
        } else {
            JOptionPane.showMessageDialog(this, "Couldn't add the book to the database");
        }
    } catch (SQLException ex) {
        Logger.getLogger(ManageBooks.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_rSMaterialButtonCircle3MouseClicked

    private void rSMaterialButtonCircle4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle4MouseClicked
        try {
        if (upDateBook()) {
            JOptionPane.showMessageDialog(this, "Book has been successfully updated");
            saveTableData(); // Update table data
        } else {
            JOptionPane.showMessageDialog(this, "Updation failed");
        }
    } catch (SQLException ex) {
        Logger.getLogger(ManageBooks.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_rSMaterialButtonCircle4MouseClicked

    private void rSMaterialButtonCircle2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle2MouseClicked
        try {
        if (deleteBook()) {
            JOptionPane.showMessageDialog(this, "Book deleted successfully");
            saveTableData(); // Update table data
        } else {
            JOptionPane.showMessageDialog(this, "Could not delete book, try again");
        }
    } catch (SQLException ex) {
        Logger.getLogger(ManageBooks.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_rSMaterialButtonCircle2MouseClicked

    private Boolean isAdded() throws SQLException{
        boolean isAdded = false;
        int BookId = Integer.parseInt(txtBookId.getText());
        String BookName = txtBookName.getText();
        String Author = txtAuthor.getText();
        int quanty = Integer.parseInt(txtQuantity.getText());
        
        
        Connection connection  = DbConnection.getConnection();
        String query = "INSERT INTO book_details values (?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, BookId);
        statement.setString(2, BookName);
        statement.setString(3, Author);
        statement.setInt(4, quanty);
        
        
        int inserted = statement.executeUpdate();
        if(inserted > 0){
            isAdded = true;
        }else{
            isAdded = false;
        }
        return isAdded;
        
        
    }
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
            java.util.logging.Logger.getLogger(ManageBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ManageBooks().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ManageBooks.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Book_Details;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle2;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle3;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle4;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtBookId;
    private javax.swing.JTextField txtBookName;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}
