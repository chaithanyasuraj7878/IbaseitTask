package com.ibaseit.studentdetailsinlist;

public class StudentDetails {

	public StudentDetails(String studentname, int rollnumber, String result) {
		super();
		this.studentname = studentname;
		this.rollnumber = rollnumber;
		this.result = result;
	}

	String studentname;
	int rollnumber;
	String result;

	@Override
	public String toString() {
		return "StudentDetails [studentname=" + studentname + ", rollnumber=" + rollnumber + ", result=" + result + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		// it checks if the argument is of the type Customer by comparing the classes
		// of the passed argument and this object.
		// if(!(obj instanceof Customer)) return false; ---> avoid.
		if (obj == null || obj.getClass() != this.getClass())
			return false;

		// type casting of the argument.
		StudentDetails customer = (StudentDetails) obj;
		if (customer.getStudentname().equals(this.studentname) && (customer.getRollnumber() == this.rollnumber))
			return true;

		return false;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public int getRollnumber() {
		return rollnumber;
	}

	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}
