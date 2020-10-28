class Person {
	public static void sayHello() { // 定义静态方法
		System.out.println("hello");
	}
}
class Example13 {
	public static void main(String[] args) {
		Person.sayHello();     // 调用静态方法
	}
}
