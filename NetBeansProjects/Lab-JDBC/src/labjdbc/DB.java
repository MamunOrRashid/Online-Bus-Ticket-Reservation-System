/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labjdbc;

import java.io.IOException;
import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import java.sql.Statement;

/**
 *
 * @author Mamun Pramanik
 */
public class DB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
//...................................................

    public static Connection getConnection() throws SQLException, IOException {
        System.setProperty("jdbc.drivers", "org.apache.derby.jdbc.ClientDriver");
        String url = "jdbc:derby://localhost:1527/Car;create=true";
        String username = "APP";
        String password = "APP";
        return DriverManager.getConnection(url, username, password);
    }

//.................................

    public void addRecord(String CustId, String Name, String Tel, int Age) throws SQLException, IOException {
        Connection cnnct = null;
        PreparedStatement pStmnt = null;
        try {
            cnnct = getConnection();
            String preQueryStatement
                    = "INSERT INTO CUSTOMER VALUES (?, ?, ?, ?)";
            pStmnt = cnnct.prepareStatement(preQueryStatement);
            pStmnt.setString(1, CustId);
            pStmnt.setString(2, Name);
            pStmnt.setString(3, Tel);
            pStmnt.setInt(4, Age);
            int rowCount;
            rowCount = pStmnt.executeUpdate();
            if (rowCount == 0) {
                throw new SQLException("Cannot insert records!");
            }
        } catch (SQLException ex) {
            while (ex != null) {
                ex = ex.getNextException();
            }
        } catch (IOException ex) {
        } finally {
            if (pStmnt != null) {
                try {
                    pStmnt.close();
                } catch (SQLException e) {
                }
            }
            if (cnnct != null) {
                try {
                    cnnct.close();
                } catch (SQLException sqlEx) {
                }
            }
        }
    }
    
    
   public void delRecord(String cus_id) throws SQLException, IOException{
        Connection cnnct = null;
        PreparedStatement pStmnt = null;
        
        try{
          cnnct = getConnection();  
          
          Statement stmt = cnnct.createStatement();
          String query1 = "update CUSTOMER set AGE = 800 where CUSTID ='"+cus_id+"'";
          //query1 = "update CUSTOMER set AGE = 40 where CUSTID ='322'";
         // String query1 = "delete from CUSTOMER where CUSTID ='123'";
          stmt.execute(query1);
          
         ResultSet rs = stmt.executeQuery("SELECT * FROM CUSTOMER");
       
         while (rs.next()) {
            String id = rs.getString("CUSTID");
            String name = rs.getString("NAME");
            String phone = rs.getString("TEL");
            int age = rs.getInt("AGE");
            
           // System.out.println(id+"   "+name+"    "+job);
             System.out.println("id: "+id+" name: "+name+" phone: "+phone+" age: "+age);
         }
        }catch (SQLException e){
            //System.err.println("");
        } 
    }
    public void queryCustByField() throws SQLException, IOException{
        Connection cnnct = null;
        PreparedStatement pStmnt = null;
        
        try{
          cnnct = getConnection();  
          
          Statement stmt = cnnct.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT * FROM CUSTOMER WHERE CUSTID = '1234'");
       
         while (rs.next()) {
            String id = rs.getString("CUSTID");
            String name = rs.getString("NAME");
            String phone = rs.getString("TEL");
            int age = rs.getInt("AGE");
            
           // System.out.println(id+"   "+name+"    "+job);
             System.out.println("id: "+id+" name: "+name+" phone: "+phone+" age: "+age);
         }
        }catch (SQLException e){
            //System.err.println("");
        } 
    }
    
    //.................................................

   /* public void createCustTable() {
        Connection cnnct = null;
        Statement stmnt = null;
        try {
            cnnct = getConnection();
            stmnt = cnnct.createStatement();
            stmnt.execute("CREATE TABLE CUSTOMER ( "
                    + " CustId CHAR(5) CONSTRAINT PK_CUSTOMER PRIMARY KEY, "
                    + " Name CHAR(25), Tel CHAR(10), Age INTEGER)");
        } catch (SQLException ex) {
            while (ex != null) {
                ex.printStackTrace();

                ex = ex.getNextException();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (stmnt != null) {
                try {
                    stmnt.close();
                } catch (SQLException e) {
                }
            }
            if (cnnct != null) {
                try {
                    cnnct.close();
                } catch (SQLException sqlEx) {
                }
            }
        }
    }*/

}
