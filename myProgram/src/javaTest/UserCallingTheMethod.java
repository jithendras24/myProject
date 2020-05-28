package javaTest;
import java.util.Scanner;
public class UserCallingTheMethod {
	public void Method1() {
		System.out.println("User entered Yes");
	}
	public void Method2() {
		System.out.println("User enterd No");
	}
	public static void main(String[] args) {
		UserCallingTheMethod obj = new UserCallingTheMethod();
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter yes or no: ");
		String input = in.nextLine();
		
		if(input.equalsIgnoreCase("yes")) {
			obj.Method1();
		}
		
		else if (input.equalsIgnoreCase("no")){
			obj.Method2();
		}
			
	}
}