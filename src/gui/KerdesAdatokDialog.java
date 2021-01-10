/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JOptionPane;
import model.Kerdes;

/**
 *
 * @author Norbert Szilagyi
 */
public class KerdesAdatokDialog extends javax.swing.JDialog {

    private boolean mentes;
    private Kerdes kerdes;

    public KerdesAdatokDialog(java.awt.Frame parent) {
        super(parent, true);
        initComponents();

        mentes = false;

        setLocationRelativeTo(null);
        setTitle("Kerdesek hozzaadasa");
      
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfKerdes = new javax.swing.JTextField();
        tfValasz0 = new javax.swing.JTextField();
        tfValasz1 = new javax.swing.JTextField();
        tfValasz2 = new javax.swing.JTextField();
        tfValasz3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnMentes = new javax.swing.JButton();
        btnMegsem = new javax.swing.JButton();
        tfHelyesValasz = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Kerdes:");

        jLabel2.setText("1. Valasz:");

        jLabel3.setText("2. Valasz:");

        jLabel4.setText("3. Valasz:");

        jLabel5.setText("4. Valasz:");

        tfValasz2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfValasz2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Helyes Valasz:");

        btnMentes.setText("Mentes");
        btnMentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMentesActionPerformed(evt);
            }
        });

        btnMegsem.setText("Megsem");
        btnMegsem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMegsemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(47, 47, 47)
                            .addComponent(tfValasz1))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addGap(47, 47, 47)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfKerdes)
                                .addComponent(tfValasz0, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4))
                            .addGap(48, 48, 48)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfValasz2)
                                .addComponent(tfValasz3, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(tfHelyesValasz, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(287, Short.MAX_VALUE)
                .addComponent(btnMentes, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnMegsem, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfKerdes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfValasz0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfValasz1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfValasz2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfValasz3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tfHelyesValasz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnMegsem, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnMentes, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfValasz2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfValasz2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfValasz2ActionPerformed

    private void btnMentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMentesActionPerformed
            int valasz;
            mentes = true;
            kerdes = new Kerdes(
                    tfKerdes.getText(),
                    tfValasz0.getText(),
                    tfValasz1.getText(),
                    tfValasz2.getText(),
                    tfValasz3.getText(), 
                    valasz = Integer.parseInt(tfHelyesValasz.getText()));      
            if (valasz >=0 && valasz < 4){
        valasz =Integer.parseInt(tfHelyesValasz.getText());   
                            setVisible(false);

    } else {
                JOptionPane.showMessageDialog(rootPane, "Hibas ertek, a megadott erteknek 0,1,2,3-nak kell lennie", "Hibas ertek", JOptionPane.ERROR_MESSAGE);
        }
           

    }//GEN-LAST:event_btnMentesActionPerformed

    private void btnMegsemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMegsemActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnMegsemActionPerformed
 public boolean isMentes() {
        return mentes;
    }
  public Kerdes getKerdes() {
        return kerdes;
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMegsem;
    private javax.swing.JButton btnMentes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField tfHelyesValasz;
    private javax.swing.JTextField tfKerdes;
    private javax.swing.JTextField tfValasz0;
    private javax.swing.JTextField tfValasz1;
    private javax.swing.JTextField tfValasz2;
    private javax.swing.JTextField tfValasz3;
    // End of variables declaration//GEN-END:variables
}