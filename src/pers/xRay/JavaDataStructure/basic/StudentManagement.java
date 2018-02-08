package pers.xRay.JavaDataStructure.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {

	public static class Person {
		private	int num;
		private String name;
		private int age;
		private String gendar;

		public void setNum(int input) {
			num=input;
		}
		public void setName(String input) {
			name=input;
		}
		public void setAge(int input) {
			age=input;
		}
		public void setGendar(String input) {
			gendar=input;
		}
		public int getNum() {
			return num;
		}
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
		public String getGendar() {
			return gendar;
		}
	}
	
	public static class Subject{
		private String name;
		private int score;
		
		public void init(String in_name, int in_score) {
			name = in_name;
			score = in_score;
		}
	}
	
	public static class Student extends Person{
		private int score;
		
		public void setScore(int input) {
			score = input;
		}
		public int getScore() {
			return score;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> students = new ArrayList<Student>();		

		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("input choice(Q:quit/C:create/D:delete/V:view:");
			String choice = scan.next();
			
			switch (choice) {
			case "Q":
				System.exit(0);
			case "C":	
				Student new_student = new Student();
				System.out.print("please input number: ");	
				new_student.setNum(scan.nextInt());
				System.out.print("please input name: ");		
				new_student.setName(scan.next());
				System.out.print("please input age: ");		
				new_student.setAge(scan.nextInt());
				System.out.print("please input gendar: ");		
				new_student.setGendar(scan.next());
				System.out.print("please input Score: ");		
				new_student.setScore(scan.nextInt());
				students.add(new_student);
				break;
			case "V":
				System.out.printf("%5s \t %20s \t %5s \t %5s \t %5s\n","num", "name", "age", "gendar", "Score");
				for (int i=0; i<students.size(); i++) {
					System.out.printf("%5d \t %20s \t %5d \t %5s \t %5d\n", 
							students.get(i).getNum(),students.get(i).getName(),students.get(i).getAge(),
							students.get(i).getGendar(),students.get(i).getScore());
				}
				break;
			case "D":
				System.out.print("please input number for delete ");	
				int num = scan.nextInt();
				for (int i=0; i<students.size(); i++) {
					if (students.get(i).getNum() == num) students.remove(i);
				}
			}
		}
	}
}
