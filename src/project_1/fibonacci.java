package project_1;

import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {
		/*int n,a=0,b=0,c=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n :");
		n=sc.nextInt();
		
		System.out.println("fibbonacci series:");
		
		for(int i =1;i<=n;i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println(a+"");
		}*/
		int r,sum=0,temp;
		int n=454;
		
		temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("palindrom");
		}
		else {
			System.out.println("not [alindrom");
		}
	}
}
