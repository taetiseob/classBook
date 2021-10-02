package codes;
import java.util.Scanner;

public class MainDrive {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner myScanner = new Scanner(System.in);
//		System.out.println("숫자를 입력");
//		int maxiMum = myScanner.nextInt();
//		int result = 0;
//		for(int i=0; i<=maxiMum; i++) {
//			result+=i;
//		}
//		System.out.println(result);
//		
//		System.out.println("========================");
		
		int maxiMum;
		Scanner myScanner2 = new Scanner(System.in);
		System.out.println("두번째 숫자를 입력");
		maxiMum = myScanner2.nextInt();
		
		
		int count=0;
		int result2=0;
		while(count<maxiMum) {
			count++;
			result2+=count;
		}
		System.out.println(result2);
	}

}
