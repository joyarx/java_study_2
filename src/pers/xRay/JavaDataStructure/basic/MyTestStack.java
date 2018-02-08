package pers.xRay.JavaDataStructure.basic;

import java.util.Scanner;
import pers.xRay.JavaDataStructure.basic.MyArrayClass.*;

public class MyTestStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		MyArray adt = new MyArray();
		adt.init();
		
		while(true) {
			System.out.println("input choice(Q:quit/C:create/D:delete/V:view:");
			String choice = scan.next();
			
			switch (choice) {
			case "Q":
				System.exit(0);
			case "C":	
				MyNode node = new MyNode();
				System.out.print("please input value: ");	
				node.setValue(scan.nextInt());
				adt.insert(adt.getSize(), node);
				break;
			case "D":
				System.out.print("please input index for delete ");	
				int index = scan.nextInt();
				adt.remove(index);
				break;
			case "V":
				adt.view();
				break;
			}
		}
	}
}
