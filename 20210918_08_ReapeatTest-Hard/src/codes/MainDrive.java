package codes;
import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("���� �Է�:");
		
		
		int inputNum = myScanner.nextInt();
		
//		�Է��� ���ڸ� �״�� ���ؾ��ϴ� ��츦 ���. inputNum�� �����ص���.
		int backUp = inputNum;
		
		int clapCount =0;
		while(true) {
			// ���ڸ� ���� ���Ѵ�
			int lastDigit = inputNum % 10;
			// ���ڸ��� 3/6/9���� Ȯ���Ѵ�.
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
				System.out.print("¦");
			}
		}

	}

}
