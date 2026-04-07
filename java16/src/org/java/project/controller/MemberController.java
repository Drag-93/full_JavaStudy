package org.java.project.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.java.project.dto.MemberDto;
import org.java.project.service.MemberService;
import org.java.project.service.impl.MemberServiceImpl;

public class MemberController {

	public static void main(String[] args) {
		
		
		MemberService service=null;
		
		
		service=new MemberServiceImpl();
	
		
		Map<String, List<MemberDto>> map=new HashMap<String, List<MemberDto>>();		
		
		List<MemberDto> memberDtos= service.memberDtos();		
		
		map.put("memberList", memberDtos);		
	
		//return map;
		// react  -> JSON
		
	}
}
