package cn.itcast.example;  // 使用package关键字声明包
public class Test{
	public static void main(String args[]){
		Student stu=new Student();  // 创建一个Student对象
		stu.introduce();              // 调用Student对象的introduce()方法
	}
}
/*
package cn.itcast.example;    // 使用package关键字声明包
import cn.itcast.Student;     // 使用import关键字导入包
public class Test{
	public static void main(String args[]){
		Student stu=new Student();
		stu.introduce();
	}
}
*/