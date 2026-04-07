package org.java.collectionEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx1 {

	public static void main(String[] args) {

		System.out.println("Map<K,V>");
		// <키,값>
		Map<String, Integer> map0 = new HashMap<String, Integer>();
		// put -> 추가
		map0.put("일요일", 0);
		map0.put("월요일", 1);
		map0.put("화요일", 2);
		map0.put("수요일", 3);
		map0.put("목요일", 4);
		map0.put("금요일", 5);
		map0.put("토요일", 6);

		System.out.println(map0);
		Set<String> set0 = map0.keySet();// 키값을 저장 Set, 키는 중복X
		Iterator<String> iterator0 = set0.iterator(); // Iterator로 모드 요소조회

		while (iterator0.hasNext()) {
			String key0 = iterator0.next();
			// .get() -> 키갑 -> 조회
			System.out.print(map0.get(key0) + " ");
		}
		System.out.println();

		System.out.println();
		Map<Integer, String> map = new HashMap<Integer, String>();
		// 1. 추가
		map.put(new Integer(1), "JAVA"); // 자동박싱 Integer i=1;
		map.put(2, "SPRING");
		map.put(3, "JDBC");
		map.put(4, "SECURITY");
		map.put(5, "JPA");
		// 2. 조회
		String s1 = map.get(1);
		String s2 = map.get(2);
		String s3 = map.get(3);
		String s4 = map.get(4);
		String s5 = map.get(5);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println();

		// key값 -> Set
		Set<Integer> set = map.keySet();
		// Key값을 이용해서 출력
		Iterator<Integer> iterator = set.iterator();
		while (iterator.hasNext()) {
			Integer keyStr = iterator.next();
//			int keyStr2 = iterator.next();// 자동언박싱
			// 조회 -> 전체 목록 Map
			map.get(keyStr);
			System.out.println(map.get(keyStr));
		}

	}
}
