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
public class NewJFrameTest {
    
    public NewJFrameTest() {
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
        
        String expResult = "4";
        String result = orders[3][5];
        assertEquals(expResult,result);
    }
    /**
     * Test of main method, of class NewJFrame.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        NewJFrame.main(args);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
