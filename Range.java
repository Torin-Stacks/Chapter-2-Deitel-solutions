import java.util.Scanner;

	public class Range{
	
		public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("Enter three integers:  ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		int sum = a + b + c;
		int average = sum / 3;
		int product = a * b * c;

		//for lowest value, assuming a is the lowest

		if (b < a){
		a = b;
		}
		else if (c < a) {
		a = c;
		}
		else{
		a = a;
		}
		System.out.println("The lowest integer = " + a);


		//for highest value, assuming a is the highest
		
		if (b > a){
		a = b;
		}
		else {
		a = a;
		}
		
		if( c > a){   
		a = c;
		}
		else {
		a = a;
		}
		
		System.out.println("The highest integer = " + a);

		
		System.out.println("The sum of integers = " + sum);
		System.out.println("The average of integers = " + average);
		System.out.println("The product of integers = " + product);
}
}


