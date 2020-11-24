// 과제1) 

import java.util.Scanner;

public class test1 {
  public static void main(String[] args) {
	  
	  // 2가지 실행결과를 보여주기 위한 반복문.
	  while(true) {
	  System.out.print("(x , y)의 좌표를 입력하세요 : ");
	  Scanner input = new Scanner(System.in);  // 입출력 클래스 생성 
	  String line = input.nextLine(); // 입력받은 값을 문자열로 저장
	  String[] str = line.split(","); // 쉼표를 기준으로 문자열을 나눠 배열로 저장 
	  
	  int num1 = Integer.parseInt(str[0]); // 저장한 문자열을 숫자로 변환 
	  int num2 = Integer.parseInt(str[1]);
	  
	  // 조건문을 활용하여 범위안에 값이 있다면 올바른 결과 산출
	  if ( 100<=num1 && num1<=200 && 100<=num2 && num2<=200) { 
		  System.out.printf(
				  "점 (%d,%d)은 (100,100)~(200,200) 영역의 사각형 내에 위치해 있습니다.\n",num1,num2);  
	  } else {
		  System.out.printf(
				  "점 (%d,%d)은 (100,100)~(200,200) 영역의 사각형 밖에 위치해 있습니다.",num1,num2);
		break; // 사각형 밖에 점이 위치할 경우 종료.
	  }
    }
  }
}
