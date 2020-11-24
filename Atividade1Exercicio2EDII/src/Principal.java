public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManipulaVetor armazenaNumeros = new ManipulaVetor();
		armazenaNumeros.adicionar();
		int crescente []= armazenaNumeros.imprimirCrescente();
		String ordemCres = "";
		String ordemDecres = "";
		for (int i = 0; i < crescente.length; i++) {
			ordemCres += crescente[i] + " ";
		}
		System.out.println("Numeros em ordem crescente: " + ordemCres);
		
		int decrescente[]= armazenaNumeros.imprimirDecrescente();
		for (int i = 0; i < decrescente.length; i++) {
			ordemDecres += decrescente[i] + " ";
		}
		System.out.println("Numeros em ordem decrescente: " + ordemDecres);
		
		armazenaNumeros.imprimirPares();
		armazenaNumeros.imprimirImpares();
	}

}
