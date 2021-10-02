import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
//		학점 판정 로직.
//		점수 입력? int로 입력을 받자.
//		90이상? A
//		추가 검사. 5등 이내 : A+, 그 외 : A0
//		80이상? B+
//		70이상? C0
//		70미만 F
		Scanner myScanner = new Scanner(System.in);
		System.out.print("평균 점수 입력: ");
		int avgScore = myScanner.nextInt();
		
//		반에서 몇등? int로 입력받자.
		
		
		if(avgScore>=90) {
			System.out.print("등수 입력 :");
			int rank = myScanner.nextInt();
			if(rank<=5) {
				System.out.println("A+");
			}else {
				System.out.println("A0");
			}
			
		}
		else if(avgScore>=80) {
			System.out.println("B+");
		}
		else if(avgScore>=70) {
			System.out.println("C0");
		}
		else {
			System.out.println("F");
		}
		
	}

}
