import java.util.Scanner;

public class ConStatements {
	public static void main(String[] args) {

		// ���ǹ�
		// - ����ڰ� �Է��� ���� ���� �ش��ϴ� ���� ����Ѵ�.
		// - ���� ��� ����ڰ� 8�̶�� ���ڸ� �Է��ϸ� 8�� ��ü�� ����� ����Ѵ�.
		// - ����ڰ� 2 �̻�, 9 ���ϰ� �ƴ� ���� �Է��ϴ� ��� "2�̻�, 9������ ���� �Է��� �� �ֽ��ϴ�."��� �޽����� ����Ѵ�

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("����� ����Ͻðڽ��ϱ�?");
			int num = sc.nextInt();
			if (num < 2 || num > 9) {
				System.out.println("2�̻�, 9������ ���� �Է��� �� �ֽ��ϴ�.");
			} else {
				for (int i = 1; i < 10; i++) {
					System.out.println(num * i);
				}
				break;
			}
		}
	}

}
