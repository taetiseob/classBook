package codes;

public class Book {
	String title;
	int rentFee;
	int limitAge;
	User rentUser;
	void printBookInfo() {
		System.out.println("===============");
		System.out.println("제목 :"+title);
		System.out.println("대여료 :"+rentFee);
		System.out.println("연령제한 :"+limitAge);

		if(rentUser == null) {
			System.out.println("빌려간 사람이 엄서연");
		}else {
			System.out.println(rentUser.name+" 이 빌려감");
		}
		System.out.println("===============");
	}
}
