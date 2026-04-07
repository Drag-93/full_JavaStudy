package org.java.java13.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ArrayListEx1 {
	public static void main(String[] args) {
		System.out.println("ArrayList");//벡터와 사용법이 유사, 벡터의 최신
		//1. 순서가 있다.
		//2. 객체형 요소.
		//3. 데이터의 크기가 정해져 있지 않다.
		Vector<Integer> v1=new Vector<Integer>();
//		ArrayList<Integer> arr1= new ArrayList<Integer>();
		List<Integer>arr1= new ArrayList<Integer>();
		
		//1. 추가
		List<Integer> arr2=new ArrayList<Integer>();
		arr2.add(10);
		arr2.add(20);
		arr2.add(30);
		arr2.add(40);
		arr2.add(50);
		
		//2. 조회
		//확장형 for -> 확장형 for문, foreach
		for(Integer i :arr2) {
			System.out.println(i+ " ");
		}
		System.out.println();
		System.out.println(arr2);
		System.out.println(arr2.size());
		
//		arr2.clear();
		System.out.println(arr2.size());
		System.out.println(arr2);
		System.out.println(arr2.contains(new Integer(20)));
		System.out.println(arr2.contains(10));
		arr2.clear();//모든 요소 삭제
		if(arr2.isEmpty()) {
			System.out.println("조회 데이터가 없습니다");//List가 비엇으면 예외발생
			try {	//실행중 예외
				throw new RuntimeException("조회 데이터가 없습니다");
			}catch(RuntimeException e) {
				e.printStackTrace();//예외처리 -> 정상실행 목록
			}
		}else {
//			return "조회한 데이터를 변환"
		}
		System.out.println("정상실행");
		System.out.println(arr2);
//		arr2.remove(0);//index->요소 삭제
		System.out.println(arr2);
		//Iterator ***
		Iterator<Integer> iterator= arr2.iterator();
		while(iterator.hasNext()) {
			Integer i = iterator.next();
			System.out.println(i+" ");
		}
		
		
		System.out.println("forEach");
		//foreach -> List -> 요소 -> 조회
		arr2.forEach(element->{
			System.out.println(element+" ");
		});
		arr2.forEach(element-> System.out.println(element+" "));
		
		System.out.println();
		
		
		
		
		
		
		
	}
}
