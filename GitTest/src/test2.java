// ����2) 

import java.util.Scanner;

public class test2 {
  public static void main(String[] args) {
	  int price = 0 ;  // ������� �� ���� ���� ���� �� �ʱ�ȭ 
	  
	  // 3���� �������� �����ִ� ���� �Է� �ݺ�
	  while(true) { 
	  
	  System.out.print("������� ������ ������ �Է��ϼ���: ");
	  Scanner input = new Scanner(System.in); // ����� Ŭ���� ���� 
	  String line = input.nextLine(); // �Է¹��� ���� ���ڿ��� ����
	  String[] str = line.split(" "); // ��ǥ�� �������� ���ڿ��� ���� �迭�� ���� 
	  int num = Integer.parseInt(str[1]); // �ڿ� �Է��� ���ڿ��� ���ڷ� ��ȯ 
	  
	  // ���ǹ��� ���� ���ڿ��� Ư�� ��������� �Է��� ��� ��������� ���� ����
	  switch (str[0]) { 
	    case "�Ƹ޸�ī��" : 
	    	price = 3000 * num; // ����� ���� * ��ȯ�� ����(����) 
	    break;
	    case "īǪġ��" : 
	    	price = 3300 * num; 	    	
	    break;
	    case "ī���" : 
	    	price = 3500 * num; 	    	
	    break;
	    case "���ν����" : 
	    	price = 4000 * num; 
	    break;
	  }
	  
	  
	  
	  // ������ 2������ ���� ��� 10% �������ְ�, �ƴ� ��� �״�� ����ϸ� �����ݾ��� �˷��ش�.
	  if ( price >= 20000 ) { 
  		price = (int)(price * 0.9) ;
  		System.out.println("������ �ݾ��� " + price +"���Դϴ�.");
  	}
  	  else {
  			System.out.println("������ �ݾ��� " + price +"���Դϴ�.");
  	}
	  
	  // �����ؾ� �� ������ �˷��� �� ���� ���� �ݾ��� �Է��Ѵ�. 
	  System.out.print("�󸶸� �����Ͻðڽ��ϱ�? ");
	  Scanner input2 = new Scanner(System.in);
	  int payment = input2.nextInt();
	  int change = 0; // �Ž����� ���� ���� �� �ʱ�ȭ
	  
	  // ���� ���ұݾ��� ���ݺ��� ���� ��� �ݾ� ���� �޼����� ����, �ƴϸ� �Ž������� ������ �˷��ش�.
	  if ( payment >= price) {
	    change = payment - price ;
	    System.out.println("�Ž������� "+ change +"���Դϴ�.�����մϴ�.\n"); 
	  } else { 
		System.out.println("�ݾ��� �����մϴ�.");  
		break;  // �ݾ� ������ ��� ����.
	  }
	  
	}
  }
}
