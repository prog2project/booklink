/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package booklink.controller;

import booklink.gui.jpShowPDF;
import booklink.model.PDFDeleteModel;
import booklink.model.PDFSelectModel;
import java.io.File;
import java.sql.ResultSet;


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
    
    /**
     * Deletes PDF
     * @param thePanel View to talk to
     * @param bookid bookID
     * @param pdfname Name(path of PDF)
     * @throws Exception 
     */
    public void deletePDF(jpShowPDF thePanel, int bookid, String pdfname) throws Exception {
        try {
            PDFDeleteModel delModel = new PDFDeleteModel();
            delModel.setBookId(bookid);
            delModel.setPdfName(pdfname);

            DBController ctl = DBController.getInstance();
            if (ctl.initDBConnection()) {
                ctl.delete(delModel.getSelectStatement());
            }
            ctl.exit();
            thePanel.populateList(bookid);
        } catch (Exception e) {
            throw new Exception("PDF konnte nicht gelöscht werden.");
        }

    }
    /**
     * Adds new PDF File
     * @param files Array of Files
     * @param bookid BookID
     * @throws Exception 
     */
    public void addNewPDF(File files[], int bookid) throws Exception {
        try {
            for (int i = 0; i < files.length; i++) {
                // 1. Nachsehen ob das PDF schon existiert
                PDFSelectModel pdfSelect = new PDFSelectModel();
                pdfSelect.setBookID(bookid);
                pdfSelect.setPathname(files[i].getCanonicalPath());
                DBController ctl = DBController.getInstance();
                if (ctl.initDBConnection()) {
                    ResultSet rs = ctl.select(pdfSelect.getSelectStatement());
                    if (rs.next()) {
                        // Solange wir was finden, nix machen.
                        rs.close();
                    } else {
                        rs.close();
                        //2. PDF anlegen
                        boolean bSuccess = ctl.addPDF(bookid, pdfSelect.getPathname());
                        if(!bSuccess) {
                            throw new Exception("Fehler beim Anlegen des PDFs");
                        }
                    }
                    
                }
                ctl.exit();
            }
        } catch (Exception e) {
            throw new Exception("Irgendwas schlimmes passiert.");
        }
    }
    
    /**
     * Alle PDFs zu einem Buch laden.
     * @param id BuchID
     * @return String Array mit PDFs
     */
    public String[] getPDFInfo(int id) {
        DBController dbctr = DBController.getInstance();
        String[] pdfinfo = null;
        try {
            if (dbctr.initDBConnection()) {
                pdfinfo = dbctr.getPDFInfo(id);
            }
            dbctr.exit();            
        } catch (Exception e) {
           // Zur Not auf System.out
            System.out.println(e.getMessage());
        }
        
        return pdfinfo;
        
    }
}
