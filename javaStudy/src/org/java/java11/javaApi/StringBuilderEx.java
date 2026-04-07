package org.java.java11.javaApi;

public class StringBuilderEx {
	public static void main(String[] args) {
		//StringBuffer와 유사
		//OpenApi에서 제공되어지는 데이터를 get
		//OpenApi에서 샘플예제를 이용해서 작성
		StringBuffer sb =new StringBuffer("java");
		StringBuilder sf = new StringBuilder("java");
		System.out.println(sb);
		System.out.println(sf);
		
		//원문자열이 변한다.
		sf.append(" Spring");
		System.out.println(sf);
		System.out.println();
				
		StringBuilder responseBody = new StringBuilder();
		responseBody.append("[ ");
		for (int i = 0; i < 5; i++) {
		responseBody.append("{'moveTitle': move" + i + "} ");
		}
		responseBody.append("] \n");
		System.out.println(responseBody);
		String dbMovieData = responseBody.toString();
		System.out.println(dbMovieData);

		System.out.println("================================");
				
				
		StringBuilder sf2 = new StringBuilder("Java Spring Web");
		System.out.println(sf2+" <<");
		sf2.append(" 2026");   // 선택자.append() -> 선택자 마지막요소 다음에 추가
		System.out.println(sf2);

		System.out.println(sf2.delete(0, 5)); // 삭제
		System.out.println(sf2+" <<");
		System.out.println(sf2.insert(0, "JAVA "));
				
		System.out.println(sf2+" <<");
		//String -> 1
		System.out.println(sf2.toString()+" << String");
		//String -> 2
		System.out.println(String.valueOf(sf2)+" << String");
				
		String str="";
		str+="<div>";
		str+="<h1>HelloWorld!</h1>";
		str+="</div>";
				
		System.out.println(str);
		System.out.println("================================");
				
		String responseBodyStr = new String();
		responseBodyStr+="[\n";
		for (int i = 0; i < 5; i++) {
			responseBodyStr+="\t{'moveTitle': move" + i + "}\n";
		}
		responseBodyStr+="]\n";
				
	System.out.println(responseBodyStr);
	
		
		
	}
}


