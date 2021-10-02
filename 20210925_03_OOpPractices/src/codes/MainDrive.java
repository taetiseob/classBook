package codes;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
//		여러가지 책/사용자들을 끌어다 사용하는 무대
		Book b1 = new Book();
		b1.title = "드래곤볼";
		b1.rentFee = 500;
		b1.limitAge = 15;
//		사용자 한명을 인스턴스화
		User u1 = new User();
		u1.name = "김태섭";
		u1.money = 999999999;
		u1.birthYear = 1991;
		
//		다른 책 한권을 추가로 인스턴스화
		Book b2 = new Book();
		b2.title = "애기공룡둘리";
		b2.rentFee = 1000;
		b2.limitAge = 7;
		
//		u1은 2021년에 몇살인가? => 사용자에게 기능 추가 / 활용.
		System.out.println("나이는? "+u1.getKoreanAge(2021));
//		두번째 사용자. 김초딩 / 0 / 2010년생
		User u2 = new User();
		u2.birthYear = 2010;
		u2.name ="김초딩";
		u2.money = 0;
		
//		System.out.println("나이는? "+u2.getKoreanAge(2021));
//		
//		System.out.println(b1.title);
//		System.out.println(b2.title);
		
//		책의 정보를 출력(syso)하는 기능 ( 메소드 );
//		결과가 필요 없다.
		b1.printBookInfo();
		b2.printBookInfo();
		
//		u1.printUserInfo();
//		u2.printUserInfo();
		
//		String => 참조형
//		String str = "Test";
//		
//		b1 = b2; //b1도 b2와 같은 객체(인스턴스) 참조.
//		b1.title = "나루토";
		
//		b1을 빌려간 사람? 아직 없다.
//		System.out.println(b1.rentUser);
//		System.out.println(b1.rentUser.name);
		
//		b2룰 빌려가는 사람으로 u1을 지정
		b1.rentUser = u2;
		b2.rentUser = u1;
		System.out.println("d"+b1.rentUser);
		
		System.out.println(b2.rentUser.name.replace("조","김"));
		
		
		b1.rentUser = null;
		
	}

}
