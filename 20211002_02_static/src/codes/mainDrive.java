package codes;

public class mainDrive {

	public static void main(String[] args) {
		
		Card card1 = new Card("하트",2);
		card1.printCard();
		
		Card.width = 5.8;
		
		Card card2 = new Card("스페이드",7);
		card2.printCard();
		
		Card.width = 6.2;
//		card1이던 card2이던 걍 변수대입처럼
//		웬만하면 static은 클래스명 자체로 사용해라
		System.out.println(Card.width);
		Card.printCardClass();
	}

}
