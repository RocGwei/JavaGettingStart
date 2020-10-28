import java.util.*;
public class Example12 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();     // 创建TreeSet集合
		ts.add("Jack");                   // 向TreeSet集合中添加元素
		ts.add("Helena");
		ts.add("Helena");
		ts.add("Eve");
		Iterator it = ts.iterator();   // 获取Iterator对象
		while(it.hasNext()) {            
			System.out.println(it.next());
		}
	}
}
