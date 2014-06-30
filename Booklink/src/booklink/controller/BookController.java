/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package booklink.controller;

import java.sql.ResultSet;

/**
 *
 * @author Christian Zwirlein <christian.zwirlein@stud.fh-rosenheim.de>
 */
public class BookController {
    
    private static final BookController bookcontroller = new BookController();
    
    public BookController() {
	}

	public static BookController getInstance() {
		return bookcontroller;
	}
    
    public ResultSet getBooklist() {
        ResultSet rs = null;
        DBController dbctrl = DBController.getInstance();
        try {
            if (dbctrl.initDBConnection()) {
                //dbctrl.ausgabeDB();
                rs = dbctrl.getAllBooks();
                dbctrl.exit();
            } else {
            // Fehler melden.
            }
        } catch (Exception e) {
        }
        
        return rs; 
    }
    
}
