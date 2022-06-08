package day15Assignment.question2;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		EmployeeBonus employeeBonus = new EmployeeBonus();

		double bonus=0;
		try {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter joining Date format(DD/MM/YYYY)");
			String joiningdate=scanner.next();
			bonus = employeeBonus.takeJoiningDate(joiningdate);
		} catch (InvailedDate e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Total Bonus is " + bonus);

	}

}
