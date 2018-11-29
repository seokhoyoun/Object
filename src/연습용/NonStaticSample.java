package 연습용;

public class NonStaticSample {
	
	public static void main(String[] args) {
		NonStaticSample n1 = new NonStaticSample();
//		n1.printLottoNumbers();
//		n1.outPutChar(5, 'A');
//		System.out.println(n1.alphabette());
//		String text = n1.mySubstring("abcdefghijk", 2, 5);
//		System.out.println(text);
		int[] address = n1.intArrayAllocation(5);
		n1.display(address);
		n1.swap(address, 0, 3);
		n1.display(address);
		n1.sortDescending(address);
		n1.display(address);
		n1.sortAscending(address);
		n1.display(address);
		int sum = n1.totalValue(0, 10);
		System.out.println(sum);
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

	public char alphabette() { //65 ~ 122
		//실행 요청시 알파벳 범위의 임의의 영문자를 하나 발생시켜 리턴하는 메소드
		char r_ch = (char)((int)(Math.random()*(26))+65);
		return r_ch;
	}
	
	public String mySubstring(String text, int i1, int i2) {
		if(text == null) {
			return null;
		}
		else {
			return text.substring(i1, i2);
			
		}
	}

	public int[] intArrayAllocation(int num) {
		// int 한개의 전달값을 받아서, 배열의 주소를 리턴하는 메소드
		int[] rar = new int[num];
		for(int i = 0; i < rar.length; i++) {
			rar[i] = (int)(Math.random()*100)+1;
				if(i > 0) {
					for(int j = 0; j < i; j++) {
						if(rar[i] == rar[j]) {
							i--;
						}
					}
				}
		}
			return rar;
			
		
		
	}
	
	public void display(int[] rar) {
		for(int i = 0; i < rar.length; i++) {
			System.out.print(rar[i]+"\t");
		}
		System.out.println();
		
	}

	public void swap(int[] rar, int n1, int n2) {
		// 배열과, 두 정수의 인덱스를 전달받아 두 인덱스의 값을 교환함
		int tmp = rar[n1];
		rar[n1] = rar[n2];
		rar[n2] = tmp;
	}
	
	public void sortDescending(int[] rar) {
		// 처리할 내용 : 위에서 작성한 swap 메소드를 이용하여 배열의 값 들을 내림차순 정렬 처리함
		for(int i = 0; i < rar.length-1; i++) {
			for(int j = i+1; j < rar.length; j++) {
				if(rar[i] < rar[j]) {
					swap(rar, i , j);
				}
			}
		}
	}
	
	public void sortAscending(int[] rar) {
		// 오름차순 정렬
		for(int i = 0; i < rar.length-1; i++) {
			for(int j = i+1; j < rar.length; j++) {
				if(rar[i] > rar[j]) {
					swap(rar, i, j);
				}
			}
		}
	}

	public int countChar(String text, char key) {
		// 문자열과 문자 하나를 전달받아, 문자열에 포함된 문자의 갯수를 리턴하는 메소드, 포함 된 문자가 없으면 0을 반환
		int sum = 0;
		for(int i = 0; i < text.length(); i++) {
			if(text.charAt(i) == key) {
				sum++;
			}
		} return sum;
	}

	public int totalValue(int num1, int num2) {
		// 정수 두 개를 전달받아, 두 수 중 작은 값에서 큰 값사이의 정수들의 합계를 구해서 리턴하는 메소드
		int sum = 0;
		if(num1 > num2) {
			for(int i = num2; i <= num1; i++) {
				sum += i;
			}
			return sum;
		}
		else if(num1 < num2) {
			for(int i = num1; i <= num2; i++) {
				sum += i;
			}
			return sum;
		}
		else {
			return sum;
		}
	}

	public char pCharAt(String text, int index) {
		// 문자열과 인덱스를 전달받아, 그 위치의 문자를 리턴하는 메소드
		char ch = text.charAt(index);
		return ch;
	}

	public String pConcat(String text, String text2) {
		return text.concat(text2);
	}
}
