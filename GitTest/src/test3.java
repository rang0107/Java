// ����3) 

import java.util.Scanner;

public class test3 {
  public static void main(String[] args) {
	
	  String [] eng = new String[5]; // ���ܾ� �迭 ���� �� ���� 
	  eng[0] = "java";
	  eng[1] = "study";
	  eng[2] = "happy";
	  eng[3] = "array";
	  eng[4] = "project";
	   
	  String [] kor = new String[5]; // ���ܾ�� ¦�� �̷� �ǹ̸� ���� �ѱ۴ܾ� �迭 ���� �� ����
	  kor[0] = "�ڹ�";
	  kor[1] = "����";
	  kor[2] = "�ູ��";
	  kor[3] = "�迭";
	  kor[4] = "����";
	 
	 // "exit" �Է� ������ ��� �ܾ� �Է��ϵ��� �ݺ��� ����
	 while(true) { 
	  System.out.println("���� �ܾ �Է��ϼ���: ");
	  Scanner input = new Scanner(System.in); // ����� Ŭ���� ���� 
	  String line = input.nextLine(); // �Է¹��� ���� ���ڿ��� ����
	  
	// �ݺ��� �ȿ� if���ǹ��� ���� ���ڿ��� Ư�� ��������� �Է��� ��� ��������� ���� ����
		  for(int i=0;i< eng.length;i++) { 
			  if (line.equals(eng[i])) {
					 System.out.println(kor[i]);
					 break; // for �ݺ��� ����. �ؿ� break�� ��������.
		         }
			  // eng[i]�� �迭���̸�ŭ �ݺ��ߴµ��� line�� ��� ��ġ���� �ʴ´ٸ� "ã�� �� ����"�� �޼��� ���� 
			  if (i==4) { 
				  if (!line.equals(eng[i]) &&!line.equals("exit")) {
					  System.out.println("�ش�ܾ ã�� �� �����ϴ�.");	 
						 break;
			         } 
			  }
		  }
		 
		  if(line.equals("exit")) {
			     System.out.println("���α׷��� �����մϴ�.");
			      break; // while�� ��ü�� ����.
		  }
	 }
	
   } 
 }

