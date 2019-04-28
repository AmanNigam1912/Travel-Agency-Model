/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.TravelAgency;

import Business.Airliner;
import Business.AirlinerDirectory;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.awt.CardLayout;
import java.awt.Component;
/**
 *
 * @author aman9
 */
public class CreateAirlinerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateAirliner
     */
    
    JPanel travelAgencyContainer;
    AirlinerDirectory airlinerDirectory;
    private int flag;
    
    public CreateAirlinerJPanel(JPanel travelAgencyContainer, AirlinerDirectory airlinerDirectory) {
        initComponents();
        this.travelAgencyContainer=travelAgencyContainer;
        this.airlinerDirectory=airlinerDirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        airlineCreateLabel = new javax.swing.JLabel();
        airlineNameCreateLabel = new javax.swing.JLabel();
        airlineNameCreateTextField = new javax.swing.JTextField();
        okCreateTextField = new javax.swing.JButton();
        backCreateTextField = new javax.swing.JButton();
        headquartersLabel = new javax.swing.JLabel();
        headquartersTextField = new javax.swing.JTextField();
        hubLabel = new javax.swing.JLabel();
        hubTextField = new javax.swing.JTextField();

        airlineCreateLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        airlineCreateLabel.setText("Create a New Airline");

        airlineNameCreateLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        airlineNameCreateLabel.setText("Airline Name");

        okCreateTextField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        okCreateTextField.setText("OK");
        okCreateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okCreateTextFieldActionPerformed(evt);
            }
        });

        backCreateTextField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        backCreateTextField.setText("<<Back");
        backCreateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backCreateTextFieldActionPerformed(evt);
            }
        });

        headquartersLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        headquartersLabel.setText("Headquarters");

        hubLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        hubLabel.setText("Hub");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(airlineCreateLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(backCreateTextField)
                        .addGap(47, 47, 47)
                        .addComponent(okCreateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(airlineNameCreateLabel)
                            .addComponent(headquartersLabel)
                            .addComponent(hubLabel))
                        .addGap(204, 204, 204)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(airlineNameCreateTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(headquartersTextField)
                            .addComponent(hubTextField))))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(airlineCreateLabel)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(airlineNameCreateLabel)
                    .addComponent(airlineNameCreateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(headquartersLabel)
                    .addComponent(headquartersTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hubLabel)
                    .addComponent(hubTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backCreateTextField)
                    .addComponent(okCreateTextField))
                .addContainerGap(204, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void okCreateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okCreateTextFieldActionPerformed
             
        flag=0;
        if(airlineNameCreateTextField.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Airline Name field cannot be empty");
            airlineNameCreateTextField.setText("");
            flag=1;
        }
        
         if(headquartersTextField.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Headquarters field cannot be empty");
            headquartersTextField.setText("");
            flag=1;
        }
         
         if(hubTextField.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Hub field cannot be empty");
            hubTextField.setText("");
            flag=1;
        } 
        
        if (flag==0){             
            Airliner airliner = airlinerDirectory.addAirliner();
            airliner.setAirlineName(airlineNameCreateTextField.getText());
            airliner.setAirHeadquarters(headquartersTextField.getText());
            airliner.setAirHub(hubTextField.getText());
            
            JOptionPane.showMessageDialog(null, "Airline added successfully");
        }
        else
            JOptionPane.showMessageDialog(null, "Unable to add airline. Please enter correct values in fields!!");
        
    }//GEN-LAST:event_okCreateTextFieldActionPerformed

    private void backCreateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backCreateTextFieldActionPerformed
        /*travelAgencyContainer.remove(this);
        CardLayout layout=(CardLayout)travelAgencyContainer.getLayout();
        layout.previous(travelAgencyContainer);*/
        backAction();        
    }//GEN-LAST:event_backCreateTextFieldActionPerformed

    private void backAction(){
        travelAgencyContainer.remove(this);
        Component componentArray[]= travelAgencyContainer.getComponents();
        Component component = componentArray[componentArray.length-1];
        ManageTravelAgencyJPanel mtajp = (ManageTravelAgencyJPanel)component;
        mtajp.refreshTable();
        CardLayout layout= (CardLayout)travelAgencyContainer.getLayout();
        layout.previous(travelAgencyContainer);
    }     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel airlineCreateLabel;
    private javax.swing.JLabel airlineNameCreateLabel;
    private javax.swing.JTextField airlineNameCreateTextField;
    private javax.swing.JButton backCreateTextField;
    private javax.swing.JLabel headquartersLabel;
    private javax.swing.JTextField headquartersTextField;
    private javax.swing.JLabel hubLabel;
    private javax.swing.JTextField hubTextField;
    private javax.swing.JButton okCreateTextField;
    // End of variables declaration//GEN-END:variables
}
