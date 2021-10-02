package codes;

public class MainDrive {

	public static void main(String[] args) {
		Book b1 = new Book();
		b1.title = "먼나라 이웃나라";
		b1.limitAge = 5;
		b1.rentFee = 1000;
		
		Book b2 = new Book();
		b2.title = "타짜";
		b2.limitAge = 19;
		b2.rentFee = 2500;
		
		User u1 = new User();
		u1.name = "김성인";
		u1.birthYear = 1990;
		u1.point = 30000;
		
		User u2 = new User();
		u2.name = "이잼민";
		u2.birthYear = 2007;
		u2.point = 10000;
		
//		1. 김 성인은 타짜를 빌릴수 있는가?
		boolean isU1rentB2 = u1.rentBook(b2);
		System.out.println(isU1rentB2);
		
//		대여 이후의 u1,u2 정보 출력
		u1.printUserInfo(); //포인트가 차감됨
		b2.printBookInfo(); //타짜의 대여자로 -> 김 성인;
		
//		2. 이 학생은 타짜를 빌릴 수 있나?
		boolean isU2RentB2 = u2.rentBook(b2);
		System.out.println(isU2RentB2);
		
//		3. 이 학생은 먼나라 이웃나라를 빌릴 수 있나?
		boolean isU2RentB1 = u2.rentBook(b1);
		System.out.println(isU2RentB1);
		
		u2.printUserInfo();
		b1.printBookInfo();
		
		User u3 = new User();
		u3.name = "박성인";
		u3.birthYear = 1993;
		u3.point = 50000;
//		박 성인은 타짜를 빌릴 수 있나?
		boolean isU3rentB2 = u3.rentBook(b2);
		System.out.println(isU3rentB2);
		
		u3.printUserInfo();
	}

}
