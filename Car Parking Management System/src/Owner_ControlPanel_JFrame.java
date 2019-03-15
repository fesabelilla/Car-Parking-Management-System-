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
import javax.swing.table.DefaultTableModel;

public class Owner_ControlPanel_JFrame extends javax.swing.JFrame {

    String filename = null;
    
    public Owner_ControlPanel_JFrame() {
        initComponents();
        show_Owners();
        show_Owners_address();
        //for middel
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2 - getHeight()/2);   
    }
    
    public  ArrayList<Owner>ownerList(){
  ArrayList <Owner> ownerList = new ArrayList<>();
  
        try {
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
             Connection connection = DriverManager  
                     .getConnection(  
                             "jdbc:sqlserver://localhost:1433;databaseName=Car_Parking_Management_System;selectMethod=cursor",   "sa", "123456");  
   
           String query1 = "SELECT OwnerId,UserName,FirstName,LastName,Password,PhoneNumber,NIDNumber,Gender,ParkingSlots,Images FROM Owner";
        
           Statement st  = connection.createStatement();
            ResultSet rs = st.executeQuery(query1);
        Owner owner;
         while(rs.next()){
             owner = new Owner(rs.getInt("OwnerId") ,rs.getString("UserName"),rs.getString("FirstName"),rs.getString( "LastName"),rs.getString("Password"),rs.getString("PhoneNumber"),rs.getString("NIDNumber"),rs.getString("Gender"),rs.getString("ParkingSlots"),rs.getBytes("Images"));
         ownerList.add(owner);
         }
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
  
  return ownerList;
}
    
    public void show_Owners(){
        ArrayList<Owner> list = ownerList();
        
        DefaultTableModel model = (DefaultTableModel)ownerControlpanel_Table.getModel();
        
        Object[] row = new Object[10];
        
        System.out.println(list.size());
        
        for(int i = 0 ; i<list.size();i++){
                    row[0] = list.get(i).getOwnerId();
                    row[1] = list.get(i).getUserName();
                    row[2] = list.get(i).getFirstName();
                    row[3] = list.get(i).getLastName();
                    row[4] = list.get(i).getPassword();
                    row[5] = list.get(i).getPhoneNumber();
                    row[6] = list.get(i).getNIDNumber();
                    row[7] = list.get(i). getGender();
                    row[8] = list.get(i).getParkingSlots();
                    row[9] = list.get(i).getImages();
                    model.addRow(row);
        }
    }
 
    public  ArrayList<Owner_address>ownerAddressList(){
  ArrayList <Owner_address> ownerAddressList = new ArrayList<>();
  
        try {
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
             Connection connection = DriverManager  
                     .getConnection(  
                             "jdbc:sqlserver://localhost:1433;databaseName=Car_Parking_Management_System;selectMethod=cursor",   "sa", "123456");  
   
           String query1 = "SELECT * FROM OwnersAddress";
        
           Statement st  = connection.createStatement();
            ResultSet rs = st.executeQuery(query1);
        Owner_address owner_address;
         while(rs.next()){
             owner_address = new Owner_address(rs.getInt("OwnerId") ,rs.getInt("AddressId") ,rs.getString("Area"),rs.getString("Sector"),rs.getString( "RodeNumber"),rs.getString("HouseNumber"));
         ownerAddressList.add(owner_address);
         }
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
     
  return ownerAddressList;
}
    
    public void show_Owners_address(){
        ArrayList<Owner_address> list = ownerAddressList();
        
        DefaultTableModel model = (DefaultTableModel)Owner_address_Table.getModel();
        
        Object[] row = new Object[10];
  
        System.out.println(list.size());
        
        for(int i = 0 ; i<list.size();i++){
                    row[0] = list.get(i).getOwnerId();
                    row[1] = list.get(i).getAddressId();
                    row[2] = list.get(i).getArea();
                    row[3] = list.get(i).getSector();
                    row[4] = list.get(i).getRodeNumber();
                    row[5] = list.get(i).getHouseNumber();
                    //row[9] = list.get(i).  
                    model.addRow(row);
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ownerControlpanel_Table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Owner_address_Table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        refreshButton = new javax.swing.JButton();
        Owner_Img_Label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ownerControlpanel_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OwnerId", "UserName", "FirstName", "LastName", "Password", "PhoneNumber", "NIDNumber", "Gender", "ParkingSlots", "Images"
            }
        ));
        ownerControlpanel_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ownerControlpanel_TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ownerControlpanel_Table);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("                          Owner Control Panel");

        Owner_address_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OwnerId", "AddressId", "Area", "Sector", "RodeNumber", "HouseNumber"
            }
        ));
        jScrollPane2.setViewportView(Owner_address_Table);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("               Addres");

        refreshButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(474, 474, 474))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(186, 186, 186)
                        .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 993, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 993, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(Owner_Img_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(Owner_Img_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        DefaultTableModel dft1 = (DefaultTableModel)ownerControlpanel_Table.getModel();
        DefaultTableModel dft2 = (DefaultTableModel)Owner_address_Table.getModel();
        dft1.setRowCount(0);
        dft2.setRowCount(0);
        show_Owners();
        show_Owners_address();
        Owner_Img_Label.setIcon(null);
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void ownerControlpanel_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ownerControlpanel_TableMouseClicked
        int i = ownerControlpanel_Table.getSelectedRow();
        byte[] img = (ownerList().get(i).getImages());
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(Owner_Img_Label.getWidth(),Owner_Img_Label.getHeight(),Image.SCALE_SMOOTH));
        Owner_Img_Label.setIcon(imageIcon);    
    }//GEN-LAST:event_ownerControlpanel_TableMouseClicked

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Owner_ControlPanel_JFrame().setVisible(true);
                
                
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Owner_Img_Label;
    private javax.swing.JTable Owner_address_Table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable ownerControlpanel_Table;
    private javax.swing.JButton refreshButton;
    // End of variables declaration//GEN-END:variables
}
