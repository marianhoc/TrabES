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
	private int valor;
	
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
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public Material(String nome, int valor, String descricao){
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
		this.gravaObjeto();
	}
	
	private void gravaObjeto(){
		try(FileWriter fw = new FileWriter("trabESTest.txt", true);
			    BufferedWriter bw = new BufferedWriter(fw);
			    PrintWriter out = new PrintWriter(bw))
			{
			    out.println("NOME:      "+this.nome);
			    out.println("VALOR:     "+this.valor);		
			    out.println("DESCRICAO: "+this.descricao);
			    out.println("---------------------------------");
			    out.close();
			    System.out.println("OBJETO GRAVADO COM SUCESSO");
			} catch (IOException e) {
			    //exception handling left as an exercise for the reader
			}
	}
	
	
	
}
