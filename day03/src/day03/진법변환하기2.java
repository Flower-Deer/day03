package day03;

public class 진법변환하기2 {

	public static void main(String[] args) {
		Util util = new Util();
		System.out.println("<<진법 변환하는 프로그램");
		
		//10진수 ->2진수로 변환
		int n =14;
		System.out.println("10진수 " + n + "을(를) 2진수로 바꾸면 " + util.decToBin(n));
		String bn ="1110";
		System.out.println("2진수 " + bn + "을(를) 10진수로 바꾸면 " + util.binToBin(bn));
	}

}

//진법변환하는 클래스
class Util{
	public String decToBin(int value) {
		String result = "";
		int mok, nmg; //몫, 나머지
		
		mok = value; // ex)몫 = 14(n)
		
		while( mok != 0) {
			nmg = mok % 2; //나머지 = 0
			//숫자0을 문자로 만들기
//			String.valueOf(nmg);
			//유니코드표에 문자0은 코드표로48 입니다. 그래서 숫자(0) + 48을하면 문자 0이나옴.
			result += (char)(nmg + '0');
			mok = mok/2;
			System.out.println(result);
		}
		return null;
	}
	
	public int binToBin(String value) {
		int result = 0;
		for (int i = 0; i < value.length(); i++) {
			result = result * 2 + value.charAt(i) - '0';
		
		}
		return result;
	}
	
}
