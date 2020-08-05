/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.menu.view;

import javax.swing.ImageIcon;

/**
 *
 * @author Josue
 */
public class FrmCinemaBoxCustomer extends javax.swing.JFrame {

    ImageIcon lotr = new ImageIcon("lotr.png");
    ImageIcon shrek = new ImageIcon("shrek.png");
    ImageIcon ridge = new ImageIcon("hacksawridge.png");
    ImageIcon joker = new ImageIcon("thejoker.png");
    ImageIcon pulp = new ImageIcon("pulpfiction.png");
    ImageIcon ryan = new ImageIcon("privateryan.png");
    ImageIcon ww = new ImageIcon("ww.png");
    ImageIcon bw = new ImageIcon("bw.png");
    ImageIcon mk = new ImageIcon("mortalkombat.png");
    ImageIcon pr1 = new ImageIcon("promotion1.png");
    ImageIcon pr2 = new ImageIcon("promotion2.png");
    ImageIcon pr3 = new ImageIcon("promotion3.png");
    ImageIcon pr4 = new ImageIcon("promotion4.png");

    /**
     * Creates new form CinemaBox
     */
    public FrmCinemaBoxCustomer() {
        initComponents();
        setLocationRelativeTo(null);
        //BILLBOARD
        lblMovie1.setText("");
        lblMovie2.setText("");
        lblMovie3.setText("");
        lblMovie4.setText("");
        lblMovie5.setText("");
        lblMovie6.setText("");
        lblMovie1.setIcon(lotr);
        lblMovie2.setIcon(shrek);
        lblMovie3.setIcon(ridge);
        lblMovie4.setIcon(joker);
        lblMovie5.setIcon(pulp);
        lblMovie6.setIcon(ryan);

        //COMING SOON
        lblNext1.setText("");
        lblNext2.setText("");
        lblNext3.setText("");
        lblNext1.setIcon(ww);
        lblNext2.setIcon(bw);
        lblNext3.setIcon(mk);
        
        //PROMOTION
        lblPromotion1.setIcon(pr1);
        lblPromotion2.setIcon(pr2);
        lblPromotion3.setIcon(pr3);
        lblPromotion4.setIcon(pr4);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        lblMovie1 = new javax.swing.JLabel();
        lblMovie2 = new javax.swing.JLabel();
        lblMovie3 = new javax.swing.JLabel();
        lblMovie4 = new javax.swing.JLabel();
        lblMovie5 = new javax.swing.JLabel();
        lblMovie6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblNext1 = new javax.swing.JLabel();
        lblNext2 = new javax.swing.JLabel();
        lblNext3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblPromotion1 = new javax.swing.JLabel();
        lblPromotion2 = new javax.swing.JLabel();
        lblPromotion3 = new javax.swing.JLabel();
        lblPromotion4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CUSTOMER MENU");
        setBackground(new java.awt.Color(240, 21, 34));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 51));

        lblMovie1.setText("jLabel1");

        lblMovie2.setText("jLabel2");

        lblMovie3.setText("jLabel3");

        lblMovie4.setText("jLabel4");

        lblMovie5.setText("jLabel5");

        lblMovie6.setText("jLabel6");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMovie1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(lblMovie4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMovie2, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(lblMovie5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMovie6, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(lblMovie3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(189, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMovie1)
                    .addComponent(lblMovie2)
                    .addComponent(lblMovie3))
                .addGap(102, 102, 102)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMovie4)
                    .addComponent(lblMovie5)
                    .addComponent(lblMovie6))
                .addContainerGap(396, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Billboard", jPanel3);

        jPanel5.setBackground(new java.awt.Color(0, 0, 51));

        lblNext1.setText("jLabel1");

        lblNext2.setText("jLabel2");

        lblNext3.setText("jLabel3");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblNext1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNext2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNext3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(174, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNext1)
                    .addComponent(lblNext2)
                    .addComponent(lblNext3))
                .addContainerGap(501, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Coming soon", jPanel5);

        jPanel4.setBackground(new java.awt.Color(0, 0, 51));

        lblPromotion1.setText("jLabel1");

        lblPromotion2.setText("jLabel1");

        lblPromotion3.setText("jLabel1");

        lblPromotion4.setText("jLabel1");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPromotion1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPromotion3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPromotion2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPromotion4, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPromotion1)
                    .addComponent(lblPromotion2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 230, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPromotion3)
                    .addComponent(lblPromotion4))
                .addGap(251, 251, 251))
        );

        jTabbedPane2.addTab("Promotions", jPanel4);

        jMenu1.setText("CinemaBoxOffice");

        jMenuItem1.setText("Exit");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FrmCinemaBoxCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCinemaBoxCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCinemaBoxCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCinemaBoxCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCinemaBoxCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel lblMovie1;
    private javax.swing.JLabel lblMovie2;
    private javax.swing.JLabel lblMovie3;
    private javax.swing.JLabel lblMovie4;
    private javax.swing.JLabel lblMovie5;
    private javax.swing.JLabel lblMovie6;
    private javax.swing.JLabel lblNext1;
    private javax.swing.JLabel lblNext2;
    private javax.swing.JLabel lblNext3;
    private javax.swing.JLabel lblPromotion1;
    private javax.swing.JLabel lblPromotion2;
    private javax.swing.JLabel lblPromotion3;
    private javax.swing.JLabel lblPromotion4;
    // End of variables declaration//GEN-END:variables
}
