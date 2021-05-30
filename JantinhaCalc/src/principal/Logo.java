package principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Logo {
	
	public void printLogo() throws IOException {
		InputStream is = getClass().getResourceAsStream("logo.txt");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);		
		
		String line;
		while ((line = br.readLine()) != null) {
		    System.out.println(line);
		}
		System.out.println();
	}

}
