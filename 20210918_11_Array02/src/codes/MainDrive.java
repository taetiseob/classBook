package codes;
import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = new int[6];
		Scanner myScanner = new Scanner(System.in);
	
		//6�� ���� ���ڸ� �Է� �޴´�
		for(int i=0; i<numArr.length; i++) {
			//�� �ڸ��� ����� �� ���ڸ� ������ ���� �ݺ�.
			while(true) {
				System.out.print(i+1+"��° ���ڸ� �Է��ϼ���");
				int inputNum = myScanner.nextInt();
//				�Է��� ���ڰ� 1~45 ��������?
				boolean isRangeOk = (1<=inputNum && inputNum<=45);
				//�̹� �Էµ� ���ڴ� �ƴ���?
				boolean isDupOk = true;
//				numArr�� ���� �Է��� ���ڰ� ��� �ִ°�? => ����ִ� : �ߺ�, ���X (�˻� ����)
				
				for (int myNum : numArr) {
					if(inputNum == myNum) {
//						�������� �߰�! => �ߺ��� ����.
//						�ߺ��˻� ��� X
						isDupOk = false;
						break;
					}
				}
				if(isRangeOk && isDupOk) {
					numArr[i] = inputNum;
					break;
				}else if(!isRangeOk) {
//					�����˻� Ż��
					System.out.println("1~45�� ���ڸ� �Է��ϼ���");
				}else {
//					
					System.out.println("�̹� �Էµ� �����Դϴ�.");
				}
//				
				
				
//				if(inputNum<45) {
//					numArr[i] = inputNum;
//					break;
//				}
			}
			
			
		}
		
		for(int num : numArr) {
			System.out.println(num);
		}
	}
}