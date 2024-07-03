package sec02.exam07;

public class FloatDoubleExample {
	public static void main(String[] args) {
		//실수값 저장
		//float var1 = 3.14;	//컴파일 에러(Type mismatch)
		float var2 = 3.14f;
		double var3 = 3.14;
		
		long ab = 30000000000000l;
		
		//정밀도 테스트
		float var4 = 0.1234567890123456789f;
		double var5 = 0.1234567890123456789;
		
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
		
		//e 사용하기
		double var6 = 3e6;
		float var7 = 3e6F;
		double var8 = 2e-3;
		System.out.println("var6: " + var6);
		System.out.println("var7: " + var7);
		System.out.println("var8: " + var8);
		
		boolean a1 = true;
		boolean a2 = false;
		
		boolean stop = true;
		if (stop) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}
		
		System.out.println("자바는");
		System.out.println("\n재미있는 \"프로그래밍\" 언어\n");
		System.out.println("입니다");
		
		// 02-2-2
		// byte var = 200; -> byte -128 ~ 127
		// char var = 'AB'; -> 2개의 글자를 담을 수 없어서
		// char var = 65; // OK~ -> 0 ~ 65535
		// long var = 50000000000; -> 마지막에 'L' or 'l' 문자가 빠짐
		// float var = 3.14; -> 마지막에 'F' or 'f' 문자가 빠짐
		// double var = 100.0; // OK~
		// String var = "나의 직업은 "개발자"입니다." -> "옆에 역슬래시(\)가 빠짐 -> "나의 직업은 \"개발자\"입니다."
		// boolean var = 0; -> false나 true값이 들어와야 함
		
		
	} 
} 