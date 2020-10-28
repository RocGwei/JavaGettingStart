import java.util.*;
public class Example07 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("data_1");
		list.add("data_2");
		list.add("data_3");
		System.out.println(list);
		ListIterator it = list.listIterator(list.size()); // 获得ListIterator对象
		while (it.hasPrevious()) {         // 判断该对象中是否有上一个元素
			Object obj = it.previous();   // 迭代该对象的上一个元素
			System.out.print(obj + " ");  // 获取并打印该对象中的元素
		}
	}
}
