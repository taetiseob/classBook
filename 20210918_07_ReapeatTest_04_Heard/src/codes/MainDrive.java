package codes;
import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = myScanner.nextInt();
		boolean isPrimeNum = true;
//		몇으로 나눠떨어졌는지 기록할 변수
		int divideNum = 0;
		
//		2 ~ num직전까지 하나하나 나눠보자. 나눠떨어지는게 있나? 판단.
		for(int i=2; i<input /2; i++) {
			if(input%i==0) {
//				나눠떨어지는 숫자 발견! => 소수가 아님
				divideNum = i;
				isPrimeNum = false;
				break;
			}
		}
		if(isPrimeNum) {
			System.out.println("한번도 나눠떨어지지 않았으므로 소수가 맞음");
		}else {
			System.out.println(divideNum+"로 떨어지므로"+"소수가 아님");
		}
		

	}

}
