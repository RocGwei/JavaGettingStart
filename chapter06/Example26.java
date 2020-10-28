import java.text.*;
import java.util.*;
public class Example26 {
	public static void main(String[] args) {
		Date date = new Date();
		// Full格式的日期格式器对象
		DateFormat fullFormat = DateFormat.getDateInstance(DateFormat.FULL);
		// Long格式的日期格式器对象
		DateFormat longFormat = DateFormat.getDateInstance(DateFormat.LONG);
		// medium格式的日期/时间 格式器对象
		DateFormat mediumFormat = DateFormat.getDateTimeInstance(
				DateFormat.MEDIUM, DateFormat.MEDIUM);
		// short格式的日期/时间格式器对象
		DateFormat shortFormat = DateFormat.getDateTimeInstance(
				DateFormat.SHORT, DateFormat.SHORT);
		// 下面打印格式化后的日期或者日期/时间
		System.out.println("当前日期的完整格式为：" + fullFormat.format(date));
		System.out.println("当前日期的长格式为：" + longFormat.format(date));
		System.out.println("当前日期的普通格式为：" + mediumFormat.format(date));
		System.out.println("当前日期的短格式为：" + shortFormat.format(date));
	}
}
