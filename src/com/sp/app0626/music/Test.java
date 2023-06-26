package com.sp.app0626.music;

public class Test {
	public static void main(String[] args) {
		//상수
		//공개되어 있어야 한다.
		//모든 인스턴스가 쳐다볼 수 있어야 함
		//변하면 안된다.
		//public static final int x=5;
		//더이상 변경할 수 없다!!
		final int x = 5;

		//메서드 적용 : 상속관계에서 오버라이드 불허
		//클래스 적용 : 상속을 허용하지 않음
		//x=7;
	}
}
