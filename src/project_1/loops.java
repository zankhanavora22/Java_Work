package project_1;

public class loops {
	public static void main(String[] args) {
		System.out.println("For loop");
		for(int i=1;i<=5;i++) {
			System.out.println("i = "+i);
		}
		System.out.println("While loop");
		int j=1;
		while(j<=5) {
			System.out.println("j = "+j);
			j++;
		}
		System.out.println("do while loop");
		int k=1;
		
		do {
			System.out.println("k = "+k);
			k++;
		}
		while(k<=5);
		
		System.out.println("Pattern");
		for(int z=1;z<=5;z++) {
			for(int y=1;y<=z;y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int b=5;b>=1;b) {
			for(int c=5;c<=b;c--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
