
import java.util.Arrays;
import java.util.Scanner;

						
public class EX4_18_2 {				///////첫번째 코드 연습 20221231 /////

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
				
	
	System.out.println("서브웨이에 오신 것을 환영합니다.");
		
		String[] menu1 = {"(1)화이트","(2)오트","(3)플랫"};
		String[] menu2 = {"(1)비프","(2)베이컨","(3)치킨"};
		String[] menu3 = {"(1)케쳡","(2)머스터드","(3)칠리","(4)소스없이"};	
		
		while(true) { 
			System.out.println("먼저 원하시는 빵을 선택해 주세요."+Arrays.toString(menu1)+"(종료 : 0)>");//배열 자동불러오기
			int choice1 = scanner.nextInt();	//int 형식으로
			
			if(choice1==0) {
			break; 			// while문 벗어나기 
			} else if (!(0<=choice1 && choice1<=menu1.length)) {	//범위를 배열길이만큼만 지정->추후 옵션추가시 편리
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.>");
				continue;		//while문으로 복귀 
			}
			System.out.println(menu1[choice1-1]+"을(를) 선택하셨습니다.");		//1입력시-1을 해줘야 0번째 메뉴 출력
			
			for(;;) {			
			System.out.println("두번째로 원하시는 패티 종류를 선택해 주세요."+Arrays.toString(menu2)+"(종료 : 0)>");
			int choice2 = scanner.nextInt();	
			
				if(choice2==0) {
					break;
				} else if(!(0<=choice2 && choice2<=menu2.length)) {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.>");
					continue;				//상위 for문으로 복귀, for문 안하면 while문 옵션1로 복귀해버림 
					} System.out.println(menu2[choice2-1]+"을(를) 선택하셨습니다.");
			
			for(;;) {	
			System.out.println("마지막으로 원하시는 소스를 선택해 주세요."+Arrays.toString(menu3)+"(종료 : 0)>");
			int choice3 = scanner.nextInt();
				if(choice3==0) {
					break;
				} else if(!(0<=choice3 && choice3<=menu3.length)) {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.>");
					continue;				//마찬가지로 상위 for문으로 복귀 
					} System.out.println(menu3[choice3-1]+"을(를) 선택하셨습니다.");
			 
			System.out.printf("주문하신 샌드위치는 "+menu1[choice1-1]+"빵에 "+menu2[choice2-1]+" 패티,"+menu3[choice3-1]+"을(를) 선택하셨습니다.");
			//int choice[]들이 동일한 while문 안에  적용 가능 (while-for문 안에 2겹???으로 갇혀있으면 안됨)
			
			System.out.println("맛있게 드세요.");break; //2번 for문 탈출
				} break; 	// 2번 for문 탈출
			}
			break;	//while문 탈출 
		} System.out.println("안녕히 가세요.");
	} //main
}	//class 


