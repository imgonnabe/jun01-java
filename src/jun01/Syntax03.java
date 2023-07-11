package jun01;
//main 메소드에 적어야 실행된다.
class Apple{
	public static void main(String[] args) {
		System.out.println("애플 클래스 속 메인 메소드");
	}
}
public class Syntax03 {//Syntax03이름 같음
	public static void main(String[] args) {
		System.out.println("출력문");
		add1(10,20);//메소드 호출
	}
	static void add1(int num1, int num2) {
		System.out.println(num1*num2);
	}

}
/*
 * 
 * 단락주석
 * 
 */
/*문서 주석*/
