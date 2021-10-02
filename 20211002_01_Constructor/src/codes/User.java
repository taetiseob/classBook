package codes;

public class User {
	String name;
	int birthYear;
	String phoneNum;
	boolean isMale;
	double height;
	
//	재료도 안받고 / 아무 일도 안하는 생성자 추가 => 기본 생성자를 직접 추가.
	public User() {
		name = "이름 없음";
	}
	
	public User( 
			String name, 
			int birthYear, 
			String inputPhoneNum, 
			boolean inputIsMale, 
			double inputHeight) {
		
		this.name = name;
		this.birthYear = birthYear;
		phoneNum = inputPhoneNum;
		isMale = inputIsMale;
		height = inputHeight;
		
	}
	
//	나이계산기능
	int getKoreanAge() {
		return 2021 - this.birthYear + 1;
	}
	
	void printUserInf() {
		
		System.out.println("=======사용자정보=======");
		System.out.println(this.name);
		System.out.println(this.getKoreanAge());
		
	}
	
}
