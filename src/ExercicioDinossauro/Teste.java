package ExercicioDinossauro;

import java.util.Scanner;


public class Teste {

	public static void main(String[] args) {
		Dinossauro skeep = new Dinossauro();
		Scanner sc = new Scanner(System.in);
		String textoMaiusculo;
		char letra=' ';
		while(true){
			System.out.println("Dino Skeep \n "
					+ "Digite: \n"
					+ "P -> para Pular \n"
					+ "A -> para Atirar \n"
					+ "C -> para Correr \n"
					+ "S -> parar Tomar Sol \n"
					+ "M -> para Comer \n"
					+ "O -> para Ficar na Sombra \n");
			textoMaiusculo = sc.nextLine().toUpperCase();
			letra = textoMaiusculo.charAt(0);
			//skeep.info();
			switch (letra) {
			case 'P': skeep.pular(); skeep.info();
				break;
			case 'A': skeep.atirar();skeep.info();
				break;
			case 'C': skeep.correr();skeep.info();
				break;
			case 'S': skeep.tomarSol(); skeep.info();
				break;
			case 'M': skeep.comer(); skeep.info();
				break;
			case 'O': skeep.ficarNaSombra();skeep.info();
				break;
			default:
				break;
			}	
		}
		
		

	}

}
