import java.util.Scanner;
public class HeartRatesTest{
public static void main(String[]args){
	Scanner input = new Scanner(System.in);
	
	System.out.println("What is your first name");
	String firstName = input.next();
	System.out.println("What is your last name");
	String lastName = input.next();
	System.out.println("What is your day of birth");
	int dayOfBirth = input.nextInt();
	System.out.println("What is your month of birth");
	int monthOfBirth = input.nextInt();
	System.out.println("What is your year of birth");
	int yearOfBirth = input.nextInt();


	HeartRates obj = new HeartRates(firstName, lastName, dayOfBirth, monthOfBirth, yearOfBirth);
//	obj.setpersonAge(calcAge);
//	obj.setpersonMaxRate(calcmax);
//	obj.setpersonTargetRate(calcTarget);



	
	
	System.out.printf("Your name is %s %n you're %d yrs old%n your heart max rate is %d and the target rate is %.2f", obj.getFName(), obj.personAge(), obj.personMaxRate(),obj.personTargetRate());
	

 	}
}