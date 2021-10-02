package codes;
import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.print("연 수익률 입력:");
		double rate = myScanner.nextDouble();
		
		
		double myMoney = 1000;

		

		int year=0;
		while(true) {
//			ex, 5% 내돈 : 1.05배 =? 1+%값/100
			myMoney = myMoney * (1 + rate/100);
			System.out.println(myMoney);
			year++;
			if(myMoney>=2000) {
				
				break;
			}
		}
		
		System.out.println("몇년만에 2배가 넘었는가");
		System.out.println(year);
	}

}
