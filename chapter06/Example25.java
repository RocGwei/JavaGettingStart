import java.util.*;
public class Example25 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance(); // 今天是2月6日
		// 将MONTH字段设置为13
		calendar.set(Calendar.MONTH, 13);
		System.out.println(calendar.getTime());
		// 开启non-lenient模式
		calendar.setLenient(false);
		calendar.set(Calendar.MONTH,13);
		System.out.println(calendar.getTime());
	}
}
