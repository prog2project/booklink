/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package booklink.controller;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Christian Zwirlein <christian.zwirlein@stud.fh-rosenheim.de>
 */
public class BookController {
    
    private static final BookController bookcontroller = new BookController();
    
    private BookController() {
	}

	public static BookController getInstance() {
		return bookcontroller;
	}
    
    public DefaultTableModel getBooklist() {
        DefaultTableModel tm = new DefaultTableModel();
        ResultSet rs = null;
        DBController dbctrl = DBController.getInstance();
        try {
            if (dbctrl.initDBConnection()) {
                //dbctrl.ausgabeDB();
                //rs = dbctrl.getAllBooks();
                tm = dbctrl.getAllBooks();
               /* while (rs.next()) {
                    System.out.println("BookController Autor = " + rs.getString("Autor"));
                    System.out.println("BookController Titel = " + rs.getString("Titel"));
                } */
                dbctrl.exit();
            } else {
            // Fehler melden.
            }
        } catch (Exception e) {
        }
        
        return tm; 
    }
    
    public String[] getBookInfo(int id) {
        DBController dbctr = DBController.getInstance();
        String[] bookinfo = null;
        try {
            if(dbctr.initDBConnection()) {
                bookinfo = dbctr.getBookInfo(id);
            }
            dbctr.exit();  
        } catch (Exception e) {
        }
        
        
        return bookinfo;
        
    
    }
    
}
