/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busticketbooking;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author mp
 */
public class BusScheduling {
   Connection conn;
    ResultSet rs;
    PreparedStatement pst, pst2;
    
    
    public BusScheduling() throws SQLException{
        conn = JavaConnect.ConnecrDb();
    }
   
    public void modify(String busId, String bname,String btype,String bfrom,String bto,String bdeparturetime,String barrival,String btotalseat,String bavailable,String bfare,String bdate){
         String s_busId = busId;

        int i_busId = Integer.parseInt(s_busId);
        String s_sql = "update busscheduling set bname=?,btype=?,bfrom=?,bto=?,bdeparturetime=?,barrival=?,btotalseat=?,bavailable=?,bfare=?,bdate=? where bid=" + i_busId;

        try {
            pst = conn.prepareStatement(s_sql);

            pst.setString(1, bname);
            pst.setString(2, btype);
            pst.setString(3, bfrom);
            pst.setString(4, bto);
            pst.setString(5, bdeparturetime);
            pst.setString(6, barrival);
            pst.setString(7, btotalseat);
            pst.setString(8, bavailable);
            pst.setString(9, bfare);
            pst.setString(10, bdate);

            pst.execute();

            JOptionPane.showMessageDialog(null, "Schedule Modified");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void delete(String busId){
         String sql = "select * from busscheduling where bid= ?";
            String s_busId = busId;

            int i_busId = Integer.parseInt(s_busId);

            try {
                pst = conn.prepareStatement(sql);
                pst.setInt(1,i_busId);
                rs = pst.executeQuery();

                if(rs.next()){
                    String s1 = "delete from busscheduling where bid=" + i_busId;
                    pst2 = conn.prepareStatement(s1);

                    pst2.execute();

                    JOptionPane.showMessageDialog(null, "Schedule deleted");

                }else if(!rs.next()){
                    JOptionPane.showMessageDialog(null, "No record found!");
                }

                ///  String s_busId = etBusId_busScheduling.getText();

                /// int i_busId = Integer.parseInt(s_busId);

            }

            catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
    }
    
    public void add(String bid,String bname,String btype,String bfrom,String bto,String bdeparturetime,String barrival,String btotalseat,String bavailable,String bfare,String bdate){
          String s_sql = "insert into busscheduling(bid,bname,btype,bfrom,bto,bdeparturetime,barrival,btotalseat,bavailable,bfare,bdate) values(?,?,?,?,?,?,?,?,?,?,?)";

        try {
            pst = conn.prepareStatement(s_sql);
            pst.setString(1, bid);
            pst.setString(2, bname);
            pst.setString(3, btype);
            pst.setString(4, bfrom);
            pst.setString(5, bto);
            pst.setString(6, bdeparturetime);
            pst.setString(7, barrival);
            pst.setString(8, btotalseat);
            pst.setString(9, bavailable);
            pst.setString(10, bfare);
            pst.setString(11, bdate);

            pst.execute();

            JOptionPane.showMessageDialog(null, "Schedule Added");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
}
