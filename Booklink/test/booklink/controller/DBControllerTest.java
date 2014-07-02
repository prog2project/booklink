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
 * @author Sebastian Paulus, Christian Zwirlein
 */
public class DBControllerTest {

    
    public DBControllerTest() {
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
     * Test of getInstance method, of class DBController.
     */
    @Test
    public void testGetInstance() throws SQLException{
        System.out.println("getInstance");
        DBController instance = DBController.getInstance();
        instance.initDBConnection();
        assertNotNull(instance);
        instance.exit();
    }

    /**
     * Test of initDBConnection method, of class DBController.
     */
    @Test
    public void testInitDBConnection() throws SQLException {
        System.out.println("initDBConnection");
        DBController instance = DBController.getInstance();
        instance.initDBConnection();
        boolean expResult = false;
        boolean result = instance.initDBConnection();
        assertEquals(expResult, result);
        instance.exit();
    }

    /**
     * Test of getAllBooks method, of class DBController.
     */
    @Test
    public void testGetAllBooks() {
        System.out.println("getAllBooks");
        DBController instance = DBController.getInstance();
        assertTrue(instance.initDBConnection());
        DefaultTableModel expResult = null;
        DefaultTableModel result = instance.getAllBooks();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getBookInfo method, of class DBController.
     */
    @Test
    public void testGetBookInfo() throws SQLException {
        DBController datenbankInstanz2 = DBController.getInstance();
        datenbankInstanz2.initDBConnection();
        System.out.println("getAllBooks");
        // DefaultTableModel expResult = null;
        DefaultTableModel result = datenbankInstanz2.getAllBooks();
        assertNotNull(result);
        datenbankInstanz2.exit();
    }


   

    /**
     * Test of addBook method, of class DBController.
     */
    @Test
    public void testAddEditDeleteBook() throws SQLException, Exception {
        System.out.println("testAddEditDeleteBook");
        String autor = "TESTRUN";
        String titel = "TESTRUNBOOK";
        String erscheinungsjahr = "2014";
        String isbn = "23748973248";
        String verlag = "TESTVERLAG";
        String auflage = "1";
        String leihfrist = "6";
        DBController instance = DBController.getInstance();
        // Chris: Mal sehen...
        assertTrue(instance.initDBConnection());
        boolean addExpResult = true;
        boolean result = instance.addBook(autor, titel, erscheinungsjahr, isbn, verlag, auflage, leihfrist);
        
        assertEquals(addExpResult, result);
        // EDIT
        String statement = "SELECT ID, TITEL FROM books WHERE TITEL = 'TESTRUNBOOK';";
        titel = "EDITRUN";
        int id = 0;
        
        ResultSet rsSelect = instance.select(statement);
        while (rsSelect.next()) {
            id = rsSelect.getInt("ID");
        }
        rsSelect.close();
        assertTrue(id > 0);
        boolean editExpResult = true;
        boolean editResult = instance.editBook(id, autor, titel, erscheinungsjahr, isbn, verlag, auflage, leihfrist);
        assertEquals(editExpResult, editResult);
        // Chris: als letztes: delete Testen
        assertTrue(instance.deleteBook(id));
        
        
        instance.exit();
        // TODO review the generated test code and remove the default call to fail.
        
    }


    /**
     * Test of addPDF method, of class DBController.
     */
    @Test
    public void testAddPDF() throws Exception {
        System.out.println("addPDF");
        String autor = "TESTRUN";
        String titel = "TESTRUNBOOK";
        String erscheinungsjahr = "2014";
        String isbn = "23748973248";
        String verlag = "TESTVERLAG";
        String auflage = "1";
        String leihfrist = "6";
        DBController instance = DBController.getInstance();
        // Chris: Mal sehen...
        assertTrue(instance.initDBConnection());
        boolean addExpResult = true;
        boolean result = instance.addBook(autor, titel, erscheinungsjahr, isbn, verlag, auflage, leihfrist);
        
        assertEquals(addExpResult, result);
        // EDIT
        String statement = "SELECT ID, TITEL FROM books WHERE TITEL = 'TESTRUNBOOK';";
        titel = "EDITRUN";
        int id = 0;
        
        ResultSet rsSelect = instance.select(statement);
        while (rsSelect.next()) {
            id = rsSelect.getInt("ID");
        }
        assertTrue(id > 0);
        rsSelect.close();
        boolean editExpResult = true;
        boolean editResult = instance.editBook(id, autor, titel, erscheinungsjahr, isbn, verlag, auflage, leihfrist);
        assertEquals(editExpResult, editResult);

        // Chris: Hier der Abschnitt zum PDF Testen
        String pathname = "C:\\Test.PDF";
        
        boolean expPDFResult = true;
        boolean pdfResult = instance.addPDF(id, pathname);
        // Chris: als letztes: delete Testen
        assertTrue(instance.deleteBook(id));
        instance.exit();
        assertEquals(expPDFResult, pdfResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPDFInfo method, of class DBController.
     */
    @Test
    public void testGetPDFInfo() {
        System.out.println("getPDFInfo");
        int id = 0;
        DBController instance = null;
        String[] expResult = null;
        String[] result = instance.getPDFInfo(id);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class DBController.
     */
    @Test
    public void testDelete() throws Exception {
        System.out.println("delete");
        String statement = "";
        DBController instance = null;
        instance.delete(statement);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

  
    
    
}
