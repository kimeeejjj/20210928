package co.kimej.prj;

public abstract class Animal { //하나이상의 abstract메소드 갖거나, 몸체가 비어있는 클래스 = 추상클래스
	public abstract void run(); //몸체{}없는메소드. 꼭 필요함! 추상클래스특.자기자신을 인스턴스로 생성못함(Animal animal = new Animal(); 이거못함)
	public void sleep() {
		System.out.println("잠을 잡니다.");
	}
}
