
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class SlotBookingControlPanel extends javax.swing.JFrame {

    public SlotBookingControlPanel() {
        initComponents();
        
        showSlotHistory();
        
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2 - getHeight()/2);   
  
    }
    
    
    public ArrayList<SlotBooked> slotList(){
       ArrayList<SlotBooked> slotList = new ArrayList<>();
       try {
       Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
             Connection connection = DriverManager  
                     .getConnection(  
                             "jdbc:sqlserver://localhost:1433;databaseName=Car_Parking_Management_System;selectMethod=cursor",   "sa", "123456");  
             String query1 = "SELECT * from Uses";
        
           Statement st = connection.createStatement();
           ResultSet rs = st.executeQuery(query1);
           
          SlotBooked slotBooked;
           
           while(rs.next()){
               slotBooked = new SlotBooked(rs.getInt("SloatId"),rs.getInt("UserId") ,rs.getInt("OwnerId"),rs.getString("StartingTime"),rs.getString( "EndingTime"),rs.getInt("Duration"),rs.getDouble("TotalBill"));
               slotList.add(slotBooked);
           }
           
       } 
       
       catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
       }
       
       
      return slotList; 
    }
   
    public void showSlotHistory(){
        ArrayList<SlotBooked> list = slotList();
        
        DefaultTableModel model = (DefaultTableModel)slotBookedTable.getModel();
        
        Object[] row = new Object[7];
        
        System.out.println(list.size());
        
        for(int i = 0 ; i<list.size();i++){
                    row[0] = list.get(i).getSloatId();
                    row[1] = list.get(i).getUserID();
                    row[2] = list.get(i).getOwnerId();
                    row[3] = list.get(i).getStartingTime();
                    row[4] = list.get(i).getEndingTime();
                    row[5] = list.get(i).getDuration();
                    row[6] = list.get(i).getTotalBill();
                    model.addRow(row);
        }
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        slotBookedTable = new javax.swing.JTable();
        refreshButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        slotBookedTable.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        slotBookedTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SloatId", "UserID", "OwnerId", "StartingTime", "EndingTime", "Duration", "TotalBill"
            }
        ));
        jScrollPane1.setViewportView(slotBookedTable);

        refreshButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        DefaultTableModel dft = (DefaultTableModel)slotBookedTable.getModel();
        dft.setRowCount(0);
        showSlotHistory();
        
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        ControlPanel cp = new ControlPanel();
        cp.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SlotBookingControlPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshButton;
    private javax.swing.JTable slotBookedTable;
    // End of variables declaration//GEN-END:variables
}
