package codes;

public class MainDrive {

	public static void main(String[] args) {
		int[] lottoNumbers = { 9,17,1,3,2,10 };
//		정렬 로직 거치면
		
//		인접한 두 숫자 비교 => 통째로 반복. for중첩.
//		총 6개의 숫자를 정리하기 위한 for문
		for(int i=0; i<lottoNumbers.length; i++) {
			
//			두개 숫자 순서가 제대로인지? 안맞으면 바꿔주자.
			for(int j=0; j<lottoNumbers.length-1; j++) {
				if(lottoNumbers[j] > lottoNumbers[j+1]) {
//					순서가 큰게 앞에 있는 상황 => 바꿔주자
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
