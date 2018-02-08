package pers.xRay.JavaDataStructure.basic;

import java.util.Scanner;

import pers.xRay.JavaDataStructure.basic.StudentManagement.Student;

public class MyArrayClass {

	public static class MyNode{
		private int value=0;

		public void setValue(int input) {
			value=input;		
		}
		public int getValue() {
			return value;			
		}
	}
	
	public static class MyArray {
		
		private MyNode[] pool = new MyNode[100];
		private int size=0;
		
		public int getSize() {
			return size;
		}
		public MyArray() {
			init();
		}
		public void init() {
			MyNode root = new MyNode();
			root.setValue(0);
			pool[0]=root;
		}
		public void insert(int index, MyNode node) {
			int i=0;
			if (index > size || index <0) return;
			
			for (i=size; i>index; i--) {		
				pool[i+1]=pool[i];
			}
			pool[i+1] = node;
			size++;
		}		
		public void replace(int index, MyNode node) {
			if (index > size+1) return;			
			pool[index] = node;
		}
		public MyNode get(int index) {
			if (index>size) return null;
			return pool[index];
		}
		public void remove(int index) {
			if (index > size || index <= 0) return;
			
			for (int i=index; i<size; i++) {				
				pool[i]=pool[i+1];
			}
			size--;
		}
		public void view()		
		{
			for (int i=0; i<=size; i++) {
				System.out.println(i + " " + pool[i].getValue());
			}
		}
	}
}

//test edit on website
