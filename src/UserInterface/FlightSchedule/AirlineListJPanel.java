/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.FlightSchedule;

import Business.AirlinerDirectory;
import Business.Airliner;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
/**
 *
 * @author aman9
 */

public class AirlineListJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AirlineListJPanel
     */
    JPanel travelAgencyContainer;
    AirlinerDirectory airlinerDirectory;
    Airliner air;
    
    public AirlineListJPanel(JPanel travelAgencyContainer,AirlinerDirectory airlinerDirectory,Airliner air) {
        initComponents();
        this.travelAgencyContainer=travelAgencyContainer;
        this.airlinerDirectory=airlinerDirectory;
        this.air=air;
        airlineListComboBox.removeAllItems();
        try{
        for (Airliner airliner: airlinerDirectory.getAirlineDirectory())
            airlineListComboBox.addItem(airliner);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "No Airline present.Please add Airline!!");
            return;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        airlineListLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        airlineListComboBox = new javax.swing.JComboBox();
        goBtn = new javax.swing.JButton();

        airlineListLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        airlineListLabel.setText("Airline List");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel1.setText("Airline");

        airlineListComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        airlineListComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airlineListComboBoxActionPerformed(evt);
            }
        });

        goBtn.setText("GO>>");
        goBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel1)
                        .addGap(177, 177, 177)
                        .addComponent(airlineListComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(goBtn)
                            .addComponent(airlineListLabel))))
                .addGap(228, 228, 228))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(airlineListLabel)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(airlineListComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(goBtn)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void goBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBtnActionPerformed
        Airliner air= (Airliner)airlineListComboBox.getSelectedItem();
        ManageFlightScheduleJPanel mfsjp = new ManageFlightScheduleJPanel(travelAgencyContainer,air,airlinerDirectory);
        travelAgencyContainer.add("ManageFlightScheduleJPanel", mfsjp);
        CardLayout layout= (CardLayout)travelAgencyContainer.getLayout();
        layout.next(travelAgencyContainer);       
    }//GEN-LAST:event_goBtnActionPerformed

    private void airlineListComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airlineListComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_airlineListComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox airlineListComboBox;
    private javax.swing.JLabel airlineListLabel;
    private javax.swing.JButton goBtn;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}