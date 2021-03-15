/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Astrid
 */
public class OrderContentsTest {
    
    public OrderContentsTest() {
       
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
        
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @Test
    public void testArrayRetrieve() {
        String orders[][] = {{"Jonathan", "123 paper street", "0192252345", "RM30.90","1. HAMBORGOR","23"},
            {"Arc","333 magic blv.","0138882345","RM12.50","1. pizza", "10"},
            {"Monika","789 world walk","0192346224","RM33.10","1. Combo box", "15"},
            {"Michael","908 city street","01526623789","RM70.90","1. Steak set", "4"}};
        
        String expResult = "Jonathan";
        String result = orders[0][0];
        assertEquals(expResult,result);
    }

    /**
     * Test of main method, of class OrderContents.
     */
    @org.junit.jupiter.api.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        OrderContents.main(args);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
