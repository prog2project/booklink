
package booklink;



import booklink.gui.jpAddBook;
import booklink.gui.jpAddPDF;
import booklink.gui.jpShowPDF;
import booklink.controller.*;
import java.awt.Color;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;




public class MainFrame extends javax.swing.JFrame {
    private UtilController utilctrl;
    private int bookID;
   
   
    public MainFrame() {
        this.utilctrl = UtilController.getInstance();
        initComponents();
        
        PDF.setEnabled(false);
        // Fenster soll fixe größe haben.
        this.setResizable(false);
        this.setLocation(1, 1);
        // Erstmaliges Befüllen der Liste
        initDisplayTable();
        
        
    }

    
   public void initDisplayTable() {
       BookController bkctrl = BookController.getInstance();
      
       try {
      
            jTable1.setModel(bkctrl.getBooklist());
            this.setGoodStatus("Buchliste geladen.");
       } catch (Exception e) {
           this.setErrorStatus("Fehler: " + e.getMessage());
       }
   
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SearchField = new javax.swing.JTextField();
        PDF = new javax.swing.JButton();
        Search = new javax.swing.JButton();
        BuchButton1 = new javax.swing.JButton();
        multipanel = new javax.swing.JPanel();
        pdfpanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblStatus = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Booklink");
        setBackground(new java.awt.Color(102, 153, 0));
        setMinimumSize(new java.awt.Dimension(1024, 600));
        getContentPane().setLayout(null);

        SearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchFieldActionPerformed(evt);
            }
        });
        SearchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SearchFieldKeyPressed(evt);
            }
        });
        getContentPane().add(SearchField);
        SearchField.setBounds(0, 0, 170, 40);

        PDF.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        PDF.setText("Skript/PDF +");
        PDF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PDFMouseClicked(evt);
            }
        });
        PDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PDFActionPerformed(evt);
            }
        });
        getContentPane().add(PDF);
        PDF.setBounds(420, 0, 140, 40);

        Search.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Search.setText("Search");
        Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchMouseClicked(evt);
            }
        });
        getContentPane().add(Search);
        Search.setBounds(170, 0, 120, 40);

        BuchButton1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BuchButton1.setText("Buch +");
        BuchButton1.setMaximumSize(new java.awt.Dimension(23, 23));
        BuchButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuchButton1MouseClicked(evt);
            }
        });
        BuchButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuchButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(BuchButton1);
        BuchButton1.setBounds(290, 0, 130, 40);

        multipanel.setLayout(new java.awt.BorderLayout());
        getContentPane().add(multipanel);
        multipanel.setBounds(270, 50, 710, 220);

        pdfpanel.setLayout(new java.awt.BorderLayout());
        getContentPane().add(pdfpanel);
        pdfpanel.setBounds(270, 280, 710, 210);

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.setShowHorizontalLines(false);
        jTable1.setShowVerticalLines(false);
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 50, 270, 460);

        lblStatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblStatus.setText("Status");
        getContentPane().add(lblStatus);
        lblStatus.setBounds(270, 490, 350, 20);

        jMenu1.setText("Datei");

        jMenuItem1.setText("Beenden");
        jMenuItem1.setToolTipText("Beendet das Programm");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PDFActionPerformed
        // TODO add your handling code here:                                   
    }//GEN-LAST:event_PDFActionPerformed

    private void SearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchFieldActionPerformed
        search();
        
    }//GEN-LAST:event_SearchFieldActionPerformed

    private void SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMouseClicked
      search(); 
    }//GEN-LAST:event_SearchMouseClicked

    
    private void SearchFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchFieldKeyPressed
      
      search();
      
    }//GEN-LAST:event_SearchFieldKeyPressed

    private void BuchButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuchButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuchButton1ActionPerformed

    private void BuchButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuchButton1MouseClicked
         multipanel.removeAll();
         jpAddBook bookpanel = new jpAddBook(this, false);
         multipanel.setVisible(true); 
         multipanel.setLayout(new java.awt.BorderLayout()); 
         multipanel.add(bookpanel); 
         multipanel.validate();
    }//GEN-LAST:event_BuchButton1MouseClicked

    private void PDFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PDFMouseClicked
        // Der Knopf soll nur funktionieren, wenn er angeschaltet ist.
        if (PDF.isEnabled()) {
            jpAddPDF PDFpanel = new jpAddPDF(this);
            pdfpanel.setVisible(true);
            pdfpanel.setLayout(new java.awt.BorderLayout());
            pdfpanel.add(PDFpanel);
            pdfpanel.validate();
        }
    }//GEN-LAST:event_PDFMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       int row = jTable1.getSelectedRow();
       int id = 0;
        // Erstmal die ID erwischen:
       //Object o = jTable1.getModel().getValueAt(row, 0);
        try {
          id = (int) jTable1.getModel().getValueAt(row, 0);
          this.PDF.setEnabled(true);
          this.bookID = id;
          BookController ctrl = BookController.getInstance();
          String[] items = ctrl.getBookInfo(id);
          PDFController pdfctl = PDFController.getInstance();
          String[] pdfitems = pdfctl.getPDFInfo(id);
          if (items != null) {
              multipanel.removeAll();
              jpAddBook bookpanel = new jpAddBook(this, true);
              bookpanel.setAuthor(items[0]);
              bookpanel.setBookTitel(items[1]);
              bookpanel.setYear(items[2]);
              bookpanel.setISBN(items[3]);
              bookpanel.setPress(items[4]);
              bookpanel.setEdition(items[5]);
              bookpanel.setLendingPeriod(items[6]);
              //bookpanel.setID(id);
              multipanel.setVisible(true); 
              multipanel.setLayout(new java.awt.BorderLayout()); 
              multipanel.add(bookpanel); 
              multipanel.validate();
              
          }
          if (pdfitems != null) {
              pdfpanel.removeAll();
              jpShowPDF showpdf = new jpShowPDF(this);
              showpdf.setBookTitle(items[1]);
              showpdf.setPDFList(pdfitems);
              pdfpanel.setVisible(true); 
              pdfpanel.setLayout(new java.awt.BorderLayout()); 
              pdfpanel.add(showpdf); 
              pdfpanel.validate();
          } else {
              // Keine PDFs
              pdfpanel.removeAll();
          }
        } catch (Exception e) {
        }
       
       
       
    }//GEN-LAST:event_jTable1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    
    
    
    public void removePanels() {
        multipanel.removeAll();
        pdfpanel.removeAll();
        this.repaint();
        this.validate();
    }
    
    private void search() {
        String value = SearchField.getText();
          for (int row = 0; row <= jTable1.getRowCount() - 1; row++) {
                for (int col = 0; col <= jTable1.getColumnCount() - 1; col++) {

                    if (value.equals(jTable1.getValueAt(row, col))) {
                        // Rahmen
                        jTable1.scrollRectToVisible(jTable1.getCellRect(row, 0, true));
                        // Focus setzen
                        jTable1.setRowSelectionInterval(row, row);

                        for (int i = 0; i <= jTable1.getColumnCount() - 1; i++) {
                                jTable1.getColumnModel().getColumn(i).setCellRenderer(new HighlightRenderer());
                        }
                    }
                }
            }
    
    }
    
    /**
     * Eigene private Klasse um einen Rahmen um bei der Suche die gefundene 
     * Zelle hervorzuheben.
     */
    private class HighlightRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        
        /**
         * Von der Elternklasse die Funktion getTableCellRendererComponent
         * 
         */
        // Den TableCellRendererComponent des JTable holen
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        /**
         * Erweiterung des DefaultTableCellRenderer
         */
        if(row == table.getSelectedRow()) {

            // Erweitert: Zeichnet einen gelben Rahmen um die Zelle
            setBorder(BorderFactory.createMatteBorder(2, 1, 2, 1, Color.YELLOW));
        }

        return this;
    }
}
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       /* try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    public void setErrorStatus(String text) {
        String Test = utilctrl.getTime();
        this.lblStatus.setForeground(Color.red);
        this.lblStatus.setText(Test + ": " + text);
    }
    
    public void setNormalStatus(String text) {
        String Test = utilctrl.getTime();
        this.lblStatus.setForeground(Color.cyan);
        this.lblStatus.setText(Test + ": " + text);
    }
    
    public void setGoodStatus(String text) {
        String Test = utilctrl.getTime();
        this.lblStatus.setForeground(Color.green);
        this.lblStatus.setText(Test + ": " + text);
    }
    
    public int getID() {
        return this.bookID;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuchButton1;
    private javax.swing.JButton PDF;
    private javax.swing.JButton Search;
    private javax.swing.JTextField SearchField;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JPanel multipanel;
    private javax.swing.JPanel pdfpanel;
    // End of variables declaration//GEN-END:variables
}

