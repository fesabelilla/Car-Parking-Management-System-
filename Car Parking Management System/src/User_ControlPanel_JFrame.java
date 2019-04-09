import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class User_ControlPanel_JFrame extends javax.swing.JFrame {

    
    public User_ControlPanel_JFrame() {
        initComponents();
        
        show_Users();
        
        //mid screen
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2 - getHeight()/2);   
    }

    
   public ArrayList<User> userList(){
       ArrayList<User> userList = new ArrayList<>();
       try {
       Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
             Connection connection = DriverManager  
                     .getConnection(  
                             "jdbc:sqlserver://localhost:1433;databaseName=Car_Parking_Management_System;selectMethod=cursor",   "sa", "123456");  
             String query1 = "SELECT * FROM Users";
        
           Statement st = connection.createStatement();
           ResultSet rs = st.executeQuery(query1);
           
           User user;
           
           while(rs.next()){
               user = new User(rs.getInt("UserId") ,rs.getString("UserName"),rs.getString("FirstName"),rs.getString( "LastName"),rs.getString("Password"),rs.getString("PhoneNumber"),rs.getString("LicenceNumber"),rs.getString("NIDNumber"),rs.getString("Gender"),rs.getString("UserType"),rs.getBytes("Images"));
               userList.add(user);
           }
           
       } 
       
       catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
       }
       
       
      return userList; 
    }
   
    public void show_Users(){
        ArrayList<User> list = userList();
        
        DefaultTableModel model = (DefaultTableModel)user_controlPanel_Table.getModel();
        
        Object[] row = new Object[11];
        
        System.out.println(list.size());
        
        for(int i = 0 ; i<list.size();i++){
                    row[0] = list.get(i).getUserId();
                    row[1] = list.get(i).getUserName();
                    row[2] = list.get(i).getFirstName();
                    row[3] = list.get(i).getLastName();
                    row[4] = list.get(i).getPassword();
                    row[5] = list.get(i).getPhoneNumber();
                    row[6] = list.get(i).getLicenceNumber();
                    row[7] = list.get(i).getNIDNumber();
                    row[8] = list.get(i). getGender();
                    row[9] = list.get(i).getUserType();
                    row[10] = list.get(i).getImages();
                    model.addRow(row);
        }
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        user_controlPanel_Table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        refreshButton = new javax.swing.JButton();
        user_Img_Label = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        search_TextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setType(java.awt.Window.Type.POPUP);

        user_controlPanel_Table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        user_controlPanel_Table.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        user_controlPanel_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UserID", "UserName", "FirstName", "LastName", "Password", "PhoneNumber", "LicenceNumber", "NIDNumber", "Gender", "UserType", "Images"
            }
        ));
        user_controlPanel_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user_controlPanel_TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(user_controlPanel_Table);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("              User  Control Panel");

        refreshButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        user_Img_Label.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 102)));

        backButton.setBackground(new java.awt.Color(255, 255, 255));
        backButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Search");

        search_TextField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        search_TextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_TextFieldKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113)
                        .addComponent(search_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 598, Short.MAX_VALUE)
                        .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(user_Img_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(323, 323, 323)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(user_Img_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dft = (DefaultTableModel)user_controlPanel_Table.getModel();
        dft.setRowCount(0);
        show_Users();
        user_Img_Label.setIcon(null); 
        
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void user_controlPanel_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_controlPanel_TableMouseClicked
         int i = user_controlPanel_Table.getSelectedRow();
        byte[] img = (userList().get(i).getImages());
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(user_Img_Label.getWidth(),user_Img_Label.getHeight(),Image.SCALE_SMOOTH));
        user_Img_Label.setIcon(imageIcon); 
    }//GEN-LAST:event_user_controlPanel_TableMouseClicked

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
       ControlPanel cp = new ControlPanel();
       cp.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void search_TextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_TextFieldKeyReleased
        // TODO add your handling code here:
        DefaultTableModel defaultTableModel = (DefaultTableModel)user_controlPanel_Table.getModel();
        String search = search_TextField.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(defaultTableModel);
        user_controlPanel_Table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
        
    }//GEN-LAST:event_search_TextFieldKeyReleased

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_ControlPanel_JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshButton;
    private javax.swing.JTextField search_TextField;
    private javax.swing.JLabel user_Img_Label;
    private javax.swing.JTable user_controlPanel_Table;
    // End of variables declaration//GEN-END:variables
}
