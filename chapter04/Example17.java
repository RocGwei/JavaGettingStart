// 定义Animal类
class Animal {
    // 重写Object类的toString()方法
	public String toString() {     
		return "I am an animal";
	}
}
// 定义测试类
public class Example17 {
	public static void main(String[] args) {
		Animal animal = new Animal();             // 创建Animal对象
		System.out.println(animal.toString()); // 打印animal的toString()方法的返回值
	}
}
