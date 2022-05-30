package day09;
/*
 * 접근 제한자
 * - public: 클래스 내부, 외부에서 접근 가능
 * - private: 클래스 내부에서만 접근 가능
 * - protected: 상속받은 자식 또는 내부에서 접근 가능
 * - default: 같은 패키지 안에서 접근 가능
 */
import test.Member;

public class MainClass01 {
	public static void main(String[] args) {
		
		Member m = new Member();
		m.name = "박정원";
		
		TestClass01 t = new TestClass01();
		t.name = "박유덕"; // '.' <- 멤버 접근 연산자
		t.age = 40;
		System.out.println(t.name + t.age);
		
	}
}
