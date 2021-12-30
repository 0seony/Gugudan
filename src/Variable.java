import java.util.Scanner;

public class Variable {
	public static void main(String[] args) {

		// 변수
		int result = 3 * 1;
		System.out.println(result);
		result = 3 * 2;
		System.out.println(result);
		result = 3 * 3;
		System.out.println(result);
		result = 3 * 4;
		System.out.println(result);
		result = 3 * 5;
		System.out.println(result);
		result = 3 * 6;
		System.out.println(result);
		result = 3 * 7;
		System.out.println(result);
		result = 3 * 8;
		System.out.println(result);
		result = 3 * 9;
		System.out.println(result);

		// 출력할 단을 변수에 입력받아 출력하기
		Scanner sc = new Scanner(System.in);

		System.out.print("몇단을 출력하시겠습니까?: ");
		int num = sc.nextInt();
		System.out.println(num * 1);
		System.out.println(num * 2);
		System.out.println(num * 3);
		System.out.println(num * 4);
		System.out.println(num * 5);
		System.out.println(num * 6);
		System.out.println(num * 7);
		System.out.println(num * 8);
		System.out.println(num * 9);

	}
}
