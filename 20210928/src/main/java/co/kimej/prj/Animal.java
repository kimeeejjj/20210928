package co.kimej.prj;

public abstract class Animal { //�ϳ��̻��� abstract�޼ҵ� ���ų�, ��ü�� ����ִ� Ŭ���� = �߻�Ŭ����
	public abstract void run(); //��ü{}���¸޼ҵ�. �� �ʿ���! �߻�Ŭ����Ư.�ڱ��ڽ��� �ν��Ͻ��� ��������(Animal animal = new Animal(); �̰Ÿ���)
	public void sleep() {
		System.out.println("���� ��ϴ�.");
	}
}
