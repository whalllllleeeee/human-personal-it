package sec02;

public class MemberExample {
	public static void main(String[] args) {
		Member member = new Member();

		// 필드 값 변경
		member.name = "최하얀";
		System.out.println("수정된 이름 : " + member.name);
		
		member.age = 23;
		System.out.println("수정된 나이 : " + member.age);

	}
}
