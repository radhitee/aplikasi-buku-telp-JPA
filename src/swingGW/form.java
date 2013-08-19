/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * form.java
 *
 * Created on Dec 27, 2012, 9:31:00 PM
 */
package swingGW;

import controller.TbKontakJpaController;
import entity.TbKontak;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author umbara
 */
public class form extends javax.swing.JFrame implements ListSelectionListener {

    /** Creates new form form */
    EntityManagerFactory emf;
    TbKontakJpaController controller;
    TbKontak kontak;
    tableModel model;
    

    public form() {
        initComponents();
        load();
        
        setLocationRelativeTo(this);
    }

    public TbKontak getKontak() {
        kontak = new TbKontak(txtTelp.getText(), txtNama.getText(), txtEmail.getText());
        return kontak;
    }

    private void load() {
        emf = Persistence.createEntityManagerFactory("Aplikasi_Buku_Telp_JPAPU");
        controller = new TbKontakJpaController(emf);
        model = new tableModel();
        model.setLs(controller.findTbKontakEntities());
        tableGW.setModel(model);
        tableGW.getSelectionModel().addListSelectionListener(this);
    }

    private void refresh() {
        txtNama.setText("");
        txtTelp.setText("");
        txtEmail.setText("");
        btNew.setEnabled(true);
        btUpdate.setEnabled(false);
        btDelete.setEnabled(false);
        txtTelp.setEnabled(true);
        load();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGW1 = new swingGW.panelGW();
        panelKontak = new swingGW.panelTransparantGW();
        nama = new javax.swing.JLabel();
        telp = new javax.swing.JLabel();
        txtTelp = new swingGW.textFieldGW();
        txtEmail = new swingGW.textFieldGW();
        email = new javax.swing.JLabel();
        txtNama = new swingGW.textFieldGW();
        panelTombol = new swingGW.panelTransparantGW();
        btUpdate = new swingGW.buttonGW();
        btDelete = new swingGW.buttonGW();
        btNew = new swingGW.buttonGW();
        panelTable = new swingGW.panelTransparantGW();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableGW = new javax.swing.JTable();
        panelCari = new swingGW.panelTransparantGW();
        jLabel4 = new javax.swing.JLabel();
        jcboxCari = new javax.swing.JComboBox();
        txtCari = new swingGW.textFieldGW();
        btCari = new swingGW.buttonGW();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelGW1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Radhitee", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 11))); // NOI18N
        panelGW1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelGW1MouseClicked(evt);
            }
        });

        panelKontak.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Kontak", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        panelKontak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelKontakMouseClicked(evt);
            }
        });

        nama.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12));
        nama.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nama.setText("Nama");

        telp.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12));
        telp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        telp.setText("Telp");

        txtTelp.setForeground(new java.awt.Color(0, 0, 153));
        txtTelp.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTelp.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12));

        txtEmail.setForeground(new java.awt.Color(0, 0, 153));
        txtEmail.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12));

        email.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12));
        email.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        email.setText(" Email");

        txtNama.setForeground(new java.awt.Color(0, 0, 153));
        txtNama.setDisabledTextColor(new java.awt.Color(153, 0, 0));
        txtNama.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12));

        javax.swing.GroupLayout panelKontakLayout = new javax.swing.GroupLayout(panelKontak);
        panelKontak.setLayout(panelKontakLayout);
        panelKontakLayout.setHorizontalGroup(
            panelKontakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKontakLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelKontakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelKontakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(telp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nama, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                    .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelKontakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(txtTelp, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(txtNama, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelKontakLayout.setVerticalGroup(
            panelKontakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKontakLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelKontakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nama)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelKontakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telp)
                    .addComponent(txtTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelKontakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelTombol.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tombol", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        btUpdate.setForeground(new java.awt.Color(0, 0, 255));
        btUpdate.setText("Edit");
        btUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateActionPerformed(evt);
            }
        });

        btDelete.setForeground(new java.awt.Color(0, 0, 255));
        btDelete.setText("Delete");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        btNew.setForeground(new java.awt.Color(0, 0, 255));
        btNew.setText("New");
        btNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTombolLayout = new javax.swing.GroupLayout(panelTombol);
        panelTombol.setLayout(panelTombolLayout);
        panelTombolLayout.setHorizontalGroup(
            panelTombolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTombolLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTombolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btNew, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btUpdate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(btDelete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTombolLayout.setVerticalGroup(
            panelTombolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTombolLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(btUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        panelTable.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Table", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        tableGW.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableGW);

        javax.swing.GroupLayout panelTableLayout = new javax.swing.GroupLayout(panelTable);
        panelTable.setLayout(panelTableLayout);
        panelTableLayout.setHorizontalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTableLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTableLayout.setVerticalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTableLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelCari.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cari", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Cari Berdasarkan");

        jcboxCari.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nama", "Telp", "Email" }));

        txtCari.setFont(new java.awt.Font("Tahoma", 1, 12));

        btCari.setForeground(new java.awt.Color(0, 0, 255));
        btCari.setText("Cari");
        btCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCariLayout = new javax.swing.GroupLayout(panelCari);
        panelCari.setLayout(panelCariLayout);
        panelCariLayout.setHorizontalGroup(
            panelCariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCariLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcboxCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCari, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );
        panelCariLayout.setVerticalGroup(
            panelCariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCariLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcboxCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelGW1Layout = new javax.swing.GroupLayout(panelGW1);
        panelGW1.setLayout(panelGW1Layout);
        panelGW1Layout.setHorizontalGroup(
            panelGW1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGW1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGW1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelGW1Layout.createSequentialGroup()
                        .addComponent(panelKontak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelTombol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelTable, 0, 448, Short.MAX_VALUE)
                    .addComponent(panelCari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        panelGW1Layout.setVerticalGroup(
            panelGW1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGW1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(panelGW1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(panelKontak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelTombol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGW1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGW1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
        int row = tableGW.getSelectedRow();
        try {
            controller.edit(getKontak());
            model.updated(row, kontak);
            JOptionPane.showMessageDialog(panelGW1, "Kontak berhasil diUpdate");
            refresh();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btUpdateActionPerformed

    private void btNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewActionPerformed
        try {
            controller.create(getKontak());
            int row = tableGW.getSelectedRow();
            JOptionPane.showMessageDialog(panelGW1, "Kontak berhasil diTambah");
            model.insert(kontak);
            refresh();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btNewActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        int a;
        try {
            if ((a = JOptionPane.showConfirmDialog(
                    panelTombol, "Apakah anda ingin menghapus kontak ini.?",
                    "Hapus Kontak", JOptionPane.YES_NO_OPTION)) == 0) {
                String nama = (txtTelp.getText());
                controller.destroy(nama);
                int row = tableGW.getSelectedRow();
                JOptionPane.showMessageDialog(panelGW1, "Kontak berhasil dihapus");
                model.deleted(row);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btDeleteActionPerformed

    private void panelGW1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelGW1MouseClicked
        refresh();
    }//GEN-LAST:event_panelGW1MouseClicked

    private void panelKontakMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelKontakMouseClicked
        refresh();
    }//GEN-LAST:event_panelKontakMouseClicked

    private void btCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCariActionPerformed
        List<TbKontak> tb=null, tbd = controller.findTbKontakEntities();
        if (jcboxCari.getSelectedIndex() == 0) {
            model.deletAll(tbd);
            tb = controller.queryGW("nama", txtCari.getText());
            model.insertAll(tb);
        }else if(jcboxCari.getSelectedIndex() == 1) {
            model.deletAll(tbd);
            tb = controller.queryGW("telp", txtCari.getText());
            model.insertAll(tb);
        }else if(jcboxCari.getSelectedIndex() == 2) {
            model.deletAll(tbd);
            tb = controller.queryGW("email", txtCari.getText());
            model.insertAll(tb);
        }
    }//GEN-LAST:event_btCariActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new form().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swingGW.buttonGW btCari;
    private swingGW.buttonGW btDelete;
    private swingGW.buttonGW btNew;
    private swingGW.buttonGW btUpdate;
    private javax.swing.JLabel email;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox jcboxCari;
    private javax.swing.JLabel nama;
    private swingGW.panelTransparantGW panelCari;
    private swingGW.panelGW panelGW1;
    private swingGW.panelTransparantGW panelKontak;
    private swingGW.panelTransparantGW panelTable;
    private swingGW.panelTransparantGW panelTombol;
    private javax.swing.JTable tableGW;
    private javax.swing.JLabel telp;
    private swingGW.textFieldGW txtCari;
    private swingGW.textFieldGW txtEmail;
    private swingGW.textFieldGW txtNama;
    private swingGW.textFieldGW txtTelp;
    // End of variables declaration//GEN-END:variables

    @Override
    public void valueChanged(ListSelectionEvent e) {
        int baris = tableGW.getSelectedRow();
        try {
            txtNama.setText(tableGW.getValueAt(baris, 0).toString());
            txtTelp.setText(tableGW.getValueAt(baris, 1).toString());
            txtEmail.setText(tableGW.getValueAt(baris, 2).toString());
            btNew.setEnabled(false);
            btUpdate.setEnabled(true);
            btDelete.setEnabled(true);
            txtTelp.setEnabled(false);
        } catch (Exception se) {
        }
    }
}
