import java.util.Scanner;
public class JAVA_4주차과제_202184027_서해윤 {

	public static void main(String[] args) {
		
		// 스캐너 
		Scanner scanner = new Scanner(System.in);
		
		
		// 컴퓨터의 가위바위보 결과 배열 
		String str[] = {"가위", "바위", "보"};


		
		// 독자가 가위 바위 보 중 하나를 입력하도록 작성
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		
		// 가위 바위 보 반복문 실행
		while (true) {
			System.out.println(" 가위 바위 보 ! >> ");
			int n = (int) (Math.random() * 3);		// Math.random() 함수를 사용하여 0부터 2까지의 임의의 정수를 반환
			String result = scanner.nextLine();		// 사용자의 입력 값 받기 
			if (result.equals("그만")) {				// "그만"이라는 문자열이 입력될 때 게임이 종료
				System.out.println("가위 바위 보 게임을 종료합니다...");
				break;
			}
			
			
			// 컴퓨터와 사용자가 가위바위보 중 어떤 것을 냈는지에 따라서 승자가 결정되는 코드 작성
			
			// 1. 컴퓨터가 가위를 냈을 때
			if(str[n].equals("가위")) {
				if (result.equals("가위")) {
				System.out.println("사용자 = " + result + "," + "컴퓨터 = " + str[n] + ", 비겼습니다.");
				}
				else if (result.equals("바위")) {
				System.out.println("사용자 = " + result + "," + "컴퓨터 = " + str[n] + ", 사용자가 이겼습니다.");
				}
				else if (result.equals("보")) {
				System.out.println("사용자 = " + result + "," + "컴퓨터 = " + str[n] + ", 컴퓨터가 이겼습니다");
				}
				}
			
			// 2. 컴퓨터가 바위를 냈을 때
			else if (str[n].equals("바위")) {
				if (result.equals("가위")) {
				System.out.println("사용자 = " + result + "," + "컴퓨터 = " + str[n] + ", 컴퓨터가 이겼습니다.");
				}
				else if (result.equals("바위")) {
				System.out.println("사용자 = " + result + "," + "컴퓨터 = " + str[n] + ", 비겼습니다.");
				}
				else if (result.equals("보")) {
				System.out.println("사용자 = " + result + "," + "컴퓨터 = " + str[n] + ", 사용자가 이겼습니다.");
				}
				}
			
			// 3. 컴퓨터가 보를 냈을 때
			else if (str[n].equals("보")) {
				if (result.equals("가위")) {
				System.out.println("사용자 = " + result + "," + "컴퓨터 = " + str[n] + ", 사용자가 이겼습니다.");
				}
				else if (result.equals("바위")) {
				System.out.println("사용자 = " + result + "," + "컴퓨터 = " + str[n] + ", 컴픂터가 이겼습니다.");
				}
				else if (result.equals("보")) {
				System.out.println("사용자 = " + result + "," + "컴퓨터 = " + str[n] + ", 비겼습니다.");
				}
			}
				

		}
		

	}

}
