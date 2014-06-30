/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package booklink.gui;

import booklink.MainFrame;
import booklink.controller.PDFController;
import java.io.File;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.ListModel;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Kerstin
 */
public class jpAddPDF extends javax.swing.JPanel {
    MainFrame myparent;
    /**
     * Creates new form jpAddPDF
     */
    public jpAddPDF(MainFrame parent) {
        this.myparent = parent;
        initComponents();
        // Panel wurde geladen, jetzt den Dialog zum Auswählen der PDFs erzeugen
        addPdf();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBooktitel = new javax.swing.JLabel();
        tfBooktitel = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();

        lblBooktitel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblBooktitel.setText("Buchtitel:");

        tfBooktitel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBooktitelActionPerformed(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblBooktitel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfBooktitel, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBooktitel)
                    .addComponent(tfBooktitel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfBooktitelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBooktitelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBooktitelActionPerformed

    private void addPdf() {
        try {
            JFileChooser chooser = new JFileChooser();  // Neuen JFC erzeugen
            chooser.setMultiSelectionEnabled(true); // Mehrfachselektion von Dateien erlauben
            FileFilter filter = new FileNameExtensionFilter("PDF Dateien", "pdf"); // File-Filter erzeugen (nur PDFs)
            chooser.setFileFilter(filter); // Den FileFilter zu dem JFC hinzufügen
            int returnVal = chooser.showOpenDialog(chooser);
            DefaultListModel listModel = new DefaultListModel();
            int itemCount = 0;
            
            /* Abfrage, ob auf "Öffnen" geklickt wurde */
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                // Wenn Mehrere Dateien ausgewählt wurden
                if (chooser.getSelectedFiles() != null && chooser.getSelectedFiles().length > 1) {
                    // Es wurden mehrere Dateien ausgewält
                    File Files[] = chooser.getSelectedFiles();
                    
                    for (int i = 0; i < Files.length; i++) {
                        System.out.println("Die zu öffnende Datei ist: "
                                + Files[i].getName());
                        
                        PDFController pdfctl = PDFController.getInstance();
                    int bookid = myparent.getID();
                    
                    String[] pathnames = { Files[i].getCanonicalPath() };
                    pdfctl.addPDF(bookid, pathnames );
                    
                  
                    }
                    
                   
                    populateList();
                } else {
                    System.out.println("Die zu öffnende Datei ist: "
                            + chooser.getSelectedFile().getName());
                    PDFController pdfctl = PDFController.getInstance();
                    int bookid = myparent.getID();
                    
                    String[] pathnames = { chooser.getSelectedFile().getCanonicalPath() };
                    pdfctl.addPDF(bookid, pathnames );
                }

            } else { // Benutzer drückte abbrechen
              //this.btnSave.setEnabled(false);
            }
            
        } catch (Exception e) {
            
        }
        
        
        
        
    
    }

    private void populateList() {
        DefaultListModel listModel = new DefaultListModel();
        PDFController ctl = PDFController.getInstance();
        String[] items = ctl.getPDFInfo(myparent.getID());
        if(items.length > 0) {
            for (int i = 0; i < items.length; i++) {
                listModel.addElement(items[i]);
                
            }
            this.jList1.removeAll();
            this.jList1.setModel(listModel);
        }
    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBooktitel;
    private javax.swing.JTextField tfBooktitel;
    // End of variables declaration//GEN-END:variables
}
