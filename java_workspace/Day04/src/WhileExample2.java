
public class WhileExample2 {

	public static void main(String[] args) {
		
		//48 ~ 150사이의 정수 중 8의 배수만 가로로 출력하라.
		//48부터 숫자를 하나씩 올려가면서 8의 배수를 판복 반복
		
		int n = 48;
		
		while (n <= 150) {
			if(n % 8 == 0) {
				System.out.print(n + " ");
			}
			//System.out.print(n % 8 == 0 ? n + " ": "");
			
			n++;

		}
		 
		System.out.println(); //단순 줄 개행
		//1 ~ 100까지의 정수 중 4의 배수이면서
		//8의 배수는 아닌 수를 가로로 출력
		
		int i = 1;
		
		while (i <= 100) {
			if (i % 4 == 0 && i % 8 != 0) {
				System.out.print(i + " ");
			}
			
//			if (i % 4 == 0) {
//				if (i % 8 != 0) {
//					System.out.print(i + " ");
//				}
//			}
			
			i++;

		}
		
		System.out.println();
		
		//1~30000까지의 정수 중 258의 배수의 개수를 출력.
		
		int j = 1;
		int count = 0; //배수의 개수를 기억해 줄 변수.
		
		while (j <= 30000) {			
			if (j % 258 == 0) {
				count++;
			}

			j++;
		}
		System.out.println("1~30000중의 258의 배수의 개수: " + count + "개");
		
		//1000의 약수의 개수를 구하라.
		//1부터 1000까지 하나씩 올려가면서 1000이랑 나누고
		//나누어 떨어진 값이 약수이다.
		
		int k = 1;
		int cnt = 0;
		
		while (k <= 1000) {			
			if (1000 % k == 0) {
				cnt++;
			}
			
			k++;
		}
		System.out.println("1000의 약수의 개수: " + cnt + "개");
		
	}

}
