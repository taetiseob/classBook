package codes;

public class MainDrive {

	public static void main(String[] args) {
		
		// ������ ���� 100ĭ¥�� �迭 ����.
		int[] numbers =  new int[100];
		
//		9���� �л��� �̸��� ������ String �迭 ����.
		String[] studentNames = new String[9];
		
//		numbers�� �� ��ĭ�� ���� 5�� ���.
		numbers[0] = 5;
		
//		�л��� �̸� ùĭ�� ���
		studentNames[0] = "TTs";
		
//		numbers�� ������ĭ�� 10�� ���.
		numbers[99] =10;
		
//		�л��� �̸� ������ĭ�� ���
		studentNames[8] = "ttst"; //�迭�� index-1ĭ ������ ������.
		
		System.out.println(numbers[99]);
		System.out.println(numbers[0]);
		System.out.println(studentNames[8]);
		
		int[] numArr = {2,3,4,5,6,7};
		System.out.println(numArr[3]);
 	}

}
