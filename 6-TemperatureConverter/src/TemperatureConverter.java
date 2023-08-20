import java.util.Scanner;

public class TemperatureConverter {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the temperature in degree-F");
	double f=scan.nextDouble();
	TemperatureConverter temperatureConverter=new TemperatureConverter();
	double tempincelcius=temperatureConverter.convertureFahrenheitToCelsius(f);
	System.out.println(tempincelcius);
}
public double convertureFahrenheitToCelsius(double fahrenheit) {
	double celcius=(fahrenheit-32)*5/9;
	return celcius;
	
}
}
