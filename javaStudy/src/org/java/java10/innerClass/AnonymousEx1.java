package org.java.java10.innerClass;

// 공통, 강제, 획일화, 팀플
interface In1 { // 1
//	public abstract void inf1();
	void inf1();
//	void inf11();
}

interface In2 extends In1 { // 1+1
	void inf2();
}

interface In3 extends In2 { // 1+1+1
	void inf3();
}

public class AnonymousEx1 {

	public static void main(String[] args) {
		// 익명클래스
		In1 in1 = new In1() {
			@Override
			public void inf1() {
				System.out.println("inf1-> 오버라이드");
			}
//		@Override
//		public void inf11() {
//			// TODO Auto-generated method stub
//			
//		}
		};
		in1.inf1();
		// 람다식 -> 구현매서드가 하나만
		In1 in12 = () -> {
			System.out.println("inf1-> 람다식");
		};
		In1 in13 = () -> System.out.println("inf1-> 람다식");

		In2 in2 = new In2() {

			@Override
			public void inf1() {
				System.out.println("inf1-> 오버라이드");

			}

			@Override
			public void inf2() {
				System.out.println("inf2-> 오버라이드");

			}
		};

		in2.inf1();
		in2.inf2();

		System.out.println();
				
		In3 in3 = new In3() {
			@Override
			public void inf1() {
				System.out.println("inf1-> 오버라이드");
			}

			@Override
			public void inf2() {
				System.out.println("inf2-> 오버라이드");
			}

			@Override
			public void inf3() {
				System.out.println("inf3-> 오버라이드");
			}
		};

		in3.inf1();
		in3.inf2();
		in3.inf3();

		System.out.println();

		// 다형성 이용 -> 강제..		
		In1 in14 = new In3() {
			@Override
			public void inf1() {
				System.out.println("inf1-> 오버라이드");
			}
			@Override
			public void inf2() {
				System.out.println("inf2-> 오버라이드");
			}
			@Override
			public void inf3() {
				System.out.println("inf3-> 오버라이드");
			}
		};
		in14.inf1();		
		
//		//다형성
		In2 in24 = new In3() {

			@Override
			public void inf1() {
				System.out.println("inf1-> 오버라이드");
			}

			@Override
			public void inf2() {
				System.out.println("inf2-> 오버라이드");
			}

			@Override
			public void inf3() {
				System.out.println("inf3-> 오버라이드");
			}
		};
		in24.inf1();
		in24.inf2();

	}
}