package day09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		/*
		 * Map
		 * - 키와 값으로 된 하나의 쌍으로 이루어져 있음
		 * - 순서는 유지되지 않으며, 키의 중복은 허용하지 않음
		 */
		
		HashMap map = new HashMap();
		map.put("선풍기", "100만원");
		map.put("에어컨", "50만원");
		map.put("자동차", "10만원");
		// 앞의 값이 키
		// get을 쓸 때는 키의 이름을 넣음
		map.put("선풍기", "1000만원");
//		System.out.println(map);
		// 중복된 키 값은 허용하지 않음
		// 기존에 있던 값을 수정함
		
//		System.out.println(map.get("선풍기"));
//		System.out.println(map.get("에어컨"));
//		System.out.println(map.get("없는 값"));
//		
//		
//		System.out.println(map.containsKey("자동차"));
//		System.out.println(map.containsKey("없는값"));
		
		map.remove("선풍기");
//		System.out.println(map);
		
//		System.out.println(map.keySet());
		// map에 있는 key들을 가져옴

//		Set set = map.keySet();
//		Iterator it = set.iterator();
		// 보통 위 두 줄을 합쳐서 아래처럼 씀
		Iterator it = map.keySet().iterator();
		// iterator = 반복자
		// 보통 while문을 통해 해당 요소를 하나씩 출력하기 위해 씀
		
		// it = [bof, 자동차, 선풍기, eof]
		// map = {자동차: 10만원, 선풍기: 100만원}
		while(it.hasNext()) {
			String s = (String)it.next();
			System.out.println(s + ": " + map.get(s));
		}
		
		String k = "우리집", v="종로 3가";
		map.put(k, v);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("찾을 값 입력");
		String search = input.next();
		
		if(map.get(search) == null) {
			System.out.println("존재하지 않는 주소");
		}else {
			System.out.println(search + ": " + map.get(search));
		}
		
		
		
		
		
		
		
		
	}

}
