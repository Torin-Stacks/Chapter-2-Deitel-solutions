import java.util.Scanner;
 
	public class Separation{

		public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a five-digit integer: "); //12345
		int number = input.nextInt();
		int a = number % 10; //5
		int b = number / 10; //1234
		int c  = b % 10; //4
		int d  =b / 10; //123
		int e = d % 10; //3
		int f = d / 10; //12
		int g = f % 10; //2
		int h = f / 10; //1
		System.out.printf("%d   %d   %d   %d   %d%n", h, g, e, c, a);


}
}
