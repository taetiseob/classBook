package codes;
import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		System.out.print("Ȯ���� ������ �Է��Ͻÿ� :");
//		�������� �ñ��� �⵵�� (������) �Է�.
		int year = myScanner.nextInt();
		System.out.println(year);
//		if(year%4!=0) {
//			System.out.println("������ �ƴմϴ�");
//		}else {
//			if(year%100 != 0) {
//				System.out.println("����");
//				System.out.println("4�δ� ����������, 100���δ� �ȳ�������.");
//			}else {
//				//4�ε� �������� / 100���ε� ������. => 400���� ���������� �߰����� �ʿ�
//				if(year%400 ==0) {
//					//4�ε� �������� /100���ε�/400���ε� ������.
//					System.out.println("����");
//					System.out.println("400���� ��������.");
//				}else {
////					4�� /100���� ���������� 400���δ� �ȳ�����.
//					System.out.println("���� �ƴ�");
//					System.out.println("100���� ����������, 400���δ� �ȳ�������.");
//				}
//			}
//		}
		
//		�ٸ�Ǯ�̹�. => ���� ��ٷο� ������ ����, �װ� �ƴ� ��� ��������.
		if(year % 400 == 0) {
			System.out.println("�����̴�. 400���� ������");
		}
		else if(year % 100 == 0) {
			//400���� �ȳ����� 100���δ� ������
			System.out.println("������ �ƴ�. 100���� �������� 400���� �ȳ�����");
		}
		else if(year % 4 == 0) {
//			400,100���� �ȳ��������� 4�δ� ������
			System.out.println("���� . 100���� �ȳ������� 4�� ������");
		}else {
			System.out.println("���� �ƴ�. 4�� �ȳ�����.");
		}
		
	}	
}

