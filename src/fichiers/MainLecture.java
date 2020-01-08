package fichiers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainLecture {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String name="foo.txt";
		try (BufferedReader bf= new BufferedReader(new FileReader(name))) {
			String line = bf.readLine();
			System.out.println(line);
			while(line!=null) {
				line = bf.readLine();
				System.out.println(line);
			}
		}
	}

}
