import java.util.Scanner;
 
	public class Circle{

		public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("Enter radius as an integer: ");
		int r =input.nextInt();
		double pie = 3.14159;
		double area = pie *  r * r; 
		System. out.printf("The diameter of the circle is: %d%n", 2 * r);
		System. out.printf("The circumference of the circle is: %f%n", 2 * pie * r);
		System. out.printf("The area of the circle is: %f%n", pie * r * r);
		}
		}

