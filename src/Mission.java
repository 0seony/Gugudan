import java.util.Scanner;

public class Mission {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(",");

		int A = Integer.parseInt(input[0]);
		int B = Integer.parseInt(input[1]);

		for (int i = 2; i <= A; i++) {
			for (int j = 1; j <= B; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
		}
	}
}
