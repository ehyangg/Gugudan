package org.opentutorials.javatutorials.method;

public class MethodDemo2 {
	// String은 numbering이라는 메소드는 반드시 문자열을 리턴한다는 의미
	public static String numbering(int init, int limit) {
		int i = init ;
		// 만들어지는 숫자들을 output이라는 변수에 담기 위해서 변수에 빈 값을 주었다.
		String output = "";
				while(i < limit) {
					// 숫자를 화면에 출력하는 대신 변수 output에 담았다.
					output += i ;
					i++;
				}
				// 중요!!! output에 담겨 있는 문자열을 메소드 외부로 반환하려면 
				// 아래와 같이 return 키워드 뒤에 반환하려는 값을 배치하면 된다.
		return output;
	}
	
	// void가 메소드 앞에 붙으면 메소드의 리턴 값이 없다라는 뜻
	public static void main(String[] args) {
		// 메소드 numbering이 리턴한 값이 변수 result에 담긴다.
		String result = numbering(1, 5);
		// 변수 result의 값을 홤녀에 출력한다.
		System.out.println(result);
	}
}
