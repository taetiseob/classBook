package codes;

public class MainDrive {

	public static void main(String[] args) {
		
		// 정수형 변수 100칸짜리 배열 생성.
		int[] numbers =  new int[100];
		
//		9명의 학생의 이름을 저장할 String 배열 생성.
		String[] studentNames = new String[9];
		
//		numbers의 맨 앞칸에 숫자 5를 기록.
		numbers[0] = 5;
		
//		학생의 이름 첫칸에 기록
		studentNames[0] = "TTs";
		
//		numbers의 마지막칸에 10을 기록.
		numbers[99] =10;
		
//		학생의 이름 마지막칸에 기록
		studentNames[8] = "ttst"; //배열은 index-1칸 까지만 존재함.
		
		System.out.println(numbers[99]);
		System.out.println(numbers[0]);
		System.out.println(studentNames[8]);
		
		int[] numArr = {2,3,4,5,6,7};
		System.out.println(numArr[3]);
 	}

}
