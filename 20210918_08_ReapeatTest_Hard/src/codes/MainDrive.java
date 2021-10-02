package codes;
import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		System.out.print("정수를 입력하세용 :");
		int inputNum = myScanner.nextInt();
		int result = 0;
		//입력한 숫자가 몇자리인지 파악 X => 무한반복 -> 탈출 형식
		while(true) {
			// 맨 뒷자리 숫자가 뭔지? 추출.
			// 맨 뒷자리 : 1의자리
			int lastDigit = inputNum % 10;
			
			result += lastDigit;
			
//			입력한 숫자에서 마지막자리 제거.
//			52146 => 정수 / 정수 -> 소수점 제거. => 52146/1- ->5214.6 => 5214로 변경
			inputNum /=10;
			
			if(inputNum == 0) {
				break;
			}

		}
		System.out.println(result);
		

	}

}
