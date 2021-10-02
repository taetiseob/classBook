package codes;

public class User {

	String name;
	int birthYear;
	int money;
	
//	사용자 정보 출력
	void printUserInfo() {
		System.out.println("=====사용자 정보=====");
		System.out.println("이름 : "+ name);
		System.out.println("올해나이 :"+getKoreanAge(2021));
		System.out.println("가진 금액 :"+money);
		System.out.println("==================");
	}
	
//	재료로 연도를 받으면 => 나이를 계산해서 결과로 주는 메소드.
	
	int getKoreanAge(int year) {
		return year-birthYear+1;
	}
}
