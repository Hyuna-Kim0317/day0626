package com.sp.app0626.music;

public abstract class MusicPlayer {
	//아래의 메서드는 실수에 의함이 아닌, 고의로 불완전하게 정의하였다.
	//이렇게 몸체 즉 {} 가 없는 메서드를 가리켜, 추상메서드라 한다...
	//추상메서드는, 개발 시점에 그 내용을 알 수 없거나, 작성하지 않아야 할 때,
	//즉 내용없이 기준만을 세울 때 사용된다...
	//단 하나라도 추상메서드가 포함된 클래스는 불완전하다 하여, 
	//전체가 추상클래스가 된다..
	public abstract void playMp3();	//mp3를 재생한다.
	public abstract void setVolume(int v);	//볼륨을 조절한다.
	//추상메서드 쓸 때 추상 메서드 뿐 아니라 일반 메서드도 같이 쓸 수 있다.
	public void charge() {
		
	}
}
