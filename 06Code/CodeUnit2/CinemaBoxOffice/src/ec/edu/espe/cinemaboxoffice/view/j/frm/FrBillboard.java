/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.view.j.frm;

import java.awt.HeadlessException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Josue Aleman, ESPE.
 */
public class FrBillboard extends javax.swing.JFrame {

    ImageIcon imageShrek = new ImageIcon("shrek.png");
    ImageIcon imageRyan = new ImageIcon("privateryan.png");
    ImageIcon imageLotr = new ImageIcon("lotr.png");
    ImageIcon imagePulp = new ImageIcon("pulpfiction.png");
    ImageIcon imageHacksaw = new ImageIcon("hacksawridge.png");
    ImageIcon imageJoker = new ImageIcon("thejoker.png");

    public ImageIcon getImageShrek() {
        return imageShrek;
    }

    public ImageIcon getImageRyan() {
        return imageRyan;
    }

    public ImageIcon getImageLotr() {
        return imageLotr;
    }

    public ImageIcon getImagePulp() {
        return imagePulp;
    }

    public ImageIcon getImageHacksaw() {
        return imageHacksaw;
    }

    public ImageIcon getImageJoker() {
        return imageJoker;
    }

    public JLabel getLblLotr() {
        return lblLotr;
    }

    public JLabel getLblPulpF() {
        return lblPulpF;
    }

    public JLabel getLblShrek() {
        return lblShrek;
    }

    /**
     * Creates new form NewJFrame
     */
    public FrBillboard() {
        initComponents();
        this.setLocationRelativeTo(null);

        lblJoker.setText("");
        lblLotr.setText("");
        lblShrek.setText("");
        lblPulpF.setText("");
        lblRyan.setText("");
        lblRidge.setText("");
        lblRyan.setIcon(imageRyan);
        lblRidge.setIcon(imageHacksaw);
        lblJoker.setIcon(imageJoker);
        lblLotr.setIcon(imageLotr);
        lblShrek.setIcon(imageShrek);
        lblPulpF.setIcon(imagePulp);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblLotr = new javax.swing.JLabel();
        lblJoker = new javax.swing.JLabel();
        lblShrek = new javax.swing.JLabel();
        lblPulpF = new javax.swing.JLabel();
        btnLotr = new javax.swing.JButton();
        btnJoker = new javax.swing.JButton();
        btnPulp = new javax.swing.JButton();
        btnShrek = new javax.swing.JButton();
        lblRidge = new javax.swing.JLabel();
        lblRyan = new javax.swing.JLabel();
        btnRidge = new javax.swing.JButton();
        btnRyan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BILLBOARD");

        jLabel1.setText("SELECT A MOVIE");

        lblLotr.setText("The Lord of The Rings: The Return of the King");

        lblJoker.setText("The Joker");

        lblShrek.setText("Shrek");

        lblPulpF.setText("Pulp Fiction");

        btnLotr.setText("View More");
        btnLotr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLotrActionPerformed(evt);
            }
        });

        btnJoker.setText("View More");
        btnJoker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJokerActionPerformed(evt);
            }
        });

        btnPulp.setText("View More");
        btnPulp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPulpActionPerformed(evt);
            }
        });

        btnShrek.setText("View More");
        btnShrek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShrekActionPerformed(evt);
            }
        });

        lblRidge.setText("Hacksaw Ridge");

        lblRyan.setText("Saving Private Ryan");

        btnRidge.setText("View More");
        btnRidge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRidgeActionPerformed(evt);
            }
        });

        btnRyan.setText("View More");
        btnRyan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRyanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(btnLotr)
                        .addGap(322, 322, 322)
                        .addComponent(btnShrek)
                        .addGap(331, 331, 331)
                        .addComponent(btnRidge))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLotr)
                                    .addComponent(lblJoker, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(btnJoker)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(191, 191, 191)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblShrek, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPulpF, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(191, 191, 191)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblRidge, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRyan, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(btnPulp)
                                .addGap(332, 332, 332)
                                .addComponent(btnRyan)))
                        .addGap(46, 46, 46)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLotr)
                    .addComponent(lblShrek)
                    .addComponent(lblRidge))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLotr)
                    .addComponent(btnShrek)
                    .addComponent(btnRidge))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJoker)
                    .addComponent(lblPulpF)
                    .addComponent(lblRyan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnJoker)
                    .addComponent(btnPulp)
                    .addComponent(btnRyan))
                .addContainerGap(384, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(418, 418, 418)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLotrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLotrActionPerformed
        // TODO add your handling code here:
        FrMovie movie = new FrMovie();
        movie.setVisible(true);
        String name = "The Lord of the Rings: The Return of the King";
        String duration = "3h20m";
        String age = "13";
        movie.showMovie(imageLotr, name, duration, age);

    }//GEN-LAST:event_btnLotrActionPerformed

    private void btnJokerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJokerActionPerformed
        // TODO add your handling code here:
        FrMovie movie = new FrMovie();
        movie.setVisible(true);
        String name = "The Joker";
        String duration = "2h2m";
        String age = "18";
        movie.showMovie(imageJoker, name, duration, age);
    }//GEN-LAST:event_btnJokerActionPerformed

    private void btnShrekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShrekActionPerformed
        // TODO add your handling code here:
        FrMovie movie = new FrMovie();
        movie.setVisible(true);
        String name = "Shrek";
        String duration = "1h35m";
        String age = "All public";
        movie.showMovie(imageShrek, name, duration, age);
    }//GEN-LAST:event_btnShrekActionPerformed

    private void btnPulpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPulpActionPerformed
        // TODO add your handling code here:
        FrMovie movie = new FrMovie();
        movie.setVisible(true);
        String name = "Pulp Fiction";
        String duration = "2h58m";
        String age = "18";
        movie.showMovie(imagePulp, name, duration, age);
    }//GEN-LAST:event_btnPulpActionPerformed

    private void btnRidgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRidgeActionPerformed
        // TODO add your handling code here:
        FrMovie movie = new FrMovie();
        movie.setVisible(true);
        String name = "hacksaw Ridge";
        String duration = "2h19m";
        String age = "18";
        movie.showMovie(imageHacksaw, name, duration, age);
    }//GEN-LAST:event_btnRidgeActionPerformed

    private void btnRyanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRyanActionPerformed
        // TODO add your handling code here:
        FrMovie movie = new FrMovie();
        movie.setVisible(true);
        String name = "Saving Private Ryan";
        String duration = "2h50m";
        String age = "18";
        movie.showMovie(imageRyan, name, duration, age);
    }//GEN-LAST:event_btnRyanActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrBillboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrBillboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrBillboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrBillboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrBillboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJoker;
    private javax.swing.JButton btnLotr;
    private javax.swing.JButton btnPulp;
    private javax.swing.JButton btnRidge;
    private javax.swing.JButton btnRyan;
    private javax.swing.JButton btnShrek;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblJoker;
    private javax.swing.JLabel lblLotr;
    private javax.swing.JLabel lblPulpF;
    private javax.swing.JLabel lblRidge;
    private javax.swing.JLabel lblRyan;
    private javax.swing.JLabel lblShrek;
    // End of variables declaration//GEN-END:variables
}