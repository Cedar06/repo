import java.util.Scanner;

public class Windchill {

	public static void main(String[] args) {
		final double CONS1 = 35.74;
		final double CONS2 = 0.6215;
		final double CONS3 = 35.75;
		final double CONS4 = 0.4275;
		final double CONS5 = 0.16;

		double tempIn = 0;
		double windspdIn = 0;

		double finTemp = 0;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a temperature (between -45 and 40 degrees): ");
		tempIn=input.nextDouble();
		if(!((tempIn>=-45)&&(tempIn<=40))) {
			System.out.println("Invalid temperature");
		}else {

			System.out.println("Enter the windspeed (between 5 and 60 mph): ");
			windspdIn=input.nextDouble();
			if(!((windspdIn>=5)&&(windspdIn<=60))) {
				System.out.println("Invalid windspeed");
			}else {

				finTemp = CONS1 + (CONS2*tempIn) - (CONS3*(Math.pow(windspdIn,CONS5))) +
						(CONS4*tempIn)*(Math.pow(windspdIn, CONS5));

				System.out.println("Wind chill temperature: " + finTemp + " degrees Fahrenheit");
			}
		}
		System.out.println("\nProgrammer: Alejandro Lazo");
	}

}