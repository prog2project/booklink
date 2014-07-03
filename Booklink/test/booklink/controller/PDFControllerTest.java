/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package booklink.controller;

import booklink.gui.jpShowPDF;
import java.io.File;
import java.sql.ResultSet;
import static junit.framework.Assert.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Christian Zwirlein
 */
public class PDFControllerTest {
    
    public PDFControllerTest() {
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
     * Test of getInstance method, of class PDFController.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        PDFController result = PDFController.getInstance();
        assertNotNull(result);

    }

    /**
     * Test of deletePDF method, of class PDFController.
     */
    @Test
    public void testDeletePDF() throws Exception {
        System.out.println("deletePDF");
        jpShowPDF thePanel = new jpShowPDF();
        PDFController instance = PDFController.getInstance();
        
        String autor = "TESTRUN";
        String titel = "TESTRUNBOOK";
        String erscheinungsjahr = "2014";
        String isbn = "23748973248";
        String verlag = "TESTVERLAG";
        String auflage = "1";
        String leihfrist = "6";
        BookController bkctrl = BookController.getInstance();
        boolean expResult = true;
        boolean result = bkctrl.addBook(autor, titel, erscheinungsjahr, isbn, verlag, auflage, leihfrist);
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

        String pdfnames[] = {"C:\\test.pdf"};
        String pdfname = "C:\\test.pdf";
        File testfile = new File("C:\\test.pdf");
        File[] files = {testfile};
        
        try {
            instance.addNewPDF(files, id);
        } catch (Exception e) {
            fail("Test: ADD new PDF");
        }
        try {
            instance.deletePDF(thePanel, id, pdfname);
        } catch (Exception e) {
            fail("PDFTest: DELETE");
        }
        assertTrue(bkctrl.deleteBook(id));

    }

    /**
     * Test of addNewPDF method, of class PDFController.
     */
    @Test
    public void testAddNewPDF() throws Exception {
        System.out.println("addNewPDF");
        
        File testfile = new File("C:\\test.pdf");
        File[] files = {testfile};
        PDFController instance = PDFController.getInstance();
        
        String autor = "TESTRUN";
        String titel = "TESTRUNBOOK";
        String erscheinungsjahr = "2014";
        String isbn = "23748973248";
        String verlag = "TESTVERLAG";
        String auflage = "1";
        String leihfrist = "6";
        BookController bkctrl = BookController.getInstance();
        boolean expResult = true;
        boolean result = bkctrl.addBook(autor, titel, erscheinungsjahr, isbn, verlag, auflage, leihfrist);
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
        
        
        try {
            instance.addNewPDF(files, id);
        } catch (Exception e) {
            fail("Test: ADD new PDF");
        }
        assertTrue(bkctrl.deleteBook(id));
        
        
    }


    /**
     * Test of getPDFInfo method, of class PDFController.
     */
    @Test
    public void testGetPDFInfo() throws Exception {
        System.out.println("getPDFInfo");
        System.out.println("addNewPDF");
        
        File testfile = new File("C:\\test.pdf");
        File[] files = {testfile};
        PDFController instance = PDFController.getInstance();
        
        String autor = "TESTRUN";
        String titel = "TESTRUNBOOK";
        String erscheinungsjahr = "2014";
        String isbn = "23748973248";
        String verlag = "TESTVERLAG";
        String auflage = "1";
        String leihfrist = "6";
        BookController bkctrl = BookController.getInstance();
        boolean expResult = true;
        boolean result = bkctrl.addBook(autor, titel, erscheinungsjahr, isbn, verlag, auflage, leihfrist);
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
        
        
        try {
            instance.addNewPDF(files, id);
        } catch (Exception e) {
            fail("Test: ADD new PDF");
        }
        
        String[] pdfinforesult = instance.getPDFInfo(id);
        String expectedResult = "C:\\test.pdf";
        assertEquals(expectedResult, pdfinforesult[0]);
        
        assertTrue(bkctrl.deleteBook(id));

    }
    
}
