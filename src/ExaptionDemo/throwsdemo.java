package ExaptionDemo;

import java.util.InputMismatchException;
import java.util.Scanner;

class Divide{
	public void divison() throws ArithmeticException, InputMismatchException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter i=");
		int i = sc.nextInt();
		System.out.println("Enter j =");
		int j = sc.nextInt();
		int k = i/j;
		System.out.println(k);
	}
}
public class throwsdemo {
	public static void main(String[] args) {
		try {
			Divide d = new Divide();
			d.divison();
		}
		catch(ArithmeticException e) {
			System.out.println("cannot be zero");
		}
		catch(InputMismatchException e) {
			System.out.println("Cannot be string value");
		}
	}
}
