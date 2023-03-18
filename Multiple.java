import java.util.Scanner;
 
	public class Multiple{

		public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("Enter two integers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		if ((number1 * 3) % (number2 * 2) == 0){
		System.out.println(number1 + "is a multiple of " + number2);
		}
		else {System.out.println(number1 + " is not a multiple of " + number2);}
}
}

