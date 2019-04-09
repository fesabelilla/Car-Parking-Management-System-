import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class User_Homepage extends javax.swing.JFrame {
USERPROFILE_FINAL uf ;
UserHistory uhh;
   
int totalBill;

int UserID;

    public User_Homepage() {
        initComponents();

        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2 - getHeight()/2);  
    }

   public User_Homepage(USERPROFILE_FINAL uf,UserHistory uhh) {
       
        initComponents();
        this.uf= uf;
       this.uhh = uhh;
       
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2 - getHeight()/2);  
    }




    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        profileButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        doneButton = new javax.swing.JButton();
        ownerPhoneNumberTextField = new javax.swing.JTextField();
        startingTimeTextField = new javax.swing.JTextField();
        DurationTextField = new javax.swing.JTextField();
        priceTextField = new javax.swing.JTextField();
        SearchButton = new javax.swing.JButton();
        areaTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        User_Search_Table = new javax.swing.JTable();
        SectorTextField = new javax.swing.JTextField();
        roadNumberTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        refreshButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        endingTimeTextField = new javax.swing.JTextField();
        totalBillTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        historyButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        profileButton.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        profileButton.setText("Profile");
        profileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileButtonActionPerformed(evt);
            }
        });

        logoutButton.setBackground(new java.awt.Color(51, 51, 0));
        logoutButton.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(255, 255, 255));
        logoutButton.setText("Log Out");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Phone Number");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Starting Time");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Duration");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Per Hour Price");

        doneButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        doneButton.setText("Done");
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtonActionPerformed(evt);
            }
        });

        ownerPhoneNumberTextField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        startingTimeTextField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        DurationTextField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        priceTextField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        SearchButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SearchButton.setText("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        areaTextField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        areaTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                areaTextFieldKeyTyped(evt);
            }
        });

        User_Search_Table.setBackground(new java.awt.Color(204, 204, 204));
        User_Search_Table.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        User_Search_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Owner Phone Number", "Name", "Area", "Sector", "RodeNumber", "HouseNumber", "Per Hour Price"
            }
        ));
        User_Search_Table.setGridColor(new java.awt.Color(0, 51, 51));
        User_Search_Table.setSelectionBackground(new java.awt.Color(255, 255, 255));
        User_Search_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                User_Search_TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(User_Search_Table);

        SectorTextField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        roadNumberTextField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Area");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Sector");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Road Number");

        refreshButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Ending Time");

        endingTimeTextField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        totalBillTextField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Total Bill");

        historyButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        historyButton.setText("History");
        historyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(logoutButton)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(449, 449, 449))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(116, 116, 116)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ownerPhoneNumberTextField)
                            .addComponent(startingTimeTextField)
                            .addComponent(DurationTextField)
                            .addComponent(priceTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                            .addComponent(endingTimeTextField))
                        .addGap(87, 87, 87)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(totalBillTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(54, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(SectorTextField)
                                .addComponent(areaTextField)
                                .addComponent(roadNumberTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(240, 240, 240))
                            .addComponent(profileButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(historyButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(areaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(profileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SectorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(roadNumberTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(historyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(ownerPhoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startingTimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(endingTimeTextField)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DurationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(totalBillTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void profileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileButtonActionPerformed
       
        User_Profile up = new User_Profile(uf,uhh);
        System.out.println(uf.getLastName()+" login");
       
        up.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_profileButtonActionPerformed

    public  void Time(){
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
                Calendar cal = Calendar.getInstance();
                
                 startingTimeTextField.setText(dateFormat.format(cal.getTime()));
               }
        }).start();
    }

    
    public  ArrayList<UserSearchGetValue>OwnerList(){
  ArrayList <UserSearchGetValue> ownerList = new ArrayList<>();
  
        try {
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
             Connection connection = DriverManager  
                     .getConnection(  
                             "jdbc:sqlserver://localhost:1433;databaseName=Car_Parking_Management_System;selectMethod=cursor",   "sa", "123456");  
   
          String query1 = "select Owner.PhoneNumber,Owner.FirstName,Owner.Price,OwnersAddress.Area,OwnersAddress.Sector,OwnersAddress.RodeNumber,OwnersAddress.HouseNumber from Owner full join OwnersAddress on Owner.OwnerId = OwnersAddress.OwnerId  where OwnersAddress.Area = ? and OwnersAddress.Sector = ? and OwnersAddress.RodeNumber = ? and Owner.OwnerId  in (select OwnerId from  ParkingSlot where Reserved = 0)";
          //and Owner.OwnerId  in (select OwnerId from  ParkingSlot where Reserved = 0)
           //String query1 = "SELECT Owner.PhoneNumber,Owner.FirstName,Owner.Price,OwnersAddress.Area,OwnersAddress.Sector,OwnersAddress.RodeNumber,OwnersAddress.HouseNumber from Owner full join OwnersAddress on Owner.OwnerId = OwnersAddress.OwnerId WHERE CONCAT('Owner.PhoneNumber','Owner.FirstName','Owner.Price','OwnersAddress.Area','OwnersAddress.Sector','OwnersAddress.RodeNumber','OwnersAddress.HouseNumber') LIKE '%"+ValToSearch+"%'";
           
           PreparedStatement pst = connection.prepareStatement(query1);
            
            pst.setString(1,areaTextField.getText());
            pst.setString(2,SectorTextField.getText());
            pst.setString(3,roadNumberTextField.getText());

            ResultSet rs = pst.executeQuery();
            
        UserSearchGetValue usgv;
         while(rs.next()){
             usgv = new UserSearchGetValue(rs.getString("PhoneNumber"),rs.getString("FirstName"),rs.getString("Area"),rs.getString( "Sector"),rs.getString("RodeNumber"),rs.getString("HouseNumber"),rs.getInt("Price"));
         ownerList.add(usgv);
         }
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
  
  return ownerList;
}
    
    public void show_Owners(){
        
        //SearchTextField.getText()
        ArrayList<UserSearchGetValue> list = OwnerList();
        
        DefaultTableModel model = (DefaultTableModel)User_Search_Table.getModel();
        
        Object[] row = new Object[9];
        
        System.out.println(list.size());
        
        for(int i = 0 ; i<list.size();i++){
                          
                    row[0] = list.get(i).getPhoneNumber();
                    row[1] = list.get(i).getFirstName();
                    row[2] = list.get(i).getArea();
                    row[3] = list.get(i).getSector();
                    row[4] = list.get(i).getRodeNumber();
                    row[5] = list.get(i).getHouseNumber();
                    row[6] = list.get(i).getPrice();
                    model.addRow(row);
        }
    }
    
    
    
    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        FirstPageJFrame cp = new FirstPageJFrame();
        cp.setVisible(true);
        setVisible(false);

    }//GEN-LAST:event_logoutButtonActionPerformed

    private void User_Search_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_User_Search_TableMouseClicked

        int i = User_Search_Table.getSelectedRow();

        TableModel model = User_Search_Table.getModel();
        Time();
        ownerPhoneNumberTextField.setText(model.getValueAt(i,0).toString());
        // startingTimeTextField.setText(model.getValueAt(i,2).toString());
        // DurationTextField.setText(model.getValueAt(i,3).toString());
        priceTextField.setText(model.getValueAt(i, 6).toString());
    }//GEN-LAST:event_User_Search_TableMouseClicked

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        show_Owners();
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void areaTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_areaTextFieldKeyTyped
        /*  DefaultTableModel defaultTableModel = (DefaultTableModel)User_Search_Table.getModel();
        String search = SearchTextField.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(defaultTableModel);
        User_Search_Table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));*/
    }//GEN-LAST:event_areaTextFieldKeyTyped

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
         User_Search_Table.setModel(new DefaultTableModel(null,new String[]{ "Owner Phone Number", "Name", "Area", "Sector", "RodeNumber", "HouseNumber", "Price"}));
         
        ownerPhoneNumberTextField.setText(" ");
        startingTimeTextField.setText(" ");
        endingTimeTextField.setText(" ");
        DurationTextField.setText(" ");
        totalBillTextField.setText(" ");
         
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
             Connection connection = DriverManager  
                     .getConnection(  
                             "jdbc:sqlserver://localhost:1433;databaseName=Car_Parking_Management_System;selectMethod=cursor",   "sa", "123456");  
   
        //String query1 = "insert into Owner(UserName,FirstName,LastName,Password,PhoneNumber,NIDNumber,Gender,ParkingSlots,Price,Images)values(?,?,?,?,?,?,?,?,?,?)";
        
        int row = User_Search_Table.getSelectedRow();
        
         String value = (User_Search_Table.getModel().getValueAt(row, 0).toString());
        String query = "update ParkingSlot set StartingTime = ? ,EndingTime = ? ,Duration = ? ,Reserved = 1, TotalBill = ? where PhoneNmber = "+value;
        PreparedStatement pst = connection.prepareStatement(query);
        
      
        pst.setString(1, startingTimeTextField.getText());
        pst.setString(2,endingTimeTextField.getText());
        pst.setString(3, DurationTextField.getText());
        
        totalBill = (Integer.parseInt(priceTextField.getText()))*(Integer.parseInt(DurationTextField.getText()));
        totalBillTextField.setText(Integer.toString(totalBill));
         pst.setInt(4,Integer.parseInt(totalBillTextField.getText()));
            System.out.println(totalBill+" "+value);
       
            
            int OwnerId = 0,SlotId = 0;
         String sql = "SELECT * FROM ParkingSlot where PhoneNmber = ?";
         

         try (PreparedStatement pst1 = connection.prepareStatement(sql)) {
             pst1.setString(1,value);
    try (ResultSet rs = pst1.executeQuery()) {
        if (rs.next()) { 
            OwnerId = rs.getInt("OwnerId");
            SlotId = rs.getInt("SloatId");
        } 
        else{
            System.out.println("Company with ID: " + value + " could not be found\n"); 
        }
    }
} catch (SQLException e) {   
    System.out.println(e);  
}  
 
            pst.executeUpdate();

            int UserID = uf.getUserID();
         
            System.out.println(OwnerId+SlotId+UserID);
         
         String query2 = "insert into Uses(SloatId,UserID,OwnerId,StartingTime,EndingTime,Duration,TotalBill)values(?,?,?,?,?,?,?)";
         
         PreparedStatement pst2 = connection.prepareStatement(query2);
         
         pst2.setInt(1,SlotId);
         pst2.setInt(2,UserID);
         pst2.setInt(3,OwnerId);
         pst2.setString(4,startingTimeTextField.getText());
         pst2.setString(5,endingTimeTextField.getText());
         pst2.setString(6, DurationTextField.getText());
         pst2.setInt(7,Integer.parseInt(totalBillTextField.getText()));
 
         pst2.executeUpdate();
  
         JOptionPane.showMessageDialog(null,"Parking Slot is Booked ");
        } catch (Exception e) {
            e.printStackTrace(); 
        }

        
        
    }//GEN-LAST:event_doneButtonActionPerformed

    private void historyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyButtonActionPerformed
        UserHistry Uhh = new UserHistry(uf,uhh);
        Uhh.show_Users();
        Uhh.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_historyButtonActionPerformed

  
    

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_Homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DurationTextField;
    private javax.swing.JButton SearchButton;
    private javax.swing.JTextField SectorTextField;
    private javax.swing.JTable User_Search_Table;
    private javax.swing.JTextField areaTextField;
    private javax.swing.JButton doneButton;
    private javax.swing.JTextField endingTimeTextField;
    private javax.swing.JButton historyButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JTextField ownerPhoneNumberTextField;
    private javax.swing.JTextField priceTextField;
    private javax.swing.JButton profileButton;
    private javax.swing.JButton refreshButton;
    private javax.swing.JTextField roadNumberTextField;
    private javax.swing.JTextField startingTimeTextField;
    private javax.swing.JTextField totalBillTextField;
    // End of variables declaration//GEN-END:variables
}
