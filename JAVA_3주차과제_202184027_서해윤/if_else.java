import java.util.Scanner;

public class if_else {

	public static void main(String[] args) {
		
		// 키 입력받기 
		Scanner scanner = new Scanner(System.in);
		System.out.println("연산>>>");
		
		// 연산 받기
		double numbers_one = scanner.nextDouble();
		String operator = scanner.next();	// if문을 이용하여 연산자 찾기위해 문자열로 받음
		double numbers_two = scanner.nextDouble();
		
		// 연산 결과를 출력 할 변수 생성
		double sum = 0;	
		
		
		// 연산자를 찾은 후 계산하기
		if (operator.equals("+")) {			// 연산자가 덧셈일 경우
			sum = numbers_one + numbers_two;
		} else if (operator.equals("-")) {			// 연산자가 빼기일 경우
			sum = numbers_one - numbers_two;
		} else if (operator.equals("*")) {			// 연산자가 곱셈일 경우
			sum = numbers_one * numbers_two;
        } else if (operator.equals("/")) {			// 연산자가 나눗셈일 경우
            if (numbers_two == 0 || numbers_one == 0) {
                System.out.println("0으로 나눌 수 없습니다.");
                return;
            }
            sum = numbers_one / numbers_two ;
        }
		// 연산자를 입력하지 않았을 때
            else {
            	System.out.println("오류. 연산자를 입력해주세요");
            	return;
            }
		
		
		// 결과 출력
		System.out.println(numbers_one + operator + numbers_two + "의 결과는 " + sum);
		

	}
	
}