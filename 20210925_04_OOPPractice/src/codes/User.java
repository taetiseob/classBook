package codes;

public class User {
	String name;
	int birthYear;
	int point;
	
//	책 빌려가기 기능 -> 대여 성공 / 실패
	
	boolean rentBook( Book b ) {
		
//		돈이 충분한가? => 내가 가진돈이, 책의 대여로 보다 많은가?
//		만약 돈이 부족하다면, 안내메세지 + 결과 대여 실패.
		if(point < b.rentFee) {
			System.out.println("포인트가 부족합니다.");
			return false;
		}
		if(getKoreanAge()<b.limitAge) {
			System.out.println("연령대가 맞지 않은 책 입니다.");
			return false;
		}
		if(b.rentUser != null) {
//			rentUser가 있다->빌려간 사람이 있다
			return false;
		}
//		여기도 실행됨? 돈,나이, 대여여부 전부 OK. => 빌려져도 됨.
		
//		실제 대여 처리.
//		1) 나의 포인트를 책에 대여료 만큼 차감
		point -= b.rentFee;
//		2) 책의 대여자를 이 사람(클래스 자체를)으로 등록
		b.rentUser = this;
		System.out.println("대여에 성공했습니다.");
		return true;
		
		
	}
	
	int getKoreanAge() {
		int age = 2021 - birthYear +1;
		return age;
	}
	void printUserInfo() {
		System.out.println("=====사용자 정보=====");
		System.out.println("이름 : "+ name);
		System.out.println("올해나이 :"+getKoreanAge());
		System.out.println("가진 금액 :"+point);
		System.out.println("==================");
	}
}
