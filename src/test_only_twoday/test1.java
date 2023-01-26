package test_only_twoday;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		/*
		스캐너를 통해 원하는 배열의 길이값을 입력받은 뒤
		1 ~ 50까지의 난수를 발생시키는 static 메소드를 이용하여
		입력한 배열의 길이만큼 난수들을 정수 배열의 인덱스에 각각 대입하고 출력하세요.

		 *발생한 난수들의 중복 상관없음

		———출력 예시———

		원하는 배열의 길이를 입력하시오 : 7
		47 42 7 37 13 17 22 
		 */
		Scanner sc = new Scanner(System.in);

		System.out.print("원하시는 배열의 길이를 입력하시오 : ");
		int num = sc.nextInt();

		int arr[] = new int[num];

		for(int i = 0; i < arr.length; i++) {
			arr[i] = randomMaker();
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static int randomMaker() {

		return (int) (Math.random() * 50) + 1;
	}
}