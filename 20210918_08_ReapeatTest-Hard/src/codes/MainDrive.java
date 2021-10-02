package codes;
import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("정수 입력:");
		
		
		int inputNum = myScanner.nextInt();
		
//		입력한 숫자를 그대로 말해야하는 경우를 대비. inputNum을 복사해두자.
		int backUp = inputNum;
		
		int clapCount =0;
		while(true) {
			// 끝자리 부터 구한다
			int lastDigit = inputNum % 10;
			// 끝자리가 3/6/9인지 확인한다.
			if(lastDigit==3||lastDigit==6||lastDigit==9) {
				clapCount++;
			}
			
			
			inputNum /=10;
			if(inputNum==0) {
				break;
			}
			
		}
		if(clapCount ==0) {
			System.out.println(backUp);
		}else {
			for(int i=0; i<clapCount; i++) {
				System.out.print("짝");
			}
		}

	}

}
