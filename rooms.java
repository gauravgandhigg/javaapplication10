package javaapplication10;
import java.sql.*;
//import javax.swing.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class rooms extends javax.swing.JFrame {
    private String rtype= null;
    Connection conn=null; 
    public rooms() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        standard = new javax.swing.JRadioButton();
        duluxe = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        checkout = new datechooser.beans.DateChooserCombo();
        checkin = new datechooser.beans.DateChooserCombo();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(238, 242, 242));
        jLabel1.setText("Room Type:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(260, 70, 100, 24);

        buttonGroup1.add(standard);
        standard.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        standard.setForeground(new java.awt.Color(238, 242, 242));
        standard.setText("Standard $70");
        standard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                standardActionPerformed(evt);
            }
        });
        getContentPane().add(standard);
        standard.setBounds(390, 70, 150, 28);

        buttonGroup1.add(duluxe);
        duluxe.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        duluxe.setForeground(new java.awt.Color(238, 242, 242));
        duluxe.setText("Duluxe $100");
        duluxe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duluxeActionPerformed(evt);
            }
        });
        getContentPane().add(duluxe);
        duluxe.setBounds(550, 70, 140, 28);

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(238, 242, 242));
        jLabel2.setText("Check In:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(260, 120, 90, 24);

        jLabel3.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(238, 242, 242));
        jLabel3.setText("Check Out:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(450, 120, 100, 24);

        search.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search);
        search.setBounds(280, 460, 80, 30);
        getContentPane().add(checkout);
        checkout.setBounds(440, 160, 155, 37);

        checkin.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Cantarell", java.awt.Font.PLAIN, 15),
                    new java.awt.Color(46, 52, 54),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Cantarell", java.awt.Font.PLAIN, 15),
                    new java.awt.Color(46, 52, 54),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Cantarell", java.awt.Font.PLAIN, 15),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Cantarell", java.awt.Font.PLAIN, 15),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Cantarell", java.awt.Font.PLAIN, 15),
                    new java.awt.Color(46, 52, 54),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Cantarell", java.awt.Font.PLAIN, 15),
                    new java.awt.Color(46, 52, 54),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    getContentPane().add(checkin);
    checkin.setBounds(240, 160, 155, 37);

    jButton1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
    jButton1.setText("Back");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
        }
    });
    getContentPane().add(jButton1);
    jButton1.setBounds(500, 460, 80, 30);

    jLabel4.setFont(new java.awt.Font("DejaVu Serif Condensed", 3, 24)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(251, 251, 243));
    jLabel4.setText("Book Your Room");
    getContentPane().add(jLabel4);
    jLabel4.setBounds(330, 20, 280, 40);

    jTable1.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null},
            {null},
            {null},
            {null}
        },
        new String [] {
            "ROOMS"
        }
    ));
    jScrollPane1.setViewportView(jTable1);

    getContentPane().add(jScrollPane1);
    jScrollPane1.setBounds(270, 280, 330, 110);

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void standardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_standardActionPerformed
        if(standard.isSelected()){
            rtype="Standard";
        }
    }//GEN-LAST:event_standardActionPerformed

    private void duluxeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duluxeActionPerformed
        if(duluxe.isSelected()){
            rtype="Delux";
        }
    }//GEN-LAST:event_duluxeActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
     SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
 
        String date = formater.format(checkin.getSelectedDate().getTime());
        JOptionPane.showMessageDialog(null,date);
        
        
        String date2 = formater.format(checkout.getSelectedDate().getTime());
        JOptionPane.showMessageDialog(null,date2);
        try{
            
           // Statement stmt=(Statement)conn.createStatement();
           //String sql ="select from room,reservation where rtype ";
           
           
          // stmt.executeUpdate(sql);
        }
        catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
        }
// TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        login1 l=new login1();
                l.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
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
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rooms().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private datechooser.beans.DateChooserCombo checkin;
    private datechooser.beans.DateChooserCombo checkout;
    private javax.swing.JRadioButton duluxe;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton search;
    private javax.swing.JRadioButton standard;
    // End of variables declaration//GEN-END:variables
}
