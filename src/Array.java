
public class Array {
	public static void main(String[] args) {
		
		// 배열을 이용하여 2단 구현
//		int result[] = new int[9];
//		
//		for(int i = 0; i<result.length; i++) {
//			result[i] = 2 * (i+1);
//			System.out.println(result[i]);
//		}
		
		// 배열과 이중for문을 사용하여 2~9단까지 중복코드 없이 출력
		int result[] = new int[9];
		
		for(int i = 2; i<10; i++) {
			System.out.println("-- " + i + "단");
			for(int j = 0; j<result.length; j++) {
				result[j] = i * (j+1);
				System.out.println(result[j]);
			}
		}
	}

}
