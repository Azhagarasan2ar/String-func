package com.stringprog;

import java.util.Scanner;

public class Compare {
	String string1;
	String string2;
	Scanner sc=new Scanner(System.in);
	
	Compare()
	{
		System.out.println("Enter the first string ");
		string1=sc.next();
		System.out.println("Hash code: "+string1.hashCode());
		
		System.out.println("Enter the second string");
		string2=sc.next();
		System.out.println("Hash code: "+string2.hashCode());
	}
	
	void matchWithHash()
	{
		if(string1.length()==string2.length())
		{
			if(string1.hashCode()==string2.hashCode())
			{
				int count=0;
				int i=0;
				int len=string1.length();
				while(i<len)
				{
					if(string1.charAt(i)==string2.charAt(i))
					{
						count+=1;
					}
					i++;
				}
				if(count==len)
				{
					System.out.println("String Match");
				}
				else
				{
					System.out.println("String Mismatch");

				}
			}
			else
			{
				System.out.println("String Mismatch");

			}
		}
		else
		{
			System.out.println("String Mismatch");

		}
	}
}
