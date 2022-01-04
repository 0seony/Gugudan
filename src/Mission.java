import java.util.Scanner;

public class Mission {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 추가 요구사항 1
		int input1 = sc.nextInt();
		
		for (int i = 1; i <= input1; i++) {
			System.out.println(input1 + "*" + i + "=" + input1 * i);
		}
		
		sc.nextLine();
		
		// 추가 요구사항 2
		String[] input2 = sc.nextLine().split(",");

		int A = Integer.parseInt(input2[0]);
		int B = Integer.parseInt(input2[1]);

		for (int i = 2; i <= A; i++) {
			for (int j = 1; j <= B; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
		}
	}
}
