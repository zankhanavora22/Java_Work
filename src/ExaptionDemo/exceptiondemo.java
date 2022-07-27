package ExaptionDemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptiondemo {
	public static void main(String[] args) {
		int i,j,k;
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter i : ");
			i=sc.nextInt();
			System.out.println("Enter j : ");
			j=sc.nextInt();
			k=i/j;
			System.out.println("Division is :" +k);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		//catch(ArithmeticException e) {
			//System.out.println("Denominator cannot be zero");
	//	}
		//catch(InputMismatchException e) {
			//System.out.println("Denominator cannot be string");
		//}
	}
}
