/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.FlightSchedule;

import Business.Airliner;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Business.FlightSchedule;
import java.awt.CardLayout;
import java.awt.Component;

/**
 *
 * @author aman9
 */
public class ViewFlightScheduleJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewFlightScheduleJPanel
     */
    
    JPanel travelAgencyContainer;
    FlightSchedule fs;
    private int flag;
    public ViewFlightScheduleJPanel(JPanel travelAgencyContainer,FlightSchedule fs) {
        initComponents();
        this.travelAgencyContainer=travelAgencyContainer;
        this.fs=fs;
        flightNumberTextField.setText(fs.getFlightNumber());
        numberOfRowsTextField.setText(String.valueOf(fs.getNumberOfRows()));
        fromLocationTextField.setText(fs.getFromLocation()); 
        toLocationTextField.setText(fs.getToLocation());
        //timeOfDayTextField.setText(fs.getTimeOfDay());
        dateViewFlight.setText(String.valueOf(fs.getDate()));
        flightNumberTextField.setEditable(false);
        numberOfRowsTextField.setEditable(false);
        fromLocationTextField.setEditable(false);
        toLocationTextField.setEditable(false);
        jComboBox1.setEditable(false);
        dateViewFlight.setEditable(false);        
        updateBtnView.setEnabled(true);
        saveBtnView.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createFlightScheduleLabel = new javax.swing.JLabel();
        flightNumberLabel = new javax.swing.JLabel();
        flightNumberTextField = new javax.swing.JTextField();
        fromLocationLabel = new javax.swing.JLabel();
        fromLocationTextField = new javax.swing.JTextField();
        toLocationLabel = new javax.swing.JLabel();
        toLocationTextField = new javax.swing.JTextField();
        timeOfDayLabel = new javax.swing.JLabel();
        saveBtnView = new javax.swing.JButton();
        updateBtnView = new javax.swing.JButton();
        backBtnView = new javax.swing.JButton();
        dateLabel = new javax.swing.JLabel();
        numberOfRowsLabel = new javax.swing.JLabel();
        numberOfRowsTextField = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        dateViewFlight = new javax.swing.JTextField();

        createFlightScheduleLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        createFlightScheduleLabel.setText("View Flight Schedule");

        flightNumberLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        flightNumberLabel.setText("Flight Number");

        fromLocationLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        fromLocationLabel.setText("From Location");

        toLocationLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        toLocationLabel.setText("To Location");

        timeOfDayLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        timeOfDayLabel.setText("Time of Day");

        saveBtnView.setText("Save");
        saveBtnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnViewActionPerformed(evt);
            }
        });

        updateBtnView.setText("Update");
        updateBtnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnViewActionPerformed(evt);
            }
        });

        backBtnView.setText("Back");
        backBtnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnViewActionPerformed(evt);
            }
        });

        dateLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        dateLabel.setText("Date");

        numberOfRowsLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        numberOfRowsLabel.setText("Number of Rows");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Morning", "Day", "Evening" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addComponent(createFlightScheduleLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fromLocationLabel)
                                    .addComponent(toLocationLabel)
                                    .addComponent(timeOfDayLabel)
                                    .addComponent(dateLabel))
                                .addGap(162, 162, 162)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fromLocationTextField)
                                    .addComponent(toLocationTextField)
                                    .addComponent(jComboBox1, 0, 115, Short.MAX_VALUE)
                                    .addComponent(dateViewFlight)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(backBtnView)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(flightNumberLabel)
                                        .addGap(2, 2, 2)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(updateBtnView)
                                        .addGap(33, 33, 33)
                                        .addComponent(saveBtnView))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(162, 162, 162)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(numberOfRowsTextField)
                                            .addComponent(flightNumberTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)))))
                            .addComponent(numberOfRowsLabel))))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(createFlightScheduleLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(flightNumberLabel)
                    .addComponent(flightNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberOfRowsLabel)
                    .addComponent(numberOfRowsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fromLocationLabel)
                    .addComponent(fromLocationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toLocationLabel)
                    .addComponent(toLocationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeOfDayLabel)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateLabel)
                    .addComponent(dateViewFlight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtnView)
                    .addComponent(updateBtnView)
                    .addComponent(saveBtnView))
                .addGap(225, 225, 225))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateBtnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnViewActionPerformed
        flightNumberTextField.setEditable(true);
        numberOfRowsTextField.setEditable(true);
        fromLocationTextField.setEditable(true);
        toLocationTextField.setEditable(true);
        jComboBox1.setEditable(true);
        dateViewFlight.setEditable(true);
        updateBtnView.setEnabled(false);
        saveBtnView.setEnabled(true);
    }//GEN-LAST:event_updateBtnViewActionPerformed

    private void saveBtnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnViewActionPerformed
        flightNumberTextField.setEditable(false);
        numberOfRowsTextField.setEditable(false);
        fromLocationTextField.setEditable(false);
        toLocationTextField.setEditable(false);
        jComboBox1.setEditable(false);
        dateViewFlight.setEditable(false);
        updateBtnView.setEnabled(true);
        saveBtnView.setEnabled(false);
        
        flag=0;
        if(flightNumberTextField.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Flight Number field cannot be empty");
            flightNumberTextField.setText("");
            flag=1;
        }
        
        if(fromLocationTextField.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "From Location field cannot be empty");
            fromLocationTextField.setText("");
            flag=1;
        }
        
        if(toLocationTextField.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "To Location field cannot be empty");
            toLocationTextField.setText("");
            flag=1;
        }
        
        /*if(timeOfDayTextField.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Time of Day field cannot be empty");
            timeOfDayTextField.setText("");
            flag=1;
        }*/
        
        /*if(dateTextField.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Date field cannot be empty");
            dateTextField.setText("");
            flag=1;
        }*/
        
        if (flag==0){
            try{
                Integer.parseInt(numberOfRowsTextField.getText());                
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Please enter numeric value only for number of seats field!!");
                return;
            }
            
            fs.setFlightNumber(String.valueOf(flightNumberTextField.getText()));
            fs.setNumberOfRows(Integer.parseInt(numberOfRowsTextField.getText()));
            fs.setFromLocation(fromLocationTextField.getText());
            fs.setToLocation(toLocationTextField.getText());
            //fs.setTimeOfDay(timeOfDayTextField.getText());
           // fs.setDate(dateTextField.getText());
            
            JOptionPane.showMessageDialog(null, "Flight Details updated successfully");
        }
        else{
            JOptionPane.showMessageDialog(null, "Unable to update flight details. Please enter correct values in the fields.");
        }
    }//GEN-LAST:event_saveBtnViewActionPerformed

    private void backBtnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnViewActionPerformed
        travelAgencyContainer.remove(this);
        Component[] componentArray = travelAgencyContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageFlightScheduleJPanel mfsjp = (ManageFlightScheduleJPanel) component;
        mfsjp.refreshTable();
        CardLayout layout = (CardLayout) travelAgencyContainer.getLayout();
        layout.previous(travelAgencyContainer);
    }//GEN-LAST:event_backBtnViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtnView;
    private javax.swing.JLabel createFlightScheduleLabel;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JTextField dateViewFlight;
    private javax.swing.JLabel flightNumberLabel;
    private javax.swing.JTextField flightNumberTextField;
    private javax.swing.JLabel fromLocationLabel;
    private javax.swing.JTextField fromLocationTextField;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel numberOfRowsLabel;
    private javax.swing.JTextField numberOfRowsTextField;
    private javax.swing.JButton saveBtnView;
    private javax.swing.JLabel timeOfDayLabel;
    private javax.swing.JLabel toLocationLabel;
    private javax.swing.JTextField toLocationTextField;
    private javax.swing.JButton updateBtnView;
    // End of variables declaration//GEN-END:variables
}
