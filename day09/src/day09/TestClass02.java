package day09;

public class TestClass02 {
//���������� ��ȯŸ�� �޼ҵ��(�Ű�����(argument))
	public void test() {
		test2(); //�װ� ������ 4
		System.out.println("test �޼ҵ� ����");
	}
	public void test1() {
		System.out.println("test1 �޼ҵ� ����");
	} //����� ������ test1()�� ȣ���ߴ� ������ ���ư� 1
	public void test2() {
		test1(); // �װ� ������ 2
		System.out.println("test2 �޼ҵ� ����");
	} //����� ������ test2()�� ȣ���ߴ� ������ ���ư� 

}
