package org.opentutorials.javatutorials.method;

public class MethodDemo1 {
//	public static void numbering() {
//		int i = 1;
//		while(i < 10) {
//			System.out.println(i);
//			i++;
//		}
//	}  //numbering이라는 method를 define { } 이게 기호로써의 차이점
//	//method를 define함으로써 유지보수가 유리하고, 코드 간소화 가능, 재활용 가능
//	
//	public static void main(String[] args) {
//		numbering();
//		//define한 numbering을 call
//	}
	
	//method를 재활용을 보다 잘 활용하기 위해서 입력과 출력을 배움
	//가변적
								//매개변수, parameter : 입력 값을 수용하기 위한 변수
	public static void numbering(int limit) {
		int i = 1;
		while(i < limit) {
			System.out.println(i);
			i++;
		}
	}
	/*고정적
	public static void numbering() {
		int limit = 9;
		int i = 1;
		while(i < limit) {
			System.out.println(i);
			i++;
		}
	}
	*/
	
	/*시작 값도 가변적으로 하는 방법
	 public static void numbering(int init, int limit) {
		int i = init;
		while(i < limit) {
			System.out.println(i);
			i++;
		}
	}
			public static void main(String[] args) {
					//인자, argument : 매개변수에 주는 값 (parameter와 혼용해서 쓰이기도 함)
			numbering(3, 7);
	}
}
	 */
	
		public static void main(String[] args) {
					//인자, argument : 매개변수에 주는 값 (parameter와 혼용해서 쓰이기도 함)
			numbering(9);
	}
}
