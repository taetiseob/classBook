package codes;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("숫자를 입력");
		int input = myScanner.nextInt();
		int result = 1;
		for(int i=1; i<=input; i++) {
			result*=3;
		}
		System.out.println(result);
	}

}
