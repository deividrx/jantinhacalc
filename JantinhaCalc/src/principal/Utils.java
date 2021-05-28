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
		
		String escolha;
		
		do {
			char op;
			System.out.println("=============================");
			System.out.println("(a) - arroz  | (c) - carne");
			System.out.println("(s) - salada | (t) - troperio");
			System.out.print("Deseja alterar o preço de qual porção: ");
			op = Character.toUpperCase(input.next().charAt(0));
			
			System.out.println("Deseja alterar o custo de mais alguma porção: ");
			escolha = input.nextLine();
			
		} while (escolha.equalsIgnoreCase("sim"));
		
		
	}
	
}
