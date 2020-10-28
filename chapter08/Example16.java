import java.io.*;
public class Example16 {
	public static void main(String[] args) throws Exception {
      // 创建一个PrintStream对象，将FileOutputStream读取到的数据输出
	 PrintStream ps = new PrintStream(new FileOutputStream("printStream.txt"), true);
	    Student stu=new Student();   // 创建一个Student对象
		ps.print("这是一个数字:");     
		ps.println(19);   // 打印数字
		ps.println(stu); // 打印Student对象
	}
}
class Student{	
    // 重写Object的toString()方法
	public String toString() {	
		return "我是一个学生";
	}
}
