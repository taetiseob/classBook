import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
//		���� ���� ����.
//		���� �Է�? int�� �Է��� ����.
//		90�̻�? A
//		�߰� �˻�. 5�� �̳� : A+, �� �� : A0
//		80�̻�? B+
//		70�̻�? C0
//		70�̸� F
		Scanner myScanner = new Scanner(System.in);
		System.out.print("��� ���� �Է�: ");
		int avgScore = myScanner.nextInt();
		
//		�ݿ��� ���? int�� �Է¹���.
		
		
		if(avgScore>=90) {
			System.out.print("��� �Է� :");
			int rank = myScanner.nextInt();
			if(rank<=5) {
				System.out.println("A+");
			}else {
				System.out.println("A0");
			}
			
		}
		else if(avgScore>=80) {
			System.out.println("B+");
		}
		else if(avgScore>=70) {
			System.out.println("C0");
		}
		else {
			System.out.println("F");
		}
		
	}

}
