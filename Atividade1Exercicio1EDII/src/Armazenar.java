import java.util.Scanner;

public class Armazenar {
String[] nomes = new String[5];

public void adicionar() {
	String nome = "";
	Scanner scanner = new Scanner(System.in);
	for (int i = 0; i < nomes.length; i++) {
		System.out.println("Digite o " + (i+1) + "º nome.");
		nome = scanner.nextLine();
		nomes[i] = nome;
	}
}
public void buscar() {
	String nome = "";
	Scanner scanner = new Scanner(System.in);
	System.out.println("Digite o nome a ser buscado.");
	nome = scanner.nextLine();
	boolean contem = false;
	
	for (int i = 0; i < nomes.length; i++) {
		if(nomes[i].equals(nome)){
			System.out.println("Nome encontrado! Posição: "+(i+1));
			contem = true;
		    break;
		    }		
	}
	if(!contem) {
		System.out.println("Nome não encontrado!");
	}
}
}
