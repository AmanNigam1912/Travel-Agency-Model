/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Airliner;
import Business.AirlinerDirectory;
import Business.Customer;
import UserInterface.TravelAgency.ManageTravelAgencyJPanel;
import UserInterface.FlightSchedule.AirlineListJPanel;
import UserInterface.Customer.ManageSearchBookFlightJPanel;
import java.awt.CardLayout;
import Business.FlightSchedule;
import Business.CustomerDirectory;
import Business.FlightScheduleDirectory;
/**
 *
 * @author aman9
 */
public class ManageAirlineMainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form ManageAirlineMainJFrame
     */
    private AirlinerDirectory airlineDirectory;
    private FlightSchedule flightSchedule;
    private CustomerDirectory customerDirectory;
    private FlightScheduleDirectory flightDirectory;
    private Airliner air;
//    private Customer cust;
    
    public ManageAirlineMainJFrame() {
        initComponents();
        airlineDirectory = new AirlinerDirectory();
        customerDirectory = new CustomerDirectory();
        flightDirectory = new FlightScheduleDirectory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        manageAirlinerBtn = new javax.swing.JButton();
        flightScheduleBtn = new javax.swing.JButton();
        bookFlightBtn = new javax.swing.JButton();
        travelAgencyContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane2.setDividerLocation(120);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageAirlinerBtn.setText("Manage Airliner");
        manageAirlinerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageAirlinerBtnActionPerformed(evt);
            }
        });
        jPanel3.add(manageAirlinerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 110, -1));

        flightScheduleBtn.setText("Flight Schedule");
        flightScheduleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightScheduleBtnActionPerformed(evt);
            }
        });
        jPanel3.add(flightScheduleBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        bookFlightBtn.setText("Book a Flight");
        bookFlightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookFlightBtnActionPerformed(evt);
            }
        });
        jPanel3.add(bookFlightBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 110, -1));

        jSplitPane2.setLeftComponent(jPanel3);

        travelAgencyContainer.setLayout(new java.awt.CardLayout());
        jSplitPane2.setRightComponent(travelAgencyContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void manageAirlinerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageAirlinerBtnActionPerformed
        ManageTravelAgencyJPanel mtajp = new ManageTravelAgencyJPanel(travelAgencyContainer, airlineDirectory);
        travelAgencyContainer.add("ManageTravelAgencyJPanel", mtajp);
        CardLayout layout= (CardLayout)travelAgencyContainer.getLayout();
        layout.next(travelAgencyContainer);
    }//GEN-LAST:event_manageAirlinerBtnActionPerformed

    private void flightScheduleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightScheduleBtnActionPerformed
        AirlineListJPanel mfsjp = new AirlineListJPanel(travelAgencyContainer,airlineDirectory,air);
        travelAgencyContainer.add("AirlineListJPanel", mfsjp);
        CardLayout layout= (CardLayout)travelAgencyContainer.getLayout();
        layout.next(travelAgencyContainer);
    }//GEN-LAST:event_flightScheduleBtnActionPerformed

    private void bookFlightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookFlightBtnActionPerformed
        ManageSearchBookFlightJPanel msbfjp = new ManageSearchBookFlightJPanel(travelAgencyContainer, airlineDirectory,customerDirectory,flightDirectory);
        travelAgencyContainer.add("ManageSearchBookFlightJPanel", msbfjp);
        CardLayout layout= (CardLayout)travelAgencyContainer.getLayout();
        layout.next(travelAgencyContainer);
    }//GEN-LAST:event_bookFlightBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ManageAirlineMainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageAirlineMainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageAirlineMainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageAirlineMainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageAirlineMainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookFlightBtn;
    private javax.swing.JButton flightScheduleBtn;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JButton manageAirlinerBtn;
    private javax.swing.JPanel travelAgencyContainer;
    // End of variables declaration//GEN-END:variables
}
