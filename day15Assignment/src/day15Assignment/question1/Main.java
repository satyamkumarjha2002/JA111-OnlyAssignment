package day15Assignment.question1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
	public void dob() {
    	Scanner scanner =new Scanner(System.in);
    	 DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
    	 System.out.println("Enter your Date Of Birth");
    	 String dateOfBirth=scanner.next();
    	 try {
    		 LocalDate DOB=LocalDate.parse(dateOfBirth,dateTimeFormatter);
        	Period diff=Period.between(DOB,LocalDate.now());
        	if(diff.getYears()<0||diff.getDays()<0||diff.getMonths()<0) {
        		System.out.println("“Date should not be in Future”.");
        	}
		} catch (Exception e) {
		System.out.println(e.getMessage());
		}
    }

	public static void main(String[] args) {
        Main main=new Main();
        main.dob();
	}

}
