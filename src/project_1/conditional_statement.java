package project_1;

import java.util.Scanner;

public class conditional_statement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a = ");
		int a = sc.nextInt();
		System.out.print("enter b =");
		int b = sc.nextInt();
		
		//1. Simple If
		if(a>b) {
			System.out.println("a is greater than b");
		}
		
		//2.ELse if
		if(a>b) {
			System.out.println("a is greater than b");
		}
		else {
			System.out.println("b is greater than a");
		}
		
		//3.Nested if
		System.out.println("enter age : ");
		int age = sc.nextInt();
		if(age>18)
		{
			if(age<60)
			{
				System.out.println("eligible for donate");
			}
			else {
				System.out.println("age is greater than 18 but less than 60");
			}
		}
		else {
			System.out.println("age is less than 18");
		}
		
		//4.Else if ladder
		System.out.println("enter marks : ");
		int marks = sc.nextInt();
		if(marks<35) {
			System.out.println("fail");
		}
		else if(marks>=35 && marks<=50) {
			System.out.println("D grade");
		}
		else if(marks>=51 && marks<=70) {
			System.out.println("C grade");
		}
		else if(marks>=71 && marks<=80) {
			System.out.println("B grade");
		}
		else if(marks>=81 && marks<=90) {
			System.out.println("A grade");
		}
		else if(marks>=91 && marks<=100) {
			System.out.println("A+ grade");
		}
		else
		{
			System.out.println("invalid input");
		}
		
		// 5. Switch case
		
		System.out.println("1. For English 2.For Hindi 3. For Gujarati "
				+ "Enter your option :");
		int lang = sc.nextInt();
		switch(lang) {
		case 1:
			System.out.println("you selected english");
			break;
		
		case 2:
			System.out.println("you selected hindi");
			break;
		
		case 3:
			System.out.println("you selected gujarati");
			break;
		
		default:
			System.out.println("invalid choice");
		}
		
	}
}
