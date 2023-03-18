import java.util.Scanner;

	public class Arithmetic{
			
		public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("Enter two integers: ");
		int first= input.nextInt();
		int second = input.nextInt();

		int squareFirst = first * first;
		int squareSecond = second * second;
		System.out.printf("Square of first and second integer = %d and %d%n", squareFirst, squareSecond);
		int sum = squareFirst + squareSecond;
		int difference = squareFirst- second;
		System.out.printf("Sum of first and second integer = %d and difference of both integer = %d%n", sum, difference);

}

}


