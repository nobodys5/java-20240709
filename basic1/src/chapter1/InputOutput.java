package chapter1;

import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {

		// 콘솔 입력
		// java.utill.Scanner 클래스의 객체를 생성해서 next() 메서드로 입력
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("입력 :");
		int num = scanner.nextInt();
		
		System.out.println("사용자가 입려한 수 : " + num);
		
		// 시스템으로부터 받은 입력 리소스를 반환
		scanner.close();
		
	}

}
