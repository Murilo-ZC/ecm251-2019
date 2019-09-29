package DAO;

import Model.Jogo;
import Utilities.Constants;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SingletonJogoDAO {
    private Connection connection;
    private static SingletonJogoDAO instance = null;
    public static SingletonJogoDAO getInstance(){
        if(instance == null)
            instance = new SingletonJogoDAO(Constants.URL_MEU_BANCO);
        return instance;
    }
    private SingletonJogoDAO(String myConnection){
        try {
            connection = DriverManager.getConnection(myConnection);
            connection.setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
            connection = null;
        }
    }
    //Método para pegar toda a lista de usuários
    public List<Jogo> getAllJogos(){
        List<Jogo> resultados = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM meus_jogos;");
            while (resultSet.next()) {
                Jogo jogo = new Jogo(
                        resultSet.getString("nome"),
                        resultSet.getString("lancamento"),
                        resultSet.getString("genero"),
                        resultSet.getString("plataforma"),
                        resultSet.getInt("id")
                        );
                resultados.add(jogo);
            }
        }
        catch (Exception e){
            System.out.println("Algo deu errado!");
        }
        return resultados;
    }

    public void insertJogo(Jogo jogo) {
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement("INSERT INTO meus_jogos VALUES(null,?,?,?,?);");
            preparedStatement.setString(1, jogo.nome);
            preparedStatement.setString(2, jogo.plataforma);
            preparedStatement.setString(3, jogo.lancamento);
            preparedStatement.setString(4, jogo.genero);
            preparedStatement.execute();
            connection.commit();
        }
        catch (Exception e){
            System.out.println("Algo não ocorreu bem!");
            e.printStackTrace();
        }
    }
}
