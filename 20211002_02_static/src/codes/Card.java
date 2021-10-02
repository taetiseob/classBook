package codes;

public class Card {
	String pattern; //스페이드/하트/다이아
	int number;//카드에 적혀있는 숫자
	
	
	static double width; //카드의 가로 길이. 모든 카드길이가 동일 -> Card 클래스 자체의 특성.
	
	
	public Card(String pattern, int number) {
		super();
		this.pattern = pattern;
		this.number = number;
	}
	
	static void printCardClass() {
		System.out.println("이 클래스는 카드의 무늬/숫자를 표현하는 클래스 입니다."); //클래스에 대한 설명.
		
//		System.out.println(number) //static메쏘드(먼저생성) -> 일반 변수(나중에생성예정) -> 없는걸 끌어다 쓰려고 하는 꼴.
//		
		System.out.println("카도의 가로길이 : "+width);
	}

	void printCard() {
		System.out.println(this.pattern +"/"+ this.number);
	}
}
