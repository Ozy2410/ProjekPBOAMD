/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frame;

/**
 *
 * @author rifar
 */

/**
 * Kelas `TrainingFrame` merupakan GUI untuk menampilkan jadwal latihan dalam bentuk tabel.
 * Tabel ini menampilkan berbagai latihan untuk setiap hari latihan yang berbeda-beda.
 * Setiap latihan memiliki detail seperti nama latihan dan jumlah repetisi yang direkomendasikan.
 */
public class TrainingFrame extends javax.swing.JFrame {

    /**
     * Konstruktor untuk membuat objek `TrainingFrame`, menginisialisasi komponen GUI.
     */
    public TrainingFrame() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Bench Press", "Pull-Ups ", "Arnold Press", "Squat ", "Cardio Optional", "Barbell Curl", "Cardio Optional"},
                {"(4 set x 8-12 repetisi)", "(3 set x 8-12 repetisi)", "(3 set x 8-12 repetisi)", "(8 set x 8-12 repetisi) ", null, "4 set x 8-12 repetisi", null},
                {"Incline Dumbbell Press", "Bent Over Row", "Rear Delt Fly", "Leg Curl", null, "Dumbbell Hammer Curl", null},
                {"(4 set x 8-12 repetisi)", "(3 set x 8-12 repetisi)", "(3 set x 10-15 repetisi) ", "(5 set x 10-15 repetisi)", null, "4 set x 10-15 repetisi", null},
                {"Tricep Pushdown", "Seated Cable Row ", "Upright Row", "Leg Extension", null, "Tricep Pushdown", null},
                {"(3 set x 8-12 repetisi)", "(3 set x 10-15 repetisi)", "(3 set x 10-15 repetisi)", "(4 set Failure)", null, "3 set x 10-15 repetisi", null},
                {"", null, null, null, null, null, null}
            },
            new String [] {
                "Day 1 Chest", "Day 2 Back", "Day 3 Shoulders", "Day 4 Leg", "Day 5 Rest", "Day 6 Arms ", "Day 7 Rest"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metode main untuk menjalankan aplikasi.
     * Membuat objek `TrainingFrame` dan menampilkannya sebagai GUI utama.
     *
     * @param args Argumen baris perintah yang diteruskan ke aplikasi.
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
            java.util.logging.Logger.getLogger(TrainingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrainingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrainingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrainingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrainingFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
