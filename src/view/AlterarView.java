package view;

import dao.UsuarioDAO;
import javax.swing.JOptionPane;
import model.Usuario;

public class AlterarView extends javax.swing.JDialog {

    public AlterarView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfLogin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfSenha = new javax.swing.JPasswordField();
        tfNovaSenha1 = new javax.swing.JPasswordField();
        tfNovaSenha2 = new javax.swing.JPasswordField();
        btAlterarAlterar = new javax.swing.JButton();
        btLimparAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Avalia Fitness 1.0 <<<<<Fedablio™>>>>>");

        jLabel1.setText("Login:");

        tfLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfLoginFocusLost(evt);
            }
        });

        jLabel2.setText("Senha atual:");

        jLabel3.setText("Nova senha:");

        jLabel4.setText("Repete nova senha:");

        tfSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfSenhaFocusLost(evt);
            }
        });

        btAlterarAlterar.setText("Alterar");
        btAlterarAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarAlterarActionPerformed(evt);
            }
        });

        btLimparAlterar.setText("Limpar");
        btLimparAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfLogin)
                            .addComponent(tfSenha)
                            .addComponent(tfNovaSenha1)
                            .addComponent(tfNovaSenha2, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 246, Short.MAX_VALUE)
                        .addComponent(btLimparAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAlterarAlterar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfNovaSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfNovaSenha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAlterarAlterar)
                    .addComponent(btLimparAlterar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfLoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfLoginFocusLost
        tfLogin.setEditable(false);
    }//GEN-LAST:event_tfLoginFocusLost

    private void btLimparAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparAlterarActionPerformed
        tfLogin.setEditable(true);
        tfSenha.setEditable(true);
    }//GEN-LAST:event_btLimparAlterarActionPerformed

    private void btAlterarAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarAlterarActionPerformed
        try {
            Usuario u = new Usuario();
            UsuarioDAO ud = new UsuarioDAO();
            boolean comparacao = new UsuarioDAO().dao_autenticar_acesso(tfLogin.getText(), tfSenha.getText());
            if (tfNovaSenha1.getText().equals(tfNovaSenha2.getText()) & tfNovaSenha1.getText().length() > 4) {
                if (comparacao == true) {
                    u.setLogin_usuario(tfLogin.getText());
                    u.setSenha_usuario(tfNovaSenha2.getText());
                    ud.alterar(u);
                    limpar_campos();
                    JOptionPane.showMessageDialog(null, "Senha alterada com sucesso!", "Sistema de Avaliação RSE <<<<<Fedablio™>>>>>", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Desculpe, o usuário e/ou senha estão inválidos. Tente novamente.", "Sistema de Avaliação RSE <<<<<Fedablio™>>>>>", JOptionPane.ERROR_MESSAGE);
                    limpar_campos();
                }
            } else {
                JOptionPane.showMessageDialog(null, "As senhas novas nao coincidem ou a mesma tem menos que cinco caracateres.", "Sistema de Avaliação RSE <<<<<Fedablio™>>>>>", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception erro) {
            throw new RuntimeException(erro);
        }
    }//GEN-LAST:event_btAlterarAlterarActionPerformed

    private void tfSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfSenhaFocusLost
        tfSenha.setEditable(false);
    }//GEN-LAST:event_tfSenhaFocusLost

    
    public void limpar_campos(){
        tfLogin.setText(null);
        tfSenha.setText(null);
        tfNovaSenha1.setText(null);
        tfNovaSenha2.setText(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterarAlterar;
    private javax.swing.JButton btLimparAlterar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField tfLogin;
    private javax.swing.JPasswordField tfNovaSenha1;
    private javax.swing.JPasswordField tfNovaSenha2;
    private javax.swing.JPasswordField tfSenha;
    // End of variables declaration//GEN-END:variables
}
