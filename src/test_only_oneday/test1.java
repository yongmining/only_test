package test_only_oneday;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		/*===김밥가게 운영 프로그램=====

				1. 손님 맞이
				2. 주문 받고 계산해주기
				3. 김밥 만들기
				4. 김밥 전달하고, 손님의 반응을 듣기

				- 프로그램의 요구사항

				1. 손님이 들어오면 주문 받는 사람은 손님에게 아래의 메뉴를 제시한다.

				=====메뉴=====

				[1]: 야채김밥: 1,000원

				[2]: 참치김밥: 2,000원

				[3]: 김치김밥: 1,500원

				-우리는 카드만 받습니다! ^^

				1. 손님은 먹고 싶은 김밥의 종류를 번호로, 각 김밥 종류별 갯수를 숫자로 주문한다.
				2. 주문 받는 사람은 손님에게 주문을 받은 뒤, 손님이 결제할 금액을 계산하여, 손님에게 다음과 같이 알려준다.
				예) “전체 금액은 5,000원 입니다.”
				3. 주문 받는 사람은 손님이 지불한 금액을 가게 장부에 기록하여, 전체 매상을 누적 계산한다.  
				4. 주문 받는 사람은 김밥 마는 사람에게 주문내역을 전달하고, 김밥 마는 사람은 주문내역을 전달 받아 김밥을 만든다. 이때 주문 받는 사람은 김밥 마는 사람에게 주문내역을 전달해주며 다음과 같이 말한다.
				예) “참치김밥 2개 김치김밥 1개 주문 받았습니다.”

				     김밥 마는 사람은 다 만든 김밥을 주문 받는 사람에게 전달해주며 다음과 같이 말한다.

				      예) “참치김밥 2개 김치김밥 1개 조리 완료되었습니다.”

				1. 주문 받는 사람은 손님에게 김밥을 전달해주며 다음과 같이 말한다.
				예) “주문하신 참치김밥 2개, 김치김밥 1개 나왔습니다.”
				2. 손님은 김밥을 받으며 다음과 같이 이야기한다.
				예) “참치김밥 2개, 김치김밥 1개 잘 먹겠습니다.”  */
		
		Manager service = new Manager();
		Consumer custom = new Consumer();
		SuperVisor service1 = new SuperVisor();
		
		Scanner sc = new Scanner (System.in);
		
		while(true) {
			System.out.println("===== 메뉴 =====");
			
			System.out.println("야채김밥: 1000원");
			System.out.println("참치김밥: 2000원");
			System.out.println("김치김밥: 1500원");
			System.out.println("1. 주문");
			System.out.println("2. 슈퍼바이저에게 주문내역전달");
			System.out.println("3. 손님에게 주문내역 전달");
			System.out.println("4. 슈퍼바이저가 김밥을 매니저에게 전달");
			System.out.println("5. 매니저가 김밥을 손님에게 전달" );
			System.out.println("9. 잘먹겠습니다.");
			int no = sc.nextInt();
			
			switch(no) {
				case 1 : service.order(); break;
				case 2 : service1.bill1(); break;
				case 3 : custom.bill2(); break;
				case 4 : service.deliver1(); break;
				case 5 : custom.deliver2(); break;				
				case 9 : System.out.println("잘먹겠습니다."); return;
				default : System.out.println("잘못된 번호를 선택하셨습니다."); break;
		}
		
	}

	}
}