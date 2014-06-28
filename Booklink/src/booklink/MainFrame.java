
package booklink;



import booklink.gui.jpAddBook;
import booklink.gui.jpAddPDF;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.ListModel;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;




public class MainFrame extends javax.swing.JFrame {

   
    public MainFrame() {
        initComponents();
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        displayTable();
        
    }

    
   private void displayTable() {
   jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {1, "Heinz", "Stephen King"},
                {2, "Bernd", "Grass, G."},
                {3, "Zeppelin", "Kohl, H."},
                {4, "Schlumpf", "Picard, J-L."}
            },
            new String [] {
                "Nr", "Titel", "Autor"
            }
        ));
   
    RowSorter sorter = jTable1.getRowSorter();
    List sortKeys = new ArrayList();
    sortKeys.add(new RowSorter.SortKey(1, SortOrder.ASCENDING));
    sorter.setSortKeys(sortKeys);
   
   
   
   
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        for (int column = 0; column < jTable1.getColumnCount(); column++) {
            TableColumn tableColumn = jTable1.getColumnModel().getColumn(column);
            int preferredWidth = tableColumn.getMinWidth();
            int maxWidth = tableColumn.getMaxWidth();

            for (int row = 0; row < jTable1.getRowCount(); row++) {
                TableCellRenderer cellRenderer = jTable1.getCellRenderer(row, column);
                Component c = jTable1.prepareRenderer(cellRenderer, row, column);
                int width = c.getPreferredSize().width + jTable1.getIntercellSpacing().width;
                preferredWidth = Math.max(preferredWidth, width);

        //  We've exceeded the maximum width, no need to check other rows
                if (preferredWidth >= maxWidth) {
                    preferredWidth = maxWidth;
                    break;
                }
            }

            tableColumn.setPreferredWidth(preferredWidth);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Booklink");
        setBackground(new java.awt.Color(102, 153, 0));
        setMinimumSize(new java.awt.Dimension(888, 600));
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
        SearchField.setBounds(30, 0, 170, 40);

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
        PDF.setBounds(470, 0, 140, 40);

        Search.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Search.setText("Search");
        Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchMouseClicked(evt);
            }
        });
        getContentPane().add(Search);
        Search.setBounds(200, 0, 120, 40);

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
        BuchButton1.setBounds(330, 0, 130, 40);

        multipanel.setLayout(new java.awt.BorderLayout());
        getContentPane().add(multipanel);
        multipanel.setBounds(270, 50, 700, 220);

        pdfpanel.setLayout(new java.awt.BorderLayout());
        getContentPane().add(pdfpanel);
        pdfpanel.setBounds(270, 310, 710, 210);

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
        jTable1.setRowSelectionAllowed(true);
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
        jScrollPane1.setBounds(0, 50, 240, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PDFActionPerformed
        // TODO add your handling code here:                                   
    }//GEN-LAST:event_PDFActionPerformed

    private void SearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchFieldActionPerformed
        // TODO add your handling code here:                            
    }//GEN-LAST:event_SearchFieldActionPerformed

    private void SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMouseClicked
       // jLabel1.setText("Gesucht wurde:  "+ SearchField.getText());             // Suche + Button
      
         
        
       
    }//GEN-LAST:event_SearchMouseClicked

    
    private void SearchFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchFieldKeyPressed
      
      
      
    }//GEN-LAST:event_SearchFieldKeyPressed

    private void BuchButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuchButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuchButton1ActionPerformed

    private void BuchButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuchButton1MouseClicked
         jpAddBook bookpanel = new jpAddBook(false);
         multipanel.setVisible(true); 
         multipanel.setLayout(new java.awt.BorderLayout()); 
         multipanel.add(bookpanel); 
         multipanel.validate();
    }//GEN-LAST:event_BuchButton1MouseClicked

    private void PDFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PDFMouseClicked
      jpAddPDF PDFpanel = new jpAddPDF();
      pdfpanel.setVisible(true); 
      pdfpanel.setLayout(new java.awt.BorderLayout()); 
      pdfpanel.add(PDFpanel); 
      pdfpanel.validate();
        
                                                    // Fenster für PDfs anzeigen lassen      !!!!
    }//GEN-LAST:event_PDFMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       int row = jTable1.getSelectedRow();
       int column = jTable1.getSelectedColumn();
       
        /// Funktion von Chris aufrufen ;) :D
       
    }//GEN-LAST:event_jTable1MouseClicked

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuchButton1;
    private javax.swing.JButton PDF;
    private javax.swing.JButton Search;
    private javax.swing.JTextField SearchField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel multipanel;
    private javax.swing.JPanel pdfpanel;
    // End of variables declaration//GEN-END:variables
}
