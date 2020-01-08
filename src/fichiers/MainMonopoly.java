package fichiers;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Writer;

public class MainMonopoly {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		String[] cases = new String[40];
		
		String name="monopoly.txt";
		String newFile="cases_du_monopoly.txt";
		try (BufferedReader bf= new BufferedReader(new FileReader(name));Writer fichier = new FileWriter(newFile)) {
			
//		for(int i=0;i<40;i++) {
//			String line = bf.readLine();
//			String[] temp = line.split(";");
//			cases[i]=temp[2];
//			}
//		
//		for (int i=0; i<40;i++) {
//			fichier.write("Case "+(i+1)+" "+cases[i]+"\n");
			
			String line = bf.readLine();
			while((line = bf.readLine()) !=null) {
				String[] temp = line.split(";");
				fichier.write("Case "+temp[2]+"\n");
		}
		fichier.close();
		System.out.println("écriture");
	}
		
		}
	

}
