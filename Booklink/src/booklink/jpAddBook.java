/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package booklink;

/**
 *
 * @author Kerstin
 */
public class jpAddBook extends javax.swing.JPanel {

    /**
     * Creates new form jpAddBook
     */
    public jpAddBook() {
        initComponents();
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
        tfBooktitel = new javax.swing.JTextField();
        lblAuthor = new javax.swing.JLabel();
        tfAuthor = new javax.swing.JTextField();
        lblISBN = new javax.swing.JLabel();
        tfISBN = new javax.swing.JTextField();
        lblPress = new javax.swing.JLabel();
        tfPress = new javax.swing.JTextField();
        lblYear = new javax.swing.JLabel();
        tfYear = new javax.swing.JTextField();
        lblEdition = new javax.swing.JLabel();
        lblLendingPeriod = new javax.swing.JLabel();
        lblComment = new javax.swing.JLabel();
        tfEdition = new javax.swing.JTextField();
        tfLendingPeriod = new javax.swing.JTextField();
        tfComment = new javax.swing.JTextField();

        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

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

        lblBooktitel.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblBooktitel.setText("Buchtitel");

        tfBooktitel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBooktitelActionPerformed(evt);
            }
        });

        lblAuthor.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblAuthor.setText("Autor");

        tfAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAuthorActionPerformed(evt);
            }
        });

        lblISBN.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblISBN.setText("ISBN");

        lblPress.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblPress.setText("Verlag");

        tfPress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPressActionPerformed(evt);
            }
        });

        lblYear.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblYear.setText("Erscheinungsjahr");

        lblEdition.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblEdition.setText("Auflage");

        lblLendingPeriod.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblLendingPeriod.setText("Leihfrist");

        lblComment.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblComment.setText("Bemerkung");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAuthor)
                    .addComponent(lblPress)
                    .addComponent(lblISBN)
                    .addComponent(lblBooktitel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfBooktitel, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(tfAuthor)
                    .addComponent(tfISBN)
                    .addComponent(tfPress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblYear, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEdition, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLendingPeriod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblComment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfEdition)
                            .addComponent(tfLendingPeriod)
                            .addComponent(tfYear, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(tfComment))))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBooktitel)
                    .addComponent(tfBooktitel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblYear)
                    .addComponent(tfYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblISBN)
                        .addGap(56, 56, 56))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfEdition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEdition)
                            .addComponent(tfAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAuthor))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLendingPeriod)
                            .addComponent(tfLendingPeriod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfComment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblComment)
                    .addComponent(lblPress))
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnOk))
                .addGap(40, 40, 40))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOkActionPerformed

    private void tfBooktitelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBooktitelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBooktitelActionPerformed

    private void tfPressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPressActionPerformed

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        // TODO add your handling code here:
         this.setVisible(false);
    }//GEN-LAST:event_btnCancelMouseClicked

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelActionPerformed

    private void tfAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAuthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAuthorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel lblAuthor;
    private javax.swing.JLabel lblBooktitel;
    private javax.swing.JLabel lblComment;
    private javax.swing.JLabel lblEdition;
    private javax.swing.JLabel lblISBN;
    private javax.swing.JLabel lblLendingPeriod;
    private javax.swing.JLabel lblPress;
    private javax.swing.JLabel lblYear;
    private javax.swing.JTextField tfAuthor;
    private javax.swing.JTextField tfBooktitel;
    private javax.swing.JTextField tfComment;
    private javax.swing.JTextField tfEdition;
    private javax.swing.JTextField tfISBN;
    private javax.swing.JTextField tfLendingPeriod;
    private javax.swing.JTextField tfPress;
    private javax.swing.JTextField tfYear;
    // End of variables declaration//GEN-END:variables
}