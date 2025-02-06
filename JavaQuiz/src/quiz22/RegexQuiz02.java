package quiz22;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz02 {

	public static void main(String[] args) {
		
		//상품번호, GS25, (상품명), 가격 분리해서 출력.
		String str = "123123-45644 GS25(치킨도시락) 4,400원";
		String str2 = "123123-3453454 GS25(마늘햄쌈) 5,000원";
		String str3 = "123456-3453 GS(김혜자도시락) 6,000";
		String[] arr = {str, str2, str3};
		
		//패턴 4개
		
		String pattern1 = "[0-9]+-[0-9]+";
		String pattern2 = "[A-Z]+[0-9]*"; // GS25|GS
		String pattern3 = "\\([가-힣]+\\)";
		String pattern4 = "[0-9]+,[0-9가-힣]+";
		
		Pattern p1 = Pattern.compile(pattern1);
		Pattern p2 = Pattern.compile(pattern2);
		Pattern p3 = Pattern.compile(pattern3);
		Pattern p4 = Pattern.compile(pattern4);
		
		for(int i = 0; i < arr.length; i++) {
		
			Matcher m1 = p1.matcher(arr[i]);
			Matcher m2 = p2.matcher(arr[i]);
			Matcher m3 = p3.matcher(arr[i]);
			Matcher m4 = p4.matcher(arr[i]);
			
			if(i == 0) {
				System.out.println((i+1)+"번 편의점");
			} else {
				System.out.println("\n"+(i+1)+"번 편의점");
			}
			
			if(m1.find()) {
				System.out.println("상품번호:"+m1.group());			
			}
			
			if(m2.find()) {
				System.out.println("편의점:"+m2.group());
			}
			
			if(m3.find()) {
				System.out.println("상품명:"+m3.group());
			}
			
			if(m4.find()) {
				System.out.println("가격:"+m4.group());
			}
		
		}
		
	}
}
