import java.util.Scanner;

public class Registros {
	String alunos[] = new String[5];
	float notas1[] = new float [5];
	float notas2[] = new float [5];
	float medias[] = new float [5];
	boolean situacao[] = new boolean [5];
	
	public void adicionarAluno() {
		String nome = "";
		float nota = 0;
		float nota2 = 0;
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < alunos.length; i++) {
			System.out.println("Digite o nome do " + (i+1) + "º aluno.");
			nome = scanner.nextLine();
			alunos[i] = nome;
			
			System.out.println("Digite a primeira nota.");
			nota = scanner.nextFloat();
			scanner.nextLine();
			notas1[i] = nota;
			
			System.out.println("Digite a segunda nota.");
			nota2 = scanner.nextFloat();
			scanner.nextLine();
			notas2[i] = nota2;
			
			
		}
	}
	
	public void calcular() {
		for (int i = 0; i < 5; i++) {
			medias[i] = (notas1[i] + notas2[i])/2;
			if (medias[i]< 6) {
				situacao[i] = false;
			}
			if (medias[i]>=6) {
				situacao[i] = true;
			}
		}
	}
	public void imprimir() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Aluno: " + alunos[i]);
			System.out.println("Notas: \nNota 1: " + notas1[i] + "\nNota 2: " + notas2[i]);
			System.out.println("Media: " + medias[i]);
			if (situacao[i]) {
				System.out.println("Aluno aprovado!\n");
			}else {
				System.out.println("Aluno reprovado!\n");
			}
		}
	}
}
