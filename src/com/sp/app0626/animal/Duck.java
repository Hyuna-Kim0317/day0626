package com.sp.app0626.animal;

//최상위 클래스인 Object를 import 하지 않아도 사용가능한 이유??
//자바 프로그램 개발시 그 사용 빈도가 너무 너무 높은 경우, java.lang 이라는 패키지에서
//주요 클래스들을 지원하며, 이 java.lang(language) 패키지는 개발자가 import 하지 않아도
//접근이 가능하다. 즉, object 도 java.lang 에 들어 있다.

public class Duck extends Bird{
	String name = "도날드";	//인스턴스 변수 .. 인스턴스 생성 전에는 못 쓴다. new 를 해야 한다.
										//this, super : 레퍼런스 변수.. this(앞에는 인스턴스가... 라는 말이 붙는다.)
	
										//최상위 객체 : object
										//duck 이 올라가기 전에 object 가 먼저 생성된다.
	//객체 자료형에서는 가리킬 수 있는 범위가 커야 상위
	
	public void fly() {
		
		System.out.println("오리가 난다.");
	}
	
	
	public static void main(String[] args) {
		//Bird b = new Duck(); // 가능 .. *** 중요 ***중요***
		Duck d = new Duck();
		
		Bird b=d;
		System.out.println(b.name);
		
		
		//자식이 업그레이드 한 경우 무조건 자식의 메서드 호출
		b.fly();
		
		
		//d.toString();
		
		
		//String x = "5";
		//Integer.parseInt(x);
		
	}

}
