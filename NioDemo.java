package snippet;
import java.io.*;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class NioDemo {

	public static void main(String[] args) {
		try {
			//Files.lines(Paths.get("hello.txt")).forEach(System.out::println);
			//Files.list(Paths.get(".")).forEach(System.out::println);
			//Files.list(Paths.get("hello.txt")).filter(s->s.toString().endsWith(".txt")).forEach(System.out::println);
			Files.lines(Paths.get("hello.txt")).filter(s->s.toString().length()>15).forEach(System.out::println);
			Files.lines(Paths.get("hello.txt")).filter(s->s.toString().length()>15).map(String::toUpperCase).forEach(System.out::println);
			Files.lines(Paths.get("hello.txt")).filter(s->(s.toString().split(" ")).length>=3).map(String::toUpperCase).forEach(System.out::println);
		    
		
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
