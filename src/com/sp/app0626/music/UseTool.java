package com.sp.app0626.music;

public class UseTool {

	public static void main(String[] args) {
		//불완전한 클래스는 인스턴스화할 수 없스비다.
		//추상클래스는 불완전하기 때문에, 자식에 의해 완성되기 전까지는
		//직접 new에 의해 인스턴스화 될 수 없다...
		//즉 자식에 의해 올라간다... 즉 자식을 new 하면 된다.
		//new MusicPlayer();	불가능
		Ipod p = new Ipod();

	}

}
