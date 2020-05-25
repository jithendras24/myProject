package javaTest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class MyProgram {

	public void CurrentDate() throws ParseException {
	
	//System Date	
		SimpleDateFormat sydtformat = new SimpleDateFormat("dd/MM/yyyy");
		Date SystemDate = new Date();
		System.out.println(SystemDate);
		String sysdate = sydtformat.format(SystemDate);
		System.out.println(sysdate);
	
	// Date and time input
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the date: ");
		String inputdate = in.nextLine();
													
		Date inputdate1 = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(inputdate);		
		SimpleDateFormat inputdtformat = new SimpleDateFormat("dd/MM/yyyy HH:mm");

		String printdate = inputdtformat.format(inputdate1);
		System.out.println("Date Entered: "+ printdate);
		
	//Comparision//	
		Date d1 = new SimpleDateFormat("dd/MM/yyyy").parse(sysdate);
		Date d2 = new SimpleDateFormat("dd/MM/yyyy").parse(printdate);
		

		if(d2.compareTo(d1)>0 || d1.equals(d2)) {
			System.out.println("User Date is Greater or Equal");
		}
		else {
			System.out.println("User Date is Lesser");
		}
	
	}
	public static void main(String[] args) throws ParseException {
		MyProgram obj = new MyProgram();
		obj.CurrentDate();
	}
}