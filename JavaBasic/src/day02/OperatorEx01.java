package day02;

public class OperatorEx01 {
	
	public static void main(String[] args) {
		
		//단항연산자
		
		//부호연산자 +, -
		int i = -3;
		int iiiiiii = +3; // (=3)

		//증감연산자
		int k = 1;
		int h = k++; // 후위연산 - 먼저 값을 대입하고, 맨 마지막에 증가
		
		System.out.println("k의 값: " + k);
		System.out.println("h의 값: " + h);
		
		int x = 1;
		int y = ++x;
		
		System.out.println("x의 값: " + x);
		System.out.println("y의 값: " + y);
		
		x=1;
		x++; // 일반적인 사용
		++x;
		x--;
		
		x=1;
		
		System.out.println(x++);
		System.out.println(++x);
		
		System.out.println("-----------------------------------------------");
		
		//비트연산자 ~ // 많이 안씀~
		byte b = 10; // 0000 1010
		System.out.println(~b); // 1111 0101
		System.out.println(~b + 1);
		System.out.println("-----------------------------------------------");
		
		//논리반전 연산자 ! - 부정의 의미(조건을 만들때 사용)
		
		System.out.println(!true);
		System.out.println(!false);
		
		boolean bool = !true;
		
		
	}

}
