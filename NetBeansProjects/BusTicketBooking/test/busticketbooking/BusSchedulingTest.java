/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busticketbooking;

import java.sql.SQLException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class BusSchedulingTest {
    
    public BusSchedulingTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of modify method, of class BusScheduling.
     */
  /*  @Test
    public void testModify() throws SQLException {
        System.out.println("modify");
        String busId = "";
        String bname = "";
        String btype = "";
        String bfrom = "";
        String bto = "";
        String bdeparturetime = "";
        String barrival = "";
        String btotalseat = "";
        String bavailable = "";
        String bfare = "";
        String bdate = "";
        BusScheduling instance = new BusScheduling();
        instance.modify(busId, bname, btype, bfrom, bto, bdeparturetime, barrival, btotalseat, bavailable, bfare, bdate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
    
    

    /**
     * Test of delete method, of class BusScheduling.
     */
    @Test
    public void testDelete() throws SQLException {
        System.out.println("delete");
        String busId = "400";
        BusScheduling instance = new BusScheduling();
        instance.delete(busId);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    

    /**
     * Test of add method, of class BusScheduling.
     */
   @Test
    public void testAdd() throws SQLException {
        System.out.println("add");
        String bid = "407";
        String bname = "Welcome";
        String btype = "AC";
        String bfrom = "Dhaka";
        String bto = "Kushtia";
        String bdeparturetime = "10:30am";
        String barrival = "3:30pm";
        String btotalseat = "50";
        String bavailable = "50";
        String bfare = "200";
        String bdate = "20-04-2019";
        BusScheduling instance = new BusScheduling();
        instance.add(bid, bname, btype, bfrom, bto, bdeparturetime, barrival, btotalseat, bavailable, bfare, bdate);
    }

    
}
