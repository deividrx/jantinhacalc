package principal;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Utils {
	
	public static Scanner input = new Scanner(System.in);
	
	public static String printLogo() throws IOException {
		
		Path arquivoLogo = Paths.get("logo.txt");
		Scanner logo = new Scanner(arquivoLogo);
		String line = "";
		
		while (logo.hasNextLine()) {
		    line += " " + logo.nextLine() + "\n";
		}
		
		logo.close();
		return line;
	}
	
	public static void alterarVetorC(double[] vetorC) {
		char op;
		String escolha;
		
		System.out.print("Deseja alterar o custo de produ��o de todas as por��es [s/n]? ");
		op = Character.toUpperCase(input.next().charAt(0));
		
		while (op != 'S' && op != 'N') {
			System.out.print("[ERRO] Entrada inv�lida!\nInforme novamente: ");
			op = Character.toUpperCase(input.next().charAt(0));
		}
		
		if (op == 'S') {
			String porcao = "";
			System.out.println("Alterar por��es: ");
			for (int i = 0; i < vetorC.length; i++) {
				switch (i) {
				case 0:
					porcao = "Pre�o do arroz: ";
					break;
				case 1:
					porcao = "Pre�o da carne: ";
					break;
				case 2:
					porcao = "Pre�o da salada: ";
					break;
				case 3:
					porcao = "Pre�o do tropeiro: ";
					break;
				}
				
				System.out.print("*" + porcao);
				vetorC[i] = input.nextDouble();
			}
			
			input.nextLine();
			
		} else {
			
			do {
				System.out.println();
				int escolha2;
				System.out.println("====[Op��es]====");
				System.out.println("[1] - Arroz");
				System.out.println("[2] - Carne");
				System.out.println("[3] - Salada");
				System.out.println("[4] - Tropeiro");
				System.out.print("Qual por��o deseja alterar: ");
				escolha2 = input.nextInt();
				
				while(escolha2 != 1 && escolha2 != 2 && escolha2 != 3 && escolha2 != 4) {
					System.out.print("[ERRO]Entrada inv�lida, informe novamente: ");
					escolha2 = input.nextInt();
				}
				
				String porcao = "";
				
				switch (escolha2) {
				case 1:
					porcao = "Pre�o do arroz: ";
					break;
				case 2:
					porcao = "Pre�o da carne: ";
					break;
				case 3:
					porcao = "Pre�o da salada: ";
					break;
				case 4:
					porcao = "Pre�o do tropeiro: ";
					break;
				}
				System.out.print("#" + porcao);
				vetorC[(escolha2) - 1] = input.nextDouble();
				
				while (vetorC[(escolha2) - 1] < 0) {
					System.out.print("[ERRO] Entrada inv�lida!\nInforme novamanete: ");
					vetorC[(escolha2) - 1] = input.nextDouble();
				}
				
				input.nextLine();
				
				System.out.print("Deseja alterar o custo de mais alguma por��o: [s/n] ");
				escolha = input.nextLine();
				
				while (!escolha.equalsIgnoreCase("s") && !escolha.equalsIgnoreCase("n")) {
					System.out.print("[ERRO] Entrada inv�lida!\nInforme novamente: ");
					escolha = input.nextLine();
				}
				
			} while (escolha.equalsIgnoreCase("s"));
			
		}
		
	}
	
	public static void mostrarVetorC(double[] vetorC) {
		String porcao = "";
		for (int i = 0; i < vetorC.length; i++) {
			switch (i) {
			case 0:
				porcao = "Pre�o do arroz: ";
				break;
			case 1:
				porcao = "Pre�o da carne: ";
				break;
			case 2:
				porcao = "Pre�o da salada: ";
				break;
			case 3:
				porcao = "Pre�o do tropeiro: ";
				break;
			}
			System.out.println(porcao + "R$ " + vetorC[i]);
		}
		
		
	}

	public static void mostrarMatrizP(int[][] matrizP) {
		
		for (int i = 0; i < matrizP.length; i++) {
			System.out.println("#Prato: " + (i + 1));
			for (int j = 0; j < matrizP[0].length; j++) {
				String porcao = "";
				switch (j) {
				case 0:
					porcao = "Por��es de arroz: ";
					break;
				case 1:
					porcao = "Por��es de carne: ";
					break;
				case 2:
					porcao = "Por��es de salada: ";
					break;
				case 3:
					porcao = "Por��es de tropeiro: ";
					break;
				}
				
				System.out.println(porcao + matrizP[i][j]);
				
			}
		}
		
	}
}
