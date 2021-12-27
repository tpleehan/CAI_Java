package api.lang.stringbuilder;

public class StrBuilderExample {

	public static void main(String[] args) {
		
		/*
		 * # String 클래스의 단점
		 * 
		 * - String 클래스는 아주 많이 쓰이고 
		 *   좋은 기능들을 많이 가지고 있지만
		 *   메모리를 과소비하는 단점이 있다.
		 * 
		 * - String 객체는 처음 초기화된 데이터에 변화를 주어야 하는 상황에서 
		 *   기존 객체를 활용하지 않고 새로운 객체를 계속해서 생성한다.
		 *   
		 * # StringBuilder (Java 5버전부터 사용가능)
		 * 
		 * - String 클래스의 단점으로 인한 메모리 과부하 및 속도가 느려지는 현상을 
		 *   개선하기 위해서 StringBuilder가 새롭게 추가 되었다.
		 *   
		 * - StringBuilder는 기존 객체를 계속 재활용하면서
		 *   실제 객체 내부의 값을 변경하게 된다.
		 */

		String str = "hello";
		System.out.println("str의 주소값: " + str.hashCode());
		
		str = "hello wolrd";
		System.out.println("str의 주소값: " + str.hashCode());
		
		str = "hello~!";
		System.out.println("str의 주소값: " + str.hashCode());
		
		System.out.println("-------------------------");
		
		StringBuilder sb = new StringBuilder("hello");
		System.out.println(sb);
		System.out.println("sb의 주소값" + sb.hashCode());
		
		// 문자열을 맨 끝에 추가하는 메서드 append(문자열)
		sb.append(" world");
		System.out.println(sb);
		System.out.println("sb의 주소값" + sb.hashCode());
		
		// 문자열을 특정 인덱스에 삽입하는 메서드 insert(인덱스, 삽입할 문자열)
		sb.insert(6, "my ");
		System.out.println(sb);
		System.out.println("sb의 주소값" + sb.hashCode());
		
		// 특정 인덱스 범위의 문자열을 교체하는 메서드 replace(begin, end, 문자열)
		// end는 끝범위 미만으로 인식된다.
		sb.replace(6, 8, "your");
		System.out.println(sb);
		System.out.println("sb의 주소값" + sb.hashCode());
		
		// 문자열 내의 특정 단어를 삭제하는 메서드 delete(begin, end)
		// delete는 replace와 같이 끝범위는 미만으로 인식된다.
		sb.delete(6, 11);
		System.out.println(sb);
		System.out.println("sb의 주소값" + sb.hashCode());
		
		StringBuilder sb2 = new StringBuilder(str);
		System.out.println(sb2);
		
		String str2 = sb2.toString();
		System.out.println(str2);
		
	}

}
