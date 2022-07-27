package project_1;

import java.util.Scanner;

class print1{
	public void run() {
		System.out.println("this is run method");
	}
}

public class demo {
	public static void main(String[] args) {
		print1 d = new print1();
		d.run();
		System.out.println("hello world");
		System.out.println("hello java");
		System.out.println("hello \"java\" again");
		
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter value of i= ");
		i=sc.nextInt();
		System.out.print("enter value of j= ");
		j=sc.nextInt();
		System.out.println("i= "+i);
		System.out.println("j= "+j);
		
		int k = i+j;
		System.out.println("Addition of i and j = "+k);
		System.out.println("subtraction of i and j="+(i-j));
		System.out.println("Multiplication of i and j="+(i*j));
		System.out.println("Division of i and j="+(i/j));
		System.out.println("Square of i="+(i*i));
		System.out.println("Square of j="+(j*j));
		
		
		int s1,s2,s3;
		System.out.println("enter sub1 mark :");
		s1=sc.nextInt();
		System.out.println("enter sub2 mark :");
		s2=sc.nextInt();
		System.out.println("enter sub3 mark :");
		s3=sc.nextInt();
		
		System.out.println("Average is : "+(s1+s2+s3/3));
		System.out.println("percentage is :"+((s1+s2+s3)*100)/300);
		float a,b;
		
		System.out.println("enter value of a=");
		a=sc.nextFloat();
		System.out.println("enter value of b=");
		b=sc.nextFloat();
		System.out.println("Addition of a and b is="+(a+b));
		
		System.out.println("enter character : ");
		char c = sc.next().charAt(0);
		System.out.println(c);
		
		
		
		
	}

}
