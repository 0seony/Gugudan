import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		// 8��,9�� ���ǹ� ����ϱ�
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("����� ����Ͻðڽ��ϱ�?");
			int num = sc.nextInt();
			if (num < 2 || num > 9) {
				System.out.println("2�̻�, 9������ ���� �Է��� �� �ֽ��ϴ�.");
//				continue;
			} else {
				for (int i = 1; i < 10; i++) {
					System.out.println(num * i);
			} break;
				}
			}
		
		
//		// 2�� - �ܼ� �ݺ����� ���
//		System.out.println(2 * 1);
//		System.out.println(2 * 2);
//		System.out.println(2 * 3);
//		System.out.println(2 * 4);
//		System.out.println(2 * 5);
//		System.out.println(2 * 6);
//		System.out.println(2 * 7);
//		System.out.println(2 * 8);
//		System.out.println(2 * 9);
//
//		// 3�� - ����
//		int result = 3 * 1;
//		System.out.println(result);
//		result = 3 * 2;
//		System.out.println(result);
//		result = 3 * 3;
//		System.out.println(result);
//		result = 3 * 4;
//		System.out.println(result);
//		result = 3 * 5;
//		System.out.println(result);
//		result = 3 * 6;
//		System.out.println(result);
//		result = 3 * 7;
//		System.out.println(result);
//		result = 3 * 8;
//		System.out.println(result);
//		result = 3 * 9;
//		System.out.println(result);
//
//		// 4~5�� - �� �Է�
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("����� ����Ͻðڽ��ϱ�?: ");
//		int num = sc.nextInt();
//		System.out.println(num * 1);
//		System.out.println(num * 2);
//		System.out.println(num * 3);
//		System.out.println(num * 4);
//		System.out.println(num * 5);
//		System.out.println(num * 6);
//		System.out.println(num * 7);
//		System.out.println(num * 8);
//		System.out.println(num * 9);
//
//		// 6�� - while��
//		int i = 1;
//		while (i < 10) {
//			System.out.println(6 * i);
//			i++;
//		}
//
//		// 7�� - for��
//		for (int j = 1; j < 10; j++) {
//			System.out.println(7 * j);
//		}
	}
}
