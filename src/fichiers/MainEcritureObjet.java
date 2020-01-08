package fichiers;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class MainEcritureObjet {

		public static void main(String[] args) throws FileNotFoundException, IOException {
					String name="datas.ser";
					
					Contact c1 = new Contact ("Lagaffe","Gaston",31);
					
					ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(name));
					oos.writeObject(c1);
					oos.close();
					
			
			
	}

}
