import java.util.*;
public class Example32 {
	public static void main(String[] args) throws Exception {
		String str = "传智";
		byte[] b1 = str.getBytes();                      // 使用默认的码表编码
		byte[] b2 = str.getBytes("GBK");                // 使用GBK编码
		System.out.println(Arrays.toString(b1));      // 打印出字节数组的字符串形式
		System.out.println(Arrays.toString(b2));
		byte[] b3 = str.getBytes("UTF-8");             // 使用UTF-8编码
		String result1 = new String(b1, "GBK");
		System.out.println(result1);
		String result2 = new String(b2, "GBK");
		System.out.println(result2);
		String result3 = new String(b3, "UTF-8");
		System.out.println(result3);
		String result4 = new String(b2, "ISO8859-1");
		System.out.println(result4);
	}
}
