package principal;

import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);
		double[] vetorCustos = {3,4,2,3};
		int[][] numsPorcoes = {{2,1,1,1},{1,2,1,1},{2,2,0,3}};
		String comando;
	
		System.out.println(Utils.printLogo());
		
		do {
			System.out.print("administrador@jantinhacalc~$ ");
			comando = input.nextLine();
			
			switch (comando) {
			case "exit":
				System.out.println("Saindo do programa...");
				break;
			default:
				System.out.println("[ERRO] Comando \"" + comando + "\" não encontrado!");
			}
			
		} while (!comando.equals("exit"));
		
		input.close();
	}
	
}
