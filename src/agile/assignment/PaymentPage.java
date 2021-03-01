/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agile.assignment;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class PaymentPage extends javax.swing.JFrame {

    ArrayList<MenuPage> MP = new ArrayList<>();
    ArrayList<Order> OR = new ArrayList<>();  
    ArrayList<paymentMethod> PP = new ArrayList<>();
    /**
     * Creates new form PaymentPage
     */
    public PaymentPage() {
        initComponents();
        
    }

    public PaymentPage(String amount){
        initComponents();
        lblAmount.setText(amount);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    public PaymentPage(ArrayList<MenuPage> MP1, ArrayList<Order> OR1, ArrayList<paymentMethod> PP1){
        this.MP = MP1;
        this.OR = OR1;
        this.PP= PP1;
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
        
    public String GenNewID(){
    String newID = "";
    if(!PP.isEmpty()){
        int paymentID = PP.size() -1;
        String lastPromoID = PP.get(paymentID).getPaymentID();
        String prefix = lastPromoID.substring(0,2);
        int integer = Integer.parseInt(lastPromoID.substring(2,5));
        integer +=1;  
        newID = prefix + String.format("%03d", integer);
    }else{
        newID = "PP001";
    }
    return newID;
    }    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtCardNumber = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        txtPwd = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        lblAmount = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Card Number");

        jLabel3.setText("Expiration Date");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Visa Card");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Debit Card");

        jLabel4.setText("CVV");

        jButton1.setText("Confirm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtCardNumber.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCardNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCardNumberKeyTyped(evt);
            }
        });

        txtDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDateKeyTyped(evt);
            }
        });

        txtPwd.setToolTipText("123");
        txtPwd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPwdKeyTyped(evt);
            }
        });

        jLabel5.setText("Amount");

        lblAmount.setText("lblAmount");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jRadioButton3)
                        .addGap(30, 30, 30)
                        .addComponent(jRadioButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(jLabel4))
                                    .addComponent(jLabel5))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblAmount)
                                        .addGap(46, 46, 46))
                                    .addComponent(txtPwd)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDate)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblAmount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(txtPwd.getText().isEmpty() || txtDate.getText().isEmpty()|| txtCardNumber.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Please fill in all the neccesary information");
        }
        else if(txtPwd.getText().length() != 3){
            JOptionPane.showMessageDialog(this,"CVV must include 3 digit of number");
        }
        else if(txtDate.getText().length() != 4){
            JOptionPane.showMessageDialog(this,"Date must include 4 digit of number");
        }
        else if(txtCardNumber.getText().length() != 16){
            JOptionPane.showMessageDialog(this,"Card Number must include 16 digit of number");
        }
        else{
            String cardType;
            if(jRadioButton1.isSelected()){
                cardType = jRadioButton1.getText();
            } 
            else{
                cardType = jRadioButton3.getText();
            }
            String cn = txtCardNumber.getText();
            String dt = txtDate.getText();
            String pwd = txtPwd.getText();
            String amount = lblAmount.getText();
            paymentMethod pp = new paymentMethod(GenNewID(),cardType, cn, dt, pwd, amount);
            PP.add(pp);
            JOptionPane.showMessageDialog(this,"Payment successful");
            new OrderDetail().setVisible(true);
            this.setVisible(false);
            dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtPwdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPwdKeyTyped
        char c = evt.getKeyChar();    
        if(!Character.isDigit(c)){
            evt.consume();
        }
        if(txtPwd.getText().length()>=3){
            evt.consume();
        }
    }//GEN-LAST:event_txtPwdKeyTyped

    private void txtDateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDateKeyTyped
        char c = evt.getKeyChar();    
        if(!Character.isDigit(c)){
            evt.consume();
        }
        if(txtDate.getText().length()>=4){
           evt.consume();
        }
    }//GEN-LAST:event_txtDateKeyTyped

    private void txtCardNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCardNumberKeyTyped
        char c = evt.getKeyChar();    
        if(!Character.isDigit(c)){
            evt.consume();
        }
        if(txtCardNumber.getText().length()>=16){
            evt.consume();
        }
    }//GEN-LAST:event_txtCardNumberKeyTyped

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
            java.util.logging.Logger.getLogger(PaymentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JTextField txtCardNumber;
    private javax.swing.JTextField txtDate;
    private javax.swing.JPasswordField txtPwd;
    // End of variables declaration//GEN-END:variables
}
