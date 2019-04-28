/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Customer;

import Business.Seat;
import Business.SeatDirectory;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aman9
 */
public class ViewTicketJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewTicketJPanel
     */
    private SeatDirectory seatDirectory;
    private JPanel travelAgencyContainer;
    
    public ViewTicketJPanel(JPanel travelAgencyContainer,SeatDirectory seatDirectory) {
        initComponents();
        this.seatDirectory=seatDirectory;
        this.travelAgencyContainer=travelAgencyContainer;
        populateFinalTable();
    }

    public void populateFinalTable(){
        DefaultTableModel dtm = (DefaultTableModel)orderJTable.getModel();
        dtm.setRowCount(0);
        
        for (Seat s : seatDirectory.getSeatDirectory()){
            Object row[]= new Object[dtm.getColumnCount()];
                    row[0] = s.getFlight();
                    //System.out.println(fs);
                    //row[0] = air.getAirlineName();
                    //row[1] = s.getCustomer();
                    row[1] = s.getSeatNumber();
                    dtm.addRow(row);
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

        flightOrderLabel = new javax.swing.JLabel();
        congoLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderJTable = new javax.swing.JTable();

        flightOrderLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        flightOrderLabel.setText("Flight Order");

        congoLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        congoLabel.setText("Congratulations, your flight order details are:");

        orderJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Flight Number", "Seat Number"
            }
        ));
        jScrollPane1.setViewportView(orderJTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(congoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(324, 324, 324)
                        .addComponent(flightOrderLabel)))
                .addGap(184, 184, 184))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(flightOrderLabel)
                .addGap(20, 20, 20)
                .addComponent(congoLabel)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel congoLabel;
    private javax.swing.JLabel flightOrderLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable orderJTable;
    // End of variables declaration//GEN-END:variables
}
