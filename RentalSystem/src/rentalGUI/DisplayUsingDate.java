/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalGUI;
import rentalmanagementsystem.RentalGuitar;
import rentalmanagementsystem.Rental;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import rentalmanagementsystem.Rental;

/**
 *
 * @author hp
 */
public class DisplayUsingDate extends javax.swing.JFrame {

    /**
     * Creates new form DisplayUsingDate
     */
    public DisplayUsingDate() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        startDateLabel = new javax.swing.JLabel();
        startDateTextField = new javax.swing.JTextField();
        endDateLabel = new javax.swing.JLabel();
        endDateTextField = new javax.swing.JTextField();
        SubmitButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BackButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        startDateLabel.setText("Start Date(year-month-day)");

        startDateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startDateTextFieldActionPerformed(evt);
            }
        });

        endDateLabel.setText("End Date(year-month-day)");

        endDateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endDateTextFieldActionPerformed(evt);
            }
        });

        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial Number", "Date", "Customer"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("(For Example 2th May 2020 = 2020-5-2)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addComponent(BackButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(endDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(startDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(89, 89, 89)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(startDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(endDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addComponent(SubmitButton)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(startDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BackButton)))
                .addGap(3, 3, 3)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(endDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SubmitButton))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void startDateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startDateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startDateTextFieldActionPerformed

    private void endDateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endDateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_endDateTextFieldActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        // TODO add your handling code here:
        refresh();
         if((startDateTextField.getText()).equals("") || (endDateTextField.getText()).equals("")){
            JOptionPane.showMessageDialog(null,"Enter all Entries");
        }else{
            String [] splittedStart;
            String [] splittedEnd;
           
            splittedStart = startDateTextField.getText().split("-");
            splittedEnd = endDateTextField.getText().split("-");
            Date date1 = new Date(Integer.parseInt(splittedStart[2]),Integer.parseInt(splittedStart[1]),Integer.parseInt(splittedStart[0]));
            Date date2 = new Date(Integer.parseInt(splittedEnd[2]),Integer.parseInt(splittedEnd[1]),Integer.parseInt(splittedEnd[0]));
            ArrayList<RentalGuitar> list =RentalSystem.rent.showBetweenDates(date1, date2);

            DefaultTableModel model = ( DefaultTableModel)jTable1.getModel();
            Object[] row = new Object[3];
            for(int i = 0; i < list.size(); i++)
            {
                row[0] = list.get(i).getGuitar().getSerialNumber();
                row[1] = list.get(i).getRentaldate();
                row[2] = list.get(i).getCustomer().getName();

                model.addRow(row);
            }
        }
         
    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed
 public void refresh()
   {
      

               // refresh jtable data
               DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
               model.setRowCount(0);
               
          
   }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JLabel endDateLabel;
    private javax.swing.JTextField endDateTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel startDateLabel;
    private javax.swing.JTextField startDateTextField;
    // End of variables declaration//GEN-END:variables
}
