import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Owner_Profile extends javax.swing.JFrame {
    
    OWNERPROFILE_FINAL OPF;
    
    public Owner_Profile() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2 - getHeight()/2);   
    }

    public Owner_Profile(OWNERPROFILE_FINAL OPF) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        initComponents(); 
        this.OPF = OPF;
        
        ShowProfile();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2 - getHeight()/2);  
       
    }

    @SuppressWarnings("unchecked")

     public void ShowProfile(){
         
        System.out.println(OPF.getUserName());
        userNameTextField.setText(OPF.getUserName());
        firstNameTextField.setText(OPF.getFirstName());
        lastNameTextField.setText(OPF.getLastName());
        passwordTextField.setText(OPF.getPassword());
        phoneNumberTextField.setText(OPF.getPhoneNumber());
        nidNumberTextField.setText(OPF.getNIDNumber());
        if(OPF.getGender().equals("Male")){
            maleRadioButton.setSelected(true);
        }
        else{
            femaleRadioButton.setSelected(true);
        }
       ParkingSlotsTextField.setText(Integer.toString(OPF.getParkingSlots()));
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(OPF.getImg()).getImage().getScaledInstance(ownerImglbl.getWidth(),ownerImglbl.getHeight(),Image.SCALE_SMOOTH));
        ownerImglbl.setIcon(imageIcon); 

         //System.out.println(Area +" "+ Sector +" "+ RodeNumber+" " + HouseNumber+" print" );
        
        areaTextField.setText(OPF.getArea());
        sectorTextField4.setText(OPF.getSector());
        rodeNumberTextField3.setText(OPF.getRodeNumber());
        houseNumberTextField2.setText(OPF.getHouseNumber());
        slotPriceTextField.setText(Integer.toString(OPF.getPrice()));
       
}
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        areaTextField = new javax.swing.JTextField();
        houseNumberTextField2 = new javax.swing.JTextField();
        rodeNumberTextField3 = new javax.swing.JTextField();
        sectorTextField4 = new javax.swing.JTextField();
        userNameTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        phoneNumberTextField = new javax.swing.JTextField();
        ParkingSlotsTextField = new javax.swing.JTextField();
        nidNumberTextField = new javax.swing.JTextField();
        maleRadioButton = new javax.swing.JRadioButton();
        femaleRadioButton = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        LogOutButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        ownerImglbl = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        slotPriceTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Last Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Password");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Phone Number");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("NID Number");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Gender");

        firstNameTextField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        firstNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextFieldActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("Address :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Area");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Sector");

        lastNameTextField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lastNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameTextFieldActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Rode Number");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("House Number");

        areaTextField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        houseNumberTextField2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        rodeNumberTextField3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        sectorTextField4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        userNameTextField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        userNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTextFieldActionPerformed(evt);
            }
        });

        passwordTextField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("ParkingSlot");

        phoneNumberTextField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        ParkingSlotsTextField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        nidNumberTextField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        maleRadioButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        maleRadioButton.setText("Male");
        maleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRadioButtonActionPerformed(evt);
            }
        });

        femaleRadioButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        femaleRadioButton.setText("Female");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("User Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("First Name");

        BackButton.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        LogOutButton.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        LogOutButton.setText("Log Out");
        LogOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutButtonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        ownerImglbl.setBackground(new java.awt.Color(0, 0, 0));
        ownerImglbl.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 102, 51)));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("            Profile");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(340, 340, 340)
                .addComponent(ownerImglbl, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ownerImglbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel12.setText("Slot  Price");

        slotPriceTextField.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 789, Short.MAX_VALUE)
                        .addComponent(LogOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(285, 285, 285)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(518, 518, 518)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(211, 211, 211)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(nidNumberTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                                        .addComponent(phoneNumberTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(passwordTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lastNameTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(firstNameTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(userNameTextField, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(ParkingSlotsTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(maleRadioButton)
                                                .addGap(18, 18, 18)
                                                .addComponent(femaleRadioButton)))
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48)
                                        .addComponent(slotPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rodeNumberTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(houseNumberTextField2)
                            .addComponent(sectorTextField4)
                            .addComponent(areaTextField))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(phoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nidNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ParkingSlotsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(slotPriceTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(femaleRadioButton)
                    .addComponent(maleRadioButton)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)))
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(areaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sectorTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rodeNumberTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(houseNumberTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTextFieldActionPerformed
        
    }//GEN-LAST:event_firstNameTextFieldActionPerformed

    private void lastNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameTextFieldActionPerformed

    }//GEN-LAST:event_lastNameTextFieldActionPerformed

    private void userNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTextFieldActionPerformed

    private void maleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRadioButtonActionPerformed

    }//GEN-LAST:event_maleRadioButtonActionPerformed
 
    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        Owner_HomePage oh = new Owner_HomePage(OPF);
        oh.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void LogOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutButtonActionPerformed
      FirstPageJFrame cp = new FirstPageJFrame();
        cp.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_LogOutButtonActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Owner_Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton LogOutButton;
    private javax.swing.JTextField ParkingSlotsTextField;
    private javax.swing.JTextField areaTextField;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JTextField houseNumberTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JTextField nidNumberTextField;
    public javax.swing.JLabel ownerImglbl;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JTextField phoneNumberTextField;
    private javax.swing.JTextField rodeNumberTextField3;
    private javax.swing.JTextField sectorTextField4;
    public javax.swing.JTextField slotPriceTextField;
    private javax.swing.JTextField userNameTextField;
    // End of variables declaration//GEN-END:variables
}
