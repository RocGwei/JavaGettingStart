import java.util.*;
public class Example20 {				  // 创建TreeMap测试类
	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		tm.put("1", "Jack");
		tm.put("2", "Rose");
		tm.put("3", "Lucy");
		Set keySet = tm.keySet();          // 获取键的集合
		Iterator it = keySet.iterator(); // 获取Iterator对象
		while (it.hasNext()) {             // 判断是否存在下一个元素
			Object key = it.next();       // 取出元素
			Object value = tm.get(key);  // 根据获取的键找到对应的值
			System.out.println(key + ":" + value);
		}
	}
}
