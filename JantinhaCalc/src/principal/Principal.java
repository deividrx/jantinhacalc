package principal;

import java.io.IOException;

public class Principal {

	public static void main(String[] args) throws IOException {
		
		double[] vetorCustos = {3,4,2,3};
		int[][] numsPorcoes = {{2,1,1,1},{1,2,1,1},{2,2,0,3}};
		String comando;
		System.out.println(Utils.printLogo());
		
		do {
			System.out.print("administrador@jantinhacalc~$ ");
			comando = Utils.input.nextLine();
			
			switch (comando) {
			case "sair":
				System.out.println("Saindo do programa...");
				break;
			case "cp":
				Utils.alterarVetorC(vetorCustos);
				break;
			case "":
				break;
			default:
				System.out.println("[ERRO] Comando \"" + comando + "\" não encontrado!");
			}
			
			Utils.input.nextLine();
			
		} while (!comando.equals("sair"));
		
		Utils.input.close();
	}
	
}
