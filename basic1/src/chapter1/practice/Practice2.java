package chapter1.practice;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {

		// 문자열 결합
		// 사용자로부터 기준 문자열, 연결할 문자열을 두개 입력받음
		// 입력받은 문자열을 문자 배열로 변경하고 두 문자 배열을 연결하여
		// 새로운 문자 배열에 저장 후 출력
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("기준 문자열 : ");
		String firstString = scanner.nextLine(); // 문자열로 입력받기위해 string 으로 nextline 받아줌
		
		System.out.println("연결할 문자열 : ");
		String secondString = scanner.nextLine();
		
		char[] firstChars = new char[firstString.length()]; // 입력받은 문자열을 배열로 변경하기 위한 배열생성 문자열입력만큼 저장하기위해 length로 생성
		for (int index = 0; index < firstChars.length; index++) { // 반복문을 돌려서  생성된 배열요소에 입력한 문자열 요소(index)를 담아준다
			firstChars[index] = firstString.charAt(index);
		}
		
		char[] secondChars = new char[secondString.length()];
		for (int index = 0; index < secondString.length(); index++) {
			secondChars[index] = secondString.charAt(index);
		}
		
		char[] resultChars = new char[firstChars.length + secondChars.length];
		for (int index = 0; index < firstChars.length; index++) {
			resultChars[index] = firstChars[index];
		}
		
		for (int index = 0; index < secondChars.length; index++) {
			resultChars[firstChars.length + index] = secondChars[index]; // 기준 문자열 과 연결할문자열을 합치기 위해 첫번째 문자배열 + 결과값배열에 두번째 문자배열을 담는다
		}
		System.out.println(resultChars);
	}

}
