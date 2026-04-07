package org.java.java11.service;

import java.util.List;

import org.java.java11.dto.MemberDto;

//@Service
public interface MemberService {
	int save(MemberDto memberDto);	//insert
	int saveUpdate(MemberDto memberDto);	//update
	int deleteById(MemberDto memberDto);	//delete
	
	//제네릭 -> 컬렉션프레임워크 List<E>
	List<MemberDto> findAll();	//select
}
