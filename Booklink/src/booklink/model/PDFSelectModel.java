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
    private int bookID;
    private String pathname;
    
    /**
     * 
     * @return Buch ID
     */
    public int getBookID() {
        return bookID;
    }
    /**
     * 
     * @param bookID 
     */
    public void setBookID(int bookID) {
        this.bookID = bookID;
    }
    /**
     * 
     * @return 
     */
    public String getPathname() {
        return pathname;
    }
    /**
     * 
     * @param pathname 
     */
    public void setPathname(String pathname) {
        this.pathname = pathname;
    }
    /**
     * 
     * @return 
     */
    @Override
    public String getSelectStatement() {
        return "SELECT * FROM pdfs where pathname='" + pathname + "' AND bookid = " +bookID +";";
    }
}
