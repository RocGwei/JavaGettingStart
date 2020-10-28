import java.io.*;
public class Example22 {
  public static void main(String[] args)throws Exception {
	     FileReader reader = new FileReader("A.txt");// 创建一个FileReader对象
		CharArrayWriter caw = new CharArrayWriter();// 在内存中创建一个字符数组缓冲区
		// 下面的代码是将数据写入缓冲区
		int b;
		while ((b = reader.read()) != -1) {
			caw.write(b);        // 将读取到的字符写入缓冲区
		}
		reader.close();
		caw.close();
         char[] c = caw.toCharArray();// 将缓冲区中的数据转换成字符型数组
         CharArrayReader cr = new CharArrayReader(c);// 读取字符数组中的数据
		// 下面的代码是从缓冲区中读取数据，并进行打印
         int i = 0;
		while ((i = cr.read()) != -1) {
			System.out.println((char) i);
		}
    }
}
