package view;

public class AdministracaoCaminhoView extends javax.swing.JDialog {

    public AdministracaoCaminhoView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btAlterarSenha = new javax.swing.JButton();
        btGerarRelatorio = new javax.swing.JButton();
        btAjustarPrecos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Avalia Fitness 1.0 <<<<<Fedablio™>>>>>");

        btAlterarSenha.setText("Alterar Senha");
        btAlterarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarSenhaActionPerformed(evt);
            }
        });

        btGerarRelatorio.setText("Gerar Relatório");
        btGerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGerarRelatorioActionPerformed(evt);
            }
        });

        btAjustarPrecos.setText("Ajustar Preços");
        btAjustarPrecos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAjustarPrecosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btAlterarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAjustarPrecos, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btGerarRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btAlterarSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btGerarRelatorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btAjustarPrecos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAlterarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarSenhaActionPerformed
        new AlterarView(null, true).show();
    }//GEN-LAST:event_btAlterarSenhaActionPerformed

    private void btGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGerarRelatorioActionPerformed
        dispose();
        new RelatorioEntreDatasView(null, true).show();
    }//GEN-LAST:event_btGerarRelatorioActionPerformed

    private void btAjustarPrecosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAjustarPrecosActionPerformed
        new AvaliacaoView(null, true).show();
    }//GEN-LAST:event_btAjustarPrecosActionPerformed

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAjustarPrecos;
    private javax.swing.JButton btAlterarSenha;
    private javax.swing.JButton btGerarRelatorio;
    // End of variables declaration//GEN-END:variables
}
