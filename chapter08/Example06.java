class Car {
	private String carName;      // 定义一个属性，代表车名
	public Car(String carName) {
		this.carName = carName;
	}
	public void show() {         // 实现Car的show()方法
		System.out.println("我是 " + carName + " ,具有基本功能");
	}
}
// 定义一个类RadarCar
class RadarCar {
	public Car myCar;
	public RadarCar(Car myCar) {	// 通过构造方法接收被包装的对象
		this.myCar = myCar;
	}
	public void show() {
		myCar.show();
		System.out.println("具有倒车雷达功能"); // 实现功能的增强
	}
}
public class Example06 {
	public static void main(String[] args) {
		Car benz = new Car("Benz");  // 创建一个NewCar对象
		System.out.println("--------------包装前--------------");
		benz.show();
		RadarCar decoratedCar_benz = new RadarCar(benz);  // 创建一个RadarCar对象
		System.out.println("--------------包装后--------------");
		decoratedCar_benz.show();
	}
}
