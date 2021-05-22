package principal;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws IOException {
		
		//Exibir o logo e comandos do programa
		Path arquivoLogo = Paths.get("logo.txt");
		Scanner logo = new Scanner(arquivoLogo);
		String line = "";
		
		while (logo.hasNextLine()) {
		    line += " " + logo.nextLine() + "\n";
		}
		
		System.out.println(line);
		logo.close();
		
		//Comandos
		Scanner input = new Scanner(System.in);
		String comando;
		
		do {
			System.out.print("administrador@jantinhacalc$ ");
			comando = input.nextLine();
			
			switch (comando) {
			case "avp":
				System.out.println(":)");
				break;
			case "mcp":
				System.out.println(";-;");
				break;
			case "cpp":
				System.out.println("hehehe");
				break;
			}
			
		} while (true);
		
	}
	
}
