package codes;
import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.print("�� ���ͷ� �Է�:");
		double rate = myScanner.nextDouble();
		
		
		double myMoney = 1000;

		

		int year=0;
		while(true) {
//			ex, 5% ���� : 1.05�� =? 1+%��/100
			myMoney = myMoney * (1 + rate/100);
			System.out.println(myMoney);
			year++;
			if(myMoney>=2000) {
				
				break;
			}
		}
		
		System.out.println("��⸸�� 2�谡 �Ѿ��°�");
		System.out.println(year);
	}

}
