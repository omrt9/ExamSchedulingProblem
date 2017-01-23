package File;

import java.io.File;
import java.io.IOException;

public class file_txt 
{
	public static void main(String[] args) throws IOException
	{
		File f = new File("SponeShift1.txt");
		if(f.exists() == true)
		{
			System.out.println("Yes");
		}
		
		f.createNewFile();
		System.out.println(f.getAbsolutePath());
		if(f.exists())
			System.out.println("t");
		
	}
}
