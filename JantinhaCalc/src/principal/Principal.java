package principal;

import java.io.IOException;

public class Principal {

	public static void main(String[] args) throws IOException {
		
		double[] vetorCustos = {3,4,2,3};
		int[][] numsPorcoes = {{2,1,1,1},{1,2,1,1},{2,2,0,3}};
		String comando;
		
		Logo logo = new Logo();
		logo.printLogo();
		
		do {
			System.out.print("administrador@jantinhacalc~$ ");
			comando = Utils.input.nextLine();
			
			switch (comando) {
			case "sair":
				System.out.println("Saindo do programa...");
				break;
			case "cp":
				System.out.println();
				Utils.alterarVetorC(vetorCustos);
				System.out.println();
				break;
			case "vc":
				System.out.println();
				Utils.mostrarVetorC(vetorCustos);
				System.out.println();
				break;
			case "vp":
				System.out.println();
				Utils.mostrarMatrizP(numsPorcoes);
				System.out.println();
				break;
			case "mcp":
				System.out.println();
				Utils.mostrarCustoPrato(numsPorcoes, vetorCustos);
				System.out.println();
				break;
			case "acp":
				System.out.println();
				Utils.alterarMatrizComposiçaoPrato(numsPorcoes);
				System.out.println();
				break;
			case "":
				break;
			default:
				System.out.println("[ERRO] Comando \"" + comando + "\" não encontrado!");
			}
			
		} while (!comando.equals("sair"));
		
		Utils.input.close();
	}
	
}
