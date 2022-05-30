package day09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		HashMap menu = new HashMap();
		
		while(true) {
			System.out.println("===============");
			System.out.println("1. 메뉴 등록");
			System.out.println("2. 메뉴별 가격 보기");
			System.out.println("3. 종료");
			System.out.println("===============");
			System.out.print(">>>");
			int user = input.nextInt();
			
			if(user==3) {
				System.out.println("시스템을 종료합니다.");
				break;
			}else if(user==1) {
				while(true) {
					System.out.println("메뉴를 등록합니다.");
					System.out.print("메뉴 이름: ");
					String name = input.next();
					
					if(menu.containsKey(name)){
						System.out.println("이미 존재하는 메뉴입니다.");
						continue;
					}else {
						System.out.print("메뉴 가격: ");
						String price = input.next();
						
						menu.put(name, price);
						break;
					}
				}
			}else if(user==2) {
				
				System.out.println("메뉴별 가격을 확인합니다.");
				Iterator it = menu.keySet().iterator();
				
				while(it.hasNext()) {
					String str = (String)it.next();
					System.out.println(str + ": " + menu.get(str) + "원");
				}
				System.out.println("1. 수정 2. 삭제 3. 나가기");
				System.out.print(">>>");
				user = input.nextInt();
				if(user==3) {
					continue;
				}else if(user==1) {
					System.out.println("메뉴를 수정합니다.");
					System.out.print("수정할 메뉴 이름: ");
					
					String name = input.next();
					if(menu.containsKey(name)) {
						System.out.print("수정할 가격: ");
						String price = input.next();
						menu.put(name, price);
					}else if(menu.containsKey(name)==false) {
						System.out.println("없는 메뉴입니다.");
						continue;
					}
					
				}else if(user==2) {
					System.out.println("메뉴를 삭제합니다.");
					System.out.print("삭제할 메뉴 이름: ");
					
					String name = input.next();
					if(menu.containsKey(name)) {
						menu.remove(name);
						System.out.println("삭제되었습니다.");
					}else if(menu.containsKey(name)==false) {
						System.out.println("없는 메뉴입니다.");
						continue;
					}
				}
			}else {
				System.out.println("다시 입력해주세요.");
				continue;
			}
		}
		
		
		
		
		

	}

}
