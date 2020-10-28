class Person { 
	int age;
	// 定义有参的构造方法
	public Person(int a) {
		age = a;                       // 为age属性赋值
	}
	public void speak() {
		System.out.println("I am " + age + " years old.!");
	}
}
public class Example06 { 
	public static void main(String[] args) {
		Person p = new Person(20); // 实例化 Person 对象
		p.speak();
	}
}
