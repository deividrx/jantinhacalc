package principal;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Utils {
	
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
	
	
}
