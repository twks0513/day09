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
			System.out.println("1. �޴� ���");
			System.out.println("2. �޴��� ���� ����");
			System.out.println("3. ����");
			System.out.println("===============");
			System.out.print(">>>");
			int user = input.nextInt();
			
			if(user==3) {
				System.out.println("�ý����� �����մϴ�.");
				break;
			}else if(user==1) {
				while(true) {
					System.out.println("�޴��� ����մϴ�.");
					System.out.print("�޴� �̸�: ");
					String name = input.next();
					
					if(menu.containsKey(name)){
						System.out.println("�̹� �����ϴ� �޴��Դϴ�.");
						continue;
					}else {
						System.out.print("�޴� ����: ");
						String price = input.next();
						
						menu.put(name, price);
						break;
					}
				}
			}else if(user==2) {
				
				System.out.println("�޴��� ������ Ȯ���մϴ�.");
				Iterator it = menu.keySet().iterator();
				
				while(it.hasNext()) {
					String str = (String)it.next();
					System.out.println(str + ": " + menu.get(str) + "��");
				}
				System.out.println("1. ���� 2. ���� 3. ������");
				System.out.print(">>>");
				user = input.nextInt();
				if(user==3) {
					continue;
				}else if(user==1) {
					System.out.println("�޴��� �����մϴ�.");
					System.out.print("������ �޴� �̸�: ");
					
					String name = input.next();
					if(menu.containsKey(name)) {
						System.out.print("������ ����: ");
						String price = input.next();
						menu.put(name, price);
					}else if(menu.containsKey(name)==false) {
						System.out.println("���� �޴��Դϴ�.");
						continue;
					}
					
				}else if(user==2) {
					System.out.println("�޴��� �����մϴ�.");
					System.out.print("������ �޴� �̸�: ");
					
					String name = input.next();
					if(menu.containsKey(name)) {
						menu.remove(name);
						System.out.println("�����Ǿ����ϴ�.");
					}else if(menu.containsKey(name)==false) {
						System.out.println("���� �޴��Դϴ�.");
						continue;
					}
				}
			}else {
				System.out.println("�ٽ� �Է����ּ���.");
				continue;
			}
		}
		
		
		
		
		

	}

}
