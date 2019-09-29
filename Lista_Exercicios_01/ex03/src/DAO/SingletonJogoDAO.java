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
    //Método para inserir um novo jogo no sistema
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

    //Método para buscar jogos por nome
    public List<Jogo> getAllJogosByName(String nome){
        List<Jogo> resultados = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM meus_jogos WHERE nome LIKE '%" + nome + "%';");
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

    //Método para buscar jogos por plataforma
    public List<Jogo> getAllJogosByPlataform(String plataforma){
        List<Jogo> resultados = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM meus_jogos WHERE plataforma LIKE '%" + plataforma + "%';");
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

    //Método para buscar jogos por nome
    public List<Jogo> getAllJogosByGrender(String nome){
        List<Jogo> resultados = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM meus_jogos WHERE genero LIKE '%" + nome + "%';");
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
}
