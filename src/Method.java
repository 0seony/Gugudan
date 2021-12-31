
public class Method {
	
	//메소드를 활용하여 구구단을 구현한다
	
	//구구단을 계산하는 메소드
	public static int[] calculate(int dan){
		int[] result = new int[9];
		for(int i = 0; i<result.length; i++) {
			result[i] = dan * (i+1);
		}
		return result;
	}
	
	public static void print(int[] result) {
		for(int i = 0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	public static void main(String[] args) {
		for(int i = 2; i<10; i++) {
			int[] result = calculate(i);
			print(result);
		}
	}

}
