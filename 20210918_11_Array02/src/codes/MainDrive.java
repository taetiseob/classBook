package codes;
import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = new int[6];
		Scanner myScanner = new Scanner(System.in);
	
		//6번 동안 숫자를 입력 받는다
		for(int i=0; i<numArr.length; i++) {
			//각 자리에 제대로 된 숫자를 넣을때 까지 반복.
			while(true) {
				System.out.print(i+1+"번째 숫자를 입력하세용");
				int inputNum = myScanner.nextInt();
//				입력한 숫자가 1~45 사이인지?
				boolean isRangeOk = (1<=inputNum && inputNum<=45);
				//이미 입력된 숫자는 아닌지?
				boolean isDupOk = true;
//				numArr에 지금 입력한 숫자가 들어 있는가? => 들어있다 : 중복, 사용X (검사 실패)
				
				for (int myNum : numArr) {
					if(inputNum == myNum) {
//						같은숫자 발견! => 중복된 숫자.
//						중복검사 통과 X
						isDupOk = false;
						break;
					}
				}
				if(isRangeOk && isDupOk) {
					numArr[i] = inputNum;
					break;
				}else if(!isRangeOk) {
//					범위검사 탈락
					System.out.println("1~45의 숫자를 입력하세요");
				}else {
//					
					System.out.println("이미 입력된 숫자입니다.");
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