package org.java.collectionEx;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx1 {

	public static void main(String[] args) {
		
		System.out.println("Stream");
		//배열 
		String[] strArr = { "java", "oracle", "mysql", "servlet", "spring" };		
		// 배열 -> List 변경
		List<String> strArrList = Arrays.asList(strArr);
		
		System.out.println("String[] strArr 조회");
		for (String str : strArrList) {
			System.out.print(str + " ");
		}
		System.out.println();
		System.out.println(" 배열 -> List 변경 ");
		strArrList.forEach(System.out::println); //매서드 참조		
		System.out.println();
		System.out.println(" 매서드 참조");		
		strArrList.forEach(System.out::print);		
		System.out.println();				
		// 배열 정렬
		Arrays.sort(strArr);/// java  mysql oracle servlet spring		
		// 컬렉션 정렬
		Collections.sort(strArrList);// java  mysql oracle servlet spring			
	
		System.out.println("===========================================");
		
		String[] strArr2 = { "java", "oracle", "mysql", "servlet", "spring" };
		List<String> strArrList2 = Arrays.asList(strArr);		
		// 배열을 Stream화
		Stream<String> stream1 = Arrays.stream(strArr2); //배열 -> Stream
		Stream<String> stream2 = strArrList2.stream();   // List ->Stream
		//배열
//		stream1.sorted().forEach(element -> {
//			System.out.println(element);
//		});
//		stream1.sorted().forEach(el->System.out.println(el));
		stream1.sorted().forEach(System.out::println);				
		System.out.println("=======List=========");
		
		//매서드체이닝 ->  매서드().매서드().. -> 매서드를 중복해서 사용가능
//		stream2.sorted().forEach(element->{
//			System.out.println(element);
//		});		
		stream2.sorted().forEach(System.out::println);
		//List -> Stream -> 정렬 -> 모든 요소-> System.out.println실행
		strArrList2.stream().sorted().forEach(System.out::println);
		
		//List -> Stream -> 정렬 -> List-> 모든 요소-> System.out.println실행
		strArrList2.stream().sorted().collect(Collectors.toList())
					.forEach(System.out::println);

		System.out.println();				
		System.out.println(" 정렬후 원본 데이터가 변경이 안 된다.");
		//List
		for (String str : strArrList2) {
			System.out.print(str + " ");
		}
		System.out.println();
		for (String str : strArr2) {
			System.out.print(str + " ");
		}
		System.out.println();
	}
}
