package codes;

public class MainDrive {

	public static void main(String[] args) {
		int[] lottoNumbers = { 9,17,1,3,2,10 };
//		���� ���� ��ġ��
		
//		������ �� ���� �� => ��°�� �ݺ�. for��ø.
//		�� 6���� ���ڸ� �����ϱ� ���� for��
		for(int i=0; i<lottoNumbers.length; i++) {
			
//			�ΰ� ���� ������ ���������? �ȸ����� �ٲ�����.
			for(int j=0; j<lottoNumbers.length-1; j++) {
				if(lottoNumbers[j] > lottoNumbers[j+1]) {
//					������ ū�� �տ� �ִ� ��Ȳ => �ٲ�����
					int backUp = lottoNumbers[j];
					lottoNumbers[j] = lottoNumbers[j+1];
					lottoNumbers[j+1] = backUp;
				}
				
				
//		int temp = 0;		
//				while(lottoNumbers[i]<lottoNumbers[j]) {
//					temp = lottoNumbers[i];
//					lottoNumbers[i] = lottoNumbers[j];
//					lottoNumbers[j] = temp;
//				}
				
				
			}
		}
		
		for(int num : lottoNumbers) {
			System.out.println(num);
		}

	}

}
