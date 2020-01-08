package fichiers;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class MainEcriture {

	
	public static void main(String[] args) throws IOException {
		String name="foo.txt";
		Writer fichier = new FileWriter(name,true); //true si on veut append a chaque nouvelle boucle
		for (int i=0; i<10;i++) {
			fichier.write("Hello, world\n");
			
		}
		fichier.close();
		System.out.println("écriture");
	}


}
