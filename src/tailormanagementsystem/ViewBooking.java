
package tailormanagementsystem;

import java.text.DecimalFormat;
import javax.swing.table.DefaultTableModel;


public class ViewBooking extends javax.swing.JFrame {

    private Staff[] tailor;
    private Customer customer;
    private Manager maneger;
    private Booking booking;
    private Measurement[] measurement;
    
    private int indexMeasurement;
    private double totalPrice = 0;
    
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    
    public ViewBooking() {
        initComponents();
    }
    
    public ViewBooking(Customer customer, Booking booking, Manager maneger, Staff[] tailor) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.tailor = tailor;
        this.customer = customer;
        this.maneger = maneger;
        this.booking = booking;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        Object rowData[] = new Object[8];
        
        rowData[0] = "Siti Nur Sumayyah Jamaluddin";
        rowData[1] = "850927-01-6754";
        rowData[2] = "017-67245678";
        rowData[3] = "Ayu";
        rowData[4] = "3";
        rowData[5] = "6.09.2020";
        rowData[6] = "27.10.2020";
        rowData[7] = "RM145";
        model.addRow(rowData);
        
        rowData[0] = "Mariam Huda Abdul Ghani";
        rowData[1] = "790910-03-8756";
        rowData[2] = "013-26543892";
        rowData[3] = "Sofia";
        rowData[4] = "2";
        rowData[5] = "12.11.2020";
        rowData[6] = "30.11.2020";
        rowData[7] = "RM85";
        model.addRow(rowData);
        
        addRowToJTable();
    }
    
    public void addRowToJTable(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        Object rowData[] = new Object[8];
        
        rowData[0] = customer.getCustName();
        rowData[1] = customer.getCustID();
        rowData[2] = customer.getPhoneNumber();
        rowData[3] = booking.getTailor();
        rowData[4] = booking.getQuantity();
        rowData[5] = booking.getDateBooking();
        rowData[6] = booking.getDatePickup();
        
        indexMeasurement = booking.getQuantity();
        
        for(int i=0; i<indexMeasurement; i++){
            totalPrice = totalPrice + booking.getCostBooking(customer.getMeasurement()[i].getAttire());
        }
        
        rowData[7] = "RM" + df2.format(totalPrice);
        
        model.addRow(rowData);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Name", "Customer ID", "Customer HP Number", "Tailor Incharge", "Quantity Attire", "Date Booking", "Date Pick-up", "Total Price"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setBackground(new java.awt.Color(255, 255, 102));
        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(552, 552, 552))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MainPage form = new MainPage(customer, booking, maneger, tailor);
        form.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
