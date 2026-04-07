package org.java.collectionEx;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx3 {

	public static void main(String[] args) {

		System.out.println("Stream");

		List<String> list = new ArrayList<String>();
		list.add("ma1");
		list.add("a1");
		list.add("ca1");
		list.add("ta1");
		list.add("r1");
		list.add("r1a");
		list.add("r100a");
		System.out.println();
		// 1. Stream
		Stream<String> stream1 = list.stream();
		// 2. 출력
		System.out.println("forEach -> 조회");
		System.out.println();
		stream1.forEach(el -> {
			System.out.println(el + " ");
		});
		System.out.println(); // Stream은 한번만 사용
//		stream1.forEach(el->System.out.println(el+" "));
		list.stream().forEach(el -> System.out.println(el + " "));
		System.out.println();

		list.stream().forEach(System.out::println);// Stream은 한번만 사용
		System.out.println();

		// 3.필터링
		System.out.println("filter -> return(필터링)");
		// List
		// Stream -> "a"가포함되어 있는 요소를 List<>화
		List<String> list2 = list.stream().filter(el -> el.contains("a")) // 필터링 ->Stream
				.collect(Collectors.toList()); // Stream->List -> return
		// Stream -> "a"로 시작되어 있는 요소를 List<>화
		List<String> list3 = list.stream().filter(el -> el.startsWith("a")).collect(Collectors.toList());
		// Stream -> "1"로 끝나는 요소를 List<>화
		List<String> list4 = list.stream().filter(el -> el.endsWith("1")).collect(Collectors.toList());
		// List 출력
		list2.forEach(System.out::println);
		System.out.println();
		list3.forEach(System.out::println);
		System.out.println();
		list4.forEach(System.out::println);
		System.out.println();

		// 4. map() -> Stream모든 요소를 조회 후 결과를 return
		System.out.println("map -> return");
		// List -> Stream화
		Stream<String> stream2 = list.stream();
//
		List<String> list5 = stream2.map(el -> el.toUpperCase()) // stream2 모든요소를 -> 대문자
				.collect(Collectors.toList()); // List ->return
//		모든요소 조회
		list5.forEach(System.out::println);
		System.out.println();

		// 매서드체이닝 -> 매서드를 .으로 연결해서 사용할 수 있다.
		list.stream().filter(el -> el.contains("a")) // "a"포함
//				.map(el -> el.toUpperCase()) // "a"포함 -> 대문자
				.map(String::toUpperCase) // "a"포함된 모든 요소를 ->대문자로변경
				.collect(Collectors.toList())// List
				.forEach(System.out::println); // 출력

	}
}
