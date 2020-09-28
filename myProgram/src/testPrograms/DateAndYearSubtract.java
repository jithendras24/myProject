package testPrograms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class DateAndYearSubtract {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		//System Date	
		SimpleDateFormat sydtformat = new SimpleDateFormat("yyyy-MM-dd");
		Date SystemDate = new Date();
		String sysdate = sydtformat.format(SystemDate);
		System.out.println(sysdate);
		

		
		
		//Subtraction of date
		LocalDate date = LocalDate.parse(sysdate);
		LocalDate returnvalue = date.minusDays(1);
		System.out.println(returnvalue);
		String returnvalueString = returnvalue.toString();
		
		SimpleDateFormat newformat = new SimpleDateFormat("yyyy-MM-dd");
		Date myDate = newformat.parse(returnvalueString);
		newformat.applyPattern("dd/MM/yyyy");
		String myDateString = newformat.format(myDate);
		System.out.println(myDateString);
	}

}
