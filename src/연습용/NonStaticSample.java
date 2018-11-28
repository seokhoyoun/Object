package 연습용;

public class NonStaticSample {
	
	public static void main(String[] args) {
		NonStaticSample n1 = new NonStaticSample();
//		n1.printLottoNumbers();
		n1.outPutChar(5, 'A');
	}
	
	public NonStaticSample() {
		
	}
	
	public void printLottoNumbers() {
		// 실행 요청시 1~45까지의 임의의 정수 6개 중복되지 않게 발생시켜 출력하는 메소드
		int[] rar = new int[6];
		for(int i = 0; i < rar.length; i++) {
			rar[i] = (int)(Math.random()*45)+1;
			if(i > 0) {
				for(int j = 0; j < i; j++) {
					if(rar[i] == rar[j]) {
						i--; 
					}
				}
			}
		}
		
		for(int i = 0; i < rar.length; i++) {
			System.out.println(rar[i]);
		}
	}

	public void outPutChar(int num, char ch) {
		// 실행 요청시 정수 하나, 문자 하나를 전달받아 문자를 정수 갯수만큼 출력하는 메소드
		for(int i = 0; i < num; i++) {
			System.out.print(ch);
		}
	}

	public char alphabette() {
		
		
	}
}
