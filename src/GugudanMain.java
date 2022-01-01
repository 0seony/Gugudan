
public class GugudanMain {
	//클래스를 활용하여 다른 클래스에 있는 메소드 호출하기
	public static void main(String[] args) {
		for(int i = 2; i<10; i++) {
			int[] result = Method.calculate(i);
			Method.print(result);
		}
	}

}
