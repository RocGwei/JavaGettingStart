import java.io.*;
public class Example21 {
	public static void main(String[] args) throws Exception {
		byte[] bufs = new byte[] { 97, 98, 99, 100 };// 创建一个字节数组
		ByteArrayInputStream bis = new ByteArrayInputStream(bufs);//读取字节数组中的数据
		//下面的代码是循环读取缓冲区中的数据
         int b;
		while ((b = bis.read()) != -1) {
			System.out.println((char) b);
		}
	}
}
