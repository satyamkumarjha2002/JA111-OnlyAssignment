package day15Assignment.question1;

import java.security.GuardedObject;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
	public Period dob() {
		Period diff=Period.between(LocalDate.now(), LocalDate.now());
    	Scanner scanner =new Scanner(System.in);
    	 DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
    	 System.out.println("Enter your Date Of Birth Format(dd/MM/yyyy)");
    	 String dateOfBirth=scanner.next();
    	 try {
    		 LocalDate DOB=LocalDate.parse(dateOfBirth,dateTimeFormatter);
        	 diff=Period.between(DOB,LocalDate.now());
        	if(diff.getYears()<0||diff.getDays()<0||diff.getMonths()<0) {
        		System.out.println("“Date should not be in Future”.");
        		diff=Period.between(LocalDate.now(), LocalDate.now());
        	}
		} catch (Exception e) {
		System.out.println(e.getMessage());
		}
    	 return diff;
    }

	public static void main(String[] args) {
        Main main=new Main();
       Period age=   main.dob();
       System.out.println("User age :- "+age.getYears()+" years "+age.getMonths()+" Month "+age.getDays()+" Day ");
	}

}
