package codes;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.print("첫번째 정수 입력:");
		int num1 = myScanner.nextInt();
		
		System.out.print("두번째 정수 입력:");
		int num2 = myScanner.nextInt();
		System.out.println(num1);
////		최소공배수(Least Common Multiple)가 얼마?
//		int lcm =0;
//		int i= num1;
//		while(true) {
//			
//			if(i%num1 == 0 && i%num2==0) {
//				
//				lcm = num1;
//				break;
//			}
//			i++;
//		}
//		
//		for(int i=num1; i<=num1*num2; i++) {
//			if(i%num1 == 0 && i%num2 ==0) {
//				lcm = i;
//				break;
//			}
//		}
		
//		최대공약수(Greatest Common Factor) 얼마?
		int gcf = 0;
		for(int i=num1; i>=1; i--) {
			if(num1 % i ==0 && num2 %i==0) {
				
				gcf = i;
				break;
			}
		}
		
		
		
		System.out.println("최대공약수 :" + gcf);

	}

}
