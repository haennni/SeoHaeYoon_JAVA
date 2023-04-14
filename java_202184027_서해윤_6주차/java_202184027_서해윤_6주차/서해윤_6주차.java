package java_202184027_서해윤_6주차;

// 인터페이스 
interface Shape {
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.print("- - - 다시 그립니다. ");
		draw();
		}
	}

// 인터페이스를 구현하는 Circle 클래스 
class Circle implements Shape {
	 int radius;
	 
	 public Circle(int radius) {
		 this.radius = radius;
	}
	 
	 // 인터페이스에 있는 메소드 오버라이딩하여 재정의 해주기
	@Override
	public void draw() {
	}
	@Override
	public double getArea() {
		return PI * radius * radius;
	}
	@Override
	public void redraw() {
		System.out.println("- - - 다시 그립니다. " + "반지름이 " + radius + "인 원입니다.");
		draw();
	}
	
}

//인터페이스를 구현하는 Oval 클래스
class Oval implements Shape {
	int num1, num2;
	
	public Oval (int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	 // 인터페이스에 있는 메소드 오버라이딩하여 재정의 해주기
	@Override
	public void draw() {
	}
	@Override
	public double getArea() {
		return PI * num1 * num2;
	}
	@Override
	public void redraw() {
		System.out.println("- - - 다시 그립니다. " + "반지름이 " + num1 + " x " + num2 + "인 원입니다." );
	}
	
}

//인터페이스를 구현하는 Rect 클래스
class Rect implements Shape{
	int num1, num2;
	public Rect (int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	// 인터페이스에 있는 메소드 오버라이딩하여 재정의 해주기
	@Override
	public void draw() {
		
	}
	@Override
	public double getArea() {
		return num1 * num2;
	}
	@Override
	public void redraw() {
		System.out.println("- - - 다시 그립니다. " + num1 + " x " + num2 + "크기의 사각형 입니다.");
	}
}


public class 서해윤_6주차 {
	public static void main(String[] args) {
		Shape [] list = new Shape[3];
		list[0] = new Circle(10);
		list[1] = new Oval(20, 30);
		list[2] = new Rect(10, 40);
		
		for(int i = 0; i < list.length; i++) list[i].redraw();
		for(int i = 0; i < list.length; i++) System.out.println("면적은 " + list[i].getArea());
	}
}


