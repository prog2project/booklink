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

    public String getPdfName() {
        return pdfName;
    }

    public void setPdfName(String pdfName) {
        this.pdfName = pdfName;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    
    
    
    @Override
    public String getSelectStatement() {
        return  "DELETE from pdfs where pathname='" + pdfName + "'"
                    + " AND bookid=" + bookId + ";";
    }
    
}
