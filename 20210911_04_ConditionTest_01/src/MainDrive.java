
import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		double koreaScore, mathScore, englishScore,avgScore;
		Scanner myScanner = new Scanner(System.in);
		
		System.out.print("�������� :");
		koreaScore = myScanner.nextDouble();
		System.out.print("�������� :");
		mathScore = myScanner.nextDouble();
		System.out.print("�������� :");
		englishScore = myScanner.nextDouble();
//		��հ��� ���ϰ� ������ ����.
		avgScore = (koreaScore + mathScore + englishScore) /3;
		
		if(avgScore>=60) {
//			���G���� �ϳ��� 40���� ������?
			if(koreaScore<40||mathScore<40||englishScore<40) {
				System.out.println("�����̳׿�!");
			}else {
				System.out.println("�հ�!");
			}
		}else {
			System.out.println("���հ�!");
		}
	}

}
