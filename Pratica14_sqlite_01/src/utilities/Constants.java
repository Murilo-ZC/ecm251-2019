package utilities;

public class Constants {
    public static final String URL_MEU_BANCO = "jdbc:sqlite:meu_banco.db";
    public static final int ID_NULO = -1;
    public static final String TABELA_USUARIO = "usuarios";
    public static final String SQL_INSERT_USUARIO = "INSERT INTO "+ TABELA_USUARIO + " VALUES (?,?,?,?);";
    public static final String getInsert(String table, int paramsCount){
        String sqlInsert = "INSERT INTO "+ table + " VALUES (";
        for (int i = 0; i < paramsCount-1; i++) {
            sqlInsert += "?,";
        }
        sqlInsert += "?);";
        return sqlInsert;
    }
    public static final String selectAll(String table){
        return "SELECT * FROM "+table+";";
    }
}
