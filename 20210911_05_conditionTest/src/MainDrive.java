import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double celsius, fahrenheit;
		
		Scanner myScanner = new Scanner(System.in);
		System.out.print("���� ����� �����µ��� �Է��Ͻÿ� : ");
		
		celsius = myScanner.nextDouble();
		fahrenheit = celsius * 1.8 + 32;
		System.out.println("���� ����� ȭ��: "+fahrenheit +"�Դϴ�");
		
	}

}
