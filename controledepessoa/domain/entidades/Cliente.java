package app.controlepessoa.com.controledepessoa.domain.entidades;

import java.io.Serializable;

public class Cliente implements Serializable{

    public int codigo;
    public String nome;
    public String endereco;
    public String email;
    public String telefone;

    public Cliente(){
        codigo = 0;
    }

}
