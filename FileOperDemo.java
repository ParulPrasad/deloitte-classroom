import java.io.*;

public class FileOperDemo {

	public static void main(String[] args) {
		try {
			File file=new File("hello.txt");
			FileInputStream fin=new FileInputStream(file); //Byte Oriented
			FileReader finr=new FileReader(file);
			int c;
			System.out.println("using byte oriented");
			while((c=fin.read())!=-1) {
				System.out.print((char)c);   //c gives ascii values hence typecasting to char
			}
			System.out.println("\nusing char oriented");
			while((c=finr.read())!=-1) {
				System.out.print((char)c); 
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
