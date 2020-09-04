/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.view;

import ec.edu.espe.cinemaboxoffice.model.Movie;
import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class FrmAdmin extends javax.swing.JFrame {
    private final FrmCinemaBox parent;

    /**
     * Creates new form FrmAdmin
     * @param parent
     */
    public FrmAdmin(FrmCinemaBox parent) {
        initComponents();
        this.getContentPane().setBackground(Color.darkGray);
        setLocationRelativeTo(null);
        this.parent = parent;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        lblMovies = new javax.swing.JLabel();
        lblMovieTitle2 = new javax.swing.JLabel();
        lblMovieTitle3 = new javax.swing.JLabel();
        lblMovieTitle1 = new javax.swing.JLabel();
        lblMovieTitle4 = new javax.swing.JLabel();
        lblMovieTitle5 = new javax.swing.JLabel();
        lblMovieTitle6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblPremierTitle2 = new javax.swing.JLabel();
        lblPremierTitle1 = new javax.swing.JLabel();
        lblPremierTitle3 = new javax.swing.JLabel();
        lblPremierTitle4 = new javax.swing.JLabel();
        lblPremierTitle6 = new javax.swing.JLabel();
        lblPremierTitle5 = new javax.swing.JLabel();
        lblPremiers = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuAdminCinema = new javax.swing.JMenu();
        mnuRecord = new javax.swing.JMenu();
        mniRecorMovie = new javax.swing.JMenuItem();
        mniRecordNextPremier = new javax.swing.JMenuItem();
        mnuDelete = new javax.swing.JMenu();
        mnuDaleteMovie = new javax.swing.JMenuItem();
        mniDeletePremier = new javax.swing.JMenuItem();
        mniAdminExit = new javax.swing.JMenuItem();
        mnuAdmin = new javax.swing.JMenu();
        mnuNewAdmin = new javax.swing.JMenuItem();
        mnuReports = new javax.swing.JMenu();
        mnuItemBillReports = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cinema Box Office");

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        lblMovies.setFont(new java.awt.Font("Comic Sans MS", 3, 20)); // NOI18N
        lblMovies.setForeground(new java.awt.Color(255, 255, 255));
        lblMovies.setText("Peliculas");

        lblMovieTitle2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lblMovieTitle2.setForeground(new java.awt.Color(255, 255, 255));
        lblMovieTitle2.setText("-");

        lblMovieTitle3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lblMovieTitle3.setForeground(new java.awt.Color(255, 255, 255));
        lblMovieTitle3.setText("-");

        lblMovieTitle1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lblMovieTitle1.setForeground(new java.awt.Color(255, 255, 255));
        lblMovieTitle1.setText("-");

        lblMovieTitle4.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lblMovieTitle4.setForeground(new java.awt.Color(255, 255, 255));
        lblMovieTitle4.setText("-");

        lblMovieTitle5.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lblMovieTitle5.setForeground(new java.awt.Color(255, 255, 255));
        lblMovieTitle5.setText("-");

        lblMovieTitle6.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lblMovieTitle6.setForeground(new java.awt.Color(255, 255, 255));
        lblMovieTitle6.setText("-");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMovieTitle5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(lblMovieTitle3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMovieTitle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMovieTitle2, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(lblMovieTitle4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMovieTitle6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(97, 97, 97))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(lblMovies, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMovies)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMovieTitle2)
                    .addComponent(lblMovieTitle1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMovieTitle3)
                    .addComponent(lblMovieTitle4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMovieTitle5)
                    .addComponent(lblMovieTitle6))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));

        lblPremierTitle2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lblPremierTitle2.setForeground(new java.awt.Color(255, 255, 255));
        lblPremierTitle2.setText("-");

        lblPremierTitle1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lblPremierTitle1.setForeground(new java.awt.Color(255, 255, 255));
        lblPremierTitle1.setText("-");

        lblPremierTitle3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lblPremierTitle3.setForeground(new java.awt.Color(255, 255, 255));
        lblPremierTitle3.setText("-");

        lblPremierTitle4.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lblPremierTitle4.setForeground(new java.awt.Color(255, 255, 255));
        lblPremierTitle4.setText("-");

        lblPremierTitle6.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lblPremierTitle6.setForeground(new java.awt.Color(255, 255, 255));
        lblPremierTitle6.setText("-");

        lblPremierTitle5.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lblPremierTitle5.setForeground(new java.awt.Color(255, 255, 255));
        lblPremierTitle5.setText("-");

        lblPremiers.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblPremiers.setForeground(new java.awt.Color(255, 255, 255));
        lblPremiers.setText("Proximos Estrenos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblPremierTitle1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(lblPremierTitle5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPremierTitle3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblPremierTitle2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(lblPremierTitle4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPremierTitle6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(lblPremiers, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPremiers, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPremierTitle2)
                    .addComponent(lblPremierTitle1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPremierTitle3)
                    .addComponent(lblPremierTitle4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPremierTitle6)
                    .addComponent(lblPremierTitle5))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        mnuAdminCinema.setText("Cinema");

        mnuRecord.setText("Agregar");

        mniRecorMovie.setText("Pelicula");
        mniRecorMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniRecorMovieActionPerformed(evt);
            }
        });
        mnuRecord.add(mniRecorMovie);

        mniRecordNextPremier.setText("Proximo Estreno");
        mniRecordNextPremier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniRecordNextPremierActionPerformed(evt);
            }
        });
        mnuRecord.add(mniRecordNextPremier);

        mnuAdminCinema.add(mnuRecord);

        mnuDelete.setText("Borrar");

        mnuDaleteMovie.setText("Pelicula");
        mnuDaleteMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDaleteMovieActionPerformed(evt);
            }
        });
        mnuDelete.add(mnuDaleteMovie);

        mniDeletePremier.setText("Proximo Estreno");
        mniDeletePremier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDeletePremierActionPerformed(evt);
            }
        });
        mnuDelete.add(mniDeletePremier);

        mnuAdminCinema.add(mnuDelete);

        mniAdminExit.setText("Salir");
        mniAdminExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAdminExitActionPerformed(evt);
            }
        });
        mnuAdminCinema.add(mniAdminExit);

        jMenuBar1.add(mnuAdminCinema);

        mnuAdmin.setText("Administrador");

        mnuNewAdmin.setText("Registrarse");
        mnuNewAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuNewAdminActionPerformed(evt);
            }
        });
        mnuAdmin.add(mnuNewAdmin);

        jMenuBar1.add(mnuAdmin);

        mnuReports.setText("Reporte");
        mnuReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuReportsActionPerformed(evt);
            }
        });

        mnuItemBillReports.setText("Facturas");
        mnuItemBillReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemBillReportsActionPerformed(evt);
            }
        });
        mnuReports.add(mnuItemBillReports);

        jMenuBar1.add(mnuReports);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniRecordNextPremierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniRecordNextPremierActionPerformed
        FrmNextPremier frmPremier = new FrmNextPremier();
        frmPremier.setVisible(true);
    }//GEN-LAST:event_mniRecordNextPremierActionPerformed

    private void mniRecorMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniRecorMovieActionPerformed
        
        FrmMovieBillboard frmBillboard = new FrmMovieBillboard();
        frmBillboard.setVisible(true);
    }//GEN-LAST:event_mniRecorMovieActionPerformed

    private void mniAdminExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAdminExitActionPerformed
        this.setVisible(false);
        parent.dispose();
        
        FrmCinemaBox frmCinema = new FrmCinemaBox();
        try {
            frmCinema.showBillboard(new Date().getDay());
            frmCinema.showDataNextPremier();
            frmCinema.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(FrmCalendar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mniAdminExitActionPerformed

    private void mnuNewAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuNewAdminActionPerformed
        new FrmNewAccounts(parent).setVisible(true);
    }//GEN-LAST:event_mnuNewAdminActionPerformed

    private void mnuDaleteMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDaleteMovieActionPerformed
       
        FrmDeleteMovie frmDeleteMovie = new FrmDeleteMovie();
        try {
            frmDeleteMovie.showListMovies("Billboard.json");
        } catch (IOException ex) {
            Logger.getLogger(FrmAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        frmDeleteMovie.setVisible(true);
    }//GEN-LAST:event_mnuDaleteMovieActionPerformed

    private void mniDeletePremierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDeletePremierActionPerformed
       
        FrmDeleteMovie frmDeleteMovie = new FrmDeleteMovie();
        try {
            frmDeleteMovie.showListNextPremieres("NextPremier.json");
        } catch (IOException ex) {
            Logger.getLogger(FrmAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        frmDeleteMovie.setVisible(true);
    }//GEN-LAST:event_mniDeletePremierActionPerformed

    private void mnuReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuReportsActionPerformed
        
    }//GEN-LAST:event_mnuReportsActionPerformed

    private void mnuItemBillReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemBillReportsActionPerformed
        FrmBillsReport report = new FrmBillsReport();
        report.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        report.setTitle("Bills report");
        report.setVisible(true);
    }//GEN-LAST:event_mnuItemBillReportsActionPerformed

    public void showNamesMovies() throws IOException {
        ArrayList<Movie> movies;
        movies = Movie.consultMovies("Billboard.json");
        if (movies.size() > 5) {
            lblMovieTitle1.setText(movies.get(0).getTitle());
            lblMovieTitle2.setText(movies.get(1).getTitle());
            lblMovieTitle3.setText(movies.get(2).getTitle());
            lblMovieTitle4.setText(movies.get(3).getTitle());
            lblMovieTitle5.setText(movies.get(4).getTitle());
            lblMovieTitle6.setText(movies.get(5).getTitle());
        }
        movies = Movie.consultNextPremier("NextPremier.json");
        if (movies.size() > 5) {
            lblPremierTitle1.setText(movies.get(0).getTitle());
            lblPremierTitle2.setText(movies.get(1).getTitle());
            lblPremierTitle3.setText(movies.get(2).getTitle());
            lblPremierTitle4.setText(movies.get(3).getTitle());
            lblPremierTitle5.setText(movies.get(4).getTitle());
            lblPremierTitle6.setText(movies.get(5).getTitle());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblMovieTitle1;
    private javax.swing.JLabel lblMovieTitle2;
    private javax.swing.JLabel lblMovieTitle3;
    private javax.swing.JLabel lblMovieTitle4;
    private javax.swing.JLabel lblMovieTitle5;
    private javax.swing.JLabel lblMovieTitle6;
    private javax.swing.JLabel lblMovies;
    private javax.swing.JLabel lblPremierTitle1;
    private javax.swing.JLabel lblPremierTitle2;
    private javax.swing.JLabel lblPremierTitle3;
    private javax.swing.JLabel lblPremierTitle4;
    private javax.swing.JLabel lblPremierTitle5;
    private javax.swing.JLabel lblPremierTitle6;
    private javax.swing.JLabel lblPremiers;
    private javax.swing.JMenuItem mniAdminExit;
    private javax.swing.JMenuItem mniDeletePremier;
    private javax.swing.JMenuItem mniRecorMovie;
    private javax.swing.JMenuItem mniRecordNextPremier;
    private javax.swing.JMenu mnuAdmin;
    private javax.swing.JMenu mnuAdminCinema;
    private javax.swing.JMenuItem mnuDaleteMovie;
    private javax.swing.JMenu mnuDelete;
    private javax.swing.JMenuItem mnuItemBillReports;
    private javax.swing.JMenuItem mnuNewAdmin;
    private javax.swing.JMenu mnuRecord;
    private javax.swing.JMenu mnuReports;
    // End of variables declaration//GEN-END:variables
}
