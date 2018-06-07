package app.controlepessoa.com.controledepessoa.domain.repositorio;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import app.controlepessoa.com.controledepessoa.domain.entidades.Cliente;

public class ClienteRepositorio {

    private SQLiteDatabase conexao;

    public ClienteRepositorio(SQLiteDatabase conexao){
        this.conexao = conexao;
    }

    public void inserir(Cliente cliente){

        ContentValues contentValues = new ContentValues();
        contentValues.put("NOME", cliente.nome);
        contentValues.put("ENDERECO", cliente.endereco);
        contentValues.put("EMAIL", cliente.email);
        contentValues.put("TELEFONE", cliente.telefone);

        conexao.insertOrThrow("cliente", null, contentValues);

    }

    public void excluir(int codigo){

        String[] parametros = new String[1];
        parametros[0] = String.valueOf(codigo);

        conexao.delete("cliente", "codigo=?", parametros);

    }

    public void alterar(Cliente cliente){

        ContentValues contentValues = new ContentValues();
        contentValues.put("NOME", cliente.nome);
        contentValues.put("ENDERECO", cliente.endereco);
        contentValues.put("EMAIL", cliente.email);
        contentValues.put("TELEFONE", cliente.telefone);

        String[] parametros = new String[1];
        parametros[0] = String.valueOf(cliente.codigo);

        conexao.update("cliente", contentValues, "codigo=?", parametros);

    }

    public List<Cliente> buscarTodos(){

        List<Cliente> clientes = new ArrayList<Cliente>();

        StringBuilder sql = new StringBuilder();
        sql.append("select codigo, nome, endereco, email, telefone");
        sql.append(" from cliente");

        Cursor resultado = conexao.rawQuery(sql.toString(),null);

        if (resultado.getCount() > 0){

            resultado.moveToFirst();

            do{

                Cliente cli = new Cliente();

                cli.codigo = resultado.getInt( resultado.getColumnIndexOrThrow("codigo") );
                cli.nome = resultado.getString( resultado.getColumnIndexOrThrow("nome") );
                cli.endereco = resultado.getString( resultado.getColumnIndexOrThrow("endereco") );
                cli.email = resultado.getString( resultado.getColumnIndexOrThrow("email") );
                cli.telefone = resultado.getString( resultado.getColumnIndexOrThrow("telefone") );

                clientes.add(cli);

            } while (resultado.moveToNext());

        }


        return clientes;
    }

    public Cliente buscarCliente(int codigo) {

        Cliente cliente = new Cliente();

        StringBuilder sql = new StringBuilder();
        sql.append("select codigo, nome, endereco, email, telefone");
        sql.append("from cliente");
        sql.append("where codigo=?");

        String[] parametros = new String[1];
        parametros[0] = String.valueOf(codigo);

        Cursor resultado = conexao.rawQuery(sql.toString(), parametros);

        if (resultado.getCount() > 0) {

            resultado.moveToFirst();

            cliente.codigo = resultado.getInt(resultado.getColumnIndexOrThrow("codigo"));
            cliente.nome = resultado.getString(resultado.getColumnIndexOrThrow("nome"));
            cliente.endereco = resultado.getString(resultado.getColumnIndexOrThrow("endereco"));
            cliente.email = resultado.getString(resultado.getColumnIndexOrThrow("email"));
            cliente.telefone = resultado.getString(resultado.getColumnIndexOrThrow("telefone"));

            return cliente;

        }

        return null;
    }
}
