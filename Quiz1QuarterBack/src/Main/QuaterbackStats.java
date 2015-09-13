package Main;
import java.util.Scanner; //imports scanner from util package

public class QuaterbackStats {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of passing attempts");
		double ATT=input.nextDouble();
		System.out.print("Enter the number of completed passes");
		double COMPS=input.nextDouble();
		System.out.print("Enter the number of passing yards)");
		double YDS=input.nextDouble();
		System.out.print("Enter the number of touchdowns");
		double TD=input.nextDouble();
		System.out.print("Enter the number of interceptions");
		double ITS=input.nextDouble();
		
		double a=(((COMPS/ATT)-.3)*5);
		double b=(((YDS/ATT)-3)*.25);
		double c=((TD/ATT)*20);
		double d=(2.375-((ITS/ATT)*25));
		double pasrat=(((a+b+c+d)/6)*100);
		
		System.out.printf("The quarterback's passer rating is %2f",pasrat);
		
	}
	

}
