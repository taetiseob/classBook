package codes;

public class MainDrive {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("========================");
//		4.������ ���� �ﰢ��
//		i=0 => ���� :4, ��:1 / i=1 => ���� : 3, �� 2 /
		for(int i=0; i<5; i++) {
//			���� �ݺ�
			for(int j=0; j< 4-i; j++) {
				System.out.print(" ");
			}
//			����⵵ �ݺ�
			for(int j=0; j< i+1; j++) {
				System.out.print("*");
			}
//			�� �ٲ�
			System.out.println();
		}
		
	}

}
