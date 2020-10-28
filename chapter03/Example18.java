class Outer {
	private static int num = 6;
	// 下面的代码定义了一个静态内部类
	static class Inner {
		void show() {
			System.out.println("num = " + num);
		}
	}
}
class Example18 {
	public static void main(String[] args) {
		Outer.Inner inner = new Outer.Inner(); 	// 创建内部类对象
		inner.show(); 							// 调用内部类的方法
	}
}
