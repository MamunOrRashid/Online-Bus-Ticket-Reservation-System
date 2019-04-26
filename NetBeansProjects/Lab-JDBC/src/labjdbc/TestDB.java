/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labjdbc;

import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author Mamun Pramanik
 */
public class TestDB {

    public static void main(String[] args) throws SQLException, IOException {
        DB db = new DB();
        //db.createCustTable();
       // db.addRecord("32", "MOR", "017914", 10);
        db.delRecord("32");
        //db.queryCustByField();
        //db.delRecord();
    }
}
