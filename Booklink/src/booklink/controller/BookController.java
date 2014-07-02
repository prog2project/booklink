
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
    private String errorText;

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

                tm = dbctrl.getAllBooks();

                dbctrl.exit();
            } else {
                this.errorText = "Buchliste konnte nicht geladen werden.";
            }
        } catch (Exception e) {
        }

        return tm;
    }

    public boolean addBook(String autor,
            String titel,
            String erscheinungsjahr, String isbn, String verlag, String auflage,
            String leihfrist) {
        boolean bSuccess = false;
        try {
            DBController dbctrl = DBController.getInstance();
            if (dbctrl.initDBConnection()) {
                bSuccess = dbctrl.addBook(autor, titel, erscheinungsjahr, isbn, verlag, auflage, leihfrist);
                if (!bSuccess) {
                    this.errorText = dbctrl.getErrorText();
                }
            }
            dbctrl.exit();

            return bSuccess;
        } catch (Exception e) {

        }
        return bSuccess;
    }

    public void editBook(int id, String autor,
            String titel,
            String erscheinungsjahr, String isbn, String verlag, String auflage,
            String leihfrist) throws Exception {
        boolean bSuccess = false;
        try {
            DBController dbctrl = DBController.getInstance();
            if (dbctrl.initDBConnection()) {
                bSuccess = dbctrl.editBook(id, autor, titel, erscheinungsjahr, isbn, verlag, auflage, leihfrist);
                if (!bSuccess) {
                    this.errorText = dbctrl.getErrorText();
                }
            }
            dbctrl.exit();

        } catch (Exception e) {

        }

    }

    public boolean deleteBook(int id) {
        boolean bSuccess = false;
        try {
            DBController dbctrl = DBController.getInstance();
            if (dbctrl.initDBConnection()) {
                bSuccess = dbctrl.deleteBook(id);
                if (!bSuccess) {
                    this.errorText = dbctrl.getErrorText();
                }
            }
            dbctrl.exit();

            return bSuccess;
        } catch (Exception e) {

        }
        return bSuccess;
    }

    public String[] getBookInfo(int id) {
        DBController dbctr = DBController.getInstance();
        String[] bookinfo = null;
        try {
            if (dbctr.initDBConnection()) {
                bookinfo = dbctr.getBookInfo(id);
            }
            dbctr.exit();
        } catch (Exception e) {
        }

        return bookinfo;

    }

    public String getErrorText() {
        if (errorText != null) {
            return errorText;
        }
        return "Fehler ohne definierte Fehlermeldung. Sorry.";
    }
}
