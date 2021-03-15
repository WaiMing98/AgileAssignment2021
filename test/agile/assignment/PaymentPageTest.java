/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agile.assignment;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class PaymentPageTest {
    
    Order O = new Order();
    ArrayList<Order> OR = new ArrayList<>();  
    
    
    
    public PaymentPageTest() {
        O = new Order("OR001","12-12-2020","12.00","PR001");
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of GenNewID method, of class PaymentPage.
     */
    @Test
    public void testGenNewID() {
        System.out.println("GenNewID");
        PaymentPage instance = new PaymentPage();
        instance.GenNewID();
    }

    /**
     * Test of GenNewID2 method, of class PaymentPage.
     */
    @Test
    public void testGenNewID2() {
        System.out.println("GenNewID2");
        PaymentPage instance = new PaymentPage();
        instance.GenNewID2();
    }

    /**
     * Test of main method, of class PaymentPage.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        OR.add(O);
        assertEquals("OR001",OR.get(0).getOrderID());
        String[] args = null;
        PaymentPage.main(args);
    }
    
}
