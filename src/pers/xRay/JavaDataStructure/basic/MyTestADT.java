package pers.xRay.JavaDataStructure.basic;

import java.util.Scanner;

import pers.xRay.JavaDataStructure.basic.MyArrayClass.MyNode;
import pers.xRay.JavaDataStructure.basic.MyStackClass.*;

public class MyTestADT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		MyStackClass adt = new MyStackClass();
		
		while(true) {
			System.out.println("input choice(q:quit/i:push/o:pop/V:view:");
			String choice = scan.next();
			
			switch (choice) {
			case "q":
				System.exit(0);
			case "i":	
				MyNode node = new MyNode();
				System.out.print("please input value: ");	
				node.setValue(scan.nextInt());
				adt.push(node);
				break;
			case "o":
				MyNode node2 = adt.pop();
				System.out.println(node2.getValue());
				break;
			case "v":
				adt.view();
				break;
			}
		}
	}
}
