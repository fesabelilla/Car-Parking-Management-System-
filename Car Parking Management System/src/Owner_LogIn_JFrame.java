
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Owner_LogIn_JFrame extends javax.swing.JFrame {


    public Owner_LogIn_JFrame() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2 - getHeight()/2);   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        signUpButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userNameTextField = new javax.swing.JTextField();
        signInButton = new javax.swing.JButton();
        UserPasswordField = new javax.swing.JPasswordField();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        signUpButton.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        signUpButton.setText("SignUp");
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("User Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setText("Password");

        userNameTextField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        userNameTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userNameTextFieldMouseClicked(evt);
            }
        });

        signInButton.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        signInButton.setText("Sign In");
        signInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInButtonActionPerformed(evt);
            }
        });

        UserPasswordField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        backButton.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
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
            .addGroup(layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                        .addComponent(UserPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(109, 109, 109))
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(signUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(signInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(UserPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(signInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(signUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)))
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
        // TODO add your handling code here:
        // userNameTextField.setText(" ");
        //UserPasswordField.setText("");
        Owner_SingUp_JFrame us = new Owner_SingUp_JFrame();
        us.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_signUpButtonActionPerformed

    private void signInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInButtonActionPerformed
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager
            .getConnection(
                "jdbc:sqlserver://localhost:1433;databaseName=Car_Parking_Management_System;selectMethod=cursor",   "sa", "123456");

           // String sql = "Select * from Owner where UserName = ? and Password = ?";
           
           String sql = "Select * from Owner full join OwnersAddress on Owner.OwnerId = OwnersAddress.OwnerId where Owner.UserName = ? and Password = ?";
           
           
           
           PreparedStatement pst = con.prepareStatement(sql);
            
            pst.setString(1,userNameTextField.getText());
            pst.setString(2,UserPasswordField.getText());

            ResultSet rs = pst.executeQuery();
            if(rs.next()){ 
                int OwnerId = rs.getInt("OwnerId");
                String UserName = rs.getString("UserName");
                String FirstName = rs.getString("FirstName"); 
	        String LastName  = rs.getString("LastName");
	        String Password = rs.getString("Password");
	        String PhoneNumber = rs.getString("PhoneNumber");
	        String NIDNumber  = rs.getString("NIDNumber");
	        String Gender = rs.getString("Gender");
	        int ParkingSlots  = rs.getInt("ParkingSlots");
                byte[] img = rs.getBytes("Images");
                String Area = rs.getString("Area") ;
                String Sector = rs.getString("Sector"); 
                String RodeNumber = rs.getString("RodeNumber"); 
                String HouseNumber = rs.getString("HouseNumber");
                
               Owner_HomePage oh = new Owner_HomePage(); 
            //String sql1 = "SELECT OwnersAddress.OwnerId,AddressId,Area,Sector,RodeNumber,HouseNumber FROM OwnersAddress LEFT JOIN Owner ON OwnersAddress.OwnerId = Owner.OwnerId;";
                  
            JOptionPane.showMessageDialog(null,"Username and Password Matched");
            
            oh.Owner(UserName,FirstName,LastName,Password,PhoneNumber,NIDNumber,Gender,ParkingSlots,img,Area,Sector,RodeNumber,HouseNumber);
           // owner_address(OwnerId);
           
          // String sql1 = "Select * from Owner where UserName = ? and Password = ?";
           
           
           
           
            oh.setVisible(true);
            setVisible(false);    
            }else{
                JOptionPane.showMessageDialog(null,"Username and Password not Correct");
                userNameTextField.setText("");
                UserPasswordField.setText("");
            }
            
            con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_signInButtonActionPerformed

   /* public void owner_address(int OwnerId){   
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager
            .getConnection(
                "jdbc:sqlserver://localhost:1433;databaseName=Car_Parking_Management_System;selectMethod=cursor",   "sa", "123456");

            String sql1 = "SELECT * FROM OwnersAddress WHERE OwnerId = ? ";
            PreparedStatement pst1 = con.prepareStatement(sql1); 
             pst1.setInt(1,OwnerId);
            ResultSet address_rs = pst1.executeQuery();
            
        String Area ;
        String Sector; 
        String RodeNumber; 
        String HouseNumber;
            
            
            Owner_HomePage oh = new Owner_HomePage(); 
            if(address_rs.next()){
                 Area = address_rs.getString("Area");
                Sector = address_rs.getString("Sector");
                RodeNumber = address_rs.getString("RodeNumber");
                HouseNumber = address_rs.getString("HouseNumber");
                
                 System.out.println(Area +" "+ Sector+" "+RodeNumber+" "+HouseNumber+" value");
                
               
                
               oh.Address(Area,Sector,RodeNumber,HouseNumber); 
               
              
        }
           
        }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
        }
    } */
        
   
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

         FirstPageJFrame fp = new FirstPageJFrame();
        fp.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void userNameTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userNameTextFieldMouseClicked
               //userNameTextField.setText(" ");
    }//GEN-LAST:event_userNameTextFieldMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Owner_LogIn_JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField UserPasswordField;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton signInButton;
    private javax.swing.JButton signUpButton;
    private javax.swing.JTextField userNameTextField;
    // End of variables declaration//GEN-END:variables
}
