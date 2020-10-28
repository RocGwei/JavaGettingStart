import java.util.*;
class Student implements Comparable{	      // 定义Student类实现Comparable接口
	String name;
	int age;
	public Student(String name, int age) {  // 创建构造方法
		this.name = name;
		this.age = age;
	}
	public String toString() {	               // 重写Object类的toString()方法，返回描述信息
		return name + ":" + age;
	}
	public int compareTo(Object obj){   // 重写Comparable接口的compareTo方法
		Student s = (Student) obj;	     // 将比较对象强转为Student类型
		if(this.age -s.age > 0) {		// 定义比较方式	
				return 1;
		}
		if(this.age -s.age == 0) {		
			return this.name.compareTo(s.name);	// 将比较结果返回
		}
		return -1;
	}
}
public class Example13 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();                  // 创建TreeSet集合
		ts.add(new Student("Jack",19));             // 向集合中添加元素
		ts.add(new Student("Rose",18));
		ts.add(new Student("Tom", 19));
		ts.add(new Student("Rose",18));
		Iterator it = ts.iterator();       
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
