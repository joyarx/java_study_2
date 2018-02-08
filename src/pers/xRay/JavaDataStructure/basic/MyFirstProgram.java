package pers.xRay.JavaDataStructure.basic;

import java.util.Scanner;

public class MyFirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		String gendar;
		int age;
		String str;
		String substr;
		
		Scanner s = new Scanner(System.in);
/*		
		System.out.println("please input name:");
		name = s.next();
		System.out.println("please input age:");
		age = s.nextInt();
		System.out.println("please input gendar:");
		gendar = s.next();

		if (gendar.compareTo("Male")==0) {
			System.out.print("Mr " + name + " is " + age + " years old.");
		}
		str = s.next();
		System.out.println(str);		
		for ( int i=0; i<str.length()-1; i++) {
			if (str.charAt(i)==str.charAt(i+1)) {
				System.out.printf("%c %c\n", str.charAt(i), str.charAt(i+1));
			}
		}			

		int i, j;
		for (i=0; i<str.length(); i++) {
			for (j=1; j<str.length()-i;j++) {
				if (str.charAt(i)!=str.charAt(i+j)){
					break;
				}
			}
			if (j>=2) {
				System.out.println(str.substring(i, i+j));
				i=i+j-1;
			}
		}
*/
		int arr[] = {2,3,5,7,8,3,4,5,7,96,43,4,2,0};
		int temp;
		
		for (int i=0; i<arr.length; i++) {
			for (int j=i+1; j<arr.length; j++)
				if (arr[i]>arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		float a=(float) 100.00;
		double b=10000.00;
		b=b+a;
		System.out.println(b);
		
		double x=134.00/277.00;
		System.out.println(x);
		
	}
	
  
}
