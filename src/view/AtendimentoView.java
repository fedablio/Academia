package view;

import dao.*;
import table.AtendimentoTableModel;
import java.sql.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.*;
import net.sf.jasperreports.view.JasperViewer;
import table.*;

public final class AtendimentoView extends javax.swing.JFrame {

    public Connection conn;
    public ResultSet rs;
    public Statement st;
    Atendimento at = new Atendimento();
    AtendimentoDAO atd = new AtendimentoDAO();
    Professor p = new Professor();
    ProfessorDAO pd = new ProfessorDAO();
    Aluno a = new Aluno();
    AlunoDAO ad = new AlunoDAO();
    Dia d = new Dia();
    DiaDAO dd = new DiaDAO();
    HoraInicial hi = new HoraInicial();
    HoraInicialDAO hid = new HoraInicialDAO();
    HoraFinal hf = new HoraFinal();
    HoraFinalDAO hfd = new HoraFinalDAO();
    SimpleDateFormat sdfh = new SimpleDateFormat("HH:mm");
    SimpleDateFormat sdfh2 = new SimpleDateFormat("HH:mm:ss");
    SimpleDateFormat sdfd = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat sdfdTotal = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    DecimalFormat formaValor = new DecimalFormat("0.00", new DecimalFormatSymbols(new Locale("", "US")));
    private MaskFormatter forma_data, forma_hora;
    private int chi, chf;

    public AtendimentoView() throws Exception {
        initComponents();
        setLocationRelativeTo(null);
        popular_table_atendimento();
        popular_table_professor();
        popular_table_aluno();
        popular_table_dia();
        popular_table_horainicial();
        popular_table_horafinal();
        conn = new ConnectionFactory().getConexao();
        popular_cbNomeProfsesorAtentimento();
        popular_cbNomeAlunoAtendimento();
        popular_cbNomeHoraInicialAtendimento();
        popular_cbNomeHoraFinalAtendimento();
        limpar_campos_codigo_atendimento();
        tmHoraSistema.start(); //Dispara hora do sistema
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPesquisarNomes = new javax.swing.ButtonGroup();
        tmHoraSistema = new org.netbeans.examples.lib.timerbean.Timer();
        bgAvaliacao = new javax.swing.ButtonGroup();
        ptAtendimento = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfCodigoAtendimento = new javax.swing.JTextField();
        tfCodigoProfessorAtendimento = new javax.swing.JTextField();
        tfCodigoAlunoAtendimento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfCodigoDiaAtendimento = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        try{
            forma_data = new MaskFormatter("##/##/####");
        }catch(Exception erro){
            throw new RuntimeException(erro);
        }
        tfDataAtendimento = new JFormattedTextField(forma_data);
        jLabel10 = new javax.swing.JLabel();
        cbNomeHoraFinalAtendimento = new javax.swing.JComboBox();
        cbNomeProfessorAtentimento = new javax.swing.JComboBox();
        cbNomeAlunoAtendimento = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDadosAtendimento = new javax.swing.JTable();
        tfPesquisarNomes = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btLimparAtendimento = new javax.swing.JButton();
        btSalvarAtendimento = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        try{
            forma_data = new MaskFormatter("##/##/####");
        }catch(Exception erro){
            throw new RuntimeException(erro);
        }
        tfPesquisarData = new JFormattedTextField(forma_data);
        btPesquisarDataAtendimento = new javax.swing.JButton();
        tfCodigoHoraFinalAtendimento = new javax.swing.JTextField();
        tfCelularProfessorAtendimento = new javax.swing.JFormattedTextField();
        tfCelularAlunoAtendimento = new javax.swing.JFormattedTextField();
        tfFixoProfessorAtendimento = new javax.swing.JFormattedTextField();
        tfFixoAlunoAtendimento = new javax.swing.JFormattedTextField();
        btPesquisarNomes = new javax.swing.JButton();
        rbNomeProfessor = new javax.swing.JRadioButton();
        rbNomeAluno = new javax.swing.JRadioButton();
        jLabel31 = new javax.swing.JLabel();
        cbNomeHoraInicialAtendimento = new javax.swing.JComboBox();
        tfCodigoHoraInicialAtendimento = new javax.swing.JTextField();
        tfNomeDiaAtendimento = new javax.swing.JTextField();
        btAtualizarTabela = new javax.swing.JButton();
        rbMeiaAvaliacao = new javax.swing.JRadioButton();
        rbInteiraAvaliacao = new javax.swing.JRadioButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tfDescricaoAtendimento = new javax.swing.JTextArea();
        jLabel34 = new javax.swing.JLabel();
        btZoomDescricao = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        cbPagamento = new javax.swing.JComboBox();
        jLabel36 = new javax.swing.JLabel();
        cbSituacao = new javax.swing.JComboBox();
        jLabel37 = new javax.swing.JLabel();
        tfPrecoAtendimento = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbDadosProfessor = new javax.swing.JTable();
        btExcluirProfessor = new javax.swing.JButton();
        tfPesquisarProfessorNome = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        tfCodigoProfessor = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        tfNomeProfessor = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btSalvarProfessor = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        tfCelularProfessor = new javax.swing.JFormattedTextField();
        jLabel19 = new javax.swing.JLabel();
        tfFixoProfessor = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        tfCodigoAluno = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        tfNomeAluno = new javax.swing.JTextField();
        btLimparAluno = new javax.swing.JButton();
        btExcluirAluno = new javax.swing.JButton();
        tfPesquisarAlunoNome = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tbDadosAluno = new javax.swing.JTable();
        btSalvarAluno = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        tfCelularAluno = new javax.swing.JFormattedTextField();
        jLabel23 = new javax.swing.JLabel();
        tfFixoAluno = new javax.swing.JFormattedTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        tfCodigoDia = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        tfNomeDia = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbDadosDia = new javax.swing.JTable();
        btLimparDia = new javax.swing.JButton();
        btSalvarDia = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        tfCodigoHoraInicial = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        try{
            forma_hora = new MaskFormatter("##:##");
        }catch(Exception erro){
            throw new RuntimeException(erro);
        }
        tfNomeHoraInicial = new JFormattedTextField(forma_hora);
        jScrollPane6 = new javax.swing.JScrollPane();
        tbDadosHoraInicial = new javax.swing.JTable();
        btSalvarHoraInicial = new javax.swing.JButton();
        btLimparHoraInicial = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        tfCodigoHoraFinal = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        try{
            forma_hora = new MaskFormatter("##:##");
        }catch(Exception erro){
            throw new RuntimeException(erro);
        }
        tfNomeHoraFinal = new JFormattedTextField(forma_hora);
        jScrollPane7 = new javax.swing.JScrollPane();
        tbDadosHoraFinal = new javax.swing.JTable();
        btLimparHoraFinal = new javax.swing.JButton();
        btSalvarHoraFinal = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        dtCalendario = new net.sf.nachocalendar.components.DatePanel();
        tfDataInserida = new javax.swing.JTextField();
        btInserirData = new javax.swing.JButton();
        lbHoraSistema = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        mnTempo = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        imSalvarDia = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        imSalvarHoraInicial = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        imSalvarHoraFinal = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem21 = new javax.swing.JMenuItem();
        imSair = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        imCodigoAtendimento = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        tmHoraSistema.addTimerListener(new org.netbeans.examples.lib.timerbean.TimerListener() {
            public void onTime(java.awt.event.ActionEvent evt) {
                tmHoraSistemaOnTime(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Avalia Fitness 1.0 <<<<<Fedablio™>>>>>");
        setResizable(false);

        ptAtendimento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Código:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 16, -1, -1));

        jLabel2.setText("Aluno:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 80, -1, -1));

        jLabel3.setText("Professor:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 49, -1, -1));

        jLabel4.setText("Dia:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 108, -1, -1));

        tfCodigoAtendimento.setBackground(new java.awt.Color(255, 204, 204));
        tfCodigoAtendimento.setEditable(false);
        jPanel1.add(tfCodigoAtendimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 56, -1));

        tfCodigoProfessorAtendimento.setEditable(false);
        jPanel1.add(tfCodigoProfessorAtendimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 56, -1));

        tfCodigoAlunoAtendimento.setToolTipText("Entre com o código do aluno e tecle TAB.");
        tfCodigoAlunoAtendimento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCodigoAlunoAtendimentoFocusLost(evt);
            }
        });
        jPanel1.add(tfCodigoAlunoAtendimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 56, -1));

        jLabel5.setText("Celular:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, -1, -1));

        jLabel6.setText("Celular:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, -1, -1));

        jLabel7.setText("Fixo:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, -1, -1));

        jLabel8.setText("Fixo:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, -1, -1));

        tfCodigoDiaAtendimento.setEditable(false);
        jPanel1.add(tfCodigoDiaAtendimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 56, -1));

        jLabel9.setText("Data:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, -1));

        tfDataAtendimento.setEditable(false);
        jPanel1.add(tfDataAtendimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 120, -1));

        jLabel10.setText("Hora:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 139, -1, -1));

        cbNomeHoraFinalAtendimento.setForeground(new java.awt.Color(0, 51, 255));
        cbNomeHoraFinalAtendimento.setToolTipText("Selecione primeiramente o horário da \"combobox\" vermelha.");
        cbNomeHoraFinalAtendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNomeHoraFinalAtendimentoActionPerformed(evt);
            }
        });
        jPanel1.add(cbNomeHoraFinalAtendimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 110, -1));

        cbNomeProfessorAtentimento.setToolTipText("Nome do Professor");
        cbNomeProfessorAtentimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNomeProfessorAtentimentoActionPerformed(evt);
            }
        });
        jPanel1.add(cbNomeProfessorAtentimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 300, -1));

        cbNomeAlunoAtendimento.setToolTipText("Nome do Aluno");
        cbNomeAlunoAtendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNomeAlunoAtendimentoActionPerformed(evt);
            }
        });
        jPanel1.add(cbNomeAlunoAtendimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 300, -1));

        tbDadosAtendimento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Data", "Cód. Professor", "Professor", "Celular", "Fixo", "Cód. Aluno", "Aluno", "Celular", "Fixo", "Cód. Dia", "Dia", "Cód. Hora", "Hora", "Cód. Hora", "Hora"
            }
        ));
        tbDadosAtendimento.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbDadosAtendimento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDadosAtendimentoMouseClicked(evt);
            }
        });
        tbDadosAtendimento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbDadosAtendimentoKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbDadosAtendimento);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 175, 830, 152));
        jPanel1.add(tfPesquisarNomes, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 130, -1));

        jLabel11.setText("Nome:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, -1));

        btLimparAtendimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/doc_page_previous.png"))); // NOI18N
        btLimparAtendimento.setToolTipText("Limpar tudo.");
        btLimparAtendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparAtendimentoActionPerformed(evt);
            }
        });
        jPanel1.add(btLimparAtendimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 340, -1, 22));

        btSalvarAtendimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/disk.png"))); // NOI18N
        btSalvarAtendimento.setToolTipText("Inserir ou alterar Atendimento.");
        btSalvarAtendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarAtendimentoActionPerformed(evt);
            }
        });
        jPanel1.add(btSalvarAtendimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 340, -1, 22));

        jLabel30.setText("Data:");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 341, -1, -1));
        jPanel1.add(tfPesquisarData, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 70, -1));

        btPesquisarDataAtendimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/find.png"))); // NOI18N
        btPesquisarDataAtendimento.setToolTipText("Pesquisa por data");
        btPesquisarDataAtendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarDataAtendimentoActionPerformed(evt);
            }
        });
        jPanel1.add(btPesquisarDataAtendimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 20, 20));

        tfCodigoHoraFinalAtendimento.setEditable(false);
        jPanel1.add(tfCodigoHoraFinalAtendimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 55, -1));

        tfCelularProfessorAtendimento.setEditable(false);
        try {
            tfCelularProfessorAtendimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(tfCelularProfessorAtendimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 108, -1));

        tfCelularAlunoAtendimento.setEditable(false);
        try {
            tfCelularAlunoAtendimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(tfCelularAlunoAtendimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 108, -1));

        tfFixoProfessorAtendimento.setEditable(false);
        try {
            tfFixoProfessorAtendimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(tfFixoProfessorAtendimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 50, 108, -1));

        tfFixoAlunoAtendimento.setEditable(false);
        try {
            tfFixoAlunoAtendimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(tfFixoAlunoAtendimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, 108, -1));

        btPesquisarNomes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/find.png"))); // NOI18N
        btPesquisarNomes.setToolTipText("Pesquisar por nome do Professor ou Aluno");
        btPesquisarNomes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarNomesActionPerformed(evt);
            }
        });
        jPanel1.add(btPesquisarNomes, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 20, 20));

        bgPesquisarNomes.add(rbNomeProfessor);
        rbNomeProfessor.setSelected(true);
        rbNomeProfessor.setText("Professor");
        jPanel1.add(rbNomeProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, -1, -1));

        bgPesquisarNomes.add(rbNomeAluno);
        rbNomeAluno.setText("Aluno");
        jPanel1.add(rbNomeAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, -1, -1));

        jLabel31.setText("às");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, -1));

        cbNomeHoraInicialAtendimento.setToolTipText("Por favor, selecione a hora da \"esquerda\" para \"direita\".");
        cbNomeHoraInicialAtendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNomeHoraInicialAtendimentoActionPerformed(evt);
            }
        });
        jPanel1.add(cbNomeHoraInicialAtendimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 115, -1));

        tfCodigoHoraInicialAtendimento.setEditable(false);
        jPanel1.add(tfCodigoHoraInicialAtendimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 56, -1));

        tfNomeDiaAtendimento.setEditable(false);
        tfNomeDiaAtendimento.setToolTipText("Usa a aba \"Calendário\" para inserir a data.");
        jPanel1.add(tfNomeDiaAtendimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 130, -1));

        btAtualizarTabela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/grid.png"))); // NOI18N
        btAtualizarTabela.setToolTipText("Traz todos os dados da tabela.");
        btAtualizarTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarTabelaActionPerformed(evt);
            }
        });
        jPanel1.add(btAtualizarTabela, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 340, -1, 22));

        bgAvaliacao.add(rbMeiaAvaliacao);
        rbMeiaAvaliacao.setText("Básica");
        rbMeiaAvaliacao.setToolTipText("Tipo de Avaliação");
        rbMeiaAvaliacao.setEnabled(false);
        jPanel1.add(rbMeiaAvaliacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, -1, -1));

        bgAvaliacao.add(rbInteiraAvaliacao);
        rbInteiraAvaliacao.setText("Compl.");
        rbInteiraAvaliacao.setToolTipText("Tipo de Avaliação");
        rbInteiraAvaliacao.setEnabled(false);
        jPanel1.add(rbInteiraAvaliacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, -1, -1));

        tfDescricaoAtendimento.setColumns(20);
        tfDescricaoAtendimento.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        tfDescricaoAtendimento.setRows(5);
        jScrollPane4.setViewportView(tfDescricaoAtendimento);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 320, 54));

        jLabel34.setText("Tipo:");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, -1));

        btZoomDescricao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/find.png"))); // NOI18N
        btZoomDescricao.setToolTipText("Traz os dados do campo descrição.");
        btZoomDescricao.setEnabled(false);
        btZoomDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btZoomDescricaoActionPerformed(evt);
            }
        });
        jPanel1.add(btZoomDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, -1, 22));

        jLabel33.setText("Pgmto:");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        cbPagamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<<Selecione>>", "Não", "Sim" }));
        cbPagamento.setToolTipText("Caso o aluno efetue o pagamento com a matrícula ou reavaliação, selecione Sim");
        jPanel1.add(cbPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        jLabel36.setText("Sit.:");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        cbSituacao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<<Selecione>>", "Avaliação", "Reavaliação" }));
        cbSituacao.setToolTipText("Selecione a situação");
        jPanel1.add(cbSituacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        jLabel37.setText("Preço:");
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));

        tfPrecoAtendimento.setEditable(false);
        jPanel1.add(tfPrecoAtendimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 60, -1));

        ptAtendimento.addTab("Atendimento", jPanel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tbDadosProfessor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbDadosProfessor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDadosProfessorMouseClicked(evt);
            }
        });
        tbDadosProfessor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbDadosProfessorKeyReleased(evt);
            }
        });
        jScrollPane5.setViewportView(tbDadosProfessor);

        btExcluirProfessor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cross.png"))); // NOI18N
        btExcluirProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirProfessorActionPerformed(evt);
            }
        });

        tfPesquisarProfessorNome.setToolTipText("Basta digitar o nome do professor.");
        tfPesquisarProfessorNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfPesquisarProfessorNomeKeyReleased(evt);
            }
        });

        jLabel20.setText("Nome:");

        tfCodigoProfessor.setEnabled(false);

        jLabel21.setText("Código:");

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/doc_page_previous.png"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        tfNomeProfessor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfNomeProfessorMouseClicked(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/find.png"))); // NOI18N
        jLabel12.setText("Nome:");

        btSalvarProfessor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/disk.png"))); // NOI18N
        btSalvarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarProfessorActionPerformed(evt);
            }
        });

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/user.png"))); // NOI18N

        jLabel18.setText("Celular:");

        try {
            tfCelularProfessor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel19.setText("Fixo:");

        try {
            tfFixoProfessor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfPesquisarProfessorNome, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel28))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel18))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(tfCodigoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel20))
                            .addComponent(tfCelularProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfFixoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 464, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfNomeProfessor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btSalvarProfessor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btExcluirProfessor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(tfCodigoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)
                            .addComponent(tfNomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCelularProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(tfFixoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)))
                    .addComponent(btSalvarProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluirProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPesquisarProfessorNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel28))
                .addContainerGap())
        );

        ptAtendimento.addTab("Professor", jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel16.setText("Código:");

        tfCodigoAluno.setEnabled(false);

        jLabel17.setText("Nome:");

        tfNomeAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfNomeAlunoMouseClicked(evt);
            }
        });

        btLimparAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/doc_page_previous.png"))); // NOI18N
        btLimparAluno.setToolTipText("Limpar Campos");
        btLimparAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparAlunoActionPerformed(evt);
            }
        });

        btExcluirAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cross.png"))); // NOI18N
        btExcluirAluno.setToolTipText("Excluir");
        btExcluirAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirAlunoActionPerformed(evt);
            }
        });

        tfPesquisarAlunoNome.setToolTipText("Basta digitar o nome do aluno.");
        tfPesquisarAlunoNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfPesquisarAlunoNomeKeyReleased(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/find.png"))); // NOI18N
        jLabel13.setText("Nome:");

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/users.png"))); // NOI18N

        tbDadosAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbDadosAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDadosAlunoMouseClicked(evt);
            }
        });
        tbDadosAluno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbDadosAlunoKeyReleased(evt);
            }
        });
        jScrollPane8.setViewportView(tbDadosAluno);

        btSalvarAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/disk.png"))); // NOI18N
        btSalvarAluno.setToolTipText("Inserir/Alterar");
        btSalvarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarAlunoActionPerformed(evt);
            }
        });

        jLabel22.setText("Celular:");

        try {
            tfCelularAluno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel23.setText("Fixo:");

        try {
            tfFixoAluno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfPesquisarAlunoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel29))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel22))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(tfCodigoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel17))
                            .addComponent(tfCelularAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfFixoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(tfNomeAluno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btSalvarAluno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btExcluirAluno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btLimparAluno)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(tfCodigoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(tfNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCelularAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)
                            .addComponent(tfFixoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btLimparAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btExcluirAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btSalvarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPesquisarAlunoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel29))
                .addContainerGap())
        );

        ptAtendimento.addTab("Aluno", jPanel3);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dia", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(51, 51, 255)));

        jLabel14.setText("Código:");

        tfCodigoDia.setEditable(false);

        jLabel15.setText("Nome:");

        tfNomeDia.setEditable(false);

        tbDadosDia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Nome"
            }
        ));
        tbDadosDia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDadosDiaMouseClicked(evt);
            }
        });
        tbDadosDia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbDadosDiaKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tbDadosDia);

        btLimparDia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/doc_page_previous.png"))); // NOI18N
        btLimparDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparDiaActionPerformed(evt);
            }
        });

        btSalvarDia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/disk.png"))); // NOI18N
        btSalvarDia.setEnabled(false);
        btSalvarDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarDiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(20, 20, 20)
                        .addComponent(tfCodigoDia, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfNomeDia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btSalvarDia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btLimparDia))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 807, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSalvarDia, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(tfCodigoDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)
                        .addComponent(tfNomeDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btLimparDia, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hora Inicial", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(51, 51, 255)));

        jLabel24.setText("Código:");

        tfCodigoHoraInicial.setEditable(false);

        jLabel25.setText("Nome:");

        tfNomeHoraInicial.setEditable(false);

        tbDadosHoraInicial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Nome"
            }
        ));
        tbDadosHoraInicial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDadosHoraInicialMouseClicked(evt);
            }
        });
        tbDadosHoraInicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbDadosHoraInicialKeyReleased(evt);
            }
        });
        jScrollPane6.setViewportView(tbDadosHoraInicial);

        btSalvarHoraInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/disk.png"))); // NOI18N
        btSalvarHoraInicial.setEnabled(false);
        btSalvarHoraInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarHoraInicialActionPerformed(evt);
            }
        });

        btLimparHoraInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/doc_page_previous.png"))); // NOI18N
        btLimparHoraInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparHoraInicialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfCodigoHoraInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel25)
                        .addGap(18, 18, 18)
                        .addComponent(tfNomeHoraInicial))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btSalvarHoraInicial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btLimparHoraInicial)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(tfCodigoHoraInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(tfNomeHoraInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSalvarHoraInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLimparHoraInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hora Final", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(51, 51, 255)));

        jLabel26.setText("Código:");

        tfCodigoHoraFinal.setEditable(false);

        jLabel27.setText("Nome:");

        tfNomeHoraFinal.setEditable(false);

        tbDadosHoraFinal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Nome"
            }
        ));
        tbDadosHoraFinal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDadosHoraFinalMouseClicked(evt);
            }
        });
        tbDadosHoraFinal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbDadosHoraFinalKeyReleased(evt);
            }
        });
        jScrollPane7.setViewportView(tbDadosHoraFinal);

        btLimparHoraFinal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/doc_page_previous.png"))); // NOI18N
        btLimparHoraFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparHoraFinalActionPerformed(evt);
            }
        });

        btSalvarHoraFinal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/disk.png"))); // NOI18N
        btSalvarHoraFinal.setEnabled(false);
        btSalvarHoraFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarHoraFinalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfCodigoHoraFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel27)
                        .addGap(18, 18, 18)
                        .addComponent(tfNomeHoraFinal))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btSalvarHoraFinal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btLimparHoraFinal)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(tfCodigoHoraFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(tfNomeHoraFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSalvarHoraFinal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLimparHoraFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        ptAtendimento.addTab("Tempo", jPanel4);

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));

        dtCalendario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dtCalendarioActionPerformed(evt);
            }
        });

        tfDataInserida.setEditable(false);
        tfDataInserida.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        btInserirData.setText("Inserir");
        btInserirData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(tfDataInserida, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btInserirData))
                    .addComponent(dtCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dtCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfDataInserida)
                    .addComponent(btInserirData, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        lbHoraSistema.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbHoraSistema.setForeground(new java.awt.Color(0, 0, 255));
        lbHoraSistema.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHoraSistema.setText("-");

        jLabel35.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel35.setText("Copyright © 2012 Fedablio - Todos os direitos reservados");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                .addComponent(lbHoraSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel35))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(lbHoraSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(8, 8, 8))
        );

        ptAtendimento.addTab("Calendário", jPanel7);

        jMenu1.setText("Acessar");

        jMenu3.setText("Atendimento");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Salvar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Limpar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenu1.add(jMenu3);

        jMenu4.setText("Professor");

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Salvar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem6.setText("Excluir");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem7.setText("Limpar");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenu1.add(jMenu4);

        jMenu5.setText("Aluno");

        jMenuItem17.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem17.setText("Salvar");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem17);

        jMenuItem18.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem18.setText("Excluir");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem18);

        jMenuItem19.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem19.setText("Limpar");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem19);

        jMenu1.add(jMenu5);

        mnTempo.setText("Tempo");

        jMenu8.setText("Dia");

        imSalvarDia.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        imSalvarDia.setText("Salvar");
        imSalvarDia.setEnabled(false);
        imSalvarDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imSalvarDiaActionPerformed(evt);
            }
        });
        jMenu8.add(imSalvarDia);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem9.setText("Limpar");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem9);

        mnTempo.add(jMenu8);

        jMenu9.setText("Hora Inicial");

        imSalvarHoraInicial.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        imSalvarHoraInicial.setText("Salvar");
        imSalvarHoraInicial.setEnabled(false);
        imSalvarHoraInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imSalvarHoraInicialActionPerformed(evt);
            }
        });
        jMenu9.add(imSalvarHoraInicial);

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem12.setText("Limpar");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem12);

        mnTempo.add(jMenu9);

        jMenu10.setText("Hora Final");

        imSalvarHoraFinal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        imSalvarHoraFinal.setText("Salvar");
        imSalvarHoraFinal.setEnabled(false);
        imSalvarHoraFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imSalvarHoraFinalActionPerformed(evt);
            }
        });
        jMenu10.add(imSalvarHoraFinal);

        jMenuItem15.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem15.setText("Limpar");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem15);

        mnTempo.add(jMenu10);

        jMenu1.add(mnTempo);

        jMenu7.setText("Calendário");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Inserir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem1);

        jMenu1.add(jMenu7);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sistema");

        jMenu11.setText("Tempo");

        jMenuItem16.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem16.setText("Alterar");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem16);

        jMenuItem20.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem20.setText("Desabilitar");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem20);

        jMenu2.add(jMenu11);
        jMenu2.add(jSeparator1);

        jMenuItem21.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem21.setText("Desenvolvimento");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem21);

        imSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        imSair.setText("Sair");
        imSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imSairActionPerformed(evt);
            }
        });
        jMenu2.add(imSair);

        jMenu12.setText("Imprimir");

        imCodigoAtendimento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        imCodigoAtendimento.setText("Código de Atendimento");
        imCodigoAtendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imCodigoAtendimentoActionPerformed(evt);
            }
        });
        jMenu12.add(imCodigoAtendimento);

        jMenu2.add(jMenu12);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Administração");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ptAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, 866, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ptAtendimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbDadosAtendimentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDadosAtendimentoMouseClicked
        tfCodigoAtendimento.setText((tbDadosAtendimento.getValueAt(tbDadosAtendimento.getSelectedRow(), AtendimentoTableModel.COL_CODIGO_ATENDIMENTO).toString()));
        tfDataAtendimento.setText(tbDadosAtendimento.getValueAt(tbDadosAtendimento.getSelectedRow(), AtendimentoTableModel.COL_DATA_ATENDIMENTO).toString());
        tfCodigoProfessorAtendimento.setText(tbDadosAtendimento.getValueAt(tbDadosAtendimento.getSelectedRow(), AtendimentoTableModel.COL_CODIGO_PROF).toString());
        cbNomeProfessorAtentimento.setSelectedItem(tbDadosAtendimento.getValueAt(tbDadosAtendimento.getSelectedRow(), AtendimentoTableModel.COL_NOME_PROF));
        tfCelularProfessorAtendimento.setText(tbDadosAtendimento.getValueAt(tbDadosAtendimento.getSelectedRow(), AtendimentoTableModel.COL_CELULAR_PROF).toString());
        tfFixoProfessorAtendimento.setText(tbDadosAtendimento.getValueAt(tbDadosAtendimento.getSelectedRow(), AtendimentoTableModel.COL_FIXO_PROF).toString());
        tfCodigoAlunoAtendimento.setText(tbDadosAtendimento.getValueAt(tbDadosAtendimento.getSelectedRow(), AtendimentoTableModel.COL_CODIGO_ALUNO).toString());
        cbNomeAlunoAtendimento.setSelectedItem(tbDadosAtendimento.getValueAt(tbDadosAtendimento.getSelectedRow(), AtendimentoTableModel.COL_NOME_ALUNO));
        tfCelularAlunoAtendimento.setText(tbDadosAtendimento.getValueAt(tbDadosAtendimento.getSelectedRow(), AtendimentoTableModel.COL_CELULAR_ALUNO).toString());
        tfFixoAlunoAtendimento.setText(tbDadosAtendimento.getValueAt(tbDadosAtendimento.getSelectedRow(), AtendimentoTableModel.COL_FIXO_ALUNO).toString());
        tfCodigoDiaAtendimento.setText(tbDadosAtendimento.getValueAt(tbDadosAtendimento.getSelectedRow(), AtendimentoTableModel.COL_CODIGO_DIA).toString());
        tfNomeDiaAtendimento.setText(tbDadosAtendimento.getValueAt(tbDadosAtendimento.getSelectedRow(), AtendimentoTableModel.COL_NOME_DIA).toString());
        tfCodigoHoraInicialAtendimento.setText(tbDadosAtendimento.getValueAt(tbDadosAtendimento.getSelectedRow(), AtendimentoTableModel.COL_CODIGO_HORAINICIAL).toString());
        cbNomeHoraInicialAtendimento.setSelectedItem(tbDadosAtendimento.getValueAt(tbDadosAtendimento.getSelectedRow(), AtendimentoTableModel.COL_NOME_HORAINICIAL).toString());
        tfCodigoHoraFinalAtendimento.setText(tbDadosAtendimento.getValueAt(tbDadosAtendimento.getSelectedRow(), AtendimentoTableModel.COL_CODIGO_HORAFINAL).toString());
        cbNomeHoraFinalAtendimento.setSelectedItem(tbDadosAtendimento.getValueAt(tbDadosAtendimento.getSelectedRow(), AtendimentoTableModel.COL_NOME_HORAFINAL));
        cbPagamento.setSelectedItem(tbDadosAtendimento.getValueAt(tbDadosAtendimento.getSelectedRow(), AtendimentoTableModel.COL_PAGAMENTO_AVAL));
        tfPrecoAtendimento.setText(tbDadosAtendimento.getValueAt(tbDadosAtendimento.getSelectedRow(), AtendimentoTableModel.COL_PRECO_ATEND).toString());
        cbSituacao.setSelectedItem(tbDadosAtendimento.getValueAt(tbDadosAtendimento.getSelectedRow(), AtendimentoTableModel.COL_SITUACAO_AVAL));
        String pag = tbDadosAtendimento.getValueAt(tbDadosAtendimento.getSelectedRow(), AtendimentoTableModel.COL_PAGAMENTO_AVAL).toString();
        if (pag.equals("S")) {
            cbPagamento.setSelectedIndex(2);
        } else {
            cbPagamento.setSelectedIndex(1);
        }
        try {
            tfDescricaoAtendimento.setText(new AtendimentoDAO().descricao_atendimento(Integer.parseInt(tfCodigoAtendimento.getText())));
        } catch (Exception ex) {
            Logger.getLogger(AtendimentoView.class.getName()).log(Level.SEVERE, null, ex);
        }
        chf = Integer.parseInt(tfCodigoHoraFinalAtendimento.getText());
        if ((chf - chi) == 2) {
            rbInteiraAvaliacao.setSelected(true);
        } else if ((chf - chi) == 1) {
            rbMeiaAvaliacao.setSelected(true);
        }
    }//GEN-LAST:event_tbDadosAtendimentoMouseClicked

    private void cbNomeHoraFinalAtendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNomeHoraFinalAtendimentoActionPerformed
        try {
            if (ptAtendimento.getSelectedIndex() == 0) {
                tfCodigoHoraFinalAtendimento.setText(String.valueOf(new AtendimentoDAO().dao_codigo_horafinal(cbNomeHoraFinalAtendimento.getSelectedItem().toString())));
            }
            chf = Integer.parseInt(tfCodigoHoraFinalAtendimento.getText());
            if ((chf - chi) == 2) {
                rbInteiraAvaliacao.setSelected(true);
                tfPrecoAtendimento.setText(String.valueOf(formaValor.format(new AtendimentoDAO().dao_avaliacao_completa())));
            } else if ((chf - chi) == 1) {
                rbMeiaAvaliacao.setSelected(true);
                tfPrecoAtendimento.setText(String.valueOf(formaValor.format(new AtendimentoDAO().dao_avaliacao_basica())));
            }
        } catch (Exception erro) {
            throw new RuntimeException(erro);
        }
    }//GEN-LAST:event_cbNomeHoraFinalAtendimentoActionPerformed

    private void cbNomeProfessorAtentimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNomeProfessorAtentimentoActionPerformed
        try {
            if (ptAtendimento.getSelectedIndex() == 0) {
                tfCodigoProfessorAtendimento.setText(String.valueOf(new AtendimentoDAO().dao_codigo_professor(cbNomeProfessorAtentimento.getSelectedItem().toString())));
                tfCelularProfessorAtendimento.setText(new AtendimentoDAO().dao_celular_professor(cbNomeProfessorAtentimento.getSelectedItem().toString()));
                tfFixoProfessorAtendimento.setText(new AtendimentoDAO().dao_fixo_professor(cbNomeProfessorAtentimento.getSelectedItem().toString()));
            }
        } catch (Exception erro) {
        }
    }//GEN-LAST:event_cbNomeProfessorAtentimentoActionPerformed

    private void cbNomeAlunoAtendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNomeAlunoAtendimentoActionPerformed
        try {
            if (ptAtendimento.getSelectedIndex() == 0) {
                tfCodigoAlunoAtendimento.setText(String.valueOf(new AtendimentoDAO().dao_codigo_aluno(cbNomeAlunoAtendimento.getSelectedItem().toString())));
                tfCelularAlunoAtendimento.setText(new AtendimentoDAO().dao_celular_aluno(cbNomeAlunoAtendimento.getSelectedItem().toString()));
                tfFixoAlunoAtendimento.setText(new AtendimentoDAO().dao_fixo_aluno(cbNomeAlunoAtendimento.getSelectedItem().toString()));
            }
        } catch (Exception erro) {
        }
    }//GEN-LAST:event_cbNomeAlunoAtendimentoActionPerformed

    private void btExcluirAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirAlunoActionPerformed
        try {
            if (tbDadosAluno.getRowCount() > 0) {
                if (tbDadosAluno.getSelectedRow() >= 0) {
                    int opcao = JOptionPane.showConfirmDialog(null, "Desja mesmo excluir o item selecionado?", "<<<<<Fedablio™>>>>>", JOptionPane.YES_NO_OPTION);
                    if (opcao == 0) {
                        int exclusao = Integer.parseInt(tbDadosAluno.getValueAt(tbDadosAluno.getSelectedRow(), AlunoTableModel.COL_CODIGO_ALUNO).toString());
                        new AlunoDAO().excluir(exclusao);
                        popular_table_aluno();
                        limpar_campos_aluno();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, selecione uma linha para excluir!", "<<<<<Fedablio™>>>>>", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Desculpe, não existem dados na tabela.", "<<<<<Fedablio™>>>>>", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Desculpe, este aluno está vinculado com algum Atendimento.", "<<<<<Fedablio™>>>>>", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btExcluirAlunoActionPerformed

    private void btLimparAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparAlunoActionPerformed
        limpar_campos_aluno();
        try {
            popular_table_aluno();
        } catch (Exception ex) {
            Logger.getLogger(AtendimentoView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btLimparAlunoActionPerformed

    private void tbDadosAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDadosAlunoMouseClicked
        tfCodigoAluno.setText(tbDadosAluno.getValueAt(tbDadosAluno.getSelectedRow(), AlunoTableModel.COL_CODIGO_ALUNO).toString());
        tfNomeAluno.setText(tbDadosAluno.getValueAt(tbDadosAluno.getSelectedRow(), AlunoTableModel.COL_NOME_ALUNO).toString());
        tfCelularAluno.setText(tbDadosAluno.getValueAt(tbDadosAluno.getSelectedRow(), AlunoTableModel.COL_CELULAR_ALUNO).toString());
        tfFixoAluno.setText(tbDadosAluno.getValueAt(tbDadosAluno.getSelectedRow(), AlunoTableModel.COL_FIXO_ALUNO).toString());
    }//GEN-LAST:event_tbDadosAlunoMouseClicked

    private void btSalvarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarAlunoActionPerformed
        try {
            String nome_digitado = tfNomeAluno.getText();
            String nome_banco = new AlunoDAO().dao_nome_aluno(tfNomeAluno.getText());
            if (tfCodigoAluno.getText().equals("")) {
                if (tfNomeAluno.getText().length() > 0) {
                    if (!nome_digitado.equals(nome_banco)) {
                        int escolha = JOptionPane.showConfirmDialog(null, "Nome cadastrado não pode ser alterado.\nTem certeza que deseja cadastrar '" + nome_digitado + "' ?", "<<<<<Fedablio™>>>>>", JOptionPane.YES_NO_OPTION);
                        if (escolha == 0) {
                            a.setNome_aluno(tfNomeAluno.getText());
                            a.setCelular_aluno(tfCelularAluno.getText().replace("(", "").replace(")", "").replace("-", ""));
                            a.setFixo_aluno(tfFixoAluno.getText().replace("(", "").replace(")", "").replace("-", ""));
                            ad.inserir(a);
                            limpar_campos_aluno();
                            try {
                                popular_table_aluno();
                            } catch (Exception ex) {
                                Logger.getLogger(AtendimentoView.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            cbNomeAlunoAtendimento.removeAllItems();
                            popular_cbNomeAlunoAtendimento();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Desculpe, este nome já está cadastrado.", "<<<<<Fedablio™>>>>>", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Desculpe, o nome deve ser digitado.", "<<<<<Fedablio™>>>>>", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "<<Lembrete>>\nNome cadastrado não pode ser alterado.", "<<<<<Fedablio™>>>>>", JOptionPane.INFORMATION_MESSAGE);
                a.setCodigo_aluno(Integer.valueOf(tfCodigoAluno.getText()));
                a.setCelular_aluno(tfCelularAluno.getText().replace("(", "").replace(")", "").replace("-", ""));
                a.setFixo_aluno(tfFixoAluno.getText().replace("(", "").replace(")", "").replace("-", ""));
                ad.alterar(a);
                limpar_campos_aluno();
                popular_table_aluno();
            }
        } catch (Exception erro) {
        }
    }//GEN-LAST:event_btSalvarAlunoActionPerformed

    private void btPesquisarDataAtendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarDataAtendimentoActionPerformed
        try {
            java.sql.Date data = new java.sql.Date(sdfd.parse(tfPesquisarData.getText()).getTime());
            tbDadosAtendimento.setModel(new AtendimentoTableModel(new AtendimentoDAO().listarAtendimentoData(data)));
            ajusta_tamanho_coluna_atendimento();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Desculpe, data inválida.", "<<<<<Fedablio™>>>>>", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btPesquisarDataAtendimentoActionPerformed

    private void tbDadosAtendimentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbDadosAtendimentoKeyReleased
        tfCodigoAtendimento.setText((tbDadosAtendimento.getValueAt(tbDadosAtendimento.getSelectedRow(), AtendimentoTableModel.COL_CODIGO_ATENDIMENTO).toString()));
        tfDataAtendimento.setText(tbDadosAtendimento.getValueAt(tbDadosAtendimento.getSelectedRow(), AtendimentoTableModel.COL_DATA_ATENDIMENTO).toString());
        tfCodigoProfessorAtendimento.setText(tbDadosAtendimento.getValueAt(tbDadosAtendimento.getSelectedRow(), AtendimentoTableModel.COL_CODIGO_PROF).toString());
        cbNomeProfessorAtentimento.setSelectedItem(tbDadosAtendimento.getValueAt(tbDadosAtendimento.getSelectedRow(), AtendimentoTableModel.COL_NOME_PROF));
        tfCelularProfessorAtendimento.setText(tbDadosAtendimento.getValueAt(tbDadosAtendimento.getSelectedRow(), AtendimentoTableModel.COL_CELULAR_PROF).toString());
        tfFixoProfessorAtendimento.setText(tbDadosAtendimento.getValueAt(tbDadosAtendimento.getSelectedRow(), AtendimentoTableModel.COL_FIXO_PROF).toString());
        tfCodigoAlunoAtendimento.setText(tbDadosAtendimento.getValueAt(tbDadosAtendimento.getSelectedRow(), AtendimentoTableModel.COL_CODIGO_ALUNO).toString());
        cbNomeAlunoAtendimento.setSelectedItem(tbDadosAtendimento.getValueAt(tbDadosAtendimento.getSelectedRow(), AtendimentoTableModel.COL_NOME_ALUNO));
        tfCelularAlunoAtendimento.setText(tbDadosAtendimento.getValueAt(tbDadosAtendimento.getSelectedRow(), AtendimentoTableModel.COL_CELULAR_ALUNO).toString());
        tfFixoAlunoAtendimento.setText(tbDadosAtendimento.getValueAt(tbDadosAtendimento.getSelectedRow(), AtendimentoTableModel.COL_FIXO_ALUNO).toString());
        tfCodigoDiaAtendimento.setText(tbDadosAtendimento.getValueAt(tbDadosAtendimento.getSelectedRow(), AtendimentoTableModel.COL_CODIGO_DIA).toString());
        tfNomeDiaAtendimento.setText(tbDadosAtendimento.getValueAt(tbDadosAtendimento.getSelectedRow(), AtendimentoTableModel.COL_NOME_DIA).toString());
        tfCodigoHoraInicialAtendimento.setText(tbDadosAtendimento.getValueAt(tbDadosAtendimento.getSelectedRow(), AtendimentoTableModel.COL_CODIGO_HORAINICIAL).toString());
        cbNomeHoraInicialAtendimento.setSelectedItem(tbDadosAtendimento.getValueAt(tbDadosAtendimento.getSelectedRow(), AtendimentoTableModel.COL_NOME_HORAINICIAL).toString());
        tfCodigoHoraFinalAtendimento.setText(tbDadosAtendimento.getValueAt(tbDadosAtendimento.getSelectedRow(), AtendimentoTableModel.COL_CODIGO_HORAFINAL).toString());
        cbNomeHoraFinalAtendimento.setSelectedItem(tbDadosAtendimento.getValueAt(tbDadosAtendimento.getSelectedRow(), AtendimentoTableModel.COL_NOME_HORAFINAL));
        tfPrecoAtendimento.setText(tbDadosAtendimento.getValueAt(tbDadosAtendimento.getSelectedRow(), AtendimentoTableModel.COL_PRECO_ATEND).toString());
        String pag = tbDadosAtendimento.getValueAt(tbDadosAtendimento.getSelectedRow(), AtendimentoTableModel.COL_PAGAMENTO_AVAL).toString();
        if (pag.equals("S")) {
            cbPagamento.setSelectedIndex(2);
        } else {
            cbPagamento.setSelectedIndex(1);
        }
        cbSituacao.setSelectedItem(tbDadosAtendimento.getValueAt(tbDadosAtendimento.getSelectedRow(), AtendimentoTableModel.COL_SITUACAO_AVAL));
        try {
            tfDescricaoAtendimento.setText(new AtendimentoDAO().descricao_atendimento(Integer.parseInt(tfCodigoAtendimento.getText())));
        } catch (Exception erro) {
            throw new RuntimeException(erro);
        }
        chf = Integer.parseInt(tfCodigoHoraFinalAtendimento.getText());
        if ((chf - chi) == 2) {
            rbInteiraAvaliacao.setSelected(true);
        } else if ((chf - chi) == 1) {
            rbMeiaAvaliacao.setSelected(true);
        }
    }//GEN-LAST:event_tbDadosAtendimentoKeyReleased

    private void tbDadosDiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDadosDiaMouseClicked
        tfCodigoDia.setText(tbDadosDia.getValueAt(tbDadosDia.getSelectedRow(), DiaTableModel.COL_CODIGO_DIA).toString());
        tfNomeDia.setText(tbDadosDia.getValueAt(tbDadosDia.getSelectedRow(), DiaTableModel.COL_NOME_DIA).toString());
    }//GEN-LAST:event_tbDadosDiaMouseClicked

    private void tbDadosHoraInicialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDadosHoraInicialMouseClicked
        tfCodigoHoraInicial.setText(tbDadosHoraInicial.getValueAt(tbDadosHoraInicial.getSelectedRow(), HoraInicialTableModel.COL_CODIGO_HORAINICIAL).toString());
        tfNomeHoraInicial.setText(tbDadosHoraInicial.getValueAt(tbDadosHoraInicial.getSelectedRow(), HoraInicialTableModel.COL_NOME_HORAINICIAL).toString());
    }//GEN-LAST:event_tbDadosHoraInicialMouseClicked

    private void tbDadosHoraFinalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDadosHoraFinalMouseClicked
        tfCodigoHoraFinal.setText(tbDadosHoraFinal.getValueAt(tbDadosHoraFinal.getSelectedRow(), HoraFinalTableModel.COL_CODIGO_HORAFINAL).toString());
        tfNomeHoraFinal.setText(tbDadosHoraFinal.getValueAt(tbDadosHoraFinal.getSelectedRow(), HoraFinalTableModel.COL_NOME_HORAFINAL).toString());
    }//GEN-LAST:event_tbDadosHoraFinalMouseClicked

    private void btSalvarHoraInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarHoraInicialActionPerformed
        try {
            if (!tfNomeHoraInicial.getText().equals("  :  ")) {
                if (tfCodigoHoraInicial.getText().equals("")) {
                    String hora = tfNomeHoraInicial.getText();
                    Date date = sdfh.parse(hora);
                    Time time = new Time(date.getTime());
                    hi.setNome_horainicial(time);
                    hid.inserir(hi);
                    limpar_campos_horainicial();
                    popular_table_horainicial();
                    cbNomeHoraInicialAtendimento.removeAllItems();
                    popular_cbNomeHoraInicialAtendimento();
                } else {
                    hi.setCodigo_horainicial(Integer.parseInt(tfCodigoHoraInicial.getText()));
                    String hora = tfNomeHoraInicial.getText();
                    Date date = sdfh.parse(hora);
                    Time time = new Time(date.getTime());
                    hi.setNome_horainicial(time);
                    hid.alterar(hi);
                    limpar_campos_horainicial();
                    popular_table_horainicial();
                    cbNomeHoraInicialAtendimento.removeAllItems();
                    popular_cbNomeHoraInicialAtendimento();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Desculpe, existem campos que devem ser preenchidos.", "<<<<<Fedablio™>>>>>", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Desculpe, ocorreu um erro.\n" + erro, "<<<<<Fedablio™>>>>>", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btSalvarHoraInicialActionPerformed

    private void btLimparHoraInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparHoraInicialActionPerformed
        limpar_campos_horainicial();
        try {
            popular_table_horainicial();
        } catch (Exception erro) {
            throw new RuntimeException(erro);
        }
        tfNomeHoraInicial.requestFocusInWindow();
    }//GEN-LAST:event_btLimparHoraInicialActionPerformed

    private void btSalvarHoraFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarHoraFinalActionPerformed
        try {
            if (!tfNomeHoraFinal.getText().equals("  :  ")) {
                if (tfCodigoHoraFinal.getText().equals("")) {
                    String hora = tfNomeHoraFinal.getText();
                    Date date = sdfh.parse(hora);
                    Time time = new Time(date.getTime());
                    hf.setNome_horafinal(time);
                    hfd.inserir(hf);
                    limpar_campos_horafinal();
                    popular_table_horafinal();
                    cbNomeHoraFinalAtendimento.removeAllItems();
                    popular_cbNomeHoraFinalAtendimento();
                } else {
                    hf.setCodigo_horafinal(Integer.parseInt(tfCodigoHoraFinal.getText()));
                    String hora = tfNomeHoraFinal.getText();
                    Date date = sdfh.parse(hora);
                    Time time = new Time(date.getTime());
                    hf.setNome_horafinal(time);
                    hfd.alterar(hf);
                    limpar_campos_horafinal();
                    popular_table_horafinal();
                    cbNomeHoraFinalAtendimento.removeAllItems();
                    popular_cbNomeHoraFinalAtendimento();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Desculpe, existem campos que devem ser preenchidos.", "<<<<<Fedablio™>>>>>", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Desculpe, ocorreu um erro\n" + erro, "<<<<<Fedablio™>>>>>", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btSalvarHoraFinalActionPerformed

    private void btLimparHoraFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparHoraFinalActionPerformed
        limpar_campos_horafinal();
        try {
            popular_table_horafinal();
        } catch (Exception erro) {
            throw new RuntimeException(erro);
        }
        tfNomeHoraFinal.requestFocusInWindow();
    }//GEN-LAST:event_btLimparHoraFinalActionPerformed

    private void btSalvarAtendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarAtendimentoActionPerformed
        try {
            if (tfDataAtendimento.getText().equals("  /  /    ") | tfCodigoProfessorAtendimento.getText().equals("") | tfCodigoAlunoAtendimento.getText().equals("") | tfCodigoDiaAtendimento.getText().equals("") | tfCodigoHoraInicialAtendimento.getText().equals("") | tfCodigoHoraFinalAtendimento.getText().equals("") | (chf - chi) > 2 | chi == chf | cbPagamento.getSelectedIndex() == 0 | cbSituacao.getSelectedIndex() == 0 | tfPrecoAtendimento.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Desculpe, verifique atentamente, pois existem campos a serem preenchidos.", "<<<<<Fedablio™>>>>>", JOptionPane.INFORMATION_MESSAGE);
            } else {
                if (tfCodigoAtendimento.getText().equals("")) {
                    at.setCodigo_aluno(Integer.parseInt(tfCodigoAlunoAtendimento.getText()));
                    at.setCodigo_professor(Integer.parseInt(tfCodigoProfessorAtendimento.getText()));
                    at.setCodigo_dia(Integer.parseInt(tfCodigoDiaAtendimento.getText()));
                    at.setCodigo_horainicial(Integer.parseInt(tfCodigoHoraInicialAtendimento.getText()));
                    at.setCodigo_horafinal(Integer.parseInt(tfCodigoHoraFinalAtendimento.getText()));
                    java.sql.Date data = new java.sql.Date(sdfd.parse(tfDataAtendimento.getText()).getTime());
                    at.setData_atendimento(data);
                    at.setDescricao_atendimento(tfDescricaoAtendimento.getText() + " - " + sdfdTotal.format(new Date()) + "*");
                    at.setPreco_atendimento(Double.parseDouble(tfPrecoAtendimento.getText()));
                    if (cbPagamento.getSelectedIndex() == 1) {
                        at.setPagamento_atendimento("N");
                    } else if (cbPagamento.getSelectedIndex() == 2) {
                        at.setPagamento_atendimento("S");
                    }
                    at.setSituacao_atendimento(cbSituacao.getSelectedItem().toString());
                    JOptionPane.showMessageDialog(null, "PROFESSOR(A): " + cbNomeProfessorAtentimento.getSelectedItem() + "\n"
                            + "ALUNO(A): " + cbNomeAlunoAtendimento.getSelectedItem() + "\n"
                            + "DIA: " + tfNomeDiaAtendimento.getText() + "\n"
                            + "DATA: " + tfDataAtendimento.getText() + "\n"
                            + "DAS: " + cbNomeHoraInicialAtendimento.getSelectedItem() + " ÀS "
                            + "" + cbNomeHoraFinalAtendimento.getSelectedItem() + "", "<<<<<Fedablio™>>>>>", JOptionPane.CLOSED_OPTION);
                    if ((Integer.parseInt(tfCodigoHoraFinalAtendimento.getText()) >= (Integer.parseInt(tfCodigoHoraInicialAtendimento.getText())))) {
                        atd.inserir(at);
                        int imprimir = JOptionPane.showConfirmDialog(null, "Imprimir?", "<<<<<Fedablio™>>>>>", JOptionPane.YES_NO_OPTION);
                        if (imprimir == 0) {
                            JasperViewer.viewReport(new AtendimentoDAO().dao_relatorio_atendimento(new AtendimentoDAO().dao_ultimo_atendimento()), false);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Desculpe, a hora final não pode ser menor que a hora inicial.", "<<<<<Fedablio™>>>>>", JOptionPane.INFORMATION_MESSAGE);
                    }
                    popular_table_atendimento();
                    limpar_campos_atendimento();

                } else {
                    at.setCodigo_atendimento(Integer.parseInt(tfCodigoAtendimento.getText()));
                    at.setCodigo_aluno(Integer.parseInt(tfCodigoAlunoAtendimento.getText()));
                    at.setCodigo_professor(Integer.parseInt(tfCodigoProfessorAtendimento.getText()));
                    at.setCodigo_dia(Integer.parseInt(tfCodigoDiaAtendimento.getText()));
                    at.setCodigo_horainicial(Integer.parseInt(tfCodigoHoraInicialAtendimento.getText()));
                    at.setCodigo_horafinal(Integer.parseInt(tfCodigoHoraFinalAtendimento.getText()));
                    java.sql.Date data = new java.sql.Date(sdfd.parse(tfDataAtendimento.getText()).getTime());
                    at.setData_atendimento(data);
                    at.setDescricao_atendimento(tfDescricaoAtendimento.getText() + " - " + sdfdTotal.format(new Date()) + "*");
                    at.setPreco_atendimento(Double.parseDouble(tfPrecoAtendimento.getText()));
                    if (cbPagamento.getSelectedIndex() == 1) {
                        at.setPagamento_atendimento("N");
                    } else if (cbPagamento.getSelectedIndex() == 2) {
                        at.setPagamento_atendimento("S");
                    }
                    at.setSituacao_atendimento(cbSituacao.getSelectedItem().toString());
                    if ((Integer.parseInt(tfCodigoHoraFinalAtendimento.getText()) >= (Integer.parseInt(tfCodigoHoraInicialAtendimento.getText())))) {
                        atd.alterar(at);
                    } else {
                        JOptionPane.showMessageDialog(null, "Desculpe, a hora final não pode ser menor que a hora inicial.", "<<<<<Fedablio™>>>>>", JOptionPane.ERROR_MESSAGE);
                    }
                    popular_table_atendimento();
                    limpar_campos_atendimento();
                }
            }
        } catch (Exception erro) {
            throw new RuntimeException(erro);
        }
    }//GEN-LAST:event_btSalvarAtendimentoActionPerformed

    private void tbDadosProfessorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDadosProfessorMouseClicked
        tfCodigoProfessor.setText(tbDadosProfessor.getValueAt(tbDadosProfessor.getSelectedRow(), ProfessorTableModel.COL_CODIGO_PROFESSOR).toString());
        tfNomeProfessor.setText(tbDadosProfessor.getValueAt(tbDadosProfessor.getSelectedRow(), ProfessorTableModel.COL_NOME_PROFESSOR).toString());
        tfCelularProfessor.setText(tbDadosProfessor.getValueAt(tbDadosProfessor.getSelectedRow(), ProfessorTableModel.COL_CELULAR_PROFESSOR).toString());
        tfFixoProfessor.setText(tbDadosProfessor.getValueAt(tbDadosProfessor.getSelectedRow(), ProfessorTableModel.COL_FIXO_PROFESSOR).toString());
    }//GEN-LAST:event_tbDadosProfessorMouseClicked

    private void btSalvarDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarDiaActionPerformed
        try {
            if (tfNomeDia.getText().length() > 0) {
                if (tfCodigoDia.getText().equals("")) {
                    d.setNome_dia(tfNomeDia.getText());
                    dd.inserir(d);
                    limpar_campos_dia();
                    popular_table_dia();
                    tfNomeDiaAtendimento.setText(null);
                } else {
                    d.setCodigo_dia(Integer.parseInt(tfCodigoDia.getText()));
                    d.setNome_dia(tfNomeDia.getText());
                    dd.alterar(d);
                    limpar_campos_dia();
                    popular_table_dia();
                    tfNomeDiaAtendimento.setText(null);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Desculpe, existem campos que devem ser preenchidos.", "<<<<<Fedablio™>>>>>", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception erro) {
            throw new RuntimeException(erro);
        }
    }//GEN-LAST:event_btSalvarDiaActionPerformed

    private void btLimparDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparDiaActionPerformed
        limpar_campos_dia();
        try {
            popular_table_dia();
        } catch (Exception ex) {
            Logger.getLogger(AtendimentoView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btLimparDiaActionPerformed

    private void btLimparAtendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparAtendimentoActionPerformed
        limpar_campos_atendimento();
        try {
            popular_table_atendimento();
        } catch (Exception ex) {
            Logger.getLogger(AtendimentoView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btLimparAtendimentoActionPerformed

    private void btSalvarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarProfessorActionPerformed
        try {
            String nome_digitado = tfNomeProfessor.getText();
            String nome_banco = new ProfessorDAO().dao_nome_professor(tfNomeProfessor.getText());
            if (tfCodigoProfessor.getText().equals("")) {
                if (tfNomeProfessor.getText().length() > 0) {
                    if (!nome_digitado.equals(nome_banco)) {
                        int escolha = JOptionPane.showConfirmDialog(null, "Nome cadastrado não pode ser alterado.\nTem certeza que deseja cadastrar '" + nome_digitado + "' ?", "<<<<<Fedablio™>>>>>", JOptionPane.YES_NO_OPTION);
                        if (escolha == 0) {
                            p.setNome_professor(tfNomeProfessor.getText());
                            p.setCelular_professor(tfCelularProfessor.getText().replace("(", "").replace(")", "").replace("-", ""));
                            p.setFixo_professor(tfFixoProfessor.getText().replace("(", "").replace(")", "").replace("-", ""));
                            pd.inserir(p);
                            limpar_campos_professor();
                            popular_table_professor();
                            cbNomeProfessorAtentimento.removeAllItems();
                            popular_cbNomeProfsesorAtentimento();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Desculpe, este nome já está cadastrado.", "<<<<<Fedablio™>>>>>", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Desculpe, o nome deve ser digitado.", "<<<<<Fedablio™>>>>>", JOptionPane.INFORMATION_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(null, "<<Lembrete>>\nNome cadastrado não pode ser alterado.", "<<<<<Fedablio™>>>>>", JOptionPane.INFORMATION_MESSAGE);
                p.setCodigo_professor(Integer.valueOf(tfCodigoProfessor.getText()));
                p.setNome_professor(tfNomeProfessor.getText());
                p.setCelular_professor(tfCelularProfessor.getText().replace("(", "").replace(")", "").replace("-", ""));
                p.setFixo_professor(tfFixoProfessor.getText().replace("(", "").replace(")", "").replace("-", ""));
                pd.alterar(p);
                limpar_campos_professor();
                popular_table_professor();
            }
        } catch (Exception erro) {
        }
    }//GEN-LAST:event_btSalvarProfessorActionPerformed

    private void tfCodigoAlunoAtendimentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCodigoAlunoAtendimentoFocusLost
        try {
            cbNomeAlunoAtendimento.setSelectedItem(new AtendimentoDAO().dao_nome_aluno(Integer.parseInt(tfCodigoAlunoAtendimento.getText())));
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Desculpe, é necessário entrar com um código válido.", "<<<<<Fedablio™>>>>>", JOptionPane.ERROR_MESSAGE);
            tfCodigoAlunoAtendimento.requestFocusInWindow();
            tfCodigoAlunoAtendimento.setText(null);
        }
    }//GEN-LAST:event_tfCodigoAlunoAtendimentoFocusLost

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        tfCodigoProfessor.setText(null);
        tfNomeProfessor.setText(null);
        tfCelularProfessor.setText(null);
        tfFixoProfessor.setText(null);
        tfNomeProfessor.requestFocusInWindow();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void tbDadosHoraInicialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbDadosHoraInicialKeyReleased
        tfCodigoHoraInicial.setText(tbDadosHoraInicial.getValueAt(tbDadosHoraInicial.getSelectedRow(), HoraInicialTableModel.COL_CODIGO_HORAINICIAL).toString());
        tfNomeHoraInicial.setText(tbDadosHoraInicial.getValueAt(tbDadosHoraInicial.getSelectedRow(), HoraInicialTableModel.COL_NOME_HORAINICIAL).toString());
    }//GEN-LAST:event_tbDadosHoraInicialKeyReleased

    private void tbDadosHoraFinalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbDadosHoraFinalKeyReleased
        tfCodigoHoraFinal.setText(tbDadosHoraFinal.getValueAt(tbDadosHoraFinal.getSelectedRow(), HoraFinalTableModel.COL_CODIGO_HORAFINAL).toString());
        tfNomeHoraFinal.setText(tbDadosHoraFinal.getValueAt(tbDadosHoraFinal.getSelectedRow(), HoraFinalTableModel.COL_NOME_HORAFINAL).toString());
    }//GEN-LAST:event_tbDadosHoraFinalKeyReleased

    private void tbDadosDiaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbDadosDiaKeyReleased
        tfCodigoDia.setText(tbDadosDia.getValueAt(tbDadosDia.getSelectedRow(), DiaTableModel.COL_CODIGO_DIA).toString());
        tfNomeDia.setText(tbDadosDia.getValueAt(tbDadosDia.getSelectedRow(), DiaTableModel.COL_NOME_DIA).toString());
    }//GEN-LAST:event_tbDadosDiaKeyReleased

    private void btPesquisarNomesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarNomesActionPerformed
        try {
            if (tfPesquisarNomes.getText().length() <= 0) {
                JOptionPane.showMessageDialog(null, "Desculpe, é preciso digitar algum nome.", "<<<<<Fedablio™>>>>>", JOptionPane.ERROR_MESSAGE);
            } else {
                if (rbNomeProfessor.isSelected()) {
                    tbDadosAtendimento.setModel(new AtendimentoTableModel(new AtendimentoDAO().listarAtendimentoNomeProfessor(tfPesquisarNomes.getText())));
                    ajusta_tamanho_coluna_atendimento();
                } else {
                    tbDadosAtendimento.setModel(new AtendimentoTableModel(new AtendimentoDAO().listarAtendimentoNomeAluno(tfPesquisarNomes.getText())));
                    ajusta_tamanho_coluna_atendimento();
                }
            }
        } catch (Exception erro) {
            throw new RuntimeException(erro);
        }
    }//GEN-LAST:event_btPesquisarNomesActionPerformed

    private void dtCalendarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dtCalendarioActionPerformed
        Date selecionada = (Date) dtCalendario.getValue();
        String data_formatada = sdfd.format(selecionada); //Converte o padrão americano para o PT-BR
        String dia_semana = ""; //variável que armazena o nome do dia da semana
        int num_dia_semana = selecionada.getDay(); //retorna o dia da semana de 0 à 6
        switch (num_dia_semana) {
            case 0:
                dia_semana = "Domingo";
                break;
            case 1:
                dia_semana = "Segunda-Feira";
                break;
            case 2:
                dia_semana = "Terça-Feira";
                break;
            case 3:
                dia_semana = "Quarta-Feira";
                break;
            case 4:
                dia_semana = "Quinta-Feira";
                break;
            case 5:
                dia_semana = "Sexta-Feira";
                break;
            case 6:
                dia_semana = "Sábado";
                break;
        }
        tfDataInserida.setText(dia_semana + " - " + data_formatada);
    }//GEN-LAST:event_dtCalendarioActionPerformed

    private void tbDadosProfessorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbDadosProfessorKeyReleased
        tfCodigoProfessor.setText(tbDadosProfessor.getValueAt(tbDadosProfessor.getSelectedRow(), ProfessorTableModel.COL_CODIGO_PROFESSOR).toString());
        tfNomeProfessor.setText(tbDadosProfessor.getValueAt(tbDadosProfessor.getSelectedRow(), ProfessorTableModel.COL_NOME_PROFESSOR).toString());
        tfCelularProfessor.setText(tbDadosProfessor.getValueAt(tbDadosProfessor.getSelectedRow(), ProfessorTableModel.COL_CELULAR_PROFESSOR).toString());
        tfFixoProfessor.setText(tbDadosProfessor.getValueAt(tbDadosProfessor.getSelectedRow(), ProfessorTableModel.COL_FIXO_PROFESSOR).toString());
    }//GEN-LAST:event_tbDadosProfessorKeyReleased

    private void tbDadosAlunoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbDadosAlunoKeyReleased
        tfCodigoAluno.setText(tbDadosAluno.getValueAt(tbDadosAluno.getSelectedRow(), AlunoTableModel.COL_CODIGO_ALUNO).toString());
        tfNomeAluno.setText(tbDadosAluno.getValueAt(tbDadosAluno.getSelectedRow(), AlunoTableModel.COL_NOME_ALUNO).toString());
        tfCelularAluno.setText(tbDadosAluno.getValueAt(tbDadosAluno.getSelectedRow(), AlunoTableModel.COL_CELULAR_ALUNO).toString());
        tfFixoAluno.setText(tbDadosAluno.getValueAt(tbDadosAluno.getSelectedRow(), AlunoTableModel.COL_FIXO_ALUNO).toString());
    }//GEN-LAST:event_tbDadosAlunoKeyReleased

    private void tfPesquisarProfessorNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisarProfessorNomeKeyReleased
        try {
            tbDadosProfessor.setModel(new ProfessorTableModel(new ProfessorDAO().listarProfessorNome(tfPesquisarProfessorNome.getText())));
        } catch (Exception erro) {
            throw new RuntimeException(erro);
        }
        ajusta_tamanho_coluna_professor();
    }//GEN-LAST:event_tfPesquisarProfessorNomeKeyReleased

    private void tfPesquisarAlunoNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisarAlunoNomeKeyReleased
        try {
            tbDadosAluno.setModel(new AlunoTableModel(new AlunoDAO().listarAlunoNome(tfPesquisarAlunoNome.getText())));
        } catch (Exception erro) {
            throw new RuntimeException(erro);
        }
        ajusta_tamanho_coluna_aluno();
    }//GEN-LAST:event_tfPesquisarAlunoNomeKeyReleased

    private void btInserirDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirDataActionPerformed
        try {
            Date date_system = (Date) dtCalendario.getValue();
            String data_formatada = sdfd.format(date_system);
            int code_day_week = date_system.getDay();
            String data_do_aluno = sdfd.format(date_system);
            Date data_corrente = new Date();
            String data_atual = sdfd.format(data_corrente);
            if (data_do_aluno.equals(data_atual) | date_system.after(data_corrente)) {
                if (code_day_week == 0) {
                    String dia = "Domingo";
                    tfNomeDiaAtendimento.setText(dia);
                    tfCodigoDiaAtendimento.setText(String.valueOf(new AtendimentoDAO().dao_codigo_dia(dia)));
                } else if (code_day_week == 1) {
                    String dia = "Segunda-Feira";
                    tfNomeDiaAtendimento.setText(dia);
                    tfCodigoDiaAtendimento.setText(String.valueOf(new AtendimentoDAO().dao_codigo_dia(dia)));
                } else if (code_day_week == 2) {
                    String dia = "Terça-Feira";
                    tfNomeDiaAtendimento.setText(dia);
                    tfCodigoDiaAtendimento.setText(String.valueOf(new AtendimentoDAO().dao_codigo_dia(dia)));
                } else if (code_day_week == 3) {
                    String dia = "Quarta-Feira";
                    tfNomeDiaAtendimento.setText(dia);
                    tfCodigoDiaAtendimento.setText(String.valueOf(new AtendimentoDAO().dao_codigo_dia(dia)));
                } else if (code_day_week == 4) {
                    String dia = "Quinta-Feira";
                    tfNomeDiaAtendimento.setText(dia);
                    tfCodigoDiaAtendimento.setText(String.valueOf(new AtendimentoDAO().dao_codigo_dia(dia)));
                } else if (code_day_week == 5) {
                    String dia = "Sexta-Feira";
                    tfNomeDiaAtendimento.setText(dia);
                    tfCodigoDiaAtendimento.setText(String.valueOf(new AtendimentoDAO().dao_codigo_dia(dia)));
                } else if (code_day_week == 6) {
                    String dia = "Sábado";
                    tfNomeDiaAtendimento.setText(dia);
                    tfCodigoDiaAtendimento.setText(String.valueOf(new AtendimentoDAO().dao_codigo_dia(dia)));
                }
                tfDataAtendimento.setText(data_formatada);
                tfDataInserida.setText(null);
                ptAtendimento.setSelectedIndex(0);
                dtCalendario.setDate(new Date());
            } else {
                JOptionPane.showMessageDialog(null, "Desculpe, a data seleciona é inferior a data atual.", "<<<<<Fedablio™>>>>>", JOptionPane.ERROR_MESSAGE);
                tfCodigoDiaAtendimento.setText(null);
                tfNomeDiaAtendimento.setText(null);
                tfDataAtendimento.setText(null);
                dtCalendario.setDate(new Date());
            }
        } catch (Exception erro) {
            throw new RuntimeException(erro);
        }
    }//GEN-LAST:event_btInserirDataActionPerformed

    private void cbNomeHoraInicialAtendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNomeHoraInicialAtendimentoActionPerformed
        if (ptAtendimento.getSelectedIndex() == 0) {
            try {
                tfCodigoHoraInicialAtendimento.setText(String.valueOf(new AtendimentoDAO().dao_codigo_horainicial(cbNomeHoraInicialAtendimento.getSelectedItem().toString())));
            } catch (Exception erro) {
                throw new RuntimeException(erro);
            }
        }
        chi = Integer.parseInt(tfCodigoHoraInicialAtendimento.getText());
    }//GEN-LAST:event_cbNomeHoraInicialAtendimentoActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        try {
            if (tfDataAtendimento.getText().equals("  /  /    ") | tfCodigoProfessorAtendimento.getText().equals("") | tfCodigoAlunoAtendimento.getText().equals("") | tfCodigoDiaAtendimento.getText().equals("") | tfCodigoHoraInicialAtendimento.getText().equals("") | tfCodigoHoraFinalAtendimento.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Desculpe, existem campos que devem ser preenchidos ou\n as horas não batem.", "<<<<<Fedablio™>>>>>", JOptionPane.INFORMATION_MESSAGE);
            } else {
                if (tfCodigoAtendimento.getText().equals("")) {
                    at.setCodigo_aluno(Integer.parseInt(tfCodigoAlunoAtendimento.getText()));
                    at.setCodigo_professor(Integer.parseInt(tfCodigoProfessorAtendimento.getText()));
                    at.setCodigo_dia(Integer.parseInt(tfCodigoDiaAtendimento.getText()));
                    at.setCodigo_horainicial(Integer.parseInt(tfCodigoHoraInicialAtendimento.getText()));
                    at.setCodigo_horafinal(Integer.parseInt(tfCodigoHoraFinalAtendimento.getText()));
                    java.sql.Date data = new java.sql.Date(sdfd.parse(tfDataAtendimento.getText()).getTime());
                    at.setData_atendimento(data);
                    at.setDescricao_atendimento(tfDescricaoAtendimento.getText());
                    JOptionPane.showMessageDialog(null, "Profesor(a): " + cbNomeProfessorAtentimento.getSelectedItem() + "\n"
                            + "Aluno(a): " + cbNomeAlunoAtendimento.getSelectedItem() + "\n"
                            + "Dia: " + tfNomeDiaAtendimento.getText() + "\n"
                            + "Data: " + tfDataAtendimento.getText() + "\n"
                            + "Início: " + cbNomeHoraInicialAtendimento.getSelectedItem() + "\n"
                            + "Fim: " + cbNomeHoraFinalAtendimento.getSelectedItem() + "", "<<<<<Fedablio™>>>>>", JOptionPane.INFORMATION_MESSAGE);
                    atd.inserir(at);
                    popular_table_atendimento();
                    limpar_campos_atendimento();
                } else {
                    at.setCodigo_atendimento(Integer.parseInt(tfCodigoAtendimento.getText()));
                    at.setCodigo_aluno(Integer.parseInt(tfCodigoAlunoAtendimento.getText()));
                    at.setCodigo_professor(Integer.parseInt(tfCodigoProfessorAtendimento.getText()));
                    at.setCodigo_dia(Integer.parseInt(tfCodigoDiaAtendimento.getText()));
                    at.setCodigo_horainicial(Integer.parseInt(tfCodigoHoraInicialAtendimento.getText()));
                    at.setCodigo_horafinal(Integer.parseInt(tfCodigoHoraFinalAtendimento.getText()));
                    java.sql.Date data = new java.sql.Date(sdfd.parse(tfDataAtendimento.getText()).getTime());
                    at.setData_atendimento(data);
                    at.setDescricao_atendimento(tfDescricaoAtendimento.getText());
                    atd.alterar(at);
                    popular_table_atendimento();
                    limpar_campos_atendimento();
                }
            }
        } catch (Exception erro) {
            throw new RuntimeException(erro);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        limpar_campos_atendimento();
        try {
            popular_table_atendimento();
        } catch (Exception ex) {
            Logger.getLogger(AtendimentoView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        String nome_digitado = tfNomeProfessor.getText();
        String nome_banco = null;
        try {
            nome_banco = new ProfessorDAO().dao_nome_professor(tfNomeProfessor.getText());
        } catch (Exception ex) {
            Logger.getLogger(AtendimentoView.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (tfCodigoProfessor.getText().equals("")) {
            if (tfNomeProfessor.getText().length() > 0) {
                if (!nome_digitado.equals(nome_banco)) {
                    int escolha = JOptionPane.showConfirmDialog(null, "Nome cadastrado não pode ser alterado.\nTem certeza que deseja cadastrar '" + nome_digitado + "' ?", "<<<<<Fedablio™>>>>>", JOptionPane.YES_NO_OPTION);
                    if (escolha == 0) {
                        p.setNome_professor(tfNomeProfessor.getText());
                        p.setCelular_professor(tfCelularProfessor.getText().replace("(", "").replace(")", "").replace("-", ""));
                        p.setFixo_professor(tfFixoProfessor.getText().replace("(", "").replace(")", "").replace("-", ""));
                        pd.inserir(p);
                        limpar_campos_professor();
                        try {
                            popular_table_professor();
                        } catch (Exception ex) {
                            Logger.getLogger(AtendimentoView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        cbNomeProfessorAtentimento.removeAllItems();
                        popular_cbNomeProfsesorAtentimento();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Desculpe, este nome já está cadastrado.", "<<<<<Fedablio™>>>>>", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Desculpe, o nome deve ser digitado.", "<<<<<Fedablio™>>>>>", JOptionPane.INFORMATION_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(null, "<<Lembrete>>\nNome cadastrado não pode ser alterado.", "<<<<<Fedablio™>>>>>", JOptionPane.INFORMATION_MESSAGE);
            p.setCodigo_professor(Integer.valueOf(tfCodigoProfessor.getText()));
            p.setNome_professor(tfNomeProfessor.getText());
            p.setCelular_professor(tfCelularProfessor.getText().replace("(", "").replace(")", "").replace("-", ""));
            p.setFixo_professor(tfFixoProfessor.getText().replace("(", "").replace(")", "").replace("-", ""));
            pd.alterar(p);
            limpar_campos_professor();
            try {
                popular_table_professor();
            } catch (Exception ex) {
                Logger.getLogger(AtendimentoView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void btExcluirProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirProfessorActionPerformed
        try {
            if (tbDadosProfessor.getRowCount() > 0) {
                if (tbDadosProfessor.getSelectedRow() >= 0) {
                    int opcao = JOptionPane.showConfirmDialog(null, "Deseja mesmo excluir o item selecionado?", "<<<<<Fedablio™>>>>>", JOptionPane.YES_NO_OPTION);
                    if (opcao == 0) {
                        int exclusao = Integer.parseInt(tbDadosProfessor.getValueAt(tbDadosProfessor.getSelectedRow(), ProfessorTableModel.COL_CODIGO_PROFESSOR).toString());
                        new ProfessorDAO().excluir(exclusao);
                        limpar_campos_professor();
                        popular_table_professor();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, selecione uma linha para excluir!", "<<<<<Fedablio™>>>>>", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Desculpe, não existem dados na tabela.", "<<<<<Fedablio™>>>>>", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Desculpe, este professor está vinculado com algum Atendimento.", "<<<<<Fedablio™>>>>>", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btExcluirProfessorActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        try {
            if (tbDadosProfessor.getRowCount() > 0) {
                if (tbDadosProfessor.getSelectedRow() >= 0) {
                    int opcao = JOptionPane.showConfirmDialog(null, "Deseja mesmo excluir o item selecionado?", "<<<<<Fedablio™>>>>>", JOptionPane.YES_NO_OPTION);
                    if (opcao == 0) {
                        int exclusao = Integer.parseInt(tbDadosProfessor.getValueAt(tbDadosProfessor.getSelectedRow(), ProfessorTableModel.COL_CODIGO_PROFESSOR).toString());
                        new ProfessorDAO().excluir(exclusao);
                        limpar_campos_professor();
                        popular_table_professor();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, selecione uma linha para excluir!", "<<<<<Fedablio™>>>>>", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Desculpe, não existem dados na tabela.", "<<<<<Fedablio™>>>>>", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Desculpe, este professor está vinculado com algum Atendimento.", "<<<<<Fedablio™>>>>>", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        tfCodigoProfessor.setText(null);
        tfNomeProfessor.setText(null);
        tfCelularProfessor.setText(null);
        tfFixoProfessor.setText(null);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        try {
            String nome_digitado = tfNomeAluno.getText();
            String nome_banco = new AlunoDAO().dao_nome_aluno(tfNomeAluno.getText());
            if (tfCodigoAluno.getText().equals("")) {
                if (tfNomeAluno.getText().length() > 0) {
                    if (!nome_digitado.equals(nome_banco)) {
                        int escolha = JOptionPane.showConfirmDialog(null, "Nome cadastrado não pode ser alterado.\nTem certeza que deseja cadastrar '" + nome_digitado + "' ?", "<<<<<Fedablio™>>>>>", JOptionPane.YES_NO_OPTION);
                        if (escolha == 0) {
                            a.setNome_aluno(tfNomeAluno.getText());
                            a.setCelular_aluno(tfCelularAluno.getText().replace("(", "").replace(")", "").replace("-", ""));
                            a.setFixo_aluno(tfFixoAluno.getText().replace("(", "").replace(")", "").replace("-", ""));
                            ad.inserir(a);
                            limpar_campos_aluno();
                            popular_table_aluno();
                            cbNomeAlunoAtendimento.removeAllItems();
                            popular_cbNomeAlunoAtendimento();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Desculpe, este nome já está cadastrado.", "<<<<<Fedablio™>>>>>", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Desculpe, o nome deve ser digitado.", "<<<<<Fedablio™>>>>>", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "<<Lembrete>>\nNome cadastrado não pode ser alterado.", "<<<<<Fedablio™>>>>>", JOptionPane.INFORMATION_MESSAGE);
                a.setCodigo_aluno(Integer.valueOf(tfCodigoAluno.getText()));
                a.setCelular_aluno(tfCelularAluno.getText().replace("(", "").replace(")", "").replace("-", ""));
                a.setFixo_aluno(tfFixoAluno.getText().replace("(", "").replace(")", "").replace("-", ""));
                ad.alterar(a);
                limpar_campos_aluno();
                popular_table_aluno();
            }
        } catch (Exception erro) {
        }
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        try {
            if (tbDadosAluno.getRowCount() > 0) {
                if (tbDadosAluno.getSelectedRow() >= 0) {
                    int opcao = JOptionPane.showConfirmDialog(null, "Desja mesmo excluir o item selecionado?", "<<<<<Fedablio™>>>>>", JOptionPane.YES_NO_OPTION);
                    if (opcao == 0) {
                        int exclusao = Integer.parseInt(tbDadosAluno.getValueAt(tbDadosAluno.getSelectedRow(), AlunoTableModel.COL_CODIGO_ALUNO).toString());
                        new AlunoDAO().excluir(exclusao);
                        popular_table_aluno();
                        limpar_campos_aluno();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, selecione uma linha para excluir!", "<<<<<Fedablio™>>>>>", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Desculpe, não existem dados na tabela.", "<<<<<Fedablio™>>>>>", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Desculpe, este aluno está vinculado com algum Atendimento.", "<<<<<Fedablio™>>>>>", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        limpar_campos_aluno();
        try {
            popular_table_aluno();
        } catch (Exception ex) {
            Logger.getLogger(AtendimentoView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void imSalvarDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imSalvarDiaActionPerformed
        if (tfCodigoDia.getText().equals("")) {
            d.setNome_dia(tfNomeDia.getText());
            dd.inserir(d);
            limpar_campos_dia();
            try {
                popular_table_dia();
            } catch (Exception ex) {
                Logger.getLogger(AtendimentoView.class.getName()).log(Level.SEVERE, null, ex);
            }
            tfNomeDiaAtendimento.setText(null);
        } else {
            d.setCodigo_dia(Integer.parseInt(tfCodigoDia.getText()));
            d.setNome_dia(tfNomeDia.getText());
            dd.alterar(d);
            limpar_campos_dia();
            try {
                popular_table_dia();
            } catch (Exception ex) {
                Logger.getLogger(AtendimentoView.class.getName()).log(Level.SEVERE, null, ex);
            }
            tfNomeDiaAtendimento.setText(null);
        }
    }//GEN-LAST:event_imSalvarDiaActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        limpar_campos_dia();
        try {
            popular_table_dia();
        } catch (Exception ex) {
            Logger.getLogger(AtendimentoView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void imSalvarHoraInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imSalvarHoraInicialActionPerformed
        try {
            if (tfCodigoHoraInicial.getText().equals("")) {
                String hora = tfNomeHoraInicial.getText();
                Date date = sdfh.parse(hora);
                Time time = new Time(date.getTime());
                hi.setNome_horainicial(time);
                hid.inserir(hi);
                limpar_campos_horainicial();
                popular_table_horainicial();
                cbNomeHoraInicialAtendimento.removeAllItems();
                popular_cbNomeHoraInicialAtendimento();
            } else {
                hi.setCodigo_horainicial(Integer.parseInt(tfCodigoHoraInicial.getText()));
                String hora = tfNomeHoraInicial.getText();
                Date date = sdfh.parse(hora);
                Time time = new Time(date.getTime());
                hi.setNome_horainicial(time);
                hid.alterar(hi);
                limpar_campos_horainicial();
                popular_table_horainicial();
                cbNomeHoraInicialAtendimento.removeAllItems();
                popular_cbNomeHoraInicialAtendimento();
            }
        } catch (Exception erro) {
            throw new RuntimeException(erro);
        }
    }//GEN-LAST:event_imSalvarHoraInicialActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        limpar_campos_horainicial();
        try {
            popular_table_horainicial();
        } catch (Exception ex) {
            Logger.getLogger(AtendimentoView.class.getName()).log(Level.SEVERE, null, ex);
        }
        tfNomeHoraInicial.requestFocusInWindow();
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void imSalvarHoraFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imSalvarHoraFinalActionPerformed
        try {
            if (tfCodigoHoraFinal.getText().equals("")) {
                String hora = tfNomeHoraFinal.getText();
                Date date = sdfh.parse(hora);
                Time time = new Time(date.getTime());
                hf.setNome_horafinal(time);
                hfd.inserir(hf);
                limpar_campos_horafinal();
                popular_table_horafinal();
                cbNomeHoraFinalAtendimento.removeAllItems();
                popular_cbNomeHoraFinalAtendimento();
            } else {
                hf.setCodigo_horafinal(Integer.parseInt(tfCodigoHoraFinal.getText()));
                String hora = tfNomeHoraFinal.getText();
                Date date = sdfh.parse(hora);
                Time time = new Time(date.getTime());
                hf.setNome_horafinal(time);
                hfd.alterar(hf);
                limpar_campos_horafinal();
                popular_table_horafinal();
                cbNomeHoraFinalAtendimento.removeAllItems();
                popular_cbNomeHoraFinalAtendimento();
            }
        } catch (Exception erro) {
            throw new RuntimeException(erro);
        }
    }//GEN-LAST:event_imSalvarHoraFinalActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        limpar_campos_horafinal();
        try {
            popular_table_horafinal();
        } catch (Exception ex) {
            Logger.getLogger(AtendimentoView.class.getName()).log(Level.SEVERE, null, ex);
        }
        tfNomeHoraFinal.requestFocusInWindow();
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            Date date_system = (Date) dtCalendario.getValue();
            String data_formatada = sdfd.format(date_system);
            int code_day_week = date_system.getDay();
            if (code_day_week == 0) {
                String dia = "Domingo";
                tfNomeDiaAtendimento.setText(dia);
                tfCodigoDiaAtendimento.setText(String.valueOf(new AtendimentoDAO().dao_codigo_dia(dia)));
            } else if (code_day_week == 1) {
                String dia = "Segunda-Feira";
                tfNomeDiaAtendimento.setText(dia);
                tfCodigoDiaAtendimento.setText(String.valueOf(new AtendimentoDAO().dao_codigo_dia(dia)));
            } else if (code_day_week == 2) {
                String dia = "Terça-Feira";
                tfNomeDiaAtendimento.setText(dia);
                tfCodigoDiaAtendimento.setText(String.valueOf(new AtendimentoDAO().dao_codigo_dia(dia)));
            } else if (code_day_week == 3) {
                String dia = "Quarta-Feira";
                tfNomeDiaAtendimento.setText(dia);
                tfCodigoDiaAtendimento.setText(String.valueOf(new AtendimentoDAO().dao_codigo_dia(dia)));
            } else if (code_day_week == 4) {
                String dia = "Quinta-Feira";
                tfNomeDiaAtendimento.setText(dia);
                tfCodigoDiaAtendimento.setText(String.valueOf(new AtendimentoDAO().dao_codigo_dia(dia)));
            } else if (code_day_week == 5) {
                String dia = "Sexta-Feira";
                tfNomeDiaAtendimento.setText(dia);
                tfCodigoDiaAtendimento.setText(String.valueOf(new AtendimentoDAO().dao_codigo_dia(dia)));
            } else if (code_day_week == 6) {
                String dia = "Sábado";
                tfNomeDiaAtendimento.setText(dia);
                tfCodigoDiaAtendimento.setText(String.valueOf(new AtendimentoDAO().dao_codigo_dia(dia)));
            }
            tfDataAtendimento.setText(data_formatada);
            tfDataInserida.setText(null);
            ptAtendimento.setSelectedIndex(0);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Por favor, selecione uma data!", "<<<<<Fedablio™>>>>>", JOptionPane.INFORMATION_MESSAGE);
            ptAtendimento.setSelectedIndex(4);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        try {
            String login = JOptionPane.showInputDialog(null, "Digite o login:", "<<<<<Fedablio™>>>>>", JOptionPane.QUESTION_MESSAGE);
            String senha = JOptionPane.showInputDialog(null, "Digite o senha:", "<<<<<Fedablio™>>>>>", JOptionPane.QUESTION_MESSAGE);
            boolean comparacao = new UsuarioDAO().dao_autenticar_acesso(login, senha);
            if (comparacao == true) {
                tfNomeDia.setEditable(true);
                btSalvarDia.setEnabled(true);
                imSalvarDia.setEnabled(true);
                //
                tfNomeHoraInicial.setEditable(true);
                btSalvarHoraInicial.setEnabled(true);
                imSalvarHoraInicial.setEnabled(true);
                //
                tfNomeHoraFinal.setEditable(true);
                btSalvarHoraFinal.setEnabled(true);
                imSalvarHoraFinal.setEnabled(true);
                ptAtendimento.setSelectedIndex(3);
            } else {
                JOptionPane.showMessageDialog(null, "Desculpe, senha inválida.", "<<<<<Fedablio™>>>>>", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Cancelado pelo usuário.", "<<<<<Fedablio™>>>>>", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        tfNomeDia.setEditable(false);
        btSalvarDia.setEnabled(false);
        imSalvarDia.setEnabled(false);
        //
        tfNomeHoraInicial.setEditable(false);
        btSalvarHoraInicial.setEnabled(false);
        imSalvarHoraInicial.setEnabled(false);
        //
        tfNomeHoraFinal.setEditable(false);
        btSalvarHoraFinal.setEnabled(false);
        imSalvarHoraFinal.setEnabled(false);
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void tmHoraSistemaOnTime(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmHoraSistemaOnTime
        Date date = new Date();
        lbHoraSistema.setText(sdfh2.format(date));
    }//GEN-LAST:event_tmHoraSistemaOnTime

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        JOptionPane.showMessageDialog(null, "Desenvolvedor: Fedablio\nContato: (DD)9999-9999\nEmail: email@dominio.com\nCidade - UF", "<<<<<Fedablio™>>>>>", JOptionPane.CLOSED_OPTION);
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void imSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imSairActionPerformed
        int escolha = JOptionPane.showConfirmDialog(null, "Deseja sair?", "<<<<<Fedablio™>>>>>", JOptionPane.YES_NO_OPTION);
        if (escolha == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_imSairActionPerformed

    private void btAtualizarTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarTabelaActionPerformed
        try {
            tbDadosAtendimento.setModel(new AtendimentoTableModel(new AtendimentoDAO().listarAtendimento()));
            ajusta_tamanho_coluna_atendimento();
        } catch (Exception ex) {
            Logger.getLogger(AtendimentoView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btAtualizarTabelaActionPerformed

    private void imCodigoAtendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imCodigoAtendimentoActionPerformed
        new AtendimentoCodigoView(this, true).show();
    }//GEN-LAST:event_imCodigoAtendimentoActionPerformed

    private void tfNomeAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfNomeAlunoMouseClicked
        JOptionPane.showMessageDialog(null, "Preste atenção!\n Confira o nome antes de salvar.", "<<<<<Fedablio™>>>>>", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_tfNomeAlunoMouseClicked

    private void tfNomeProfessorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfNomeProfessorMouseClicked
        JOptionPane.showMessageDialog(null, "Preste atenção!\n Confira o nome antes de salvar.", "<<<<<Fedablio™>>>>>", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_tfNomeProfessorMouseClicked

    private void btZoomDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btZoomDescricaoActionPerformed
        ZoomDescricaoView zdv = new ZoomDescricaoView(this, true);
        zdv.tfDescricao.setText(tfDescricaoAtendimento.getText());
        zdv.setVisible(true);
    }//GEN-LAST:event_btZoomDescricaoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new LogarView(this, true).show();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    public final void popular_table_atendimento() throws Exception {
        tbDadosAtendimento.setModel(new AtendimentoTableModel(new AtendimentoDAO().listarAtendimento()));
        ajusta_tamanho_coluna_atendimento();
    }

    public final void popular_cbNomeProfsesorAtentimento() {
        String sql = "SELECT nome_professor FROM professor";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                cbNomeProfessorAtentimento.addItem(rs.getString("nome_professor"));
            }
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }

    public final void limpar_cbNomeProfsesorAtentimento() {
        String sql = "SELECT nome_professor FROM professor";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                cbNomeProfessorAtentimento.addItem(rs.getString(null));
            }
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }

    public final void popular_cbNomeAlunoAtendimento() {
        String sql = "SELECT nome_aluno FROM aluno";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                cbNomeAlunoAtendimento.addItem(rs.getString("nome_aluno"));
            }
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }

    public final void popular_cbNomeHoraInicialAtendimento() {
        String sql = "SELECT nome_horainicial FROM horainicial";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                cbNomeHoraInicialAtendimento.addItem(sdfh.format(rs.getTime("nome_horainicial")));
            }
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }

    public final void popular_cbNomeHoraFinalAtendimento() {
        String sql = "SELECT nome_horafinal FROM horafinal";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                cbNomeHoraFinalAtendimento.addItem(sdfh.format(rs.getTime("nome_horafinal")));
            }
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }

    private void ajusta_tamanho_coluna_professor() {
        tbDadosProfessor.getColumnModel().getColumn(0).setPreferredWidth(60);
        tbDadosProfessor.getColumnModel().getColumn(1).setPreferredWidth(600);
        tbDadosProfessor.getColumnModel().getColumn(2).setPreferredWidth(100);
        tbDadosProfessor.getColumnModel().getColumn(3).setPreferredWidth(100);
    }

    private void ajusta_tamanho_coluna_aluno() {
        tbDadosAluno.getColumnModel().getColumn(0).setPreferredWidth(60);
        tbDadosAluno.getColumnModel().getColumn(1).setPreferredWidth(600);
        tbDadosAluno.getColumnModel().getColumn(2).setPreferredWidth(100);
        tbDadosAluno.getColumnModel().getColumn(3).setPreferredWidth(100);
    }

    private void ajusta_tamanho_coluna_atendimento() {
        tbDadosAtendimento.getColumnModel().getColumn(0).setPreferredWidth(60); //Codigo
        tbDadosAtendimento.getColumnModel().getColumn(1).setPreferredWidth(80); //Data
        tbDadosAtendimento.getColumnModel().getColumn(2).setPreferredWidth(80); //Cod Prof
        tbDadosAtendimento.getColumnModel().getColumn(3).setPreferredWidth(200); //Nome Prof
        tbDadosAtendimento.getColumnModel().getColumn(4).setPreferredWidth(100); //Cel Prof
        tbDadosAtendimento.getColumnModel().getColumn(5).setPreferredWidth(100); //Fixo Prof
        tbDadosAtendimento.getColumnModel().getColumn(6).setPreferredWidth(80); //Cod Alu
        tbDadosAtendimento.getColumnModel().getColumn(7).setPreferredWidth(200); //Nome Alu
        tbDadosAtendimento.getColumnModel().getColumn(8).setPreferredWidth(100); //Cel Alu
        tbDadosAtendimento.getColumnModel().getColumn(9).setPreferredWidth(100); //Fixo Alu
        tbDadosAtendimento.getColumnModel().getColumn(10).setPreferredWidth(60); //Cod Dia
        tbDadosAtendimento.getColumnModel().getColumn(11).setPreferredWidth(110); //Nome Dia
        tbDadosAtendimento.getColumnModel().getColumn(12).setPreferredWidth(80); //Cod HI
        tbDadosAtendimento.getColumnModel().getColumn(13).setPreferredWidth(60); //Nome HI
        tbDadosAtendimento.getColumnModel().getColumn(14).setPreferredWidth(70); //Cod HF
        tbDadosAtendimento.getColumnModel().getColumn(15).setPreferredWidth(60); //Nome HF
        tbDadosAtendimento.getColumnModel().getColumn(16).setPreferredWidth(100); //Preço Ava
        tbDadosAtendimento.getColumnModel().getColumn(17).setPreferredWidth(100); //Pagamento
        tbDadosAtendimento.getColumnModel().getColumn(18).setPreferredWidth(100); //Situacao
    }

    public final void popular_table_professor() throws Exception {
        tbDadosProfessor.setModel(new ProfessorTableModel(new ProfessorDAO().listarProfessor()));
        ajusta_tamanho_coluna_professor();
    }

    public final void popular_table_aluno() throws Exception {
        tbDadosAluno.setModel(new AlunoTableModel(new AlunoDAO().listarAluno()));
        ajusta_tamanho_coluna_aluno();
    }

    public void popular_table_dia() throws Exception {
        tbDadosDia.setModel(new DiaTableModel(new DiaDAO().listarTodos()));
    }

    public final void popular_table_horainicial() throws Exception {
        tbDadosHoraInicial.setModel(new HoraInicialTableModel(new HoraInicialDAO().listarTodos()));
    }

    public final void popular_table_horafinal() throws Exception {
        tbDadosHoraFinal.setModel(new HoraFinalTableModel(new HoraFinalDAO().listarTodos()));
    }

    public void limpar_campos_atendimento() {
        cbNomeHoraInicialAtendimento.setSelectedIndex(0);
        cbNomeHoraFinalAtendimento.setSelectedIndex(0);
        cbNomeProfessorAtentimento.setSelectedIndex(0);
        cbNomeAlunoAtendimento.setSelectedIndex(0);
        tfCodigoAtendimento.setText(null);
        tfCodigoProfessorAtendimento.setText(null);
        tfCelularProfessorAtendimento.setText(null);
        tfFixoProfessorAtendimento.setText(null);
        tfCodigoAlunoAtendimento.setText(null);
        tfCelularAlunoAtendimento.setText(null);
        tfFixoAlunoAtendimento.setText(null);
        tfDataAtendimento.setText(null);
        tfCodigoDiaAtendimento.setText(null);
        tfCodigoHoraInicialAtendimento.setText(null);
        tfCodigoHoraFinalAtendimento.setText(null);
        tfDataAtendimento.setText(null);
        tfDescricaoAtendimento.setText(null);
        tfNomeDiaAtendimento.setText(null);
        tfPesquisarData.setText(null);
        tfPesquisarNomes.setText(null);
        rbNomeProfessor.setSelected(true);
        bgAvaliacao.clearSelection();
        btZoomDescricao.setEnabled(false);
        cbPagamento.setSelectedIndex(0);
        cbSituacao.setSelectedIndex(0);
        tfPrecoAtendimento.setText(null);
    }

    public void limpar_campos_professor() {
        tfCodigoProfessor.setText(null);
        tfNomeProfessor.setText(null);
        tfCelularProfessor.setText(null);
        tfFixoProfessor.setText(null);
    }

    public void limpar_campos_aluno() {
        tfCodigoAluno.setText(null);
        tfNomeAluno.setText(null);
        tfCelularAluno.setText(null);
        tfFixoAluno.setText(null);
        tfNomeAluno.requestFocusInWindow();
    }

    public void limpar_campos_dia() {
        tfCodigoDia.setText(null);
        tfNomeDia.setText(null);
        tfNomeDia.requestFocusInWindow();
    }

    public final void limpar_campos_horainicial() {
        tfCodigoHoraInicial.setText(null);
        tfNomeHoraInicial.setText(null);
    }

    public final void limpar_campos_horafinal() {
        tfCodigoHoraFinal.setText(null);
        tfNomeHoraFinal.setText(null);
    }

    public final void limpar_campos_codigo_atendimento() {
        tfCodigoAtendimento.setText(null);
        tfCodigoAlunoAtendimento.setText(null);
        tfCodigoProfessorAtendimento.setText(null);
        tfCodigoDiaAtendimento.setText(null);
        tfCodigoHoraInicialAtendimento.setText(null);
        tfCodigoHoraFinalAtendimento.setText(null);
    }

    public void excluir_professor() throws Exception {
        int exclusao = Integer.parseInt(tbDadosProfessor.getValueAt(tbDadosProfessor.getSelectedRow(), ProfessorTableModel.COL_CODIGO_PROFESSOR).toString());
        new ProfessorDAO().excluir(exclusao);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgAvaliacao;
    private javax.swing.ButtonGroup bgPesquisarNomes;
    private javax.swing.JButton btAtualizarTabela;
    private javax.swing.JButton btExcluirAluno;
    private javax.swing.JButton btExcluirProfessor;
    private javax.swing.JButton btInserirData;
    private javax.swing.JButton btLimparAluno;
    private javax.swing.JButton btLimparAtendimento;
    private javax.swing.JButton btLimparDia;
    private javax.swing.JButton btLimparHoraFinal;
    private javax.swing.JButton btLimparHoraInicial;
    private javax.swing.JButton btPesquisarDataAtendimento;
    private javax.swing.JButton btPesquisarNomes;
    private javax.swing.JButton btSalvarAluno;
    private javax.swing.JButton btSalvarAtendimento;
    private javax.swing.JButton btSalvarDia;
    private javax.swing.JButton btSalvarHoraFinal;
    private javax.swing.JButton btSalvarHoraInicial;
    private javax.swing.JButton btSalvarProfessor;
    private javax.swing.JButton btZoomDescricao;
    private javax.swing.JComboBox cbNomeAlunoAtendimento;
    private javax.swing.JComboBox cbNomeHoraFinalAtendimento;
    private javax.swing.JComboBox cbNomeHoraInicialAtendimento;
    private javax.swing.JComboBox cbNomeProfessorAtentimento;
    private javax.swing.JComboBox cbPagamento;
    private javax.swing.JComboBox cbSituacao;
    private net.sf.nachocalendar.components.DatePanel dtCalendario;
    private javax.swing.JMenuItem imCodigoAtendimento;
    private javax.swing.JMenuItem imSair;
    private javax.swing.JMenuItem imSalvarDia;
    private javax.swing.JMenuItem imSalvarHoraFinal;
    private javax.swing.JMenuItem imSalvarHoraInicial;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lbHoraSistema;
    private javax.swing.JMenu mnTempo;
    public javax.swing.JTabbedPane ptAtendimento;
    private javax.swing.JRadioButton rbInteiraAvaliacao;
    private javax.swing.JRadioButton rbMeiaAvaliacao;
    private javax.swing.JRadioButton rbNomeAluno;
    private javax.swing.JRadioButton rbNomeProfessor;
    private javax.swing.JTable tbDadosAluno;
    private javax.swing.JTable tbDadosAtendimento;
    private javax.swing.JTable tbDadosDia;
    private javax.swing.JTable tbDadosHoraFinal;
    private javax.swing.JTable tbDadosHoraInicial;
    private javax.swing.JTable tbDadosProfessor;
    private javax.swing.JFormattedTextField tfCelularAluno;
    private javax.swing.JFormattedTextField tfCelularAlunoAtendimento;
    private javax.swing.JFormattedTextField tfCelularProfessor;
    private javax.swing.JFormattedTextField tfCelularProfessorAtendimento;
    private javax.swing.JTextField tfCodigoAluno;
    private javax.swing.JTextField tfCodigoAlunoAtendimento;
    private javax.swing.JTextField tfCodigoAtendimento;
    private javax.swing.JTextField tfCodigoDia;
    private javax.swing.JTextField tfCodigoDiaAtendimento;
    private javax.swing.JTextField tfCodigoHoraFinal;
    private javax.swing.JTextField tfCodigoHoraFinalAtendimento;
    private javax.swing.JTextField tfCodigoHoraInicial;
    private javax.swing.JTextField tfCodigoHoraInicialAtendimento;
    private javax.swing.JTextField tfCodigoProfessor;
    private javax.swing.JTextField tfCodigoProfessorAtendimento;
    public javax.swing.JTextField tfDataAtendimento;
    private javax.swing.JTextField tfDataInserida;
    private javax.swing.JTextArea tfDescricaoAtendimento;
    private javax.swing.JFormattedTextField tfFixoAluno;
    private javax.swing.JFormattedTextField tfFixoAlunoAtendimento;
    private javax.swing.JFormattedTextField tfFixoProfessor;
    private javax.swing.JFormattedTextField tfFixoProfessorAtendimento;
    private javax.swing.JTextField tfNomeAluno;
    private javax.swing.JTextField tfNomeDia;
    private javax.swing.JTextField tfNomeDiaAtendimento;
    private javax.swing.JTextField tfNomeHoraFinal;
    private javax.swing.JTextField tfNomeHoraInicial;
    private javax.swing.JTextField tfNomeProfessor;
    private javax.swing.JTextField tfPesquisarAlunoNome;
    private javax.swing.JTextField tfPesquisarData;
    private javax.swing.JTextField tfPesquisarNomes;
    private javax.swing.JTextField tfPesquisarProfessorNome;
    private javax.swing.JTextField tfPrecoAtendimento;
    public org.netbeans.examples.lib.timerbean.Timer tmHoraSistema;
    // End of variables declaration//GEN-END:variables
}
