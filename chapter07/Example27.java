import java.util.*;
public class Example27 {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		Collections.addAll(list, "C","Z","B","K");    // 添加元素
		System.out.println("排序前: " + list);          // 输出排序前的集合
		Collections.reverse(list);                       // 反转集合
		System.out.println("反转后： " + list); 
		Collections.sort(list);                           // 按自然顺序排列
		System.out.println("按自然顺序排序后: " + list);
		Collections.shuffle(list);          
		System.out.println("洗牌后: " + list); 
	}
}
