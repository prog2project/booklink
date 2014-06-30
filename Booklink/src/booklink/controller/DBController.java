/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package booklink.controller;

import java.io.File;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sebastian Paulus
 */
public class DBController {
    
    
 
	private static final DBController dbcontroller = new DBController();
	public static Connection connection;
	//private static final String DB_PATH = System.getProperty("user.home") + "/"
	//		+ "Booklink.db";
    private static final String DB_PATH = "\\db\\booklink.db";

	static {
		try {
			Class.forName("org.sqlite.JDBC");
		} catch (ClassNotFoundException fehler) {
			System.err.println("Fehler beim Laden des JDBC-Treibers");
			fehler.printStackTrace();
		}
	}

	private DBController() {
	}

	public static DBController getInstance() {
		return dbcontroller;
	}

	public boolean initDBConnection() { 
		      try {
            if (connection != null) {
                return false;
            }
            System.out.println("Verbindung zu Datenbank wird hergestellt...");
            // Chris: Zur Laufzeit feststellen, in welchem Pfad wir sind.
            String currentPath = new File(".").getCanonicalPath();
            String absolutePath = currentPath + DB_PATH;
            //connection = DriverManager.getConnection("jdbc:sqlite:" +  DB_PATH);
            connection = DriverManager.getConnection("jdbc:sqlite:" +  absolutePath);
            if (!connection.isClosed()) {
                System.out.println("...Verbindung hergestellt");
                return true;
            }
        } catch (Exception fehler) {
            throw new RuntimeException(fehler);
        }
        return false;
	}

	public void schreibeDB(String autor,
			String titel, 
			String erscheinungsjahr, int isbn, String verlag, int auflage,
			String leihfrist) {
		try {
			Statement erstelleDatenbank = connection.createStatement();
			erstelleDatenbank.executeUpdate("CREATE TABLE IF NOT EXISTS books (Autor, Titel, Veröffentlichung, ISBN,  Verlag, Auflage, Leihfrist);");
			PreparedStatement schreibeEinträge = connection
					.prepareStatement("INSERT INTO books VALUES (?, ?, ?, ?, ?, ?, ?);");

			boolean vorhanden = false;
			PreparedStatement isbnSuche = connection
					.prepareStatement("select Titel from books where ISBN = ?");
			isbnSuche.setInt(1, isbn);
			ResultSet Suchresultate = isbnSuche.executeQuery();
			while (Suchresultate.next()) {
				System.out.println(Suchresultate.getString(1));
				if (Suchresultate.getString(1) != null) {
					vorhanden = true;
				}
			}
			Suchresultate.close();
			isbnSuche.close();

			if (vorhanden != true) {
				schreibeEinträge.setString(1, autor);
				schreibeEinträge.setString(2, titel);
				schreibeEinträge.setDate(3, Date.valueOf(erscheinungsjahr));
				schreibeEinträge.setInt(4, isbn);
				schreibeEinträge.setString(5, verlag);
				schreibeEinträge.setInt(6, auflage);
				schreibeEinträge.setString(7, leihfrist);
				schreibeEinträge.addBatch();
			}

			if (vorhanden == true) {
				System.out.println("Das Buch ist schon vorhanden");
			}

			connection.setAutoCommit(false);
			schreibeEinträge.executeBatch();
			connection.setAutoCommit(true);
			
		} catch (SQLException fehler) {
			System.err.println("Fehler bei Datenbank-Abfrage");
			fehler.printStackTrace();
		}
	}

	public void ausgabeDB() { 
		try {
			Statement ausgabeStatement = connection.createStatement();
			ResultSet ausgabeResultate = ausgabeStatement.executeQuery("SELECT * FROM books;");
			while (ausgabeResultate.next()) {
				System.out.println("Autor = " + ausgabeResultate.getString("Autor"));
				System.out.println("Titel = " + ausgabeResultate.getString("Titel"));
				System.out.println("Erscheinungsdatum = "
						+ ausgabeResultate.getDate("Veröffentlichung"));
				System.out.println("ISBN = " + ausgabeResultate.getInt("ISBN"));
				System.out.println("Verlag = " + ausgabeResultate.getString("Verlag"));
				System.out.println("Auflage = " + ausgabeResultate.getInt("Auflage"));
				System.out.println("Leihfrist = " + ausgabeResultate.getString("Leihfrist"));
			}

			ausgabeResultate.close();
			ausgabeStatement.close();
		} catch (SQLException fehler) {
			System.err.println("Fehler bei Ausgabe");
			fehler.printStackTrace();
		}
	}
	
    public DefaultTableModel getAllBooks() {
        ResultSet rs = null;
        DefaultTableModel ts = new DefaultTableModel();
        try {
            Statement ausgabeStatement = connection.createStatement();
			ResultSet ausgabeResultate = ausgabeStatement.executeQuery("SELECT books.ID, books.Autor, books.Titel FROM books;");
            ResultSetMetaData rmd = ausgabeResultate.getMetaData();
            String col[] = {"ID", "Autor", "Titel"};
            ts.setColumnIdentifiers(col);
            
            while (ausgabeResultate.next()) {
                System.out.println("DBController Autor = " + ausgabeResultate.getString("Autor"));
                Object[] mydata = { ausgabeResultate.getInt(1), ausgabeResultate.getString(2), ausgabeResultate.getString(3)};
                ts.addRow(mydata);
                System.out.println("DBController Titel = " + ausgabeResultate.getString("Titel"));
            }
            rs = ausgabeResultate;
            ausgabeResultate.close();
			ausgabeStatement.close();
        } catch (SQLException e) {
        }
        
        return ts;
    }
    
    public String[] getBookInfo(int id) {
        ResultSet rs = null;
        
        try {
            PreparedStatement idsuche = connection
					.prepareStatement("select * from books where ID = ?");
			idsuche.setInt(1, id);
            rs = idsuche.executeQuery();
            int i = rs.getFetchSize();
            while (rs.next()) {
                System.out.println("DBController Autor = " + rs.getString("Autor"));
                String newdata[] = {
                    rs.getString("Autor"),
                    rs.getString("Titel"),
                    //rs.getDate("Veröffentlichung").toString(),
                    //rs.getString("ISBN"),
                    //rs.getString("Auflage"),
                    //rs.getString("Verlag"),
                    //rs.getString("Leihfrist"),
                    };
                String test = "sdfds";
                this.data = newdata;
            } 
            //return rs;
            idsuche.close();
            rs.close();
            return data;
        } catch (Exception e) {
            String test = "sdfsd";
        }
        return data;
    }
    
	public void exit() throws SQLException
	{
		connection.close();
		connection = null;	
		
	}
    
    private String[] data;
    
	public void loescheBuch(int isbn) { 
		String query = "delete from books where ISBN=" + isbn;
		try {
			Statement loeschenStatement = connection.createStatement();
			loeschenStatement.execute(query);
			System.out.println("Das Buch mit der ISBN = " + isbn
					+ " wurde gelöscht!");
			loeschenStatement.close();
		} catch (SQLException fehler) {
			System.err.println("Fehler beim Löschen");
			fehler.printStackTrace();
		}
	}
	
}

    

