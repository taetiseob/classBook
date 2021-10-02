package codes;
import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myScanner = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 : " );
		int num1 = myScanner.nextInt();
		
		System.out.print("두번째 정수 입력 :");
		int num2 = myScanner.nextInt();

		for(int i=1; i<=num2; i++) {
			if(num1%i==0 && num2%i==0) {
				System.out.println(i);
			}
		}
		
		
	}

}
