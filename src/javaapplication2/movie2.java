/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * movie2.java
 *
 * Created on Oct 18, 2011, 3:01:48 PM
 */
package javaapplication2;

/**
 *
 * @author DIGIT
 */
public class movie2 extends javax.swing.JFrame {
static String b="hello";


    /** Creates new form movie2 */
    public movie2() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Movie = new javax.swing.JComboBox();
        Date = new javax.swing.JComboBox();
        Tim = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().setBounds(0, 0, 500, 500);
        Movie.setFont(new java.awt.Font("Freestyle Script", 0, 24));
        Movie.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT MOVIE", "RA.ONE", "ROCKSTAR", " " }));
        Movie.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MovieActionPerformed(evt);
            }
        });
        getContentPane().add(Movie);
        Movie.setBounds(10, 102, 224, 33);

        Date.setFont(new java.awt.Font("Freestyle Script", 0, 24));
        Date.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT DATE", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        Date.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateActionPerformed(evt);
            }
        });
        getContentPane().add(Date);
        Date.setBounds(10, 148, 224, 35);

        Tim.setFont(new java.awt.Font("Freestyle Script", 0, 24));
        Tim.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT SHOW TIMING", "08:30 AM", "12:30 PM", "03:30 PM", "06:30 PM", "09:30 PM", "00:00 AM" }));
        Tim.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimActionPerformed(evt);
            }
        });
        getContentPane().add(Tim);
        Tim.setBounds(10, 195, 224, 35);

        jLabel1.setFont(new java.awt.Font("French Script MT", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WELCOME TO MAP MULTIPLEX");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 20, 590, 43);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Freestyle Script", 0, 24));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SIGN IN");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 309, 134, 38);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mahek Chheda\\Desktop\\theatre.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 630, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
  sign i=new sign();
    setVisible(false);
    i.setvisible(true);

}//GEN-LAST:event_jButton1ActionPerformed

private void TimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimActionPerformed
// TODO add your handling code here:
   int flag =0;
    String s2,s3,s4;
    s2=""+Movie.getSelectedItem();
    s3=""+Date.getSelectedItem();
    s4=""+Tim.getSelectedItem();
    if(!s2.equals("SELECT MOVIE"))
    {
        if(!s3.equals("SELECT DATE"))
        {
            if(!s4.equals("SELECT SHOW TIMING"))
            {flag=1;
                jButton1.setEnabled(true);
               }
        }
    }
    if(flag==0)
    {
        System.out.println("");
        jButton1.setEnabled(false);
    }
 
}//GEN-LAST:event_TimActionPerformed

private void DateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateActionPerformed
// TODO add your handling code here:
    String s2,s3,s4;
    s3=""+Date.getSelectedItem();
        if(s3.equals("SELECT DATE"))
        {
                jButton1.setEnabled(false);
               }
        
    s2=""+Movie.getSelectedItem();
    s3=""+Date.getSelectedItem();
   s4=""+Tim.getSelectedItem();
    if(!s2.equals("SELECT MOVIE"))
    {
        if(!s3.equals("SELECT DATE"))
        {
            if(!s4.equals("SELECT SHOW TIMING"))
            {
                jButton1.setEnabled(true);
               }
        }
    }
}//GEN-LAST:event_DateActionPerformed

private void MovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MovieActionPerformed
// TODO add your handling code here:
    String s2,s3,s4;
    s2=""+Movie.getSelectedItem();
    if(s2.equals("SELECT MOVIE"))
    {
                jButton1.setEnabled(false);
               }
    
    s2=""+Movie.getSelectedItem();
    s3=""+Date.getSelectedItem();
    s4=""+Tim.getSelectedItem();
    if(!s2.equals("SELECT MOVIE"))
    {
        if(!s3.equals("SELECT DATE"))
        {
            if(!s4.equals("SELECT SHOW TIMING"))
            {
                jButton1.setEnabled(true);
               }
        }
    }
}//GEN-LAST:event_MovieActionPerformed

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
            java.util.logging.Logger.getLogger(movie2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(movie2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(movie2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(movie2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new movie2().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    public static javax.swing.JComboBox Movie;
    public static javax.swing.JComboBox Date;
    public static javax.swing.JComboBox Tim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
