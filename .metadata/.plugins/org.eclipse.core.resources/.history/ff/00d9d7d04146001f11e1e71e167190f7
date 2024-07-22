package chapter1.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice1 {

	// 사용자로부터 0이상의 숫자를 입력받고 
	// 입력받은 정수를 numbers라고하는 배열에 저장
	// 만약 사용자가 0미만의 정수를 입력하면
	// 사용자가 입력한 정수들을 모두 출력하고 프로그램을 종료
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[0]; // 배열에 저장하기 위해 빈배열 선언 및 초기화
		
		while (true) {
			
			System.out.println("정수:");
			int inputNumber = scanner.nextInt();
			
			if (inputNumber < 0) break; // 0미만의 정수를 받기위한 코드 -1 입력하면 false가 입력되어 반복문을 중단하고 빠져나간다.
			
			int[] newNumbers = new int[numbers.length + 1]; // newnumbers 배열에 numbers 배열길이 + 1 만큼 초기화 한것
			
			
			for (int index = 0; index < numbers.length; index++) { // numbers 배열길이만큼 요소들 출력하는 코드 ++증가연산자로 반복문 동작할때마다 값이 증가한다
				newNumbers[index] = numbers[index];// numbers 인덱스요소가 추가될때마다 newnumbers 인덱스요소에 담긴다
			}
			newNumbers[newNumbers.length - 1] = inputNumber;// inputnumber 1 입력받으면 배열 마지막 요소에 값을 받기 위해 newnumber 배열마지막 요소를 -1 시켜준다 
			// newNumbers = {2, 3}
			numbers = newNumbers; // 출력하기위해 numbers 에 newnumbers 변수르 담아준다
		}
//		for (int number : numbers)
		System.out.println(Arrays.toString(numbers)); // arrays.tostring 을참조하면 요소들이 배열로 출력된다
		
		// numbers
	}

}
