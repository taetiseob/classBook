package codes;

public class Book {

//	책이 가질 수 있는 하위정보 -> 멤버변수로 표현
//	멤버변수 : 클래스 자체에 바로 달려있는 변수.
	String title;
	int rentFee;
	int limitAge;
	User rentUser;
//	이 책을 빌려간 사람(User)?
	

	void printBookInfo() {
		
		System.out.println("====도서정보====");
		System.out.println("제목 : "+title);
		System.out.println("대여료 :"+rentFee+"원");
		System.out.println(limitAge + "세 이용가");
		System.out.println(rentUser);
//		빌려간 사람의 정보를 출력.
//		rentUser가 있어야 출력. 없으면 null;
		if(rentUser == null) {
			//빌려간 사람이 없다.
			System.out.println("빌려간 사람이 없d음.");
		}else {
//			null이 아니다 => 실체가 있다 => 빌려간 사람이 있다!
			System.out.println("대여자:"+rentUser.name);
		}
		
		System.out.println("==============");
	}
}
