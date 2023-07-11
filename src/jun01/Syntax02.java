package jun01;

public class Syntax02 {//신텍스 클래스
	int num() {
		return 1;
	}
	void add() {
		
	}
	static void saum() {//메소드
		
	}
	public static void print() {//프린트 메소드
		
		System.out.println("프린트 메소드입니다.");
	}
	public static void main(String[] args) {//메인 메소드 먼저하고 종료
		//명령어: 메소드 속에 들어가 있어야 한다.
		//선언, 대입, 초기화, 명령;
		String str = "메소드 속에서...";//str 변수 선언=초기화 ;명령어 끝남
		str="변경합니다.";//변수 변경
		System.out.println(str);//변수 출력
		int number=10; number=100;
		System.out.println(number);
		print();//프린트 메소드 호출하는 명령어. static
		Syntax02 s2=new Syntax02();
		s2.num();//non static 인스턴스명.num() 호출
	}
	
}
