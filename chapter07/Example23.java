import java.util.*;
public class Example23 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();	 // 创建ArrayList集合
		list.add("String");					 // 添加字符串对象
		list.add("Collection");				
		list.add(1);						// 添加Integer对象
		for (Object obj : list) {			// 遍历集合
			String str = (String) obj;		// 强制转换成String类型
		}
	}
}
