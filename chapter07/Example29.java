import java.util. *;
public class Example29 {
	public static void main(String[] args) {
		int[] arr = { 9, 8, 3, 5, 2 };            // 初始化一个数据
		System.out.print("排序前：");
		printArray(arr);                             // 打印原数组
		Arrays.sort(arr);                            // 调用Arrays的sort方法排序
		System.out.print("排序后：");
		printArray(arr);
	}
	public static void printArray(int[] arr) {  // 定义打印数组方法
		System.out.print("[");
		for (int x = 0; x < arr.length; x++) {
			if (x != arr.length - 1) {
				System.out.print(arr[x] + ", ");
			} else {
				System.out.println(arr[x] + "]");
			}
		}
	}
}
