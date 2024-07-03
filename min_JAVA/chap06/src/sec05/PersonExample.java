package sec05;

public class PersonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("123456-1234567", "홍길동");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "미국";
		//p1.ssn = "123";
		p1.name = "유관순";
	}

}
