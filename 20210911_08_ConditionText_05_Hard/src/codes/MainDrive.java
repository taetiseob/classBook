package codes;
import java.util.Scanner;

public class MainDrive {
	
	public static void main(String[] args) {
//		 TODO Auto-generated method stub
//		������ �ݾ��� �Է¹���.
		Scanner myScanner = new Scanner(System.in);
		
		System.out.print("���� �ݾ� �Է�:");
		int pay = myScanner.nextInt();
		double discount = 0;
//		if(pay>=100000) {
//			discount = pay * 0.2;
//		}else if(pay>50000) {
//			discount = pay * 0.1;
//		}else if(pay>10000) {
//			discount = pay * 0.05;
//		}else {
//			discount = 0;
//		}
		if(pay<10000) {
			discount = 0;
		}else if(pay<50000){
			discount = pay * 0.05;
		}else if(pay<100000) {
			discount = pay * 0.1;
		}else {
			discount = pay * 0.2;
		}
		
//		���� �ݾ��� ������ �����ϴ� ����
		
		
//		�ݾ׿� ���� ���� �ݾ��� ���� (if)
//		ex. 5% => discount = ���αݾ� 5% ���
//		��츶�� ���� ����ؼ� ����
		
//		�� ���αݾ� ���
		System.out.println("���� �ݾ� : "+ (int)discount +"��");
	}
}
