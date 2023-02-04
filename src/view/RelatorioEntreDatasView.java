package view;

import dao.AtendimentoDAO;
import java.awt.HeadlessException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import net.sf.jasperreports.view.JasperViewer;

public class RelatorioEntreDatasView extends javax.swing.JDialog {

    public RelatorioEntreDatasView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPagamento = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        tfCodigoProf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfData1 = new javax.swing.JFormattedTextField();
        tfData2 = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        btRelatorioProfDatas = new javax.swing.JButton();
        rbSim = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        rbNao = new javax.swing.JRadioButton();
        rbTodos = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Avalia Fitness 1.0 <<<<<Fedablio™>>>>>");

        jLabel1.setText("Cód. Professor:");

        jLabel2.setText("Data:");

        try {
            tfData1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            tfData2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel3.setText("e");

        btRelatorioProfDatas.setText("Gerar");
        btRelatorioProfDatas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelatorioProfDatasActionPerformed(evt);
            }
        });

        bgPagamento.add(rbSim);
        rbSim.setText("Sim");

        jLabel4.setText("Pgmto:");

        bgPagamento.add(rbNao);
        rbNao.setText("Não");

        bgPagamento.add(rbTodos);
        rbTodos.setSelected(true);
        rbTodos.setText("Todos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfCodigoProf, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfData1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfData2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbSim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbNao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbTodos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btRelatorioProfDatas)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfCodigoProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(tfData1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfData2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(rbSim)
                        .addComponent(rbNao)
                        .addComponent(rbTodos))
                    .addComponent(btRelatorioProfDatas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btRelatorioProfDatasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelatorioProfDatasActionPerformed
        try {
            if (tfCodigoProf.getText().length() > 0 & !tfData1.getText().equals("  /  /    ") & !tfData2.getText().equals("  /  /    ")) {
                int codigo_professor = Integer.parseInt(tfCodigoProf.getText());
                java.sql.Date data1 = new java.sql.Date(new SimpleDateFormat("dd/MM/yyyy").parse(tfData1.getText()).getTime());
                java.sql.Date data2 = new java.sql.Date(new SimpleDateFormat("dd/MM/yyyy").parse(tfData1.getText()).getTime());
                if(rbSim.isSelected()){
                    JasperViewer.viewReport(new AtendimentoDAO().dao_relatorio_professor_datas_pag(codigo_professor,data1,data2,"S"), false);
                }else if(rbNao.isSelected()){
                    JasperViewer.viewReport(new AtendimentoDAO().dao_relatorio_professor_datas_pag(codigo_professor,data1,data2,"N"), false);
                }else if(rbTodos.isSelected()){
                    JasperViewer.viewReport(new AtendimentoDAO().dao_relatorio_professor_datas_pag_tod(codigo_professor,data1,data2), false);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Desculpe, todos os campos devem ser preenchidos.", "<<<<<Fedablio™>>>>>", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException | ParseException | HeadlessException erro) {
            JOptionPane.showMessageDialog(null, "Desculpe, ocorreu um erro.\n" + erro, "<<<<<Fedablio™>>>>>", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btRelatorioProfDatasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgPagamento;
    private javax.swing.JButton btRelatorioProfDatas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton rbNao;
    private javax.swing.JRadioButton rbSim;
    private javax.swing.JRadioButton rbTodos;
    private javax.swing.JTextField tfCodigoProf;
    private javax.swing.JFormattedTextField tfData1;
    private javax.swing.JFormattedTextField tfData2;
    // End of variables declaration//GEN-END:variables
}
