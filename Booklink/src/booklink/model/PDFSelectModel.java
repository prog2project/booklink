/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package booklink.model;

/**
 *
 * @author Christian Zwirlein
 */
public class PDFSelectModel implements ISelectStatement{

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getPathname() {
        return pathname;
    }

    public void setPathname(String pathname) {
        this.pathname = pathname;
    }
    
    private int bookID;
    private String pathname;

    @Override
    public String getSelectStatement() {
        return "SELECT * FROM pdfs where pathname='" + pathname + "' AND bookid = " +bookID +";";
    }
}
