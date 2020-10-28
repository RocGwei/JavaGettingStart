import java.text.*;
public class Example27 {
	public static void main(String[] args) throws Exception{
         // 创建Long格式的DateFormat对象
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.LONG);
		String d1="2008年8月8日";
		System.out.println(df1.parse(d1)); // 将对应格式的字符串解析成Date对象
	}
}
