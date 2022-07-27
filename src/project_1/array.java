package project_1;

import java.util.Scanner;

public class array {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		for(int index=0;index<arr.length;index++) {
			System.out.println("Value of arr["+index+"]is" +arr[index]);
		}
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array :");
		int size = sc.nextInt();
		int a[]=new int[size];
		int sum=0;
		for(int i=0;i<a.length;i++) {
			System.out.print("enter element at index["+i+"] :");
			a[i] = sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println("Sum = "+sum);
		
		System.out.println("enter num = ");
		int num = sc.nextInt();
		int counter = 0;
		
		for(int i=0;i<a.length;i++) {
			if(num == a[i]) {
				counter++;
			}
		}
		if(counter == 1) {
			System.out.println("Found");
		}
		else {
			System.out.println("Not Found");
		}
		
		// sort in ascending order
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println();
		
		System.out.println("ascending order elements are :");
		for(int i = 0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
	}
}
