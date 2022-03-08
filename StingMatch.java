package com.stringprog;

import java.util.Scanner;

public class StingMatch {

	public static void main(String[] args) {
		
		//Compare matchhash=new Compare();
		//matchhash.matchWithHash();
		
		//CompareWithoutHash match=new CompareWithoutHash();
		//match.matching();
		
		ArrayMatch check=new ArrayMatch();
		Scanner input=new Scanner(System.in);
		
		String[] arr= {"kapil","dhoni","rohith","koli","aswin","jadeja","harbajan sing","bumra"};
		
		System.out.println("Enter the name you want to search");
		String name=input.next();
		
		if((check.searchString(arr, name)))
		{
			System.out.println(name+" is present in given array");
		}
		else
		{
			System.out.println(name+" is not present in given array");
		}
		
		input.close();

	}

}
