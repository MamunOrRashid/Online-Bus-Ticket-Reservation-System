

package busticketbooking;

import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class CancellingTicket extends javax.swing.JFrame {
    Connection conn; //A Connection object, which represents a physical connection with the database
    ResultSet rs;
    PreparedStatement pst;

    


   
    
    public CancellingTicket() throws SQLException {
        initComponents();
        conn = JavaConnect.ConnecrDb();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        etUid_cancellingTicket = new javax.swing.JTextField();
        labelBusId_cancellingTicket = new javax.swing.JLabel();
        etBusid_cancellingTicket = new javax.swing.JTextField();
        etNoOfSeat_cancellingTicket = new javax.swing.JTextField();
        etWeight_cancellingTicket = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        labelNoOfSeat_cancellingTicket = new javax.swing.JLabel();
        labelWeight_cancellingTicket = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSearch_cancellingTicket = new javax.swing.JButton();
        btnDelete_cancellingTicket = new javax.swing.JButton();
        btnClear_cancellingTicket = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelBusId_cancellingTicket.setText("Enter UserId");

        jLabel1.setText("Bus Id");

        labelNoOfSeat_cancellingTicket.setText("No of seat");

        labelWeight_cancellingTicket.setText("Weight");

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Cancelling Ticket");

        btnSearch_cancellingTicket.setText("Search");
        btnSearch_cancellingTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch_cancellingTicketActionPerformed(evt);
            }
        });

        btnDelete_cancellingTicket.setText("Delete");
        btnDelete_cancellingTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete_cancellingTicketActionPerformed(evt);
            }
        });

        btnClear_cancellingTicket.setText("Clear");
        btnClear_cancellingTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear_cancellingTicketActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(labelNoOfSeat_cancellingTicket)
                            .addComponent(labelBusId_cancellingTicket)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelWeight_cancellingTicket)
                                .addGap(33, 33, 33)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etWeight_cancellingTicket)
                            .addComponent(etNoOfSeat_cancellingTicket)
                            .addComponent(etBusid_cancellingTicket)
                            .addComponent(etUid_cancellingTicket, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnSearch_cancellingTicket)
                        .addGap(51, 51, 51)
                        .addComponent(btnClear_cancellingTicket)
                        .addGap(57, 57, 57)
                        .addComponent(btnDelete_cancellingTicket)))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etUid_cancellingTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelBusId_cancellingTicket))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etBusid_cancellingTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etNoOfSeat_cancellingTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNoOfSeat_cancellingTicket))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etWeight_cancellingTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelWeight_cancellingTicket))
                        .addGap(49, 139, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSearch_cancellingTicket)
                            .addComponent(btnDelete_cancellingTicket)
                            .addComponent(btnClear_cancellingTicket))
                        .addGap(40, 40, 40))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearch_cancellingTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch_cancellingTicketActionPerformed
       String s_sql = "select * from booking_information where uid=?";
        try{
            
              pst = conn.prepareStatement(s_sql);
                 // pst.setInt(1, Integer.parseInt(etUid_cancellingTicket.getText()));
                  pst.setString(1, etUid_cancellingTicket.getText());
                 rs=pst.executeQuery();
                 if(rs.next())
                 {
                     etBusid_cancellingTicket.setText(rs.getString("bid"));
                     etNoOfSeat_cancellingTicket.setText(rs.getString("noofseat"));
                     etWeight_cancellingTicket.setText(rs.getString("weight_kg"));
                       
                 }
                 else{
                     JOptionPane.showMessageDialog(null, "recrod not found");
                 }
                
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        } 
    }//GEN-LAST:event_btnSearch_cancellingTicketActionPerformed

   public void search(String uid){
       
       String s_sql = "select * from booking_information where uid=?";
       System.out.println("without try id"+uid);
        try{
            System.out.println("try id"+uid);
              pst = conn.prepareStatement(s_sql);
                 // pst.setInt(1, Integer.parseInt(etUid_cancellingTicket.getText()));
                  pst.setString(1, uid);
                 rs=pst.executeQuery();
                 if(rs.next())
                 {
                     etBusid_cancellingTicket.setText(rs.getString("bid"));
                     etNoOfSeat_cancellingTicket.setText(rs.getString("noofseat"));
                     etWeight_cancellingTicket.setText(rs.getString("weight_kg"));
                       
                 }
                 else{
                     JOptionPane.showMessageDialog(null, "recrod not found");
                 }
                
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        } 
   }
    private void btnDelete_cancellingTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete_cancellingTicketActionPerformed
       
  
        int i_uId = parseInt(etUid_cancellingTicket.getText());
              
            String s_query = "delete from booking_information where uid="+i_uId;
        try{
            pst = conn.prepareStatement(s_query);
            
                   
           // pst.setInt(1, Integer.parseInt(etUid_cancellingTicket.getText()));
            //String sql = "delete from booking_information where uid";
            pst.execute();
            JOptionPane.showMessageDialog(null, "Record deleted successfully");
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnDelete_cancellingTicketActionPerformed

    private void btnClear_cancellingTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear_cancellingTicketActionPerformed
       etUid_cancellingTicket.setText("");
       etBusid_cancellingTicket.setText("");
       etNoOfSeat_cancellingTicket.setText("");
       etWeight_cancellingTicket.setText("");
    }//GEN-LAST:event_btnClear_cancellingTicketActionPerformed

    
    
    
   
    
    public static void main(String args[]) {
       
        
        java.awt.EventQueue.invokeLater(new Runnable() {
             public void run() {
                try {
                    new CancellingTicket().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(CancellingTicket.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear_cancellingTicket;
    private javax.swing.JButton btnDelete_cancellingTicket;
    private javax.swing.JButton btnSearch_cancellingTicket;
    private javax.swing.JTextField etBusid_cancellingTicket;
    private javax.swing.JTextField etNoOfSeat_cancellingTicket;
    private javax.swing.JTextField etUid_cancellingTicket;
    private javax.swing.JTextField etWeight_cancellingTicket;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelBusId_cancellingTicket;
    private javax.swing.JLabel labelNoOfSeat_cancellingTicket;
    private javax.swing.JLabel labelWeight_cancellingTicket;
    // End of variables declaration//GEN-END:variables
}
