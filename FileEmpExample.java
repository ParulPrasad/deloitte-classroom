package snippet;
import java.io.*;
import java.nio.*;


public class FileEmpExample{

	public static void main(String[] args)throws Exception {
		
		FileOutputStream fout=null;
		ObjectOutputStream oos=null;
		
		FileInputStream fin=null;
		ObjectInputStream ois=null;
		try {
			Emp eobj=new Emp(101,"Sameer",50000);
			fout=new FileOutputStream("emp.txt");
			oos=new ObjectOutputStream(fout);
			oos.writeObject(eobj);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			oos.close();
			fout.close();
		}
		
		try {
			fin=new FileInputStream("emp.txt");
			ois=new ObjectInputStream(fin);
			Emp eobj=(Emp)ois.readObject();
			System.out.println(eobj.toString());
			}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			ois.close();
			fin.close();
		}


	}

}
