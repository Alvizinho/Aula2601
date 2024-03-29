/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import javax.swing.JOptionPane;
import javax.swing.plaf.OptionPaneUI;

/**
 *
 * @author DEV_2ano_2024
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
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

        bgpOpções = new javax.swing.ButtonGroup();
        pnlcalculadora = new javax.swing.JPanel();
        lblNum1 = new javax.swing.JLabel();
        lblNum2 = new javax.swing.JLabel();
        txtNum1 = new javax.swing.JTextField();
        txtNum2 = new javax.swing.JTextField();
        lblResultado = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        pnlOpções = new javax.swing.JPanel();
        rbtSoma = new javax.swing.JRadioButton();
        rbtSub = new javax.swing.JRadioButton();
        rbtMult = new javax.swing.JRadioButton();
        rbtDiv = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");

        lblNum1.setText("Num 1");

        lblNum2.setText("Num 2");

        lblResultado.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblResultado.setForeground(new java.awt.Color(255, 0, 0));
        lblResultado.setText("Resultado");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        pnlOpções.setBorder(javax.swing.BorderFactory.createTitledBorder("Opções"));

        bgpOpções.add(rbtSoma);
        rbtSoma.setSelected(true);
        rbtSoma.setText("Soma");
        rbtSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtSomaActionPerformed(evt);
            }
        });

        bgpOpções.add(rbtSub);
        rbtSub.setText("Subtração");

        bgpOpções.add(rbtMult);
        rbtMult.setText("Multiplicação");
        rbtMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtMultActionPerformed(evt);
            }
        });

        bgpOpções.add(rbtDiv);
        rbtDiv.setText("Divisão");

        javax.swing.GroupLayout pnlOpçõesLayout = new javax.swing.GroupLayout(pnlOpções);
        pnlOpções.setLayout(pnlOpçõesLayout);
        pnlOpçõesLayout.setHorizontalGroup(
            pnlOpçõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpçõesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlOpçõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtDiv)
                    .addComponent(rbtMult)
                    .addComponent(rbtSub)
                    .addComponent(rbtSoma))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        pnlOpçõesLayout.setVerticalGroup(
            pnlOpçõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpçõesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtSoma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtSub)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtMult)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtDiv)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlcalculadoraLayout = new javax.swing.GroupLayout(pnlcalculadora);
        pnlcalculadora.setLayout(pnlcalculadoraLayout);
        pnlcalculadoraLayout.setHorizontalGroup(
            pnlcalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlcalculadoraLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(btnCalcular)
                .addGap(56, 56, 56)
                .addComponent(btnLimpar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlcalculadoraLayout.createSequentialGroup()
                .addGroup(pnlcalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlcalculadoraLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(pnlcalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNum2)
                            .addComponent(lblNum1))
                        .addGap(82, 82, 82)
                        .addGroup(pnlcalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlcalculadoraLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblResultado)
                        .addGap(132, 132, 132)))
                .addComponent(pnlOpções, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 167, Short.MAX_VALUE))
        );
        pnlcalculadoraLayout.setVerticalGroup(
            pnlcalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlcalculadoraLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(pnlcalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlOpções, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlcalculadoraLayout.createSequentialGroup()
                        .addGroup(pnlcalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNum1)
                            .addComponent(txtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(pnlcalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNum2)
                            .addComponent(txtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addGroup(pnlcalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCalcular)
                            .addComponent(btnLimpar))))
                .addContainerGap(238, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlcalculadora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlcalculadora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        //Declaração de variáveis
        int n1, n2, total;
        
        //Entrada
        try {
            }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Erro"+ e.getMessage(),"Atenção!", JOptionPane.ERROR MESSAGE);        
        }

        
        n1 = Integer.parseInt(txtNum1.getText());
        n2 = Integer.parseInt(txtNum2.getText());
                //Processamento
        if(rbtSoma.isSelected()){
            total = n1 + n2;
        } else if(rbtSub.isSelected()) {
            total = n1 - n2;
         } else if(rbtMult.isSelected()) {
            total = n1 * n2;
        }else {
             total = n1 / n2;
                
        };
        
        //Saída
        lblResultado.setText(String.valueOf(total));
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        txtNum1.setText(null);
        txtNum2.setText(null);
        lblResultado.setText(null);
        txtNum1.requestFocus();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void rbtSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtSomaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtSomaActionPerformed

    private void rbtMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtMultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtMultActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgpOpções;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel lblNum1;
    private javax.swing.JLabel lblNum2;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JPanel pnlOpções;
    private javax.swing.JPanel pnlcalculadora;
    private javax.swing.JRadioButton rbtDiv;
    private javax.swing.JRadioButton rbtMult;
    private javax.swing.JRadioButton rbtSoma;
    private javax.swing.JRadioButton rbtSub;
    private javax.swing.JTextField txtNum1;
    private javax.swing.JTextField txtNum2;
    // End of variables declaration//GEN-END:variables
}
