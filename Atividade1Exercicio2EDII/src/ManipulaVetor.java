import java.util.Scanner;

public class ManipulaVetor {
	int numeros[] = new int[15];
	
	public void adicionar() {
		int valorEntrada = 0;
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite o " + (i+1) + "º valor.");
			valorEntrada = scanner.nextInt();
			numeros[i] = valorEntrada;
		}
	}
	
	public int[] imprimirCrescente() {
		int chave = 0;
		int[] numCresc = numeros;
		for (int i = 1; i < numCresc.length; i++){
			chave = numCresc[i];
		    int j = i - 1;
		    while (j > -1 && numCresc[j] > chave)
		    {
		    	numCresc[j + 1] = numCresc[j];
		        j--;
		    }
		    numCresc[j + 1] = chave;
		}
		return numCresc;
	}
	
	public int[] imprimirDecrescente() {
		int[] numDecresc = numeros;
		int chave = 0;
		for (int i = 1; i < numDecresc.length; i++){
			chave = numDecresc[i];
		    int j = i - 1;
		    while (j > -1 && numDecresc[j] < chave)
		    {
		    	numDecresc[j + 1] = numDecresc[j];
		        j--;
		    }
		    numDecresc[j + 1] = chave;
		}
		return numDecresc;
	}
	
	public void imprimirPares() {
		int soma = 0;
		String pares = "";
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i]%2==0) {
				pares += Integer.toString(numeros[i]) + ", ";
				soma += numeros[i];
			}
	 }
		System.out.println("Números pares: "+ pares);
		System.out.println("Resultado da soma dos pares: " + soma);
	}
	
	public void imprimirImpares() {
		int produto = 1;
		String impares = "";
		for (int i = 0; i < numeros.length; i++) {
			if((numeros[i]%2)!=0) {
				impares += Integer.toString(numeros[i]) + ", ";
				produto *= numeros[i];
			}
	 }
		System.out.println("Números pares: "+ impares);
		System.out.println("Resultado do produto dos impares: " + produto);
	}
}
