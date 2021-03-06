/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.view;

import ec.edu.espe.cinemaboxoffice.model.Movie;
import ec.edu.espe.cinemaboxoffice.model.BillboardMovie;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.nio.file.Paths;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Alisson Clavijo
 */
public class FrmTicket extends javax.swing.JFrame {

    private final Movie movie;

    /**
     * Creates new form FrmMovie
     *
     * @param movie
     */
    public FrmTicket(Movie movie) {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.movie = movie;

        lblMovieTitle.setText(movie.getTitle());
        lblMoviegender.setText(movie.getGender());
        lblMovieAgeRestriction.setText(movie.getAgeRestriction());
        lblMovieDuration.setText(movie.getDuration() + " min");
        lblMovieDate.setText(movie.getDate());
        lblMoviePrice.setText("$ " + movie.getPrice());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pnlticket = new javax.swing.JPanel();
        lblMovieDuration = new javax.swing.JLabel();
        lblMoviegender = new javax.swing.JLabel();
        lblMovieTitle = new javax.swing.JLabel();
        lblMovieAgeRestriction = new javax.swing.JLabel();
        lblMovieDate = new javax.swing.JLabel();
        lblMoviePrice = new javax.swing.JLabel();
        lblcinema = new javax.swing.JLabel();
        lblIconOne = new javax.swing.JLabel();
        lblicontwo = new javax.swing.JLabel();
        lblboxoffice = new javax.swing.JLabel();
        lbliconthree = new javax.swing.JLabel();
        lbliconfour = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnPrintTicket = new javax.swing.JButton();
        btnMovieExit = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        jPanel4.setBackground(new java.awt.Color(255, 255, 51));
        jPanel4.setForeground(new java.awt.Color(255, 255, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/cinemaboxoffice/pictures/cine.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Movie Ticket ");
        setBackground(new java.awt.Color(0, 0, 51));

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));

        pnlticket.setBackground(new java.awt.Color(255, 255, 255));
        pnlticket.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 0)));
        pnlticket.setForeground(new java.awt.Color(255, 255, 204));
        pnlticket.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMovieDuration.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        lblMovieDuration.setText("-");
        pnlticket.add(lblMovieDuration, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));

        lblMoviegender.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        lblMoviegender.setText("-");
        pnlticket.add(lblMoviegender, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

        lblMovieTitle.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        lblMovieTitle.setText("-");
        pnlticket.add(lblMovieTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 20, -1, -1));

        lblMovieAgeRestriction.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        lblMovieAgeRestriction.setText("-");
        pnlticket.add(lblMovieAgeRestriction, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, -1, -1));

        lblMovieDate.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        lblMovieDate.setText("-");
        pnlticket.add(lblMovieDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, -1));

        lblMoviePrice.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        lblMoviePrice.setText("-");
        pnlticket.add(lblMoviePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));

        lblcinema.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        lblcinema.setText("CINEMA");
        pnlticket.add(lblcinema, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 120, 40));

        lblIconOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/cinemaboxoffice/pictures/boleto.png"))); // NOI18N
        pnlticket.add(lblIconOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, 80));

        lblicontwo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/cinemaboxoffice/pictures/cine.png"))); // NOI18N
        pnlticket.add(lblicontwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, -1, -1));

        lblboxoffice.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        lblboxoffice.setText("BOX OFFICE");
        pnlticket.add(lblboxoffice, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 180, 30));

        lbliconthree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/cinemaboxoffice/pictures/cine.png"))); // NOI18N
        pnlticket.add(lbliconthree, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, -1, -1));

        lbliconfour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/cinemaboxoffice/pictures/cine.png"))); // NOI18N
        pnlticket.add(lbliconfour, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/cinemaboxoffice/pictures/cine.png"))); // NOI18N
        pnlticket.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/cinemaboxoffice/pictures/codigo-de-barras.png"))); // NOI18N
        pnlticket.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 130, 130));

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        jLabel1.setText("Titulo:");
        pnlticket.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        jLabel4.setText("genero:");
        pnlticket.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, -1));

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        jLabel6.setText("edad de restriccion:");
        pnlticket.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, -1));

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        jLabel7.setText("Duracion:");
        pnlticket.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        jLabel8.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        jLabel8.setText("Fecha:");
        pnlticket.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, 20));

        jLabel9.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        jLabel9.setText("precio:");
        pnlticket.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        btnPrintTicket.setText("Imprimir Boleto");
        btnPrintTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintTicketActionPerformed(evt);
            }
        });

        btnMovieExit.setText("Cancelar");
        btnMovieExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMovieExitActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ENTRADA DE CINE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(btnPrintTicket)
                .addGap(39, 39, 39)
                .addComponent(btnMovieExit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(279, 279, 279))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlticket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlticket, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMovieExit)
                    .addComponent(btnPrintTicket))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMovieExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMovieExitActionPerformed
        dispose();
    }//GEN-LAST:event_btnMovieExitActionPerformed

    private void btnPrintTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintTicketActionPerformed
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setJobName("Print Data");

        job.setPrintable(new Printable() {
            public int print(Graphics pg, PageFormat pf, int pageNum) {
                pf.setOrientation(PageFormat.LANDSCAPE);
                if (pageNum > 0) {
                    return Printable.NO_SUCH_PAGE;
                }

                Graphics2D g2 = (Graphics2D) pg;
                g2.translate(pf.getImageableX(), pf.getImageableY());
                g2.scale(0.80, 0.80);

                pnlticket.paint(g2);
//          

                return Printable.PAGE_EXISTS;

            }
        });

        boolean ok = job.printDialog();
        if (ok) {
            try {

                job.print();
            } catch (PrinterException ex) {
            }
        }
    }//GEN-LAST:event_btnPrintTicketActionPerformed

    public ImageIcon showPicture(String namePicture) {
        if (Paths.get("pictures/" + namePicture).toString() != null) {
            ImageIcon image = new ImageIcon(Paths.get("pictures/" + namePicture).toString());
            ImageIcon icon = new ImageIcon(image.getImage().getScaledInstance(200, 270, Image.SCALE_DEFAULT));
            return icon;
        }
        return null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMovieExit;
    private javax.swing.JButton btnPrintTicket;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblIconOne;
    private javax.swing.JLabel lblMovieAgeRestriction;
    private javax.swing.JLabel lblMovieDate;
    private javax.swing.JLabel lblMovieDuration;
    private javax.swing.JLabel lblMoviePrice;
    private javax.swing.JLabel lblMovieTitle;
    private javax.swing.JLabel lblMoviegender;
    private javax.swing.JLabel lblboxoffice;
    private javax.swing.JLabel lblcinema;
    private javax.swing.JLabel lbliconfour;
    private javax.swing.JLabel lbliconthree;
    private javax.swing.JLabel lblicontwo;
    private javax.swing.JPanel pnlticket;
    // End of variables declaration//GEN-END:variables
}
