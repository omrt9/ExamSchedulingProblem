package Bussiness_Logic;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class raw_logic
{
	public LinkedList[] arr;
	public int n;
	public int[] ans;
	public raw_logic()
	{
		
	}
	
	public void set(LinkedList[] arr, int n, int[] ans)
	{
		this.arr = arr;
		this.n = n;
		this.ans = ans;
	}
	
	public raw_logic(int n)
	{
		this.n = n;
		arr = new LinkedList[n];
	}
	

	static Scanner in = new Scanner(System.in);

	/*
	public static void main(String[] agsr)
	{
		int l = 1;
		int top = 0;
		int ch;
		do
		{
			System.out.println("1)Create a new Graph\n2)View Adjecency List\n3)Insert a node or an edge\n4)Delete a vertex\n5)View Coloring\n6)EXIT: ");
			ch = in.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter the total number of subjects: ");
				n = in.nextInt();
				
				while(l == 1)
				{
					//create();
					System.out.println("Do you want to enter another pair?(1/0)");
					l = in.nextInt();
				}
				break;
				
			case 2:
				// print();
				break;
				
			case 3:
				//insert();
				break;
				
			case 4:
				delete();
				break;
				
			case 5:
				//greedyColoring();
				break;
				
			case 6:
				return;
			}
		}
		while(true);
	}
	*/
	
	public void create(int u, int v)
	{
		int q = 0;
		if(arr[u-1] == null)
		{
			arr[u-1] = new LinkedList();
		}
		if(arr[v-1] == null)
		{
			arr[v-1] = new LinkedList();
		}
		ListIterator a = arr[u-1].listIterator();
		while(a.hasNext())
		{
			if((int)a.next() == v-1)
			{
				q = 1;
			}
		}
		if(q == 0)
		{
			arr[u-1].add(v-1);
			arr[v-1].add(u-1);			
		}
	}
	
	public void insert()
	{
		n = n + 1;
		arr = Arrays.copyOf(arr, n);
	}
	
	public String color()
    {
        ans = new int[n];

        ans[0]  = 0;

        for (int u = 1; u < n; u++)
            ans[u] = -1;

        boolean available[] = new boolean[n];
        for (int color = 0; color < n; color++)
            available[color] = false;
 
        for (int u = 1; u < n; u++)
        {
        	if(arr[u] != null)
        	{
        		Iterator<Integer> it = arr[u].iterator() ;
            while (it.hasNext())
            {
                int i = it.next();
                if (ans[i] != -1)
                    available[ans[i]] = true;
            }

            int color;
            for(color = 0; color < n; color++)
                if (available[color] == false)
                    break;
 
            ans[u] = color;

            it = arr[u].iterator() ;
            while (it.hasNext())
            {
                int i = it.next();
                if (ans[i] != -1)
                {
                	System.out.println("JHii "+ i + " " + u);
                    available[ans[i]] = false;               	
                }

            }
        	}
        }
        String s = "";
        for (int u = 0; u < n; u++)
            s = s + "Vertex" + (u+1) + "--->Color" + ans[u] + "\n";
        return s;
    }
	
	public void print()
	{	
		for(int i = 0 ; i < n; i++)
		{
			int j;
			System.out.print(i);
			if(arr[i] != null)
			{
				j = 0;
				while(j < arr[i].size())
				{
					System.out.print("----->"+arr[i].get(j));
					j++;
				}
			}
			System.out.println();
		}
	}
	
	public void delete(int m, int n)
	{
		Iterator x = arr[m-1].iterator();
		while(x.hasNext())
		{
			if((int)x.next() == n-1)
			{
				x.remove();
			}
		}
		x = arr[n-1].iterator();
		while(x.hasNext())
		{
			if((int)x.next() == m-1)
			{
				x.remove();
			}
		}
	}
}
