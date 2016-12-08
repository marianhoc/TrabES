package model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;

public class Material implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String nome;
    private String descricao;
    private double valor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Material(String values) {
        String[] val = values.split("@");
        
        this.nome = val[0];
        this.descricao = val[2];
        this.valor = Double.parseDouble(val[1]);
    }

    public boolean gravaObjeto() {
        try (FileWriter fw = new FileWriter("MATERIAIS.txt", true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw)) {
            out.println("NOME:      " + this.nome);
            out.println("VALOR:     " + this.valor);
            out.println("DESCRICAO: " + this.descricao);
            out.println("---------------------------------");
            out.close();
            return true;
        } catch (IOException e) {
            return false;
            //exception handling left as an exercise for the reader
        }
    }

}
