package sample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class fileOperations 
		{
		    public static void main(String[] args) 
		    {
		        Path filePath = Paths.get("D:/", "temp", "test.txt");
		 
		        try
		        {
		            String content = Files.readString(filePath);
		 
		            System.out.println(content);
		        } 
		        catch (IOException e) 
		        {
		            e.printStackTrace();
		        }
		    }
		}
