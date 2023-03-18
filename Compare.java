import java.util.Scanner;

	public class Compare{
			
		public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("Enter one integer:  ");
		int number = input.nextInt();
		int square = number * number;
		if ((number > 100) && (square > 100)){
		System.out.println(number + " and its square " + square + " are greater than 100");
		}
		else{
		System.out.println(number + " and its square " + square + " are not greater than 100");
		}

}

}

