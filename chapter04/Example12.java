// 定义了Animal接口
interface Animal {
	int ID = 1;       // 定义全局常量
	void breathe();  // 定义抽象方法breathe()
	void run();       // 定义抽象方法run()
}
// 定义了LandAnimal接口,并继承了Animal接口
interface LandAnimal extends Animal { // 接口继承接口
	void liveOnland();                   // 定义抽象方法liveOnLand()
}
// 定义Dog类实现Animal接口
class Dog implements LandAnimal {
	//实现breathe()方法
	public void breathe() {
		System.out.println("狗在呼吸");
	}
	//实现run()方法
	public void run() {
		System.out.println("狗在跑");
	}
     // 实现liveOnLand()方法
	public void liveOnland() {
		// TODO Auto-generated method stub
		System.out.println("狗生活在陆地上");
	} 
}
// 定义测试类
public class Example12 {
	public static void main(String args[]) {
		Dog dog = new Dog(); // 创建Dog类的实例对象
		dog.breathe();        // 调用Dog类的breathe()方法
		dog.run();             // 调用Dog类的run()方法
		dog.liveOnland();    // 调用Dog类的liveOnland()方法
	}
}
