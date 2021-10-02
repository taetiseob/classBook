package codes;

public class MainDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1 = new Dog();
		dog1.birthYear = 2014;
		dog1.isMale = true;
		dog1.run();
		
		Cat cat1 = new Cat();
		cat1.birthYear = 2014;
		cat1.run();
		
		dog1.keepHome();
//		dog1.meow(); 개는 고양이만의 고유기능은 활용 불가.
		
		cat1.meow();
	}

}
