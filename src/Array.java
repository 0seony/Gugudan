
public class Array {
	public static void main(String[] args) {
		
		// �迭�� �̿��Ͽ� 2�� ����
//		int result[] = new int[9];
//		
//		for(int i = 0; i<result.length; i++) {
//			result[i] = 2 * (i+1);
//			System.out.println(result[i]);
//		}
		
		// �迭�� ����for���� ����Ͽ� 2~9�ܱ��� �ߺ��ڵ� ���� ���
		int result[] = new int[9];
		
		for(int i = 2; i<10; i++) {
			System.out.println("-- " + i + "��");
			for(int j = 0; j<result.length; j++) {
				result[j] = i * (j+1);
				System.out.println(result[j]);
			}
		}
	}

}
