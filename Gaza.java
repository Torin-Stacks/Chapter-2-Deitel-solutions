import java.util.Scanner;

	public class Gaza{

		public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of stones used in building: ");
		int numberOfStones = input.nextInt(); //2300000
		System.out.print("Enter average weight of each stone used in building: ");
		double averageWeightOfEachStone = input.nextInt(); //15
		System.out.print("Enter number of years it took to build: ");
		double noOfYearsToBuild = input.nextInt(); //20

		double weightOfPyramid = averageWeightOfEachStone * numberOfStones;

		double howMuchWasBuiltByWeightEachYear =  weightOfPyramid / noOfYearsToBuild;

		double howMuchWasBuiltByWeightEachDay= howMuchWasBuiltByWeightEachYear / 365;
			
		double howMuchWasBuiltByWeightEachHour = howMuchWasBuiltByWeightEachDay / 24;

		double howMuchWasBuiltByWeightEachMinute = howMuchWasBuiltByWeightEachHour / 60;
		
		System.out.println("Weight of pyramid = " + weightOfPyramid);
		System.out.println("How much of the pyramid was built each year = " + howMuchWasBuiltByWeightEachYear);
		System.out.println("How much of the pyramid was built each day = " + howMuchWasBuiltByWeightEachDay);
		System.out.println("How much of the pyramid was built each hour = " + howMuchWasBuiltByWeightEachHour);
		System.out.println("How much of the pyramid was built each minute = " + howMuchWasBuiltByWeightEachMinute);

}	

}

