// 과제3) 

import java.util.Scanner;

public class test3 {
  public static void main(String[] args) {
	
	  String [] eng = new String[5]; // 영단어 배열 선언 및 저장 
	  eng[0] = "java";
	  eng[1] = "study";
	  eng[2] = "happy";
	  eng[3] = "array";
	  eng[4] = "project";
	   
	  String [] kor = new String[5]; // 영단어와 짝을 이룬 의미를 가진 한글단어 배열 선언 및 저장
	  kor[0] = "자바";
	  kor[1] = "공부";
	  kor[2] = "행복한";
	  kor[3] = "배열";
	  kor[4] = "과제";
	 
	 // "exit" 입력 전까지 계속 단어 입력하도록 반복문 생성
	 while(true) { 
	  System.out.println("영어 단어를 입력하세요: ");
	  Scanner input = new Scanner(System.in); // 입출력 클래스 생성 
	  String line = input.nextLine(); // 입력받은 값을 문자열로 저장
	  
	// 반복문 안에 if조건문을 통해 문자열에 특정 음료수명을 입력할 경우 음료수명마다 가격 설정
		  for(int i=0;i< eng.length;i++) { 
			  if (line.equals(eng[i])) {
					 System.out.println(kor[i]);
					 break; // for 반복문 종료. 밑에 break도 마찬가지.
		         }
			  // eng[i]를 배열길이만큼 반복했는데도 line과 모두 일치하지 않는다면 "찾을 수 없다"는 메세지 생성 
			  if (i==4) { 
				  if (!line.equals(eng[i]) &&!line.equals("exit")) {
					  System.out.println("해당단어를 찾을 수 없습니다.");	 
						 break;
			         } 
			  }
		  }
		 
		  if(line.equals("exit")) {
			     System.out.println("프로그램을 종료합니다.");
			      break; // while문 자체를 종료.
		  }
	 }
	
   } 
 }

