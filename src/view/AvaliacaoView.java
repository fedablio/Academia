package view;

import dao.AvaliacaoDAO;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import model.Avaliacao;
import table.AvaliacaoTableModel;

public class AvaliacaoView extends javax.swing.JDialog {
    
    public AvaliacaoView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        tfData.setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
        try {
            popular_table_avaliacao();
        } catch (Exception erro) {
            throw new RuntimeException(erro);
        }        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfPreco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfData = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAvaliacao = new javax.swing.JTable();
        btAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Avalia Fitness 1.0 <<<<<Fedablio™>>>>>");

        jLabel1.setText("Código:");

        tfCodigo.setEditable(false);

        jLabel2.setText("Nome:");

        tfNome.setEditable(false);

        jLabel3.setText("Preço:");

        jLabel4.setText("Data:");

        tfData.setEditable(false);
        try {
            tfData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        tbAvaliacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbAvaliacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbAvaliacaoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbAvaliacao);

        btAlterar.setText("Alterar");
        btAlterar.setEnabled(false);
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
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
                            .addComponent(jLabel3))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfData)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btAlterar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btAlterar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        try {
            Avaliacao a = new Avaliacao();
            AvaliacaoDAO ad = new AvaliacaoDAO();
            a.setCodigo_avaliacao(Integer.parseInt(tfCodigo.getText()));
            a.setPreco_avaliacao(Double.parseDouble(tfPreco.getText()));
            java.sql.Date data = new java.sql.Date(new SimpleDateFormat("dd/MM/yyyy").parse(tfData.getText()).getTime());
            a.setData_ajuste_avaliacao(data);
            ad.alterar(a);
            JOptionPane.showMessageDialog(null, "Atenção, o programa será fechado para as alterações de preços surtir efeito.","<<<<<Fedablio™>>>>>",JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        } catch (Exception erro) {
            throw new RuntimeException(erro);
        }
    }//GEN-LAST:event_btAlterarActionPerformed

    private void tbAvaliacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAvaliacaoMouseClicked
        tfCodigo.setText(tbAvaliacao.getValueAt(tbAvaliacao.getSelectedRow(), AvaliacaoTableModel.COL_CODIGO_AVA).toString());
        tfNome.setText(tbAvaliacao.getValueAt(tbAvaliacao.getSelectedRow(), AvaliacaoTableModel.COL_NOME_AVA).toString());
        tfPreco.setText(tbAvaliacao.getValueAt(tbAvaliacao.getSelectedRow(), AvaliacaoTableModel.COL_PRECO_AVA).toString());
        btAlterar.setEnabled(true);
    }//GEN-LAST:event_tbAvaliacaoMouseClicked


    
    public final void popular_table_avaliacao()throws Exception{
        tbAvaliacao.setModel(new AvaliacaoTableModel(new AvaliacaoDAO().listarTodos()));
        ajusta_tamanho_coluna();
    }
    
    public void limpar_campos(){
        tfCodigo.setText(null);
        tfNome.setText(null);
        tfPreco.setText(null);
    }
    
    private void ajusta_tamanho_coluna() {
        tbAvaliacao.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tbAvaliacao.getColumnModel().getColumn(0).setPreferredWidth(50);
        tbAvaliacao.getColumnModel().getColumn(1).setPreferredWidth(80);
        tbAvaliacao.getColumnModel().getColumn(2).setPreferredWidth(80);
        tbAvaliacao.getColumnModel().getColumn(3).setPreferredWidth(130);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbAvaliacao;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JFormattedTextField tfData;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfPreco;
    // End of variables declaration//GEN-END:variables
}
