package day09;

public class TestClass02 {
//접근제한자 반환타입 메소드명(매개변수(argument))
	public void test() {
		test2(); //그건 여기임 4
		System.out.println("test 메소드 실행");
	}
	public void test1() {
		System.out.println("test1 메소드 실행");
	} //출력이 끝나면 test1()을 호출했던 곳으로 돌아감 1
	public void test2() {
		test1(); // 그게 여기임 2
		System.out.println("test2 메소드 실행");
	} //출력이 끝나면 test2()를 호출했던 곳으로 돌아감 

}
