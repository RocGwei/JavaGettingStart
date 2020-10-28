import java.util.*;
public class Example21 {				                // 创建TreeMap测试类
	public static void main(String[] args) {
		TreeMap tm = new TreeMap(new MyComparator());// 传入一个自定义比较器
		tm.put("1", "Jack");						   // 向集合存入学生的学号和姓名
		tm.put("2", "Rose");
		tm.put("3", "Lucy");
		Set keySet = tm.keySet();                       // 获取键的集合
		Iterator it = keySet.iterator();			  // 获得迭代器对象
		while (it.hasNext()) {
			Object key = it.next();					// 获得一个键
			Object value = tm.get(key);				// 获得键对应的值
			System.out.println(key + ":" + value);
		}
	}
}
class MyComparator implements Comparator {         // 自定义比较器
	public int compare(Object obj1, Object obj2) {// 实现比较方法
		String id1 = (String) obj1;                  // 将Object类型的参数强转为String类型
		String id2 = (String) obj2;   
		return id2.compareTo(id1);                   // 将比较之后的值返回
	}
}
