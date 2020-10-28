// 定义Student类
class Student {
	final String name; // 使用final关键字修饰name属性
     // 定义introduce()方法，打印学生信息
	public void introduce() {
		System.out.println("我是一个学生，我叫" + name);
	}
}
// 定义测试类
public class Example09 {
	public static void main(String[] args) {
		Student stu = new Student();	// 创建Student类的实例对象					
		stu.introduce();  // 调用Student的introduce()方法
	}
}
