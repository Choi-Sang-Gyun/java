package ramda.anonymous.basic;

public class MainClass {

	public static void main(String[] args) {
		
		Person p = new Person();
		
//		p.greeting(new Say01() {
//			@Override
//			public void talking() {
//				// TODO Auto-generated method stub
//				System.out.println("안녕하시오~");
//			}
//		});
		
		p.greeting(() -> {
			System.out.println("안녕하세요");
		});
		
		
		
//		p.greeting(new Say02() {
//			
//			@Override
//			public void talking(String word) {
//				System.out.println(word);
//			}
//		});
		
		//1. 타입은 생략가능 (String)
		//2. 매개변수가 1개라면 ()도 생략이 가능
		//3. 프로그램 코드가 한줄이면 중괄호도 생략가능
		//4. {}를 생략하고 프로그램 코드가 1줄이면 return 키워드가 생략됨
		
		p.greeting( word -> System.out.println(word));
		
//		p.greeting(new Say03() {
//			
//			@Override
//			public String talking(String word, int i) {
//				return word+i;
//			}
//		});
		
		p.greeting((word, i) -> word + i);
		
		
		
		
	}
}
