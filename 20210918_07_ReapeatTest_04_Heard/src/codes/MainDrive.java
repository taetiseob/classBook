package codes;
import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int input = myScanner.nextInt();
		boolean isPrimeNum = true;
//		������ �������������� ����� ����
		int divideNum = 0;
		
//		2 ~ num�������� �ϳ��ϳ� ��������. �����������°� �ֳ�? �Ǵ�.
		for(int i=2; i<input /2; i++) {
			if(input%i==0) {
//				������������ ���� �߰�! => �Ҽ��� �ƴ�
				divideNum = i;
				isPrimeNum = false;
				break;
			}
		}
		if(isPrimeNum) {
			System.out.println("�ѹ��� ������������ �ʾ����Ƿ� �Ҽ��� ����");
		}else {
			System.out.println(divideNum+"�� �������Ƿ�"+"�Ҽ��� �ƴ�");
		}
		

	}

}
