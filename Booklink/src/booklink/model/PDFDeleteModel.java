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
public class PDFDeleteModel implements ISelectStatement{
    
    private String pdfName;
    private int bookId;
    /**
     * 
     * @return 
     */
    public String getPdfName() {
        return pdfName;
    }
    /**
     * 
     * @param pdfName 
     */
    public void setPdfName(String pdfName) {
        this.pdfName = pdfName;
    }
    /**
     * 
     * @return 
     */
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public String getSelectStatement() {
        return  "DELETE from pdfs where pathname='" + pdfName + "'"
                    + " AND bookid=" + bookId + ";";
    }
    
}
