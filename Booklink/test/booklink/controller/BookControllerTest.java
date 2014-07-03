/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package booklink.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import static junit.framework.Assert.assertEquals;
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
        BookController instance = BookController.getInstance();
        DefaultTableModel result = instance.getBooklist();
        assertNotNull(result);
        
        
    }

    /**
     * Test of addBook method, of class BookController.
     */
    @Test
    public void testAddBook() throws SQLException, Exception {
        System.out.println("addBook");
        String autor = "TESTRUN";
        String titel = "TESTRUNBOOK";
        String erscheinungsjahr = "2014";
        String isbn = "23748973248";
        String verlag = "TESTVERLAG";
        String auflage = "1";
        String leihfrist = "6";
        BookController instance = BookController.getInstance();
        boolean expResult = true;
        boolean result = instance.addBook(autor, titel, erscheinungsjahr, isbn, verlag, auflage, leihfrist);
        assertEquals(expResult, result);
        
                
        DBController ctrl = DBController.getInstance();
        assertTrue(ctrl.initDBConnection());
        
        String statement = "SELECT ID, TITEL FROM books WHERE TITEL = 'TESTRUNBOOK';";

        int id = 0;
        
        ResultSet rsSelect = ctrl.select(statement);
        while (rsSelect.next()) {
            id = rsSelect.getInt("ID");
        }
        rsSelect.close();
        assertTrue(id > 0);
        ctrl.exit();
        
        // Chris: Immer zum schluss die Testdaten wieder wegmachen.
        assertTrue(instance.deleteBook(id));
        
        
        
    }

    /**
     * Test of editBook method, of class BookController.
     */
    @Test
    public void testEditBook() throws Exception {
        System.out.println("editBook");
        String autor = "TESTRUN";
        String titel = "TESTRUNBOOK";
        String erscheinungsjahr = "2014";
        String isbn = "23748973248";
        String verlag = "TESTVERLAG";
        String auflage = "1";
        String leihfrist = "6";
        BookController instance = BookController.getInstance();
        boolean expResult = true;
        boolean result = instance.addBook(autor, titel, erscheinungsjahr, isbn, verlag, auflage, leihfrist);
        assertEquals(expResult, result);
        
        DBController ctrl = DBController.getInstance();
        assertTrue(ctrl.initDBConnection());
        
        String statement = "SELECT ID, TITEL FROM books WHERE TITEL = 'TESTRUNBOOK';";
        titel = "EDITRUN";
        int id = 0;
        
        ResultSet rsSelect = ctrl.select(statement);
        while (rsSelect.next()) {
            id = rsSelect.getInt("ID");
        }
        rsSelect.close();
        assertTrue(id > 0);
        ctrl.exit();
        try {
            instance.editBook(id, autor, titel, erscheinungsjahr, isbn, verlag, auflage, leihfrist);
        } catch (Exception e) {
            fail("Fehler beim editieren des Buchs.");
        }
        assertTrue(instance.deleteBook(id));
        
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of deleteBook method, of class BookController.
     */
    @Test
    public void testDeleteBook() throws SQLException, Exception {
        System.out.println("deleteBook");
        String autor = "TESTRUN";
        String titel = "TESTRUNBOOK";
        String erscheinungsjahr = "2014";
        String isbn = "23748973248";
        String verlag = "TESTVERLAG";
        String auflage = "1";
        String leihfrist = "6";
        BookController instance = BookController.getInstance();
        boolean expResult = true;
        boolean result = instance.addBook(autor, titel, erscheinungsjahr, isbn, verlag, auflage, leihfrist);
        assertEquals(expResult, result);
        
        DBController ctrl = DBController.getInstance();
        assertTrue(ctrl.initDBConnection());
        
        String statement = "SELECT ID, TITEL FROM books WHERE TITEL = 'TESTRUNBOOK';";
 
        int id = 0;
        
        ResultSet rsSelect = ctrl.select(statement);
        while (rsSelect.next()) {
            id = rsSelect.getInt("ID");
        }
        rsSelect.close();
        assertTrue(id > 0);
        ctrl.exit();
        
        
        assertTrue(instance.deleteBook(id));
        
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getBookInfo method, of class BookController.
     */
    @Test
    public void testGetBookInfo() throws Exception {

        System.out.println("getBookInfo");

        String autor = "TESTRUN";
        String titel = "TESTRUNBOOK";
        String erscheinungsjahr = "2014";
        String isbn = "23748973248";
        String verlag = "TESTVERLAG";
        String auflage = "1";
        String leihfrist = "6";
        BookController instance = BookController.getInstance();
        boolean expResult = true;
        boolean result = instance.addBook(autor, titel, erscheinungsjahr, isbn, verlag, auflage, leihfrist);
        assertEquals(expResult, result);
        
        DBController ctrl = DBController.getInstance();
        assertTrue(ctrl.initDBConnection());
        
        String statement = "SELECT ID, TITEL FROM books WHERE TITEL = 'TESTRUNBOOK';";

        int id = 0;
        
        ResultSet rsSelect = ctrl.select(statement);
        while (rsSelect.next()) {
            id = rsSelect.getInt("ID");
        }
        rsSelect.close();
        assertTrue(id > 0);
        ctrl.exit();
        
        String[] bookInfoResult = instance.getBookInfo(id);
        String expBookInfoResult = "TESTRUNBOOK";
        assertEquals(expBookInfoResult, bookInfoResult[1]);
        assertTrue(instance.deleteBook(id));


        
    }


    
}
