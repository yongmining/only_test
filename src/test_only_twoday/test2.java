package test_only_twoday;

public class test2 {

	public static void main(String[] args) {
		/*
		짜장면 짬뽕 탕수육 중에 오늘 어떤 반반 메뉴를 먹을지 고르는 문제이다.

		메뉴는 랜덤으로 골라지며,  배열을 통하여 메뉴를 생성한다.
		만일 골라진 두 개의 메뉴가 같으면 “아쉽지만 오늘은 00만 먹어야겠네” 라고 출력하고 
		만일 다른 두 메뉴를 고르면 “오늘은 oo xx 메뉴 반반을 먹자!”라고 출력한다.

		===출력 예제===
		오늘은 짬뽕 탕수육 반반을 먹자!

		========
		아쉽지만 오늘은 탕수육만 먹어야겠네
		 */



		String[] menu = {"짜장", "짬뽕", "탕수육"};
		String[] mixmenu = {"짜장", "짬뽕", "탕수육"};

		int random = (int) (Math.random()*menu.length);
		int randommix = (int)(Math.random()*mixmenu.length);

		if(random == randommix) {
			System.out.println("아쉽지만 오늘은 " + menu[random] + "만 먹어야겠네");
		}else {
			System.out.println("오늘은 " +menu[random] + " " + mixmenu[randommix] + " 반반을 먹자!");
		}



	}

}
