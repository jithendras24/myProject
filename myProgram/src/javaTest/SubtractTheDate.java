package javaTest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class SubtractTheDate {
	public static void main(String[] args) throws ParseException {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the date: ");
		String inputdate = in.nextLine();
		
		Date inputdate1 = new SimpleDateFormat("yyyy-MM-dd").parse(inputdate);		
		SimpleDateFormat inputdtformat = new SimpleDateFormat("yyyy-MM-dd");

		String printdate = inputdtformat.format(inputdate1);
		System.out.println("Date Entered: "+ printdate); 
		
		//Subtraction of date
		LocalDate date = LocalDate.parse(printdate);
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