import java.util.Scanner;

class PhoneBook	{
	int count = 0;
	Scanner scanner = new Scanner(System.in);
	String[] names;
	String[] numbers;
	
	// 기본 생성자 생성
	public PhoneBook() {}
	
	// 인원수를 입력받고 저장하며 이름과 번호를 각각 다른 배열에 저장하는 메소드
	public void Phone() {
		System.out.print("인원수>>>");
		int persons = scanner.nextInt();
		scanner.nextLine();
		names = new String[persons]; // 이름을 저장할 배열
		numbers = new String[persons]; // 전화번호를 저장할 배열
			
			// 이름과 전화번호를 split() 메소드를 사용하여 다른 배열에 저장
			for (count = 0; count < persons; count++) {
				System.out.println("이룸과 전화번호(이름과 번호는 빈 칸없이 입력)");
				String informations = scanner.nextLine();
				String[] parts = informations.split(" ");
				names[count] = parts[0];
				numbers[count] = parts[1];
				
				
				System.out.println("저장되었습니다 . . . ");
		}
	}
	
	//이름을 검색하는 메소드 
	public void comparison () {
		while (true) {
			System.out.println("검색할 이름>>");
			String search = scanner.nextLine();
				if (search.equals("그만")) {
					System.out.println("종료합니다.");		// 그만을 입력하면 종료
					break;
				}
				// 검색한 이름과 names 배열에 저장되어있는 이름을 비교
				boolean found = false;
				for (int i = 0; i < count; i++)	{
					if(search.equals(names[i])) {
						System.out.println(names[i] + "의 번호는 " + numbers[i] + "입니다.");
						found = true;	// " ~이 없습니다 " 를 출력하지 않기 위해 found를 true로 바꿔준다.
					}
				}
				// 검색한 이름을 names 배열에서 찾지 못했을 때 출력
				if (found == false) {
					System.out.println(search + " 이 없습니다.");
				}
		}
		
	}
	
}

public class JAVA_5주차과제_202184027_PhoneBook {

	public static void main(String[] args) {
		PhoneBook p1 = new PhoneBook();
		System.out.println(p1);
		p1.Phone();
		p1.comparison();
		

	}

}
