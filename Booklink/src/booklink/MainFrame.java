
package booklink;



import booklink.gui.jpAddBook;
import booklink.gui.jpAddPDF;
import java.awt.event.KeyEvent;
import javax.swing.BoxLayout;
import javax.swing.JPanel;




public class MainFrame extends javax.swing.JFrame {

   
    public MainFrame() {
        initComponents();
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
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
        jScrollPane2 = new javax.swing.JScrollPane();
        Booklist = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Booklink");
        setBackground(new java.awt.Color(102, 153, 0));
        setMinimumSize(new java.awt.Dimension(888, 600));
        setPreferredSize(new java.awt.Dimension(888, 600));
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
        SearchField.setBounds(0, 0, 141, 39);

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
        PDF.setBounds(147, 0, 93, 23);

        Search.setText("Search");
        Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchMouseClicked(evt);
            }
        });
        getContentPane().add(Search);
        Search.setBounds(246, 0, 65, 23);

        BuchButton1.setText("Buch +");
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
        BuchButton1.setBounds(317, 0, 67, 23);

        multipanel.setLayout(new java.awt.BorderLayout());
        getContentPane().add(multipanel);
        multipanel.setBounds(237, 45, 640, 220);

        pdfpanel.setLayout(new java.awt.BorderLayout());
        getContentPane().add(pdfpanel);
        pdfpanel.setBounds(237, 333, 640, 190);

        Booklist.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Grundlagen der Informatik; Clark Kent, Lois Lane", "Programmieren 1; Thomas Müller, Philipp Lahm", "Programmieren 2", "Mathematik" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        Booklist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BooklistMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Booklist);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(0, 45, 226, 489);

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
      //if(evt.getKeyCode()== KeyEvent.VK_ENTER)                                  // Suche + ENTER 
         // jLabel1.setText("Gesucht wurde:  "+SearchField.getText());
      
      
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

    private void BooklistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BooklistMouseClicked
        
       jpAddBook bookpanel = new jpAddBook(true);
       bookpanel.setAuthor(Booklist.getSelectedValue().toString());
       bookpanel.setBookTitel("50 shades of glitzerfisch");
       multipanel.setVisible(true); 
         multipanel.setLayout(new java.awt.BorderLayout()); 
         multipanel.add(bookpanel); 
         multipanel.validate();
        // Aus Buchliste wählen
        //jLabel2.setText("Gewählt wurde:  "+Booklist.getSelectedValue());        // Gewähltes Buch anzeigen lassen
       
       
    }//GEN-LAST:event_BooklistMouseClicked

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
    private javax.swing.JList Booklist;
    private javax.swing.JButton BuchButton1;
    private javax.swing.JButton PDF;
    private javax.swing.JButton Search;
    private javax.swing.JTextField SearchField;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel multipanel;
    private javax.swing.JPanel pdfpanel;
    // End of variables declaration//GEN-END:variables
}
