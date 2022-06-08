package day15Assignment.question2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class EmployeeBonus {
 public double takeJoiningDate(String date) throws InvailedDate {
	 double bonus=0;
	DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
	try {
		LocalDate localDate=LocalDate.parse(date,dateTimeFormatter);
		Period period=Period.between(localDate, LocalDate.now());
		if(period.getYears()<0||period.getMonths()<0||period.getDays()<0) {
			InvailedDate invailedDate = new InvailedDate();
			throw invailedDate;
		}else {
			if(period.getYears()>=2) {
				bonus=10000;
			}else if(period.getYears()>=1&&period.getYears()<2) {
				bonus=8000;
			}else {
				bonus=5000;
			}
		}
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	return bonus;
 }
}
