package src.com.ibaseit.studentdetailsinlist;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		ListOfStudents obj = new ListOfStudents();
		Scanner sc = new Scanner(System.in);

		System.out.println("enter 1 for add operation");
		System.out.println("enter 2 for delete operation");
		System.out.println("enter 3 for read operation");
		int option = sc.nextInt();

		if (option == 1) {
			System.out.println("enter the student name");
			String name = sc.next();
			System.out.println("enter the student roll number");
			int roll = sc.nextInt();
			System.out.println("enter the student result");
			String result = sc.next();

			obj.add(new StudentDetails(name, roll, result));
           System.out.println("working");
          // MainClass.main(args);
		}

		else if (option == 2) {
			System.out.println("enter the student roll number");
			int index = sc.nextInt();
			index = index - 1;
			obj.remove(index);
			//MainClass.main(args);
		}

		else if (option == 3) {
			System.out.println("enter the student roll number");
			int index = sc.nextInt();
			//index = index - 1;
			obj.getStudent(index);
			//MainClass.main(args);
		}

		
	}
	
	
	
	

}
