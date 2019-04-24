/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mamun Pramanik
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class javaconnect {

    Connection conn = null;

    public static Connection ConnecrDb() throws SQLException {
        
        System.setProperty("jdbc.drivers", "org.apache.derby.jdbc.ClientDriver");
        String url = "jdbc:derby://localhost:1527/tax;create=true";
        String username = "APP";
        String password = "APP";
        return DriverManager.getConnection(url, username, password);
        
        /*
        try {
            Class.forName("org.sqlite.JDBC");
            //Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:/home/mp/NetBeansProjects/income tax resource/taxDB.sqlite");
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
         */
    }

}
