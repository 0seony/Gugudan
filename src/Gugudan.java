import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		// 8단,9단 조건문 사용하기
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("몇단을 출력하시겠습니까?");
			int num = sc.nextInt();
			if (num < 2 || num > 9) {
				System.out.println("2이상, 9이하의 값만 입력할 수 있습니다.");
//				continue;
			} else {
				for (int i = 1; i < 10; i++) {
					System.out.println(num * i);
			} break;
				}
			}
		
		
//		// 2단 - 단순 반복으로 출력
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
//		// 3단 - 변수
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
//		// 4~5단 - 값 입력
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("몇단을 출력하시겠습니까?: ");
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
//		// 6단 - while문
//		int i = 1;
//		while (i < 10) {
//			System.out.println(6 * i);
//			i++;
//		}
//
//		// 7단 - for문
//		for (int j = 1; j < 10; j++) {
//			System.out.println(7 * j);
//		}
	}
}
