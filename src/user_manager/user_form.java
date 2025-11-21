package user_manager;
import java.sql.* ;
import javax.swing.JOptionPane;
public class user_form extends javax.swing.JFrame {
    public String userName , email ;
    public int phone , userId;
    private String tableName = "userinfo";
    public Connection conn ;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(user_form.class.getName());

    public user_form() {
        initComponents();
        conn = DB_Util.getConnection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        userIdField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        userNameField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        phoneField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        insertBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        viewBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("User Id");

        jLabel3.setText("User Name");

        jLabel4.setText("Email");

        phoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("Phone");

        insertBtn.setText("Insert");
        insertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        viewBtn.setText("View");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailField)
                            .addComponent(phoneField)
                            .addComponent(userNameField)
                            .addComponent(userIdField)))
                    .addComponent(exitBtn)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(insertBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updateBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewBtn)))
                .addGap(104, 104, 104))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(userIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(userNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(insertBtn)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(viewBtn)
                        .addComponent(deleteBtn)
                        .addComponent(updateBtn)))
                .addGap(28, 28, 28)
                .addComponent(exitBtn)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        int result = JOptionPane.showConfirmDialog(null,
                "Are you sure you want to exit?",
                "Confirm Exit",
                JOptionPane.YES_OPTION,
                JOptionPane.WARNING_MESSAGE);
                if(result == JOptionPane.YES_OPTION){
                    System.exit(0);
                }else{}
    }//GEN-LAST:event_exitBtnActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed

        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from "+ tableName);
            while (rs.next()) {
                int id = rs.getInt("userid");
                String name = rs.getString("name");
                int phone = rs.getInt("phone");
                String email = rs.getString("email");
                System.out.println(id + " | " + name + " | " + email + " | " + phone);
            }
            rs.close();
            stmt.close();
        }catch(SQLException err){
            System.out.println("Error : "+ err);
            showModal("error", "Something went wrong , please check the console");
        }
    }//GEN-LAST:event_viewBtnActionPerformed

    public void showModal(String type , String mssg){
        if("error".equals(type))JOptionPane.showMessageDialog(null, mssg,"Error",JOptionPane.ERROR_MESSAGE);
        if("warning".equals(type))JOptionPane.showMessageDialog(null, mssg,"Warning",JOptionPane.WARNING_MESSAGE);
        if("success".equals(type))JOptionPane.showMessageDialog(null, mssg,"Success",JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // If input is empty
        if(userIdField.getText().equals("")){
            showModal("warning", "User Id can't be empty");
            return ;
        };
        userId = Integer.parseInt(userIdField.getText());
        try{
            String query = "select * from userinfo where userid = '"+userId+"'";
            PreparedStatement pst = conn.prepareStatement(query);
            ResultSet rs = pst.executeQuery() ;
            
            if(rs.next()){
                int result = JOptionPane.showConfirmDialog(null,
                "Are you sure you want to delete this record?",
                "Confirm Delete",
                JOptionPane.YES_OPTION,
                JOptionPane.WARNING_MESSAGE);
                query = "delete from userinfo where userid = ?";
                
                if(result == JOptionPane.YES_OPTION){
                    try{
                    PreparedStatement ps = conn.prepareStatement(query);
                    ps.setInt(1,userId);
                    ps.executeUpdate();

                    clearFields();
                    showModal("success", "User Deleted Successfully");
                    }catch(SQLException err){
                        showModal("error", "Something went wrong please check the console!");
                        System.out.println("Error : "+err);
                    }
                }else{

                }
            }else{
                showModal("warning", "User id not found!");
                return;
            }
            pst.close();
            rs.close();
        }catch(SQLException err){
            System.out.println("Error: "+err);
            showModal("error", "Something went wrong , please check the console");
        }
      
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        if(userIdField.getText().isEmpty() || phoneField.getText().isEmpty()){
            showModal("warning", "Plase input user id and phone number");
            return ;
        }
        userId = Integer.parseInt(userIdField.getText());
        phone = Integer.parseInt(phoneField.getText());
        
        String updatingQuery = "update userinfo set phone = ? where userid = ?";
        String findingQuery = "select * from userinfo where userid = '"+userId+"'";
        try{
            PreparedStatement pst = conn.prepareStatement(findingQuery);
            ResultSet rs = pst.executeQuery() ;
            
            if(!rs.next()){
                showModal("warning", "User Id not found!");
                return ;
            }
            pst.close();
            rs.close();
            PreparedStatement ps = conn.prepareStatement(updatingQuery);
            ps.setInt(1,phone);
            ps.setInt(2,userId);
            ps.executeUpdate();
            ps.close();
            
            showModal("success","User phone number updated");
            clearFields();
//            System.out.println("Updated Successfully");
        }catch(SQLException err){
            System.out.println("Error : "+err);
            showModal("error", "Something went wrong , please check the console");
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void insertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBtnActionPerformed
        if("".equals(userNameField.getText())||"".equals(emailField.getText())||"".equals(phoneField.getText())||"".equals(userIdField.getText())){
           showModal("warning", "Please fill up all fields");
           return ; 
        }
        
        loadFieldsToVariables();
        String query = "insert into "+ tableName +" values('"+userId+"','"+userName+"','"+email+"','"+phone+"')";
        try{
            String findingQuery = "select * from userinfo where userid = '"+userId+"'";
            PreparedStatement pst = conn.prepareStatement(findingQuery);
            ResultSet rs = pst.executeQuery() ;
            
            if(rs.next()){
                showModal("warning", "User ID already exits");
                rs.close();
                pst.close();
                return ;
            }
            Statement smt = conn.createStatement();
            int result = smt.executeUpdate(query);
            if(result>0){
//                System.out.println("Query executed successfully");
                showModal("success", "New user added : "+userName);
                smt.close();
                clearFields();
            }else System.out.println("Something went wrong with query");
        }catch(SQLException e){
            System.out.println("Error : "+ e);
            showModal("error", "Something went wrong , please check the console");
        }
    }//GEN-LAST:event_insertBtnActionPerformed

    private void phoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneFieldActionPerformed

    // User defined methods
    public void clearFields(){
        userIdField.setText("");
        userNameField.setText("");
        emailField.setText("");
        phoneField.setText("");
    }
    
    public void loadFieldsToVariables(){
        userId = Integer.parseInt(userIdField.getText());
        userName = userNameField.getText();
        email = emailField.getText();
        phone = Integer.parseInt(phoneField.getText());
    }
      
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new user_form().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField emailField;
    private javax.swing.JButton exitBtn;
    private javax.swing.JButton insertBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField phoneField;
    private javax.swing.JButton updateBtn;
    private javax.swing.JTextField userIdField;
    private javax.swing.JTextField userNameField;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}
