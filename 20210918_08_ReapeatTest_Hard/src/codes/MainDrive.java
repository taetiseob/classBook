package codes;
import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� :");
		int inputNum = myScanner.nextInt();
		int result = 0;
		//�Է��� ���ڰ� ���ڸ����� �ľ� X => ���ѹݺ� -> Ż�� ����
		while(true) {
			// �� ���ڸ� ���ڰ� ����? ����.
			// �� ���ڸ� : 1���ڸ�
			int lastDigit = inputNum % 10;
			
			result += lastDigit;
			
//			�Է��� ���ڿ��� �������ڸ� ����.
//			52146 => ���� / ���� -> �Ҽ��� ����. => 52146/1- ->5214.6 => 5214�� ����
			inputNum /=10;
			
			if(inputNum == 0) {
				break;
			}

		}
		System.out.println(result);
		

	}

}
