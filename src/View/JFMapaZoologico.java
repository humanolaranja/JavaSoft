package View;

import Controller.GerenciadorJaula;
import Controller.MockDatabase;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class JFMapaZoologico extends javax.swing.JFrame {

    GerenciadorJaula jaulas;
    
    public JFMapaZoologico() {
        initComponents();
        registerMouseListener();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mapa do Zoológico - JavaSoft");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/map.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(738, 650));
        setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(JFMapaZoologico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFMapaZoologico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFMapaZoologico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFMapaZoologico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFMapaZoologico().setVisible(true);
            }
        });
    }
    
    public void setVisible(boolean bool, GerenciadorJaula j){
        this.jaulas = j;
        this.setVisible(true);
    }
    
    private void registerMouseListener(){
        jLabel1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                int x = me.getX();
                int y = me.getY();
                
                if(x>=115 && x<=149 && y>=94 && y<=124){
                    new JFListaLojas().setVisible(true, MockDatabase.lojas);
                }else if(x>=149 && x<=183 && y>=27 && y<=54){
                    new JFListaLojas().setVisible(true, MockDatabase.lojas);
                }else if(x>=238 && x<=269 && y>=20 && y<=45){
                    new JFListaLojas().setVisible(true, MockDatabase.lojas);
                }else if(x>=167 && x<=380 && y>=66 && y<=164){
                    new JFJaulaInfo().setVisible(true, jaulas.getListaJaulas().get(jaulas.buscarId(1)));
                }else if(x>=255 && x<=336 && y>=327 && y<=352){
                    new JFJaulaInfo().setVisible(true, jaulas.getListaJaulas().get(jaulas.buscarId(2)));
                }else if(x>=444 && x<=522 && y>=94 && y<=144){
                    new JFJaulaInfo().setVisible(true, jaulas.getListaJaulas().get(jaulas.buscarId(3)));
                }else if(x>=438 && x<=472 && y>=310 && y<=347){
                    new JFJaulaInfo().setVisible(true, jaulas.getListaJaulas().get(jaulas.buscarId(4)));
                }else if(x>=491 && x<=573 && y>=402 && y<=523){
                    new JFJaulaInfo().setVisible(true, jaulas.getListaJaulas().get(jaulas.buscarId(5)));
                }else if(x>=582 && x<=652 && y>=231 && y<=319){
                    new JFJaulaInfo().setVisible(true, jaulas.getListaJaulas().get(jaulas.buscarId(6)));
                }else if(x>=607 && x<=682 && y>=111 && y<=200){
                    new JFJaulaInfo().setVisible(true, jaulas.getListaJaulas().get(jaulas.buscarId(7)));
                }else if(x>=598 && x<=635 && y>=40 && y<=67){
                    new JFJaulaInfo().setVisible(true, jaulas.getListaJaulas().get(jaulas.buscarId(8)));
                }
            }

            @Override
            public void mousePressed(MouseEvent me) {}

            @Override
            public void mouseReleased(MouseEvent me) {}

            @Override
            public void mouseEntered(MouseEvent me) {}

            @Override
            public void mouseExited(MouseEvent me) {}
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
