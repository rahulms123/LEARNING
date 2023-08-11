import java.util.Scanner;
public class Arithmetic {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 2 Numbers");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println(subtractNumbers(num1,num2));
		System.out.println("Enter 2 Numbers");
		 num1=scan.nextInt();
		 num2=scan.nextInt();
         System.out.println(multiplyNumbers(num1,num2));
		 System.out.println("Enter 2 Numbers");
		 num1=scan.nextInt();
		 num2=scan.nextInt();
	     System.out.println(divideNumbers(num1,num2));
		 System.out.println("Enter 2 Numbers");
		 num1=scan.nextInt();
		 num2=scan.nextInt();
	     System.out.println(finalRemainder(num1,num2));
		 System.out.println("Enter 2 Numbers");
		 num1=scan.nextInt();
		 num2=scan.nextInt();
	}
	 public static int subtractNumbers(int num1, int num2)
	 {
					 return num1-num2;
				 }
	 public static int multiplyNumbers(int num1, int num2)
	 {
					 return num1*num2;
	 }
	 public static int divideNumbers(int num1, int num2)
	 {
					 return num1/num2;
	 }
	 public static int finalRemainder(int num1, int num2)
	 {
					 return num1%num2;
	 }




}
