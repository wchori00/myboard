package tommy.spring.polymorphism;

public class SamsungTV implements TV {
	
	public SamsungTV() {
		System.out.println("�Ｚ TV ��ü ����");
	}
	public void powerOn() {
		System.out.println("SamsungTV ������ �Ҵ�");
	}
	public void powerOff() {
		System.out.println("SamsungTV ������ ����");
	}
	public void volumeUp() {
		System.out.println("SamsungTV ������ �ø���");
	}
	public void volumeDown() {
		System.out.println("SamsungTV ������ ������");
	}
	public void start() {
		System.out.println("��ü �ʱ�ȭ �۾� ó��");
	}
	public void stop() {
		System.out.println("��ü ���� ���� ó���� ���� ó��");
	}
	
}