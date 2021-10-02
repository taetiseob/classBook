package codes;

public class MainDrive {

	public static void main(String[] args) {
		for(int i=0; i<=4; i++) {
			for(int j=0; j<=4; j++) {
				System.out.print("["+i+","+j+"]");
			}
			System.out.println();
		}
		System.out.println("=========================");
//		2 가운데 줄만 출력
		for(int i=0; i<=4; i++) {
			for(int j=0; j<=4; j++) {
				if(j==2) {
					System.out.print("["+i+","+j+"]");
				}
				System.out.print("     ");
			}
			System.out.println();
		}
		System.out.println("=========================");
//		3. 우상향 출력
		for(int i=0; i<=4; i++) {
			for(int j=0; j<=4; j++) {
				if(i+j==4) {
					System.out.print("["+i+","+j+"]");
				}
				System.out.print("     ");
			}
			System.out.println();
		}
//		4. X자 출력
		System.out.println("=========================");
		for(int i=0; i<=4; i++) {
			for(int j=0; j<=4; j++) {
				if(i+j==4 || i==j) {
					System.out.print("["+i+","+j+"]");
				}else {
					System.out.print("     ");
				}
				
			}
			System.out.println();
		}
//		ㅁ 출력
		System.out.println("=========================");
		for(int i=0; i<=4; i++) {
			for(int j=0; j<=4; j++) {
				if(i%4==0|| j%4==0) {
					System.out.print("["+i+","+j+"]");
				}else {
					System.out.print("     ");
				}
				
			}
			System.out.println();
		}
	}

}
