import java.text.*;
import java.util.*;
public class Example29 {
	public static void main(String[] args) throws Exception {
		SimpleDateFormat df2 = new SimpleDateFormat("yyyy/MMM/dd");
		String dt = "2012/八月/03";
		// 将字符串解析成Date对象
		System.out.println(df2.parse(dt));
	}
}
