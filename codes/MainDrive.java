package codes;

public class MainDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		사람 3명 등장
//		1. 김성인 / 1990 /010-1111-2222 / true / 175.3cm;
		User u1 = new User("김성인",1990,"010-1111-2222",true, 175.3);
		User u2 = new User("이잼민",2007,"010-3333-4444",false, 163.5);
		
		System.out.println(u2.name);
		
		Book b1 = new Book("드래곤볼",1000,15,"드래곤볼작가");
		System.out.println(b1.title);
		
		User u3 = new User();
		System.out.println(u3.name);
		
		Book b2 = new Book();
		System.out.println(b2.title);
	}

}
