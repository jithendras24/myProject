package testPrograms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateAndYearSubtract {

	public static void main(String[] args) throws ParseException {

//System Date	
		SimpleDateFormat sydtformat = new SimpleDateFormat("yyyy-MM-dd");
		Date SystemDate = new Date();
		String sysdate = sydtformat.format(SystemDate);
		System.out.println(sysdate);
	
//Subtraction of date		
	/*Local Date only parse dateString in the format "yyyy-MM-dd" so use next line
	 if the inputdate is in different format.
		DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd/MM/yyyy");*/
		
		LocalDate date = LocalDate.parse(sysdate);
		LocalDate returnvalue = date.minusDays(1);
		LocalDate returnvalue1 = returnvalue.minusYears(1);
		System.out.println(returnvalue1);
		String returnvalueString = returnvalue1.toString();
		
		SimpleDateFormat newformat = new SimpleDateFormat("yyyy-MM-dd");
		Date myDate = newformat.parse(returnvalueString);
		newformat.applyPattern("dd/MM/yyyy");
		String myDateString = newformat.format(myDate);
		System.out.println(myDateString);
	}

}
