
import java.util.Arrays;
import java.util.Scanner;

						
public class EX4_18_2 {				///////ù��° �ڵ� ���� 20221231 /////

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
				
	
	System.out.println("������̿� ���� ���� ȯ���մϴ�.");
		
		String[] menu1 = {"(1)ȭ��Ʈ","(2)��Ʈ","(3)�÷�"};
		String[] menu2 = {"(1)����","(2)������","(3)ġŲ"};
		String[] menu3 = {"(1)�ɫ�","(2)�ӽ��͵�","(3)ĥ��","(4)�ҽ�����"};	
		
		while(true) { 
			System.out.println("���� ���Ͻô� ���� ������ �ּ���."+Arrays.toString(menu1)+"(���� : 0)>");//�迭 �ڵ��ҷ�����
			int choice1 = scanner.nextInt();	//int ��������
			
			if(choice1==0) {
			break; 			// while�� ����� 
			} else if (!(0<=choice1 && choice1<=menu1.length)) {	//������ �迭���̸�ŭ�� ����->���� �ɼ��߰��� ��
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.>");
				continue;		//while������ ���� 
			}
			System.out.println(menu1[choice1-1]+"��(��) �����ϼ̽��ϴ�.");		//1�Է½�-1�� ����� 0��° �޴� ���
			
			for(;;) {			
			System.out.println("�ι�°�� ���Ͻô� ��Ƽ ������ ������ �ּ���."+Arrays.toString(menu2)+"(���� : 0)>");
			int choice2 = scanner.nextInt();	
			
				if(choice2==0) {
					break;
				} else if(!(0<=choice2 && choice2<=menu2.length)) {
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.>");
					continue;				//���� for������ ����, for�� ���ϸ� while�� �ɼ�1�� �����ع��� 
					} System.out.println(menu2[choice2-1]+"��(��) �����ϼ̽��ϴ�.");
			
			for(;;) {	
			System.out.println("���������� ���Ͻô� �ҽ��� ������ �ּ���."+Arrays.toString(menu3)+"(���� : 0)>");
			int choice3 = scanner.nextInt();
				if(choice3==0) {
					break;
				} else if(!(0<=choice3 && choice3<=menu3.length)) {
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.>");
					continue;				//���������� ���� for������ ���� 
					} System.out.println(menu3[choice3-1]+"��(��) �����ϼ̽��ϴ�.");
			 
			System.out.printf("�ֹ��Ͻ� ������ġ�� "+menu1[choice1-1]+"���� "+menu2[choice2-1]+" ��Ƽ,"+menu3[choice3-1]+"��(��) �����ϼ̽��ϴ�.");
			//int choice[]���� ������ while�� �ȿ�  ���� ���� (while-for�� �ȿ� 2��???���� ���������� �ȵ�)
			
			System.out.println("���ְ� �弼��.");break; //2�� for�� Ż��
				} break; 	// 2�� for�� Ż��
			}
			break;	//while�� Ż�� 
		} System.out.println("�ȳ��� ������.");
	} //main
}	//class 


