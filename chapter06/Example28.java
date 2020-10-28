import java.text.*;
import java.util.*;
public class Example28 {
	public static void main(String[] args) throws Exception {
		// 创建一个SimpleDateFormat对象
		SimpleDateFormat df1 = new SimpleDateFormat(
				"Gyyyy年MM月dd日：今天是yyyy年的第D天，E"); 
		// 按SimpleDateFormat对象的日期模板格式化Date对象
		System.out.println(df1.format(new Date()));
	}
}
