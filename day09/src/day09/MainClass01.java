package day09;
/*
 * ���� ������
 * - public: Ŭ���� ����, �ܺο��� ���� ����
 * - private: Ŭ���� ���ο����� ���� ����
 * - protected: ��ӹ��� �ڽ� �Ǵ� ���ο��� ���� ����
 * - default: ���� ��Ű�� �ȿ��� ���� ����
 */
import test.Member;

public class MainClass01 {
	public static void main(String[] args) {
		
		Member m = new Member();
		m.name = "������";
		
		TestClass01 t = new TestClass01();
		t.name = "������"; // '.' <- ��� ���� ������
		t.age = 40;
		System.out.println(t.name + t.age);
		
	}
}
