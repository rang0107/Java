// ����1) 

import java.util.Scanner;

public class test1 {
  public static void main(String[] args) {
	  
	  // 2���� �������� �����ֱ� ���� �ݺ���.
	  while(true) {
	  System.out.print("(x , y)�� ��ǥ�� �Է��ϼ��� : ");
	  Scanner input = new Scanner(System.in);  // ����� Ŭ���� ���� 
	  String line = input.nextLine(); // �Է¹��� ���� ���ڿ��� ����
	  String[] str = line.split(","); // ��ǥ�� �������� ���ڿ��� ���� �迭�� ���� 
	  
	  int num1 = Integer.parseInt(str[0]); // ������ ���ڿ��� ���ڷ� ��ȯ 
	  int num2 = Integer.parseInt(str[1]);
	  
	  // ���ǹ��� Ȱ���Ͽ� �����ȿ� ���� �ִٸ� �ùٸ� ��� ����
	  if ( 100<=num1 && num1<=200 && 100<=num2 && num2<=200) { 
		  System.out.printf(
				  "�� (%d,%d)�� (100,100)~(200,200) ������ �簢�� ���� ��ġ�� �ֽ��ϴ�.\n",num1,num2);  
	  } else {
		  System.out.printf(
				  "�� (%d,%d)�� (100,100)~(200,200) ������ �簢�� �ۿ� ��ġ�� �ֽ��ϴ�.",num1,num2);
		break; // �簢�� �ۿ� ���� ��ġ�� ��� ����.
	  }
    }
  }
}
