/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.DBModel;
import model.IModel;
import model.Kerdes;

/**
 *
 * @author Norbert Szilagyi
 */
public class FoAblak extends javax.swing.JFrame {

    private IModel model;
    private int valasz;
    Kerdes kerdes;
    List<Kerdes> kerdesek;

    public FoAblak() {
        initComponents();

        setLocationRelativeTo(null);
        setTitle("Legyen On is Milliomos");

        String connUrl = "jdbc:mysql://localhost:3306/loim";
        String user = "root";
        String pass = "1234";

        try {
            Connection conn = DriverManager.getConnection(connUrl, user, pass);
            model = new DBModel(conn);
        } catch (SQLException ex) {
            hibaAblak(ex);
        }
        lista.setSelectedIndex(14);

        ujKerdes();

    }

    public static void hibaAblak(Exception ex) {
        JOptionPane.showMessageDialog(null, ex.toString(), "Hiba tortent", JOptionPane.ERROR_MESSAGE);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList();
        btnValasz0 = new javax.swing.JButton();
        btnValasz1 = new javax.swing.JButton();
        btnValasz2 = new javax.swing.JButton();
        btnValasz3 = new javax.swing.JButton();
        lbKerdes = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miUjJatek = new javax.swing.JMenuItem();
        miKilepes = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        miKerdesek = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lista.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "15.      40.000.000 Huf", "14.      20.000.000 Huf", "13.      10.000.000 Huf", "12.      5.000.000 Huf", "11.      2.000.000 Huf", "10.      1.000.000 Huf", "9.        800.000 Huf", "8.        500.000 Huf", "7.        300.000 Huf", "6.        200.000 Huf", "5.        100.000 Huf", "4.        50.000 Huf", "3.        20.000 Huf", "2.        10.000 Huf", "1.        5.000 Huf" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lista.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(lista);

        btnValasz0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValasz0ActionPerformed(evt);
            }
        });

        btnValasz1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValasz1ActionPerformed(evt);
            }
        });

        btnValasz2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValasz2ActionPerformed(evt);
            }
        });

        btnValasz3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValasz3ActionPerformed(evt);
            }
        });

        jMenu1.setText("Fajl");

        miUjJatek.setText("Uj Jatek");
        miUjJatek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miUjJatekActionPerformed(evt);
            }
        });
        jMenu1.add(miUjJatek);

        miKilepes.setText("Kilepes");
        miKilepes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miKilepesActionPerformed(evt);
            }
        });
        jMenu1.add(miKilepes);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Adatok");

        miKerdesek.setText("Kerdesek");
        miKerdesek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miKerdesekActionPerformed(evt);
            }
        });
        jMenu2.add(miKerdesek);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbKerdes, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnValasz0, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                            .addComponent(btnValasz2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnValasz1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnValasz3, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnValasz0, btnValasz1, btnValasz2, btnValasz3});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbKerdes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnValasz1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnValasz0, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnValasz3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnValasz2))
                .addGap(54, 54, 54))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnValasz0, btnValasz1, btnValasz2, btnValasz3});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnValasz3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValasz3ActionPerformed

        if (valasz == 3) {
            lista.setSelectedIndex(lista.getSelectedIndex() - 1);

            ujKerdes();

        } else if (lista.getSelectedIndex() == 14) {
            JOptionPane.showMessageDialog(rootPane, "Vege a jateknak sajnos penzt ezuttal nem nyert...,", "Vege a jateknak", JOptionPane.PLAIN_MESSAGE);
            lista.setSelectedIndex(14);
            ujJatek();
            

        } else {

            JOptionPane.showMessageDialog(rootPane, "Vege az On nyeremenye " + String.valueOf(lista.getSelectedValue()).substring(6), "Vege a jateknak", JOptionPane.PLAIN_MESSAGE);
            lista.setSelectedIndex(14);

            ujJatek();
            
        }
    }//GEN-LAST:event_btnValasz3ActionPerformed

    private void btnValasz1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValasz1ActionPerformed
        if (valasz == 1) {
            lista.setSelectedIndex(lista.getSelectedIndex() - 1);

            ujKerdes();
        } else if (lista.getSelectedIndex() == 14) {
            JOptionPane.showMessageDialog(rootPane, "Vege a jateknak sajnos penzt ezuttal nem nyert...,", "Vege a jateknak", JOptionPane.PLAIN_MESSAGE);
            lista.setSelectedIndex(14);

            ujJatek();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Vege az On nyeremenye " + String.valueOf(lista.getSelectedValue()).substring(6), "Vege a jateknak", JOptionPane.PLAIN_MESSAGE);
            lista.setSelectedIndex(14);
          ujJatek();
        }
    }//GEN-LAST:event_btnValasz1ActionPerformed

    private void btnValasz2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValasz2ActionPerformed
        if (valasz == 2) {
            lista.setSelectedIndex(lista.getSelectedIndex() - 1);

            ujKerdes();
        } else if (lista.getSelectedIndex() == 14) {
            JOptionPane.showMessageDialog(rootPane, "Vege a jateknak sajnos penzt ezuttal nem nyert...,", "Vege a jateknak", JOptionPane.PLAIN_MESSAGE);
            lista.setSelectedIndex(14);
            ujJatek();
           
            
        } else {
            JOptionPane.showMessageDialog(rootPane, "Vege az On nyeremenye " + String.valueOf(lista.getSelectedValue()).substring(6), "Vege a jateknak", JOptionPane.PLAIN_MESSAGE);
            lista.setSelectedIndex(14);

           ujJatek();
        }

    }//GEN-LAST:event_btnValasz2ActionPerformed

    private void miUjJatekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miUjJatekActionPerformed
        lista.setSelectedIndex(14);
        ujKerdes();

    }//GEN-LAST:event_miUjJatekActionPerformed

    private void miKilepesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miKilepesActionPerformed

        kilepes();
    }//GEN-LAST:event_miKilepesActionPerformed

    private void miKerdesekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miKerdesekActionPerformed
        KerdesAdatokDialog kad = new KerdesAdatokDialog(this);
        kad.setVisible(true);

        if (kad.isMentes()) {
            try {
                Kerdes k = kad.getKerdes();
                model.addKerdes(k);

            } catch (SQLException ex) {
                hibaAblak(ex);
            }

        }

    }//GEN-LAST:event_miKerdesekActionPerformed

    private void btnValasz0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValasz0ActionPerformed
 if (valasz == 0) {
            lista.setSelectedIndex(lista.getSelectedIndex() - 1);

            ujKerdes();
        } else if (lista.getSelectedIndex() == 14) {
            JOptionPane.showMessageDialog(rootPane, "Vege a jateknak sajnos penzt ezuttal nem nyert...,", "Vege a jateknak", JOptionPane.PLAIN_MESSAGE);
            lista.setSelectedIndex(14);
            ujJatek();
           
            
        } else {
            JOptionPane.showMessageDialog(rootPane, "Vege az On nyeremenye " + String.valueOf(lista.getSelectedValue()).substring(6), "Vege a jateknak", JOptionPane.PLAIN_MESSAGE);
            lista.setSelectedIndex(14);

           ujJatek();
        }

        
    }//GEN-LAST:event_btnValasz0ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FoAblak().setVisible(true);

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnValasz0;
    private javax.swing.JButton btnValasz1;
    private javax.swing.JButton btnValasz2;
    private javax.swing.JButton btnValasz3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbKerdes;
    private javax.swing.JList lista;
    private javax.swing.JMenuItem miKerdesek;
    private javax.swing.JMenuItem miKilepes;
    private javax.swing.JMenuItem miUjJatek;
    // End of variables declaration//GEN-END:variables

    private void ujKerdes() {

        try {

            kerdesek = model.getKerdesek();
            
            for (Kerdes k : kerdesek) {
             Collections.shuffle(kerdesek);

                lbKerdes.setText(k.getKerdes());
                btnValasz3.setText(k.getValasz3());
                btnValasz0.setText(k.getValasz0());
                btnValasz1.setText(k.getValasz1());
                btnValasz2.setText(k.getValasz2());
                valasz = k.getHelyesvalasz();
            }

        } catch (SQLException ex) {
            hibaAblak(ex);
        }

    }

    private void kilepes() {
        try {
            model.close();
        } catch (SQLException ex) {
            hibaAblak(ex);
        }
        dispose();
    }

    private void ujJatek() {
        KilepesDialog kd = new KilepesDialog(this);
        kd.setVisible(true);
        
        if (kd.ujJatek == false) {
            ujKerdes();
        } else {
            if (kd.vege == true) {
                kilepes();
            }
        }
    }
}