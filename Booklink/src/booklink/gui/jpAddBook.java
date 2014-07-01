/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package booklink.gui;

import booklink.MainFrame;
import java.awt.Color;
import java.awt.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.text.JTextComponent;
import javax.swing.text.MaskFormatter;
import booklink.controller.*;
import booklink.controller.BookController;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Kerstin
 */
public class jpAddBook extends javax.swing.JPanel {
    MainFrame myparent;
    private int myid;
    private boolean bEdit;

    /**
     * Creates new form jpAddBook
     * @param showInfo Determines switch between add/show functionality
     */
    public jpAddBook(MainFrame parent, boolean showInfo) {
        this.myparent = parent;
        this.myid = parent.getID();
        initComponents();
        addDateFormatter();
        
        btnOk.setVisible(true);
        btnEdit.setVisible(true);
        btnCancel.setVisible(true);
        
        lblTitelAndAutorError.setVisible(false);
        lblBooktitelError.setVisible(false);
        lblAuthorError.setVisible(false); 
        
        if (showInfo) {

            disableTextFields();
            this.btnCancel.setEnabled(false);
            this.btnOk.setEnabled(false);
            myparent.setGoodStatus("Infos geladen!");

        } else {
            this.btnEdit.setEnabled(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOk = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblBooktitel = new javax.swing.JLabel();
        lblAuthor = new javax.swing.JLabel();
        lblISBN = new javax.swing.JLabel();
        lblPress = new javax.swing.JLabel();
        lblYear = new javax.swing.JLabel();
        lblEdition = new javax.swing.JLabel();
        lblLendingPeriod = new javax.swing.JLabel();
        lblComment = new javax.swing.JLabel();
        lblBooktitelError = new javax.swing.JLabel();
        lblAuthorError = new javax.swing.JLabel();
        lblTitelAndAutorError = new javax.swing.JLabel();
        tfBooktitel = new javax.swing.JFormattedTextField();
        tfAuthor = new javax.swing.JFormattedTextField();
        tfISBN = new javax.swing.JFormattedTextField();
        tfPress = new javax.swing.JFormattedTextField();
        tfYear = new javax.swing.JFormattedTextField();
        tfEdition = new javax.swing.JFormattedTextField();
        tfLendingPeriod = new javax.swing.JFormattedTextField();
        tfComment = new javax.swing.JFormattedTextField();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        btnOk.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnCancel.setText("Abbrechen");
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblBooktitel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblBooktitel.setText("Buchtitel");

        lblAuthor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblAuthor.setText("Autor");

        lblISBN.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblISBN.setText("ISBN");

        lblPress.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblPress.setText("Verlag");

        lblYear.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblYear.setText("Erscheinungsjahr");

        lblEdition.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblEdition.setText("Auflage");

        lblLendingPeriod.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblLendingPeriod.setText("Leihfrist");
        lblLendingPeriod.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblComment.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblComment.setText("Bemerkung");

        lblBooktitelError.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblBooktitelError.setForeground(new java.awt.Color(255, 0, 0));
        lblBooktitelError.setText("Geben Sie bitte einen Buchtitel ein.");

        lblAuthorError.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblAuthorError.setForeground(new java.awt.Color(255, 0, 0));
        lblAuthorError.setText("Geben Sie bitte einen Autor an.");

        lblTitelAndAutorError.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblTitelAndAutorError.setForeground(new java.awt.Color(255, 0, 0));
        lblTitelAndAutorError.setText("Geben Sie bitte Buchtitel & Autor an.");

        tfAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAuthorActionPerformed(evt);
            }
        });

        try {
            tfISBN.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-#-###-#####-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        tfYear.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        tfLendingPeriod.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        tfLendingPeriod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfLendingPeriodKeyTyped(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnEdit.setText("Editieren");
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditMouseClicked(evt);
            }
        });
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setText("Löschen");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });

        jLabel1.setText("Tage");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblTitelAndAutorError)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblBooktitelError)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblAuthorError))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblAuthor)
                                .addComponent(lblBooktitel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblISBN)
                                .addComponent(lblPress))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfBooktitel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfPress, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(55, 55, 55)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblEdition, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblYear)
                                .addComponent(lblLendingPeriod, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblComment, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfComment, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfYear, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfEdition, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(tfLendingPeriod, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel1))))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBooktitel)
                    .addComponent(tfBooktitel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblYear)
                    .addComponent(tfYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAuthor))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(lblISBN))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(tfISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfPress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPress)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEdition)
                            .addComponent(tfEdition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfLendingPeriod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLendingPeriod)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfComment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblComment))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitelAndAutorError)
                    .addComponent(lblBooktitelError)
                    .addComponent(lblAuthorError))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnOk)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        
        Boolean bBothEmpty = false;
         
        {
            if (tfBooktitel.getText().equals("") && tfAuthor.getText().equals("")) {
                bBothEmpty = true;
                lblTitelAndAutorError.setVisible(true);
            } 
            else {
                lblTitelAndAutorError.setVisible(false);
            }
            
            if (tfBooktitel.getText().equals("") && !bBothEmpty) { // Wenn dieses Feld leer dann soll Label angezeigt werden
                lblBooktitelError.setVisible(true);
            } 
            else {
                lblBooktitelError.setVisible(false);
            }

            if (tfAuthor.getText().equals("") && !bBothEmpty) {
                lblAuthorError.setVisible(true);
            } 
            else {
                lblAuthorError.setVisible(false);
            }
        }
        
        String sISBN = tfISBN.getText();
        sISBN = sISBN.replace("-", "");
        BookController bkctrl = BookController.getInstance();
        if (!bEdit) {
            
            boolean bSuccess = bkctrl.addBook(
                    tfAuthor.getText(),
                    tfBooktitel.getText(),
                    tfYear.getText(), sISBN, tfPress.getText(), tfEdition.getText(), tfLendingPeriod.getText()
            );
            if (bSuccess) {
                // Wenn alles gut Läuft:
                myparent.initDisplayTable();
                myparent.setGoodStatus("Buch erfolgreich angelegt!");
            } else {
                myparent.setErrorStatus(bkctrl.getErrorText());
            }

        } else {
            
            try {
               bkctrl.editBook(myparent.getID(),
                    tfAuthor.getText(),
                    tfBooktitel.getText(),
                    tfYear.getText(), sISBN, tfPress.getText(), tfEdition.getText(), tfLendingPeriod.getText()
            );
               myparent.initDisplayTable();
               myparent.setGoodStatus("Buch erfolgreich editiert.");
               disableTextFields();
               this.btnOk.setEnabled(false);
               this.btnCancel.setEnabled(false);
               this.btnEdit.setEnabled(true);
            } catch (Exception e) {
                String test = e.getMessage();
                myparent.setErrorStatus("Fehler beim editieren.");
            }
            
            
        }
        
        
        
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        // TODO add your handling code here:
        disableTextFields();
        this.btnEdit.setEnabled(true);
        this.btnCancel.setEnabled(false);
        this.btnOk.setEnabled(false);
        
         
    }//GEN-LAST:event_btnCancelMouseClicked

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnCancelActionPerformed

    private void tfAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAuthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAuthorActionPerformed

    private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseClicked
        // Alle Felder wieder auf enabled
        this.tfAuthor.setEditable(true);
        this.tfBooktitel.setEditable(true);
        this.tfComment.setEditable(true);
        this.tfEdition.setEditable(true);
        this.tfISBN.setEditable(true);
        this.tfLendingPeriod.setEditable(true);
        this.tfPress.setEditable(true);
        this.tfYear.setEditable(true);
        
        this.btnCancel.setEnabled(true);
        this.btnOk.setEnabled(true);
        this.btnEdit.setEnabled(false);
        this.bEdit = true;

        
    }//GEN-LAST:event_btnEditMouseClicked

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        this.bEdit = true;
    }//GEN-LAST:event_btnEditActionPerformed

    private void tfLendingPeriodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfLendingPeriodKeyTyped
      
    }//GEN-LAST:event_tfLendingPeriodKeyTyped

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (myparent, "Soll das Buch wirklich gelöscht werden?","Warnung",dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            int id = myparent.getID();
            if(id > 0) {
            BookController ctrl = BookController.getInstance();
            boolean success = ctrl.deleteBook(id);
            if(!success) {
             myparent.setErrorStatus("ID:" +id + "konnte nicht gelöscht werden!");
            } else {
                myparent.setGoodStatus("Buch mit ID: " +id  +" gelöscht." );
                myparent.initDisplayTable();
                myparent.removePanels();
            }
        }
        }
        
    }//GEN-LAST:event_btnDeleteMouseClicked

   
    
    private void disableTextFields() {
            this.tfAuthor.setEditable(false);
            this.tfBooktitel.setEditable(false);
            this.tfComment.setEditable(false);
            this.tfEdition.setEditable(false);
            this.tfISBN.setEditable(false);
            this.tfLendingPeriod.setEditable(false);
            this.tfPress.setEditable(false);
            this.tfYear.setEditable(false);
    
    }
    
    public void setAuthor(String text){
        this.tfAuthor.setText(text);
    }
    
    public void setBookTitel(String title) {
        this.tfBooktitel.setText(title);
    }
    public void setComment(String comment) {
        this.tfComment.setText(comment);
    }
   public void setEdition(String edition) {
         this.tfEdition.setText(edition);
    }
   public void setLendingPeriod(String period) {
          this.tfLendingPeriod.setText(period);
    }
   public void setPress(String press) {
           this.tfPress.setText(press);
    }
   public void setYear(String year) {
         this.tfYear.setText(year);
    }
   public void setISBN(String isbn) {
       this.tfISBN.setText(isbn);
   }
   
   public void setID(int id) {
       this.myid = id;
   }
   private void addDateFormatter() {
        
   }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAuthor;
    private javax.swing.JLabel lblAuthorError;
    private javax.swing.JLabel lblBooktitel;
    private javax.swing.JLabel lblBooktitelError;
    private javax.swing.JLabel lblComment;
    private javax.swing.JLabel lblEdition;
    private javax.swing.JLabel lblISBN;
    private javax.swing.JLabel lblLendingPeriod;
    private javax.swing.JLabel lblPress;
    private javax.swing.JLabel lblTitelAndAutorError;
    private javax.swing.JLabel lblYear;
    private javax.swing.JFormattedTextField tfAuthor;
    private javax.swing.JFormattedTextField tfBooktitel;
    private javax.swing.JFormattedTextField tfComment;
    private javax.swing.JFormattedTextField tfEdition;
    private javax.swing.JFormattedTextField tfISBN;
    private javax.swing.JFormattedTextField tfLendingPeriod;
    private javax.swing.JFormattedTextField tfPress;
    private javax.swing.JFormattedTextField tfYear;
    // End of variables declaration//GEN-END:variables

   
    }

