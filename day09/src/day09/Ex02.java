package day09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		/*
		 * Map
		 * - Ű�� ������ �� �ϳ��� ������ �̷���� ����
		 * - ������ �������� ������, Ű�� �ߺ��� ������� ����
		 */
		
		HashMap map = new HashMap();
		map.put("��ǳ��", "100����");
		map.put("������", "50����");
		map.put("�ڵ���", "10����");
		// ���� ���� Ű
		// get�� �� ���� Ű�� �̸��� ����
		map.put("��ǳ��", "1000����");
//		System.out.println(map);
		// �ߺ��� Ű ���� ������� ����
		// ������ �ִ� ���� ������
		
//		System.out.println(map.get("��ǳ��"));
//		System.out.println(map.get("������"));
//		System.out.println(map.get("���� ��"));
//		
//		
//		System.out.println(map.containsKey("�ڵ���"));
//		System.out.println(map.containsKey("���°�"));
		
		map.remove("��ǳ��");
//		System.out.println(map);
		
//		System.out.println(map.keySet());
		// map�� �ִ� key���� ������

//		Set set = map.keySet();
//		Iterator it = set.iterator();
		// ���� �� �� ���� ���ļ� �Ʒ�ó�� ��
		Iterator it = map.keySet().iterator();
		// iterator = �ݺ���
		// ���� while���� ���� �ش� ��Ҹ� �ϳ��� ����ϱ� ���� ��
		
		// it = [bof, �ڵ���, ��ǳ��, eof]
		// map = {�ڵ���: 10����, ��ǳ��: 100����}
		while(it.hasNext()) {
			String s = (String)it.next();
			System.out.println(s + ": " + map.get(s));
		}
		
		String k = "�츮��", v="���� 3��";
		map.put(k, v);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("ã�� �� �Է�");
		String search = input.next();
		
		if(map.get(search) == null) {
			System.out.println("�������� �ʴ� �ּ�");
		}else {
			System.out.println(search + ": " + map.get(search));
		}
		
		
		
		
		
		
		
		
	}

}
