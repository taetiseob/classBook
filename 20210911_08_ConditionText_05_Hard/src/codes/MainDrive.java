package codes;
import java.util.Scanner;

public class MainDrive {
	
	public static void main(String[] args) {
//		 TODO Auto-generated method stub
//		쇼핑한 금액을 입력받자.
		Scanner myScanner = new Scanner(System.in);
		
		System.out.print("쇼핑 금액 입력:");
		int pay = myScanner.nextInt();
		double discount = 0;
//		if(pay>=100000) {
//			discount = pay * 0.2;
//		}else if(pay>50000) {
//			discount = pay * 0.1;
//		}else if(pay>10000) {
//			discount = pay * 0.05;
//		}else {
//			discount = 0;
//		}
		if(pay<10000) {
			discount = 0;
		}else if(pay<50000){
			discount = pay * 0.05;
		}else if(pay<100000) {
			discount = pay * 0.1;
		}else {
			discount = pay * 0.2;
		}
		
//		할인 금액이 얼마인지 저장하는 변수
		
		
//		금액에 따른 할인 금액을 저장 (if)
//		ex. 5% => discount = 할인금액 5% 계산
//		경우마다 각각 계산해서 대입
		
//		총 할인금액 출력
		System.out.println("할인 금액 : "+ (int)discount +"원");
	}
}
