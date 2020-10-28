// 定义了Animal接口
interface Animal {
	int ID = 1;       // 定义全局常量
	void breathe();  // 定义抽象方法breathe()
	void run();      // 定义抽象方法run()
}

// Dog类实现了Animal接口
class Dog implements Animal {
	//实现breathe()方法
	public void breathe() {
		System.out.println("狗在呼吸");
	}
	//实现run()方法
	public void run() {
		System.out.println("狗在跑");
	} 
}
// 定义测试类
public class Example11 {
	public static void main(String args[]) {
		Dog dog = new Dog(); //创建Dog类的实例对象
		dog.breathe();        //调用Dog类的breathe()方法
		dog.run();             //调用Dog类的run()方法
	}
}
