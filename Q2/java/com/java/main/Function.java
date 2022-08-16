package com.java.main;

import java.util.Scanner;

import com.java.jpa.display.Display;
import com.java.jpa.insert.Insert;

public class Function {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	Display d1=new Display();
	Insert i1=new Insert();
	boolean s=true;
	while(s)
	{
		System.out.println("Welcome");
		System.out.println("1).Insert 2.) Display 3.)Exit");
		System.out.println("Enter a Selection");
		int n=sc.nextInt();
		switch(n)
		{
		case 1: i1.insert();
		break;
		case 2: d1.display();
		break;
		case 3: s=false;
		System.out.println("Welcome Again Bye- Bye");
		break;
		}
	}
	
}
}
