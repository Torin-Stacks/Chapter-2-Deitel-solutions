import java.util.Scanner;
	
	public class Bmi{
	
		public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("please enter your weight in pounds: ");
		double weight = input.nextDouble();
		weight = weight * 0.45359237;
		System.out.print("Please enter your height in inches: ");
		double height = input.nextDouble();
		height = height * 0.0254;
		double bmi = weight / (height * height);
		System.out.println("Your BMI is " + bmi);
		}
}

