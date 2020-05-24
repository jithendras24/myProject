package javaTest;
import java.util.Scanner;
public class StringToInteger {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value:");
		String a = in.nextLine();
		String digit = a.replaceAll("[^\\d.]","");
		System.out.println(digit);
		double b = Double.parseDouble(digit);
		int c = (int) b;
		System.out.println(c);
	}
}
