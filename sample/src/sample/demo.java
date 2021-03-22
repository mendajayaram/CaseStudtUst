package sample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path p=Path.of("C:\\Users\\ustjd10\\Desktop\\sample.txt");	
		
		String str=Files.readString(p);
		
		System.out.println("string is ===="+str);
		
		Files.writeString(p, "    NEW", StandardOpenOption.APPEND);
		
		 str=Files.readString(p);
		System.out.println("string is ===="+str);
		
		

	}

}
