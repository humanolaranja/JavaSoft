package View;

import Controller.*;

public class JFPrincipal extends javax.swing.JFrame {

    public static final GerenciadorAnimal ANIMAIS = GerenciadorAnimal.initialize();
    public static final GerenciadorFuncionario FUNCIONARIOS = GerenciadorFuncionario.initialize();
    public static final GerenciadorLoja LOJAS = GerenciadorLoja.initialize();
    public static final GerenciadorVisita VISITAS = GerenciadorVisita.initialize();
    public static final GerenciadorJaula JAULAS = GerenciadorJaula.initialize(ANIMAIS);
    
    /**
     * Creates new form JFPrincipal
     */
    public JFPrincipal() {
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

        jpBackground = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnMapa = new javax.swing.JButton();
        btnFuncionarios = new javax.swing.JButton();
        btnAnimais = new javax.swing.JButton();
        btnJaulas = new javax.swing.JButton();
        btnLojas = new javax.swing.JButton();
        btnFinanceiro = new javax.swing.JButton();
        btnVisitas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administração do Zoológico - JavaSoft");

        jpBackground.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/zoo-logo.png"))); // NOI18N

        btnMapa.setBackground(new java.awt.Color(51, 51, 255));
        btnMapa.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnMapa.setForeground(new java.awt.Color(255, 255, 255));
        btnMapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/BLUE.png"))); // NOI18N
        btnMapa.setText("MAPA");
        btnMapa.setActionCommand("");
        btnMapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMapaActionPerformed(evt);
            }
        });

        btnFuncionarios.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnFuncionarios.setForeground(new java.awt.Color(255, 255, 255));
        btnFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/RED.png"))); // NOI18N
        btnFuncionarios.setText("FUNCIONÁRIOS");
        btnFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuncionariosActionPerformed(evt);
            }
        });

        btnAnimais.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnAnimais.setForeground(new java.awt.Color(255, 255, 255));
        btnAnimais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/PURPLE.png"))); // NOI18N
        btnAnimais.setText("LOJAS");
        btnAnimais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnimaisActionPerformed(evt);
            }
        });

        btnJaulas.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnJaulas.setForeground(new java.awt.Color(255, 255, 255));
        btnJaulas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/YELLOW.png"))); // NOI18N
        btnJaulas.setText("JAULAS");
        btnJaulas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJaulasActionPerformed(evt);
            }
        });

        btnLojas.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnLojas.setForeground(new java.awt.Color(255, 255, 255));
        btnLojas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/GREEN.png"))); // NOI18N
        btnLojas.setText("LOJAS");
        btnLojas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLojasActionPerformed(evt);
            }
        });

        btnFinanceiro.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnFinanceiro.setForeground(new java.awt.Color(255, 255, 255));
        btnFinanceiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/ORANGE.png"))); // NOI18N
        btnFinanceiro.setText("JAULAS");
        btnFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinanceiroActionPerformed(evt);
            }
        });

        btnVisitas.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnVisitas.setForeground(new java.awt.Color(255, 255, 255));
        btnVisitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/GREY.png"))); // NOI18N
        btnVisitas.setText("JAULAS");
        btnVisitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisitasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpBackgroundLayout = new javax.swing.GroupLayout(jpBackground);
        jpBackground.setLayout(jpBackgroundLayout);
        jpBackgroundLayout.setHorizontalGroup(
            jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBackgroundLayout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addGroup(jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLojas, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMapa, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnimais, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnJaulas, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFinanceiro, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVisitas, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112))
        );
        jpBackgroundLayout.setVerticalGroup(
            jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBackgroundLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addGap(71, 71, 71)
                .addComponent(btnMapa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLojas, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAnimais, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnJaulas, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFinanceiro, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVisitas, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(530, 759));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMapaActionPerformed
        new JFMapaZoologico().setVisible(true, JAULAS, LOJAS);
    }//GEN-LAST:event_btnMapaActionPerformed

    private void btnFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuncionariosActionPerformed
        //new JFListaFuncionarios().setVisible(true, MockDatabase.funcionarios);
        new JFFuncionarios().setVisible(true, FUNCIONARIOS);
    }//GEN-LAST:event_btnFuncionariosActionPerformed

    private void btnJaulasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJaulasActionPerformed
        new JFJaulas().setVisible(true, JAULAS);
    }//GEN-LAST:event_btnJaulasActionPerformed

    private void btnAnimaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnimaisActionPerformed
        new JFAnimais().setVisible(true, ANIMAIS, JAULAS);
    }//GEN-LAST:event_btnAnimaisActionPerformed

    private void btnLojasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLojasActionPerformed
        new JFLojas().setVisible(true, LOJAS, FUNCIONARIOS.getListaFuncionarios());
    }//GEN-LAST:event_btnLojasActionPerformed

    private void btnFinanceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinanceiroActionPerformed
        new JFFinanceiro().setVisible(true);
    }//GEN-LAST:event_btnFinanceiroActionPerformed

    private void btnVisitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisitasActionPerformed
        new JFVisitas().setVisible(true, VISITAS);
    }//GEN-LAST:event_btnVisitasActionPerformed

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
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnimais;
    private javax.swing.JButton btnFinanceiro;
    private javax.swing.JButton btnFuncionarios;
    private javax.swing.JButton btnJaulas;
    private javax.swing.JButton btnLojas;
    private javax.swing.JButton btnMapa;
    private javax.swing.JButton btnVisitas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jpBackground;
    // End of variables declaration//GEN-END:variables
}
