
import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		double koreaScore, mathScore, englishScore,avgScore;
		Scanner myScanner = new Scanner(System.in);
		
		System.out.print("국어점수 :");
		koreaScore = myScanner.nextDouble();
		System.out.print("수학점수 :");
		mathScore = myScanner.nextDouble();
		System.out.print("영어점수 :");
		englishScore = myScanner.nextDouble();
//		평균값을 구하고 저장할 변수.
		avgScore = (koreaScore + mathScore + englishScore) /3;
		
		if(avgScore>=60) {
//			세숮ㅇ에 하나라도 40보다 작은가?
			if(koreaScore<40||mathScore<40||englishScore<40) {
				System.out.println("과락이네연!");
			}else {
				System.out.println("합격!");
			}
		}else {
			System.out.println("불합격!");
		}
	}

}
