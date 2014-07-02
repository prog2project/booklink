package booklink.controller;

import javax.swing.table.DefaultTableModel;

import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.*;


import junit.framework.TestCase;


public class DBControllerTest_OLD extends TestCase {

    /**
     * Test of getInstance method, of class DBController.
     *
     * @throws java.sql.SQLException
     */
    @Test
    public void testGetInstance() throws SQLException {
        DBController instance = DBController.getInstance();
        instance.initDBConnection();
        assertNotNull(instance);
        instance.exit();
    }

    /**
     * Test of initDBConnection method, of class DBController.
     *
     * @throws java.sql.SQLException
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
     *
     * @throws java.sql.SQLException
     */
    @Test
    public void testGetAllBooks() throws SQLException {
        DBController datenbankInstanz2 = DBController.getInstance();
        datenbankInstanz2.initDBConnection();
        System.out.println("getAllBooks");
        // DefaultTableModel expResult = null;
        DefaultTableModel result = datenbankInstanz2.getAllBooks();
        assertNotNull(result);
        datenbankInstanz2.exit();
    }

    /**
     * Test of getBookInfo method, of class DBController.
     *
     * @throws java.sql.SQLException
     */
    @Test
    public void testGetBookInfo() throws SQLException {

        System.out.println("getBookInfo");
        int id = 27;
        DBController instance = DBController.getInstance();
        instance.initDBConnection();
        String[] expResult = {"Basti", "Testbuch2", "2014-01-03", "111111111", "Springer", "3", "5 Wochen"};
        String[] result = instance.getBookInfo(id);
        assertArrayEquals(expResult, result);
        instance.exit();
    }

    /**
     * Test of deleteBook method, of class DBController.
     *
     * @throws java.sql.SQLException
     */
    @Test
    public void testDeleteBook() throws SQLException {
        DBController datenbankInstanz2 = DBController.getInstance();
        datenbankInstanz2.initDBConnection();
        datenbankInstanz2.addBook("Basti", "Testbuch", "2014-01-03", "123456789", "Springer", "3", "5 Wochen");
        datenbankInstanz2.addBook("Basti", "Testbuch2", "2014-01-03", "111111111", "Springer", "3", "5 Wochen");
        datenbankInstanz2.deleteBook(123456789);
        PreparedStatement sqlAnweisung2 = DBController.connection.prepareStatement("SELECT * FROM books");
        ResultSet sqlAnweisungErgebnis2 = sqlAnweisung2.executeQuery();
        assertTrue(sqlAnweisungErgebnis2.next());
        assertFalse("123456789".equals(sqlAnweisungErgebnis2.getString(4)));
        sqlAnweisung2.close();
        sqlAnweisungErgebnis2.close();
        datenbankInstanz2.exit();
    }

    /**
     * Test of addBook method, of class DBController.
     *
     * @throws java.sql.SQLException
     */
    @Test
    public void testAddBook() throws SQLException {
        DBController datenbankInstanz = DBController.getInstance();
        datenbankInstanz.initDBConnection();
        datenbankInstanz.addBook("Basti", "Testbuch", "2014-01-03", "123456789", "Springer", "3", "5 Wochen");
        PreparedStatement sqlAnweisung = DBController.connection.prepareStatement("SELECT * FROM books WHERE ISBN = " + "123456789");
        ResultSet sqlAnweisungErgebnis = sqlAnweisung.executeQuery();
        while (sqlAnweisungErgebnis.next()) {
            assertEquals("123456789", sqlAnweisungErgebnis.getString(4));
        }
        sqlAnweisungErgebnis.close();
        sqlAnweisung.close();
        datenbankInstanz.exit();
    }

    /**
     * Test of addPDF method, of class DBController.
     *
     * @throws java.sql.SQLException
     */
    @Test
    public void testAddPDF() throws SQLException {
        int bookid = 1000;
        String pathname = "C:\\Users\\cmz\\Documents\\Programmieren Projekt Entwurf1000.pdf";
        DBController instance = DBController.getInstance();
        instance.initDBConnection();
        boolean expResult = true;
        boolean result = instance.addPDF(bookid, pathname);
        assertEquals(expResult, result);
        instance.exit();
    }

    /**
     * Test of getPDFInfo method, of class DBController.
     *
     * @throws java.sql.SQLException
     */
    @Test
    public void testGetPDFInfo() throws SQLException {
        int id = 24;
        DBController instance = DBController.getInstance();
        instance.initDBConnection();
        String[] expResult = {"C:\\Users\\cmz\\Documents\\Programmieren Projekt Entwurf.pdf"};
        String[] result = instance.getPDFInfo(id);
        assertArrayEquals(expResult, result);
        instance.exit();
    }

}
