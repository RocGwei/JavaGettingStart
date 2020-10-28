import java.util.*;
public class Example33 {
	public static void main(String[] args) throws Exception {
		String str = "传智";
		byte[] b = str.getBytes("GBK");
		String temp = new String(b, "ISO8859-1");
		System.out.println(temp);                      // 用错误的码表解码，打印出了乱码
		byte[] b1 = temp.getBytes("ISO8859-1");     // 再使用错误的码表编码
		String result = new String(b1, "GBK");      // 用正确的码表解码
		System.out.println(result);                   // 打印出正确的结果
	}
}
