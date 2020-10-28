import java.util.*;
public class Example28 {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		Collections.addAll(list, -3,2,9,5,8);
		System.out.println("集合中的元素: " + list);
		System.out.println("集合中的最大元素: " + Collections.max(list));
		System.out.println("集合中的最小元素: " + Collections.min(list));
		Collections.replaceAll(list, 8, 0); 	// 将集合中的8用0替换掉
		System.out.println("替换后的集合: " + list);
	}
}
