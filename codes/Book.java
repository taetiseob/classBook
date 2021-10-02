package codes;

public class Book {
	String title;
	int rentFee;
	int limitAge;
	String authorName; //
	
	public Book(String title, int rentFee, int limitAge, String authorName) {
		super();
		this.title = title;
		this.rentFee = rentFee;
		this.limitAge = limitAge;
		this.authorName = authorName;
	}
//만일 클래스에 인자값이 없다면
	public Book() {
		
		this("제목없음",0,5,"작가이름모름");

	}

	
	
	
}
