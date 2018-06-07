package app.controlepessoa.com.controledepessoa.database;

public class ScriptDLL {

    public static String getCreateTableCliente(){

        StringBuilder sql = new StringBuilder();

        sql.append("create table if not exists cliente (");
        sql.append("codigo integer primary key autoincrement not null,");
        sql.append("nome varchar(250) not null default (''),");
        sql.append("endereco varchar(255) not null default (''),");
        sql.append("email varchar(200) not null default (''),");
        sql.append("telefone varchar(20) not null default ('') )");

        return sql.toString();
    }
}
