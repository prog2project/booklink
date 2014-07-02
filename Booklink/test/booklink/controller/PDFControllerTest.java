/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package booklink.controller;

import booklink.gui.jpShowPDF;
import java.io.File;
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
        PDFController expResult = null;
        PDFController result = PDFController.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletePDF method, of class PDFController.
     */
    @Test
    public void testDeletePDF() throws Exception {
        System.out.println("deletePDF");
        jpShowPDF thePanel = null;
        int bookid = 0;
        String pdfname = "";
        PDFController instance = null;
        instance.deletePDF(thePanel, bookid, pdfname);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addNewPDF method, of class PDFController.
     */
    @Test
    public void testAddNewPDF() throws Exception {
        System.out.println("addNewPDF");
        File[] files = null;
        int bookid = 0;
        PDFController instance = null;
        instance.addNewPDF(files, bookid);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPDF method, of class PDFController.
     */
    @Test
    public void testAddPDF() {
        System.out.println("addPDF");
        int bookid = 0;
        String[] pathnames = null;
        PDFController instance = null;
        boolean expResult = false;
        boolean result = instance.addPDF(bookid, pathnames);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPDFInfo method, of class PDFController.
     */
    @Test
    public void testGetPDFInfo() {
        System.out.println("getPDFInfo");
        int id = 0;
        PDFController instance = null;
        String[] expResult = null;
        String[] result = instance.getPDFInfo(id);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
