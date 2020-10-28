public class Example21 {
	public static void main(String[] args) {
		int area = getArea(3, 5); // 调用 getArea方法
		System.out.println(" The area is " + area);
	}
	// 下面定义了一个求矩形面积的方法，接收两个参数，其中x为高，y为宽
	public static int getArea(int x, int y) {
		int temp = x * y;	        // 使用变量temp记住运算结果
		return temp;                 // 将变量temp的值返回
	}
}
