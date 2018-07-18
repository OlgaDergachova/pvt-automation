package Lesson_9_pack;

public class StaticRunner {

	public static void main(String[] args) {
		
		ClassForStatic obj1 = new ClassForStatic(5);
		ClassForStatic obj2 = new ClassForStatic(7);
		
		obj1.setA(10);
		
		obj1.getA();
		obj2.getA();

	}

}
