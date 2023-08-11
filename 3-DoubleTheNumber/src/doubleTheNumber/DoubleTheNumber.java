package doubleTheNumber;
import java.util.Scanner;
public class DoubleTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
System.out.println("Enter the number to be doubled");
int num=scan.nextInt();
System.out.println("This is double num " + num*2);
	}
public static int Number(int num)
{
	return num*2;
}

}