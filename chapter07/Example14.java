import java.util.*;
class MyComparator implements Comparator {           // 定义比较器实现Comparator接口
	public int compare(Object obj1, Object obj2) { // 实现比较方法
		String s1 = (String) obj1;
		String s2 = (String) obj2;
		int temp = s1.length() - s2.length();
		return temp;
	}
}
public class Example14 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new MyComparator());// 创建TreeSet对象时传入自定义比较器
		ts.add("Jack");// 向该Set对象中添加字符串
		ts.add("Helena");
		ts.add("Eve");
		Iterator it = ts.iterator(); // 获取Iterator对象
		// 通过while循环，逐渐将集合中的元素打印出来
		while (it.hasNext()) {
			// 如果Iterator有元素进行迭代，则获取元素并进行打印
			Object obj = it.next();
			System.out.println(obj);
		}
	}
}
