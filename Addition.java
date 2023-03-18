import java.util.Scanner;
 
	public class Addition{
		

		public static void main(String[] args){
		
		int positive = 0;
		int negative = 0;
		int zero = 0;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter five integers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		int number4 = input.nextInt();
		int number5 = input.nextInt();

		
		if (number1 > 0){
		positive = positive + 1;
		}
		else if(number1 < 0)
		{negative = negative + 1;}
		else{zero = zero + 1;}
		
		if (number2 > 0){
		positive = positive + 1;}
		else if (number2 < 0)
		{negative = negative + 1;}
		else{zero = zero + 1;}
		
		if (number3 > 0){
		positive = positive + 1;}
		else if (number3 < 0)
		{negative = negative + 1;}
		else {zero = zero + 1;}
		
		if (number4 > 0){
		positive = positive + 1;}
		else if (number4 < 0)
		{negative = negative + 1;}
		else {zero = zero;}
		
		if (number5 > 0){
		positive = positive + 1;}
		else if (number5 < 0)
		{negative = negative + 1;}
		else {zero = zero;}
		
		
		
		System.out.println("The number of negative numbers = " + negative);
		System.out.println("The number of positive numbers = " + positive);
		System.out.println("The number of zeros = " + zero);

}
}
