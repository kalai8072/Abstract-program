package org.Abstract;

public class parent extends teacher {

	public void parentName() {

		System.out.println("the parent name is kavin");
	}

	public void parentAge() {

		System.out.println("the Parent age is 30");
	}

	@Override
	public void adminName() {
		// TODO Auto-generated method stub

	}

	@Override
	public void adminAge() {
		// TODO Auto-generated method stub
	}

	public static void main(String[] args) {

		parent names = new parent();
		names.adminAge();
		names.adminName();
		names.parentAge();
		names.parentName();
		names.teacherName();
		names.teacherAge();
	}

}
