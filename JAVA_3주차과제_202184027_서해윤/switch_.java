import java.util.Scanner;

public class switch_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 키 입력 받기
		Scanner scanner = new Scanner(System.in);
		System.out.println("연산>>>");
		
		// 연산 받기
		double numbers_one = scanner.nextDouble();
		String operator = scanner.next();
		double numbers_two = scanner.nextDouble();
		
		// 연산 결과를 출력 할 변수 생성
		double sum = 0;  //
				
		// switch를 사용하여 연산자를 찾은 뒤 계산하기	
		switch(operator) {
		case "+":		//덧셈
			sum = numbers_one + numbers_two;
			break;
		case "-":		//뺄
			sum = numbers_one - numbers_two;
			break;
		case "*":		//곱하기
			sum = numbers_one * numbers_two;
			break;
		case "/":		//나누기
			if (numbers_one == 0 || numbers_two == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				return;
			}
			sum = numbers_one / numbers_two;
			break;
		// 연산자를 입력하지 않았을 때
		default:
			System.out.println("오류. 연산자를 입력해주세요");
			return;
		}
		
		System.out.println(numbers_one + operator + numbers_two + "의 결과는" + sum);
		

	}

}
