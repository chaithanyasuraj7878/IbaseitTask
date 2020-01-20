package com.ibaseit.studentdetailsinlist;

public class MainClass {
	public static void main(String[] args) {
		ListOfStudents obj = new ListOfStudents();

		obj.add(new StudentDetails("azure", 1, "pass"));

		System.out.println("working1");

		System.out.println("working2");
		obj.add(new StudentDetails("cortex", 4, "pass"));

		System.out.println("working3");
		obj.add(new StudentDetails("zubair", 2, "pass"));

		System.out.println("working4");
		// obj.remove(0);
		obj.update(new StudentDetails("danni", 8, "pass"));

		System.out.println("working5");
		obj.print();

		obj.remove(88);
		System.out.println("working 2");
	}

}
