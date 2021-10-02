import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double celsius, fahrenheit;
		
		Scanner myScanner = new Scanner(System.in);
		System.out.print("현재 기온을 섭씨온도로 입력하시오 : ");
		
		celsius = myScanner.nextDouble();
		fahrenheit = celsius * 1.8 + 32;
		System.out.println("현재 기온은 화씨: "+fahrenheit +"입니다");
		
	}

}
