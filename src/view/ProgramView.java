package view;

import java.util.Scanner;

public class ProgramView {
	
	public static String paginaCriacaoMaterial(){
		Scanner teclado = new Scanner(System.in);
		System.out.println("-----INCLUIR MATERIAL------");
		System.out.print("NOME: ");
		String nome = teclado.next();
		System.out.print("PREÇO UNITARIO: ");
		String precoUnitario = teclado.next();
		System.out.print("DESCRICAO: ");
		String descricao = teclado.next();
		teclado.close();
		return (nome+","+precoUnitario+","+descricao);
	}
}
