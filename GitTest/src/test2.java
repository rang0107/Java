// 과제2) 

import java.util.Scanner;

public class test2 {
  public static void main(String[] args) {
	  int price = 0 ;  // 음료수의 총 가격 변수 선언 및 초기화 
	  
	  // 3가지 실행결과를 보여주는 동안 입력 반복
	  while(true) { 
	  
	  System.out.print("음료수의 종류와 수량을 입력하세요: ");
	  Scanner input = new Scanner(System.in); // 입출력 클래스 생성 
	  String line = input.nextLine(); // 입력받은 값을 문자열로 저장
	  String[] str = line.split(" "); // 쉼표를 기준으로 문자열을 나눠 배열로 저장 
	  int num = Integer.parseInt(str[1]); // 뒤에 입력한 문자열을 숫자로 변환 
	  
	  // 조건문을 통해 문자열에 특정 음료수명을 입력할 경우 음료수명마다 가격 설정
	  switch (str[0]) { 
	    case "아메리카노" : 
	    	price = 3000 * num; // 음료수 가격 * 변환한 숫자(수량) 
	    break;
	    case "카푸치노" : 
	    	price = 3300 * num; 	    	
	    break;
	    case "카페라떼" : 
	    	price = 3500 * num; 	    	
	    break;
	    case "아인슈페너" : 
	    	price = 4000 * num; 
	    break;
	  }
	  
	  
	  
	  // 가격이 2만원을 넘을 경우 10% 할인해주고, 아닐 경우 그대로 출력하며 결제금액을 알려준다.
	  if ( price >= 20000 ) { 
  		price = (int)(price * 0.9) ;
  		System.out.println("결제할 금액은 " + price +"원입니다.");
  	}
  	  else {
  			System.out.println("결제할 금액은 " + price +"원입니다.");
  	}
	  
	  // 지불해야 할 가격을 알려준 후 실제 지불 금액을 입력한다. 
	  System.out.print("얼마를 지불하시겠습니까? ");
	  Scanner input2 = new Scanner(System.in);
	  int payment = input2.nextInt();
	  int change = 0; // 거스름돈 변수 선언 및 초기화
	  
	  // 만약 지불금액이 가격보다 낮을 경우 금액 부족 메세지를 띄우고, 아니면 거스름돈이 얼마인지 알려준다.
	  if ( payment >= price) {
	    change = payment - price ;
	    System.out.println("거스름돈은 "+ change +"원입니다.감사합니다.\n"); 
	  } else { 
		System.out.println("금액이 부족합니다.");  
		break;  // 금액 부족할 경우 종료.
	  }
	  
	}
  }
}
