package enhanceneurofuzzysystem;

import com.seaglasslookandfeel.SeaGlassLookAndFeel;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;

public class MainFrm extends javax.swing.JFrame {

    public MainFrm() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane_ReccomendationSystem = new javax.swing.JTabbedPane();
        panel_Dataset = new javax.swing.JPanel();
        panel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        btnDisplayDataset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel18 = new javax.swing.JPanel();
        panelClustering = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_cluster = new javax.swing.JTextArea();
        jPanel19 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnCluster = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        panelTransition = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        panelClassification = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jTabbedPane_ReccomendationSystem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        panel_Dataset.setLayout(new java.awt.BorderLayout());

        panel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel3.setLayout(new java.awt.BorderLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Enhanced Neuro-Fuzzy System");
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel3.add(jLabel4, java.awt.BorderLayout.CENTER);

        panel_Dataset.add(panel3, java.awt.BorderLayout.PAGE_START);

        jPanel15.setLayout(new java.awt.BorderLayout());

        btnDisplayDataset.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDisplayDataset.setText("Display Data Set");
        btnDisplayDataset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayDatasetActionPerformed(evt);
            }
        });
        jPanel15.add(btnDisplayDataset, java.awt.BorderLayout.PAGE_START);

        jTable2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "mcg", "gvh", "alm", "mit", "erl", "vac", "vac", "nuc", "class"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable2);

        jPanel15.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        panel_Dataset.add(jPanel15, java.awt.BorderLayout.CENTER);

        jPanel18.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        panel_Dataset.add(jPanel18, java.awt.BorderLayout.PAGE_END);

        jTabbedPane_ReccomendationSystem.addTab("Data Set", panel_Dataset);

        panelClustering.setLayout(new java.awt.BorderLayout());

        jPanel16.setLayout(new java.awt.BorderLayout());

        jTextArea_cluster.setEditable(false);
        jTextArea_cluster.setColumns(20);
        jTextArea_cluster.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextArea_cluster.setRows(5);
        jScrollPane2.setViewportView(jTextArea_cluster);

        jPanel16.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        panelClustering.add(jPanel16, java.awt.BorderLayout.CENTER);

        jPanel19.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel19.setLayout(new java.awt.BorderLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Enhanced Neuro-Fuzzy System");
        jLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel19.add(jLabel5, java.awt.BorderLayout.CENTER);

        btnCluster.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCluster.setText("Display Clusters");
        btnCluster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClusterActionPerformed(evt);
            }
        });
        jPanel19.add(btnCluster, java.awt.BorderLayout.PAGE_END);

        panelClustering.add(jPanel19, java.awt.BorderLayout.PAGE_START);

        jPanel20.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        panelClustering.add(jPanel20, java.awt.BorderLayout.PAGE_END);

        jTabbedPane_ReccomendationSystem.addTab("Clustering", panelClustering);

        panelTransition.setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        jPanel5.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Gaussian");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, java.awt.BorderLayout.PAGE_START);

        jPanel1.add(jPanel5);

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane5.setViewportView(jTextArea3);

        jPanel6.add(jScrollPane5, java.awt.BorderLayout.CENTER);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Binary Transform");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton3, java.awt.BorderLayout.PAGE_START);

        jPanel1.add(jPanel6);

        panelTransition.add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Enhanced Neuro-Fuzzy System");
        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel6, java.awt.BorderLayout.CENTER);

        panelTransition.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jTabbedPane_ReccomendationSystem.addTab("Transition", panelTransition);

        panelClassification.setLayout(new java.awt.BorderLayout());

        jPanel3.setLayout(new java.awt.BorderLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane4.setViewportView(jTextArea1);

        jPanel3.add(jScrollPane4, java.awt.BorderLayout.CENTER);

        panelClassification.add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Enhanced Neuro-Fuzzy System");
        jLabel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(jLabel7, java.awt.BorderLayout.CENTER);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Classify");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, java.awt.BorderLayout.PAGE_END);

        panelClassification.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jTabbedPane_ReccomendationSystem.addTab("Classification", panelClassification);

        getContentPane().add(jTabbedPane_ReccomendationSystem);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClusterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClusterActionPerformed
        Preprocessing preprocess = new Preprocessing();
        List<ClassDatapoints> list = new ArrayList<>();
        for (int i = 1; i < 9; i++) {
//            DefaultTableModel model = (DefaultTableModel) tableCluster.getModel();
//            model.setRowCount(0);
            list = preprocess.prep(i);
            for (ClassDatapoints list1 : list) {
                System.out.println(list1);
            }
            Clustering cluster = new Clustering();
            Map<Integer, HashMap<Double, Double>> clustCentroidSD = cluster.createCluster(list);
            jTextArea_cluster.append("\t--------------------<< Feature#" + i + " >>--------------------\n\n");
            jTextArea_cluster.append("\tClusters\tMean\t\tStandard Deviation\n\n");

            for (Map.Entry<Integer, HashMap<Double, Double>> entrySet : clustCentroidSD.entrySet()) {
                Integer key = entrySet.getKey();
                HashMap<Double, Double> value = entrySet.getValue();
                String clust = "Cluster#" + key;
                for (Map.Entry<Double, Double> entrySet1 : value.entrySet()) {
                    Double key1 = entrySet1.getKey();
                    Double value1 = entrySet1.getValue();
                    String val1 = "0.0";
                    String val2 = "0.0";
                    if (key1 != 0) {
                        val1 = String.format("%.6f", key1);
                    }
                    if (value1 != 0) {
                        val2 = String.format("%.6f", value1);
                    }
                    jTextArea_cluster.append("\t" + clust + "\t" + val1 + "\t" + val2);
//                    model.addRow(new Object[]{clust, key1, value1});
                }
                jTextArea_cluster.append("\n");
            }
            jTextArea_cluster.append("\n");
            list = new ArrayList<>();
        }
    }//GEN-LAST:event_btnClusterActionPerformed

    private void btnDisplayDatasetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayDatasetActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);
        try {
            Scanner sc = new Scanner(new FileReader("dataset/yeast.txt"));
//            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = new String();
            while (sc.hasNextLine()) {
                line = sc.nextLine();
                String[] token1 = line.split("\\s+");
                model.addRow(new Object[]{token1[1],
                    token1[2], token1[3], token1[4],
                    token1[5], token1[6], token1[7],
                    token1[8], token1[9]});
            }
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDisplayDatasetActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Transition trans = new Transition();
        trans.calculateGaussian();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Classification clss = new Classification();
        clss.signoid();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed


    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
            @Override
            public void run() {
//                try {
//                    UIManager.setLookAndFeel(new SeaGlassLookAndFeel());
//                } catch (UnsupportedLookAndFeelException ex) {
//                    ex.printStackTrace();
//                }
                new MainFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCluster;
    private javax.swing.JButton btnDisplayDataset;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane_ReccomendationSystem;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea_cluster;
    private javax.swing.JPanel panel3;
    private javax.swing.JPanel panelClassification;
    private javax.swing.JPanel panelClustering;
    private javax.swing.JPanel panelTransition;
    private javax.swing.JPanel panel_Dataset;
    // End of variables declaration//GEN-END:variables
}
