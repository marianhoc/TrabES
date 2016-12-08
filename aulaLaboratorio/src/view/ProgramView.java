package view;

import java.util.Scanner;

public class ProgramView {
	static Scanner teclado = new Scanner(System.in);
	public static String paginaCriacaoMaterial(){
		
		System.out.println("------INCLUIR MATERIAL------");
		System.out.print("NOME: ");
		String nome = teclado.nextLine();
		System.out.print("PRE�O UNITARIO: ");
		String precoUnitario = teclado.nextLine();
		System.out.println("DESCRICAO: ");
		String descricao = teclado.nextLine();
                String pacote = nome+"@"+precoUnitario+"@"+descricao;
		return (pacote);
	}

    public static void paginaMaterialNaoPodeSerCriado() {
        System.out.println("MATERIAL NAO PODE SER SALVO");
    }

    public static void paginaMaterialCriadoComSucesso() {
        System.out.println("MATERIAL SALVO COM SUCESSO");
    }

    public static String paginaContinua() {
        System.out.println("DESEJA CONTINUAR?(S;N)");
        return teclado.nextLine();
    }
}
