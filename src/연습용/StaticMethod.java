package 연습용;

public class StaticMethod {
			//Field
			private static String value;
			
			//Constructor  : 필드가 모두 static 일 때는 생성자 필요없음
			/*public StaticMethod(){
			}
			
			public StaticMethod(String value){
				this.value = value;
			}*/
			
			//value 필드 값 변경용 : 필드가 static이면 setter 도 static 이어야 함
			public static void setValue(String value) {
				StaticMethod.value = value;
			}
			
			//value 필드 값 조회용 : 필드가 static 이면 getter 도 static 이어야 함
			public static String getValue() {
				return StaticMethod.value;
			}
			
			
			//필드가 모두 static 일 때는 메소드도 전부 static 이어야 함
			//static method
			//1. 반환값 없고 매개변수 없는 메소드
			//value 필드 값을 모두 대문자로 바꾸는 static 메소드
			public static void toUpper() {
				StaticMethod.value = StaticMethod.value.toUpperCase();
			}
			
			
			//2. 반환값 없고 매개변수 있는 메소드
			//인덱스와 문자를 전달받아
			//value 필드에서 전달받은 인덱스 위치의 값을 전달받은 문자로 변경하는 static 메소드
			public static void setChar(int index, char ch) {
				// StaticMethod.value.charAt(index) = ch; * 컴파일오류 : 자바에서 문자열은 immutable이라 값을 바꿀수 없다
				StaticMethod.value = StaticMethod.value.substring(0, index)+ ch + StaticMethod.value.substring(index+1);
				
			}
			

			//3. 반환값 있고 매개변수 없는 static 메소드
			//value 필드에 기록된 글자갯수 리턴 처리
			public static int valueLength() {
				return StaticMethod.value.length();
			}
			
			
			//4. 반환값 있고 매개변수 있는 static 메소드
			//문자열값을 전달받아, value 필드값과 하나로 합쳐서 리턴 처리
			public static String valueConcat(String text) {
				return StaticMethod.value.concat(text);
			}
}
