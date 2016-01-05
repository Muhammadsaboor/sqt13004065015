/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bst;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Saboor
 */
public class linknodeTest {
    
    public linknodeTest() {
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
     * Test of isEmpty method, of class linknode.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        linknode instance = new linknode();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class linknode.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        int data = 0;
        linknode instance = new linknode();
        instance.insert(data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of search method, of class linknode.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        int val = 0;
        linknode instance = new linknode();
        boolean expResult = false;
        boolean result = instance.search(val);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class linknode.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int k = 0;
        linknode instance = new linknode();
        instance.delete(k);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of countNodes method, of class linknode.
     */
    @Test
    public void testCountNodes() {
        System.out.println("countNodes");
        linknode instance = new linknode();
        int expResult = 0;
        int result = instance.countNodes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inorder method, of class linknode.
     */
    @Test
    public void testInorder() {
        System.out.println("inorder");
        linknode instance = new linknode();
        instance.inorder();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of preorder method, of class linknode.
     */
    @Test
    public void testPreorder() {
        System.out.println("preorder");
        linknode instance = new linknode();
        instance.preorder();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of postorder method, of class linknode.
     */
    @Test
    public void testPostorder() {
        System.out.println("postorder");
        linknode instance = new linknode();
        instance.postorder();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
