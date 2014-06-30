/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package booklink.controller;

/**
 *
 * @author Christian Zwirlein <christian.zwirlein@stud.fh-rosenheim.de>
 */
public class PDFController {
    
    private static final PDFController pdfcontroller = new PDFController();
    private String errorText;
    
    private PDFController() {
    
    }
    
    public static PDFController getInstance() {
        return pdfcontroller;
    }
    
    
    public boolean addPDF(int bookid, String[] pathnames) {
        boolean bSuccess = false;
         try {
            int len = pathnames.length;
             for (int i = 0; i < len; i++) {
                 String pathname = pathnames[i];
                 DBController dbctrl = DBController.getInstance();
                    if(dbctrl.initDBConnection()) {
                    bSuccess = dbctrl.addPDF(bookid, pathname);
                if(!bSuccess) {
                   this.errorText = dbctrl.getErrorText();
                } 
            }
            dbctrl.exit();
             }
             
            

            return bSuccess;
        } catch (Exception e) {
        
        }
        return bSuccess;
    }
    
    public String[] getPDFInfo(int id) {
        DBController dbctr = DBController.getInstance();
        String[] pdfinfo = null;
        try {
            if(dbctr.initDBConnection()) {
                pdfinfo = dbctr.getPDFInfo(id);
            }
            dbctr.exit();  
        } catch (Exception e) {
        }
        
        
        return pdfinfo;
        
    
    }
}
