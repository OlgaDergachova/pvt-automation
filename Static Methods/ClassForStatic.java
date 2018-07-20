package Lesson_9_pack;

public class ClassForStatic {
	
	public static int a;
	
	public ClassForStatic(int a) {
		this.a = a;
	}
	
	public static void setA(int a) {
		a = a;
	}

	public int getA() {
		System.out.println("a=" + a);
		return a;
	}
	
	public  void main(String[] args) {
	

		setA(50);
		getA();
	}
	
}
