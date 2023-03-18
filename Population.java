import java.util.Scanner;

	public class Population{
	
		public static void main(String[] args){

			Scanner input = new Scanner(System.in);
			System.out.print("Enter the current world population and world population growth rate: ");
			long currentPopulation = input.nextLong(); //7,000,000,000
			double growthRate = input.nextDouble();

			double estimatedWorldPopulationYear1 = currentPopulation * growthRate;
			
			double estimatedWorldPopulationYear2 = estimatedWorldPopulationYear1 * growthRate;

			double estimatedWorldPopulationYear3 = estimatedWorldPopulationYear2 * growthRate;

			double estimatedWorldPopulationYear4 = estimatedWorldPopulationYear3 * growthRate;

			double estimatedWorldPopulationYear5 = estimatedWorldPopulationYear4 * growthRate;
			
			System.out.println("Estimated world population for year 1 =  " +  estimatedWorldPopulationYear1);
			
			System.out.println("Estimated world population for year 2 =  " +  estimatedWorldPopulationYear2);

			System.out.println("Estimated world population for year 3 =  " +  estimatedWorldPopulationYear3);

			System.out.println("Estimated world population for year 4 =  " +  estimatedWorldPopulationYear4);

			System.out.println("Estimated world population for year 5 =  " +  estimatedWorldPopulationYear5);

}
}

