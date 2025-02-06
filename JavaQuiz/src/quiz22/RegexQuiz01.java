package quiz22;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz01 {

	public static void main(String[] args) {
		
		/*
		 * 가격 형식만 찾아서 순서대로 출력해 보세요
		 * 
		 * 4,500원
		 * 1,200원
		 * 6000원
		 */
		
		String str = "헐4,500원 일수도 있고~ 1,200원 일수도 있지. 하지만 가격은 6000원 일 수도 있어";
		
		String pattern1 = "\\d{1}+,?\\d{3}+";
		
		Pattern p = Pattern.compile(pattern1);
		Matcher m = p.matcher(str);
		
		for(int i = 1; i <= 3; i++) {
			if(m.find(i)) {
				System.out.println(m.group() + "원");
			}
		}
		
//		String pattern2 = "\\d{4}";
//		Pattern p2 = Pattern.compile(pattern2);
//		Matcher m2 = p2.matcher(str);
//		
//		if(m2.find()) {
//			System.out.println(m2.group() + "원");
//		}
		
		
		
	}
	
	
}
