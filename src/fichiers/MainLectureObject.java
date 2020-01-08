package fichiers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.io.ObjectInputStream;


public class MainLectureObject {



	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		String name="datas.ser";
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(name));
		Contact c = (Contact) ois.readObject();
		ois.close();
		System.out.println(c.getNom());
		
	}

}
