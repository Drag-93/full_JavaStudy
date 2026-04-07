package org.java.collectionEx;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

import org.java.constraint.Role;
import org.java.dto.MemberDto;

public class CollectionEx {

	public static void main(String[] args) {

		System.out.println("Collection");

		System.out.println("List");

//		ArrayList<MemberDto> members= new ArrayList<MemberDto>();
//		List<MemberDto> members= new ArrayList<MemberDto>();
		//다형성
		List<MemberDto> memberDtos = new ArrayList<MemberDto>();
								// memberId -> Long
		memberDtos.add(new MemberDto(1L, "m1@email.com", "11", 10, "서울", Role.ROLE_MEMBER, LocalDateTime.now(), null));
		memberDtos.add(new MemberDto(2L, "m2@email.com", "51", 20, "부산", Role.ROLE_MEMBER, LocalDateTime.now(), null));
		memberDtos.add(new MemberDto(3L, "m3@email.com", "81", 70, "춘천", Role.ROLE_MEMBER, LocalDateTime.now(), null));
		
		System.out.println("for~each -> 확장형 for문");
		for (MemberDto memberDto : memberDtos) {
			System.out.println(memberDto.getUserEmail() + " "  + memberDto.getUserPw() + " " + memberDto.getAge());
		}
		System.out.println();		
		System.out.println(" forEach");	
		
		memberDtos.forEach(	member -> System.out.println(member.getUserEmail() + " " + member.getUserPw() + " " + member.getAge()));
		System.out.println();
		
		System.out.println(" 매서드 참조");	//-> 람다식을 줄인 형태	
		memberDtos.forEach(System.out::println);

		
		System.out.println();
		System.out.println();
//			
//		
		System.out.println("Set");
		//중복불가능, 주머니, 순서가 없다.
		Set<String> set = new HashSet<String>();
		// 1. 추가
		set.add("JAVA");
		set.add("SPINRG");
		set.add("REACT");
		set.add("RDBMS");
		set.add("RDBMS");//중복불가능 X
		// 2. 조회
		Iterator<String> iterator2 = set.iterator();
		while (iterator2.hasNext()) {
			String str = iterator2.next();
			System.out.print(str + " ");
		}
		System.out.println();
		for (String str : set) {
		    System.out.print(str + " ");
		}
		System.out.println();
//		System.out.println();
//
		
		
		System.out.println("Queue");
		// FIFO(선입 선출)
		Queue<Integer> queue = new LinkedList<Integer>();
		// 1. 추가
		for (int i = 1; i <= 100; i++) {
			queue.add(i);// 추가 1,2,3,4,,,,
		}
		System.out.println(queue);
		for (int i = 1; i <= 100; i++) {
			System.out.print(queue.poll() + " ");// 출력 처음부터 1,2,3
		}
		System.out.println();
//		Queue<String> printer = new LinkedList<String>();
		Queue<String> printer = new LinkedList<>();//<>생략 가능
		printer.add("1번 문서"); // 인쇄 요청
		printer.add("2번 문서");
		printer.add("3번 문서");
		//FIFO -> First In First Out -> 선입선출
		while (!printer.isEmpty()) {
		    System.out.println(printer.poll() + " 인쇄 완료!"); 
		}
			
		System.out.println();
		
		System.out.println("Stack");
		// FILO -> 선입후출 
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 1; i <= 100; i++) {
			stack.push(i);// 추가
		}		
		System.out.println(stack);
		for (int i = 0; i < 100; i++) {
			System.out.print(stack.pop() + " ");//조회
		}
		System.out.println();
		System.out.println();
				
		Stack<String> project = new Stack<>();
		project.push("Front");
		project.push("Back");
		project.push("Full"); // 현재 페이지

		System.out.println(project);
		
		System.out.println("마지막요소 제거 : " + project.pop()); //마자막요소제거 
		System.out.println("현재 : " + project.peek()); // 제거후 현재
		
		System.out.println(project);
		
		System.out.println();		
//		
				
		System.out.println("LinkedList");

		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		linkedList.add(100);//0번지
		linkedList.add(200);//1번지
		linkedList.add(300);//2번지
		linkedList.add(400);//3번지
		linkedList.add(500);//4번지
		
		System.out.println(linkedList);		
		linkedList.add(2,1500); // 2번지를 찾아서 1500을 추가
		//1. 연결 끊기: 1번 인덱스(200)와 2번 인덱스(300) 사이의 연결선 잠시 끊김
		//2. 노드(번지) 연결: 새 데이터(1500)가 1번 뒤에 붙고, 기존 2번이었던 300은 새 데이터 뒤로 연결
		System.out.println(linkedList);
		

		
//
//		
//		
		
		
	}
}
