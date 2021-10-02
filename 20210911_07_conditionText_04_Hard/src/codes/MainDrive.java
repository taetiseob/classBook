package codes;
import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		System.out.print("확인할 연도를 입력하시오 :");
//		윤년인지 궁금한 년도를 (정수로) 입력.
		int year = myScanner.nextInt();
		System.out.println(year);
//		if(year%4!=0) {
//			System.out.println("윤년이 아닙니다");
//		}else {
//			if(year%100 != 0) {
//				System.out.println("윤년");
//				System.out.println("4로는 나눠지지만, 100으로는 안나눠진다.");
//			}else {
//				//4로도 나눠지고 / 100으로도 나눠짐. => 400으로 나눠지는지 추가질문 필요
//				if(year%400 ==0) {
//					//4로도 나눠지고 /100으로도/400으로도 나눠짐.
//					System.out.println("윤년");
//					System.out.println("400으로 나눠진다.");
//				}else {
////					4로 /100으로 나눠지지만 400으로는 안나눠짐.
//					System.out.println("윤년 아님");
//					System.out.println("100으로 나눠지지만, 400으로는 안나눠진다.");
//				}
//			}
//		}
		
//		다른풀이법. => 제일 까다로운 경우부터 질문, 그게 아닐 경우 보완질문.
		if(year % 400 == 0) {
			System.out.println("윤년이다. 400으로 나눠짐");
		}
		else if(year % 100 == 0) {
			//400으로 안나눠짐 100으로는 나눠짐
			System.out.println("윤년이 아님. 100으로 나눠지고 400으로 안나눠짐");
		}
		else if(year % 4 == 0) {
//			400,100으로 안나눠지지만 4로는 나눠짐
			System.out.println("윤년 . 100으로 안나눠지고 4로 나눠짐");
		}else {
			System.out.println("윤년 아님. 4로 안나눠짐.");
		}
		
	}	
}

