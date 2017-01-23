package File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.LinkedList;
import java.util.Scanner;

import Bussiness_Logic.raw_logic;

public class data_handling 
{
	static String name = "Data Handling1.txt";
	static File f = new File(name);
	static FileWriter p;
	static Scanner s;
	static String str,o;
	static int i = 1;
	static String h;
	
	public static void insert(int d, String string) throws IOException
	{
		if(f.exists() == false)
		{
			f.createNewFile();
		}
		try 
		{
			p = new FileWriter(f,true);
			str = string.toString();
			p.append((char)d);
			p.append(string);
			p.close();
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String retrive(int k) throws FileNotFoundException
	{
		str = null;
		s = new Scanner(f);
		while(s.hasNext())
		{
			h = s.next();
			o = s.next();
			if(Integer.parseInt(h) == k)
			{
				str = o;
				break;
			}
		}
		return o;
	}

	public static String retrive()
	{
		String string = "";
		if(f.exists() == true)
		{
			try 
			{
				s = new Scanner(f);
				if(!s.hasNext())
				{
					System.out.println("Empty");
				}
				while(s.hasNext())
				{
					string = string + s.next() + "\n";
				}
			}
			catch (FileNotFoundException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		return string;	
	}

}
