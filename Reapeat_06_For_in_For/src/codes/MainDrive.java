package codes;

public class MainDrive {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("========================");
//		4.오른쪽 정렬 삼각형
//		i=0 => 띄어쓰기 :4, 별:1 / i=1 => 띄어쓰기 : 3, 별 2 /
		for(int i=0; i<5; i++) {
//			띄어쓰기 반복
			for(int j=0; j< 4-i; j++) {
				System.out.print(" ");
			}
//			별찍기도 반복
			for(int j=0; j< i+1; j++) {
				System.out.print("*");
			}
//			줄 바꿈
			System.out.println();
		}
		
	}

}
