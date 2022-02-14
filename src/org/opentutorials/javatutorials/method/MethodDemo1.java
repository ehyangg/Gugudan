package org.opentutorials.javatutorials.method;

public class MethodDemo1 {
	public static void numbering() {
		int i = 1;
		while(i < 10) {
			System.out.println(i);
			i++;
		}
	}  //numbering이라는 method를 define { } 이게 기호로써의 차이점
	
	public static void main(String[] args) {
		numbering();
	} //define한 numbering을 call
}
