package day09;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Ex01 {

	/*
	 * Set
	 * - ������ �������� ����
	 * - �ߺ��� ���� ������� ����
	 */
	public static void main(String[] args) {
		
		ArrayList arr = new ArrayList();
		arr.add("������"); arr.add("������");
		System.out.println("arr: " + arr);

		
		HashSet hs = new HashSet();
		hs.add("������"); hs.add("������");
		hs.add("������");
		System.out.println(hs.remove("������")); // -> ó���� �� �Ǹ� true ���
		System.out.println("hs: " + hs);
		// �ߺ��� ���� ������� ����
		
		hs.add("������");
		
		// it = [bof, '������', '������', eof]
		// iterator�� ����� ������ ���� �տ��� bof, ���� �ڿ��� eof�� ��
		// bof: ���⼭���� ���� / eof: �� �ڿ��� ���̻� ������ ����
		Iterator it = arr.iterator();
		
		/*
		System.out.println(it.hasNext()); //���� ��ġ�� �������� ����? -> true
		System.out.println(it.next()); //���� �ִ� ��ġ�� ���� ���� ������ -> ������(1)
		
		System.out.println(it.hasNext()); // -> true
		System.out.println(it.next()); // -> ������(2)
		
		System.out.println(it.hasNext()); // -> false
		System.out.println(it.next()); // -> ����Ұ�
		*/
		
		// �� ��ɾ �ݺ������� ����� �Ʒ��� ����
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		it = hs.iterator();
		while(it.hasNext()) {
			Object s = it.next();
			String st = (String)s;
			System.out.println(st);
		}
		
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		System.out.println(s1);
		
		
	}

}
