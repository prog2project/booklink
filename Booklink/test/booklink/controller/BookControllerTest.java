/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package booklink.controller;

import javax.swing.table.DefaultTableModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cmz
 */
public class BookControllerTest {
    
    public BookControllerTest() {
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
     * Test of getInstance method, of class BookController.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        BookController result = BookController.getInstance();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getBooklist method, of class BookController.
     */
    @Test
    public void testGetBooklist() {
        System.out.println("getBooklist");
        BookController instance = null;
        DefaultTableModel expResult = null;
        DefaultTableModel result = instance.getBooklist();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addBook method, of class BookController.
     */
    @Test
    public void testAddBook() {
        System.out.println("addBook");
        String autor = "";
        String titel = "";
        String erscheinungsjahr = "";
        String isbn = "";
        String verlag = "";
        String auflage = "";
        String leihfrist = "";
        BookController instance = null;
        boolean expResult = false;
        boolean result = instance.addBook(autor, titel, erscheinungsjahr, isbn, verlag, auflage, leihfrist);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editBook method, of class BookController.
     */
    @Test
    public void testEditBook() throws Exception {
        System.out.println("editBook");
        int id = 0;
        String autor = "";
        String titel = "";
        String erscheinungsjahr = "";
        String isbn = "";
        String verlag = "";
        String auflage = "";
        String leihfrist = "";
        BookController instance = null;
        instance.editBook(id, autor, titel, erscheinungsjahr, isbn, verlag, auflage, leihfrist);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteBook method, of class BookController.
     */
    @Test
    public void testDeleteBook() {
        System.out.println("deleteBook");
        int id = 0;
        BookController instance = null;
        boolean expResult = false;
        boolean result = instance.deleteBook(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBookInfo method, of class BookController.
     */
    @Test
    public void testGetBookInfo() {
        System.out.println("getBookInfo");
        int id = 0;
        BookController instance = null;
        String[] expResult = null;
        String[] result = instance.getBookInfo(id);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getErrorText method, of class BookController.
     */
    @Test
    public void testGetErrorText() {
        System.out.println("getErrorText");
        BookController instance = null;
        String expResult = "";
        String result = instance.getErrorText();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
