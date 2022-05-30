package day09;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Ex01 {

	/*
	 * Set
	 * - 순서를 유지하지 않음
	 * - 중복된 값은 허용하지 않음
	 */
	public static void main(String[] args) {
		
		ArrayList arr = new ArrayList();
		arr.add("박유덕"); arr.add("박유덕");
		System.out.println("arr: " + arr);

		
		HashSet hs = new HashSet();
		hs.add("박유덕"); hs.add("박정원");
		hs.add("박유덕");
		System.out.println(hs.remove("박유덕")); // -> 처리가 잘 되면 true 출력
		System.out.println("hs: " + hs);
		// 중복된 값은 허용하지 않음
		
		hs.add("박유덕");
		
		// it = [bof, '박유덕', '박유덕', eof]
		// iterator로 만들면 무조건 제일 앞에는 bof, 제일 뒤에는 eof가 들어감
		// bof: 여기서부터 시작 / eof: 이 뒤에는 더이상 데이터 없음
		Iterator it = arr.iterator();
		
		/*
		System.out.println(it.hasNext()); //현재 위치의 다음값이 있음? -> true
		System.out.println(it.next()); //현재 있는 위치의 다음 값을 가져옴 -> 박유덕(1)
		
		System.out.println(it.hasNext()); // -> true
		System.out.println(it.next()); // -> 박유덕(2)
		
		System.out.println(it.hasNext()); // -> false
		System.out.println(it.next()); // -> 실행불가
		*/
		
		// 위 명령어를 반복문으로 만들면 아래와 같다
		
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
