
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Owner_HomePage extends javax.swing.JFrame {

        String UserName;  
	String FirstName ;
	String LastName ;
	String Password ;
	String PhoneNumber; 
	String NIDNumber ;
	String Gender ;
	int ParkingSlots;
        byte[] img ;
        
        String Area ;
        String Sector; 
        String RodeNumber; 
        String HouseNumber;
   
        String name;
    public Owner_HomePage() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2 - getHeight()/2);   
    }

    public void Owner(String UserName,String FirstName,String LastName,String Password ,String PhoneNumber,String NIDNumber ,String Gender ,int ParkingSlots,byte[]img,String Area,String Sector, String RodeNumber , String HouseNumber){
        this.UserName = UserName;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Password = Password;
        this.PhoneNumber = PhoneNumber;
        this.NIDNumber = NIDNumber;
        this.Gender = Gender;
        this.ParkingSlots = ParkingSlots;
        this.img = img;
        this.Area = Area;
        this.Sector = Sector;
        this.RodeNumber = RodeNumber;
        this.HouseNumber = HouseNumber; 
        
         
    }
             
   /* public void Address(String Area,String Sector, String RodeNumber , String HouseNumber){
        this.Area = Area;
        this.Sector = Sector;
        this.RodeNumber = RodeNumber;
        this.HouseNumber = HouseNumber; 
        
        System.out.println(this.Area +" "+ this.Sector+" " + this.RodeNumber +" "+this.HouseNumber+" Rec" );
    }*/
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        profileBtn = new javax.swing.JButton();
        LogOutButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        slotReservedTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        profileBtn.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        profileBtn.setText("Profile");
        profileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileBtnActionPerformed(evt);
            }
        });

        LogOutButton.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        LogOutButton.setText("Log Out");
        LogOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("Your Slot ");

        slotReservedTextField.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LogOutButton, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(profileBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(slotReservedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(profileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(slotReservedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 244, Short.MAX_VALUE)
                .addComponent(LogOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void profileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileBtnActionPerformed
         
        Owner_Profile op = new Owner_Profile();
        op.userNameTextField.setText(UserName);
        op.firstNameTextField.setText(FirstName);
        op.lastNameTextField.setText(LastName);
        op.passwordTextField.setText(Password);
        op.phoneNumberTextField.setText(PhoneNumber);
        op.nidNumberTextField.setText(NIDNumber);
        if(Gender.equals("Male")){
            op.maleRadioButton.setSelected(true);
        }
        else{
            op.femaleRadioButton.setSelected(true);
        }
       op.ParkingSlotsTextField.setText(Integer.toString(ParkingSlots));
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(op.ownerImglbl.getWidth(),op.ownerImglbl.getHeight(),Image.SCALE_SMOOTH));
        op.ownerImglbl.setIcon(imageIcon); 

         //System.out.println(Area +" "+ Sector +" "+ RodeNumber+" " + HouseNumber+" print" );
        
        op.areaTextField.setText(Area);
        op.sectorTextField4.setText(Sector);
        op.rodeNumberTextField3.setText(RodeNumber);
        op.houseNumberTextField2.setText(HouseNumber);
       
             
        op.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_profileBtnActionPerformed

    private void LogOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutButtonActionPerformed
        FirstPageJFrame cp = new FirstPageJFrame();
        cp.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_LogOutButtonActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Owner_HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogOutButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton profileBtn;
    public javax.swing.JTextField slotReservedTextField;
    // End of variables declaration//GEN-END:variables
}
