package codes;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.print("ù��° ���� �Է�:");
		int num1 = myScanner.nextInt();
		
		System.out.print("�ι�° ���� �Է�:");
		int num2 = myScanner.nextInt();
		System.out.println(num1);
////		�ּҰ����(Least Common Multiple)�� ��?
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
		
//		�ִ�����(Greatest Common Factor) ��?
		int gcf = 0;
		for(int i=num1; i>=1; i--) {
			if(num1 % i ==0 && num2 %i==0) {
				
				gcf = i;
				break;
			}
		}
		
		
		
		System.out.println("�ִ����� :" + gcf);

	}

}
