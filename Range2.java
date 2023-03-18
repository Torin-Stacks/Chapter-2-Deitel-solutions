import java.util.Scanner;

	public class Range2{
	
		public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter five integers:  ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		int e = input.nextInt();

		// for lowest value, assuming a is the lowest

		if (b < a){
		a = b;
		}
		else if (c < a) {
		a = c;
		}
		else if (d < a) {
		a = d;
		}
		else if (e < a) {
		a = e;
		}
		else {a = a;}
		
		System.out.println("The lowest value is " + a);
		
		// for highest value, assuming a is the highest

		if (b > a){
		 a = b;
		}
		else {a = a;}
		
		if( c > a){   
		a = c;
		}
		else {a = a;}
		
		if (d > a) {
		a = d;
		}
		else {a = a;}
		
		if (e > a) {
		a = e;
		}
		else {a = a;}
		
		System.out.println("The highest value is " + a);
		
		}
		}


		
		

