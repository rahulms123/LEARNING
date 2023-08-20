import java.util.Scanner;
public class JourneyCalculaterApp{
public static void main(String[] args)
		{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Speed And Time To Calculate Distance");
		double speed=scan.nextDouble();
		double time=scan.nextDouble();
		JourneyCalculater journeyCalculater=new JourneyCalculater();
		double distance=journeyCalculater.calculateDistance(speed,time);
		System.out.println(distance);
		}
		}



