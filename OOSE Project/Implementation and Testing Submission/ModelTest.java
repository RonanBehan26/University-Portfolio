/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ronan.cristina;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ronan
 */
public class ModelTest {
    
    public ModelTest() {
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
     * Test of getUserName method, of class Model.
     */
    @org.junit.Test
    public void testGetUserName() {
        System.out.println("getUserName");
        RonanBehan instance = new RonanBehan();
        String expResult = "";
        String result = instance.getUserName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserName method, of class Model.
     */
    @org.junit.Test
    public void testSetUserName() {
        System.out.println("setUserName");
        String userName = "";
        RonanBehan instance = new RonanBehan();
        instance.setUserName(userName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class Model.
     */
    @org.junit.Test
    public void testGetPassword() {
        System.out.println("getPassword");
        RonanBehan instance = new RonanBehan();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class Model.
     */
    @org.junit.Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        RonanBehan instance = new RonanBehan();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRegisterName method, of class Model.
     */
    @org.junit.Test
    public void testGetRegisterName() {
        System.out.println("getRegisterName");
        RonanBehan instance = new RonanBehan();
        String expResult = "";
        String result = instance.getRegisterName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegisterName method, of class Model.
     */
    @org.junit.Test
    public void testSetRegisterName() {
        System.out.println("setRegisterName");
        String userName = "";
        RonanBehan instance = new RonanBehan();
        instance.setRegisterName(userName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRegisterPassword method, of class Model.
     */
    @org.junit.Test
    public void testGetRegisterPassword() {
        System.out.println("getRegisterPassword");
        RonanBehan instance = new RonanBehan();
        String expResult = "";
        String result = instance.getRegisterPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegisterPassword method, of class Model.
     */
    @org.junit.Test
    public void testSetRegisterPassword() {
        System.out.println("setRegisterPassword");
        String password = "";
        RonanBehan instance = new RonanBehan();
        instance.setRegisterPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
