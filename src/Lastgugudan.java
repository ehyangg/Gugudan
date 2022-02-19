//사용자가 입력한 값에 따라 크기가 다른 구구단을 계산해 출력한다.
//예를 들어 사용자가 8을 입력하면 팔팔단, 19를 입력하면 십구십구단(2 * 1에서 19 * 19)을 계산해 출력한다.

import java.util.Scanner;
public class Lastgugudan {

	public static void calculator(int number) {
		for(int j=2; j<=number; j++) {
			for(int i = 1; i<=number; i++) {		
			System.out.println((number-(number-j)) * i);
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("사용자가 원하는 구구단은? : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("사용자가 입력한 값 : " + number);
		calculator(number);
	}
}