package dao;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConnectionFactory {

    public Connection getConexao() {
        Connection conexao = null;
        try {
            conexao = DriverManager.getConnection("jdbc:mysql://localhost/nome_banco", "user", "pass");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Não conseguiu conectar ao MySQL.\n" + erro, "<<<<Fedablio™>>>>", JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException(erro);
        }
        return conexao;
    }
}
