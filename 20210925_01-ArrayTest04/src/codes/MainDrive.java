package codes;

public class MainDrive {

	public static void main(String[] args) {
		
//		���� ������ ���� 6���� ����
		int[] myLottoNumbers = {4, 6, 12, 18, 21, 34};
		
//		��÷��ȣ 6���� ��� �迭.
		int[] winLottoNumbers = new int[6];
		
//		6�� ��÷ ���ڸ� ��÷�� for��.
		for(int i=0; i<winLottoNumbers.length; i++) {
			
//			�ǹٸ� ���ڰ� ���ö� ���� ������ ������ => ���� �ݺ�
			while(true) {
				
//				Math.random()*45+1
//				1~45�� �ϳ��� ������ ���� => ���� OK
				int randomNum = (int) (Math.random() * 45 +1);
//				�ߺ��˻�� ����� ������ �� ����. => ��÷��ȣ�� �� �ϴٰ�, �ߺ� �߰��ϸ� Ż��ó��.
				boolean isDuplOk = true;
				
				for(int winNum : winLottoNumbers) {
					if(randomNum == winNum) {
//						���� �̹��� ���� ���� ���ڴ�, ��÷��ȣ�� �ߺ��Ȱ� �ִ�. ���� �ȵ�.
						isDuplOk = false;
						break;
					}
				}
				if(isDuplOk) {
//					�ߺ��˻縦 ����ߴٸ�, ��÷��ȣ�� �������.
					winLottoNumbers[i] = randomNum;
//					���� ��÷���� ������ �̵�
					break;
				}
			}
		}
		
//		���ʽ� ��ȣ �ϳ� ����. => 1~45, ��÷��ȣ �ߺ�X
		int bonusNum = 0;
		while(true) {
			int randomNum = (int) (Math.random()*45+1);
			boolean isDuplOk = true;
			for(int winNum : winLottoNumbers) {
				if(randomNum == winNum) {
					isDuplOk = false;
					break;
				}
			}
			if(isDuplOk) {
				bonusNum = randomNum;
				break;
			}
		}
		
		bonusNum = 34;
		System.out.println("���ʽ� �ѹ� "+bonusNum);
		
//		{4, 6, 12, 18, 21, 34};
		winLottoNumbers[0] = 4;
		winLottoNumbers[1] = 6;
		winLottoNumbers[2] = 12;
		winLottoNumbers[3] = 18;
		winLottoNumbers[4] = 21;
		winLottoNumbers[5] = 24;
		
//		��÷��ȣ Ȯ�ο� for
		for(int winNum : winLottoNumbers) {
			System.out.println(winNum);
		}
//		�׷��� ����ΰ�? ���� ������ ��ΰ�?.
		int correctCount = 0;
//		�� ���ڸ� �ϳ��� �������� for
		for(int myNum : myLottoNumbers) {
//			��÷��ȣ�� �ϳ��� �������� for
			for(int winNum : winLottoNumbers) {
				
//				�� ���ڰ� ������?
				if(myNum == winNum)
					correctCount++;
				
			}
		}

		
//		���� ������ ���� �ٸ� ���
		if(correctCount == 6) {
			System.out.println("1��!");
		}else if( correctCount == 5) {
			
//			���� : ���ʽ� ��ȣ�� ����°�? �߰� �˻�. ������ 2��, �ƴϸ� 3��
			boolean isBonusCorrect = false;
			for(int myNum : myLottoNumbers) {
				if(myNum == bonusNum) {
//					�� ��ȣ��, ���ʽ� ��ȣ�� �ִ�.
					isBonusCorrect = true;
				}
			}
			if(isBonusCorrect) {
				System.out.println("2��! ���ʽ� ��ȣ ����!");
			}else {
				System.out.println("3��");
			}
			
		}else if(correctCount == 4) {
			System.out.println("4��");
		}else if(correctCount == 3) {
			System.out.println("5��");
		}else {
			System.out.println("��÷");
		}

	}

}
