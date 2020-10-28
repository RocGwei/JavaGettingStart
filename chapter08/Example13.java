import java.io.*;
public class Example13 {
	public static void main(String[] args) throws Exception {
		Person p = new Person("p1", "zhangsan", 20); // 创建一个Person对象
		System.out.println("---------写入文件前----------");
		System.out.println("Person对象的id:"+p.getId());       // 打印Person对象的id
		System.out.println("Person对象的name:"+p.getName());    // 打印Person对象的name
		System.out.println("Person对象的age:"+p.getAge());     //打印Person对象的age
		 // 创建文件输出流对象，将数据写入objectStream.txt文件中 
		FileOutputStream fos = new FileOutputStream("objectStream.txt");
          // 创建对象输出流对象，用于处理输出流对象写入的数据
		ObjectOutputStream oos = new ObjectOutputStream(fos);
          // 将Person对象输出到输出流中
		oos.writeObject(p);
	}
}
class Person implements Serializable {
	private String id;
	private String name;
	private int age;
	public Person(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
