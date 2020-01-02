package snippet;
import java.io.*;

public class FileWrite {

	public static void main(String[] args) {
		try {
	  File file=new File("hello.txt");
	  FileReader fin=new FileReader(file);
	  BufferedReader br=new BufferedReader(fin);   //Buffered oriented
     // File file2=new File("file.txt");
	  FileWriter fout=new FileWriter("file.txt");
	  BufferedWriter bw=new BufferedWriter(fout);
	  String line;
	  while((line=br.readLine())!=null) {
		  if(line.length()>5)
			  bw.write(line+"\n");
	  }
	  br.close();
	  bw.close();
	  
	}
		
		catch(Exception e) {
			
		}
	}

}
