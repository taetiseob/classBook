package codes;

public class MainDrive {

	public static void main(String[] args) {
		
//		내가 선택한 숫자 6개를 저장
		int[] myLottoNumbers = {4, 6, 12, 18, 21, 34};
		
//		당첨번호 6개가 담길 배열.
		int[] winLottoNumbers = new int[6];
		
//		6개 당첨 숫자를 추첨할 for문.
		for(int i=0; i<winLottoNumbers.length; i++) {
			
//			옳바른 숫자가 나올때 까지 랜덤을 돌리기 => 무한 반복
			while(true) {
				
//				Math.random()*45+1
//				1~45중 하나의 랜덤값 추출 => 범위 OK
				int randomNum = (int) (Math.random() * 45 +1);
//				중복검사는 통과를 전제로 해 두자. => 당첨번호와 비교 하다가, 중복 발견하면 탈락처리.
				boolean isDuplOk = true;
				
				for(int winNum : winLottoNumbers) {
					if(randomNum == winNum) {
//						내가 이번에 뽑은 랜덤 숫자는, 당첨번호증 중복된게 있다. 쓰면 안됨.
						isDuplOk = false;
						break;
					}
				}
				if(isDuplOk) {
//					중복검사를 통과했다면, 당첨번호로 담아주자.
					winLottoNumbers[i] = randomNum;
//					다음 당첨숫자 뽑으러 이동
					break;
				}
			}
		}
		
//		보너스 번호 하나 추출. => 1~45, 당첨번호 중복X
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
		System.out.println("보너스 넘버 "+bonusNum);
		
//		{4, 6, 12, 18, 21, 34};
		winLottoNumbers[0] = 4;
		winLottoNumbers[1] = 6;
		winLottoNumbers[2] = 12;
		winLottoNumbers[3] = 18;
		winLottoNumbers[4] = 21;
		winLottoNumbers[5] = 24;
		
//		당첨번호 확인용 for
		for(int winNum : winLottoNumbers) {
			System.out.println(winNum);
		}
//		그래서 몇등인가? 맞춘 개수가 몇개인가?.
		int correctCount = 0;
//		내 숫자를 하나씩 꺼내보는 for
		for(int myNum : myLottoNumbers) {
//			당첨번호를 하나씩 꺼내보는 for
			for(int winNum : winLottoNumbers) {
				
//				두 숫자가 같은가?
				if(myNum == winNum)
					correctCount++;
				
			}
		}

		
//		맞춘 갯수에 따라 다른 출력
		if(correctCount == 6) {
			System.out.println("1등!");
		}else if( correctCount == 5) {
			
//			실제 : 보너스 번호를 맞췄는가? 추가 검사. 맞으면 2등, 아니면 3등
			boolean isBonusCorrect = false;
			for(int myNum : myLottoNumbers) {
				if(myNum == bonusNum) {
//					내 번호중, 보너스 번호가 있다.
					isBonusCorrect = true;
				}
			}
			if(isBonusCorrect) {
				System.out.println("2등! 보너스 번호 맞춤!");
			}else {
				System.out.println("3등");
			}
			
		}else if(correctCount == 4) {
			System.out.println("4등");
		}else if(correctCount == 3) {
			System.out.println("5등");
		}else {
			System.out.println("낙첨");
		}

	}

}
