package modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VendaDAO {
    
    private static final String JDBC_DRIVER = "org.postgresql.Driver";
    private static final String JDBC_URL = "jdbc:postgresql://localhost:5432/loja_cartas";
    private static final String JDBC_USUARIO = "aluno";
    private static final String JDBC_SENHA = "ufc123";
    
    public List<Venda> listar() {
        List<Venda> resultado = new ArrayList<>();
        try {
            Class.forName(JDBC_DRIVER);
            Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USUARIO, JDBC_SENHA);
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT id, data_hora, usuario_id FROM venda");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Venda venda = new Venda();
                venda.setId(resultSet.getInt("id"));
                venda.setData_hora(resultSet.getString("data_hora"));
                venda.setUsuario_id(resultSet.getInt("usuario_id"));
                resultado.add(venda);
            }
            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException ex) {
            return resultado;
        }
        return resultado;
    }

     public Venda obter(int id) {
        Venda venda = null;
        try {
            Class.forName(JDBC_DRIVER);
            Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USUARIO, JDBC_SENHA);
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT id, data_hora, usuario_id FROM venda WHERE id = ?");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                venda = new Venda();
                venda.setId(resultSet.getInt("id"));
                venda.setData_hora(resultSet.getString("data_hora"));
                venda.setUsuario_id(resultSet.getInt("usario_id"));
            }
            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException ex) {
            return null;
        }
        return venda;
    }

    public boolean inserir(int id, String data_hora, int usuario_id) {
        boolean sucesso = false;
        try {
            Class.forName(JDBC_DRIVER);
            Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USUARIO, JDBC_SENHA);
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO venda (id, data_hora, usuario_id) VALUES (?, ?, ?)");
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, data_hora);
            preparedStatement.setInt(3, usuario_id);
            sucesso = (preparedStatement.executeUpdate() == 1);
            preparedStatement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException ex) {
            return false;
        }
        return sucesso;
    }

    public boolean atualizar(String data_hora, int usuario_id, int id) {
        boolean sucesso = false;
        try {
            Class.forName(JDBC_DRIVER);
            Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USUARIO, JDBC_SENHA);
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE venda SET data_hora = ?, usuario_id = ? WHERE id = ?");
            preparedStatement.setString(1, data_hora);
            preparedStatement.setInt(2, usuario_id);
            preparedStatement.setInt(3, id);
            sucesso = (preparedStatement.executeUpdate() == 1);
            preparedStatement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException ex) {
            return false;
        }
        return sucesso;
    }

        public boolean excluir(int id) {
        boolean sucesso = false;
        try {
            Class.forName(JDBC_DRIVER);
            Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USUARIO, JDBC_SENHA);
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM venda WHERE id = ?");
            preparedStatement.setInt(1, id);
            sucesso = (preparedStatement.executeUpdate() == 1);
            preparedStatement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException ex) {
            return false;
        }
        return sucesso;
    }

        public static void main(String[] args) {

    }
}
