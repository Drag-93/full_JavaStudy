package org.java.java13.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorEx0 {
public static void main(String[] args) {
	System.out.println("Vector");
	//1
	Vector<Integer>	v0 = new Vector<Integer>();
	//2 
	List<Integer> v1 = new ArrayList<Integer>();
	
	//추가 add(객체)
	v0.add(new Integer(10));
	v0.add(new Integer(20));
	v0.add(30);//자동boxing Integer i=30
	v0.add(40);
	v0.add(50);
	//길이(크기)
	int size = v0.size();
	System.out.println(size);
	System.out.println(v0);
	//5번지에 추가
	
	System.out.println(v0);
	v1.add(200);
	v1.add(300);
	v1.add(400);
	System.out.println(v1);
	System.out.println(v1.size());
	//벡터에 벡터를 추가
	System.out.println(v1.addAll(v0));
	//모든요소 삭제
//	v1.clear();
	System.out.println(v1);
	//벡터에 포함 되어 있느냐?
	System.out.println(v1.contains(200));//v1에 200 이 포함되어 있나?
	System.out.println(v1);
	v1.remove(0);//인덱스에 해당하는 요소 삭제
	System.out.println(v1);
	int i1=v1.get(0);//자동 언박싱 -> 특정요소 조회(하나)
	System.out.println(i1);
	
	System.out.println("모든 요소 조회");
	//2. 조회 -> 모든 요소
	List<Integer> v2= new Vector<Integer>();
	v2.add(100);
	v2.add(200);
	v2.add(300);
	v2.add(400);
	v2.add(500);
	
	
	
	
	//1for -> 개수를 개발자가 설정
	for (int i = 0; i < v2.size();i++) {
		System.out.println(v2.get(i)+" ");
	}
	System.out.println();
	//2.foreach**** -> 모든 요소를 조회
	for(Integer i : v2) {
		System.out.println(i+ " ");
	}
	System.out.println();
	//3. Iterator -> 공식 -> 객체를 직렬화
	Iterator<Integer> iterator = v2.iterator();
	while(iterator.hasNext()) {
//		Integer i2= iterator.next();
		int i2= iterator.next();
		System.out.println(i2+" ");
	}
	
	//DB데이터 조회 -> 비었다
	if(v2.isEmpty()) {
		System.out.println("조회할 데이터가 없음");
	}
	System.out.println();
	
	Vector<String> v3= new Vector<String>();
		System.out.println(v3);
		System.out.println(v3.isEmpty());
	if(v3.isEmpty()) {
		System.out.println("조회할 데이터가 없음");
	}
//	MemberDto member=null;
//	System.out.println(member);
//	if(member==null) {
//		System.out.println("조회할 회원이 존재하지 않습니다");
//	}
	
	
	
	
	
	
}
}
