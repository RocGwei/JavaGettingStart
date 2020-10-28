import java.io.*;
import java.util.*;
public class Example24 {
	public static void main(String[] args) throws Exception {
		Vector vector = new Vector();// 创建Vector对象
		// 下面的代码是创建3个输入流对象
		FileInputStream fis1 = new FileInputStream("1.txt");
		FileInputStream fis2 = new FileInputStream("2.txt");
		FileInputStream fis3 = new FileInputStream("3.txt");
		// 下面的代码是向Vector中添加3个输入流对象
		vector.addElement(fis1);
		vector.addElement(fis2);
		vector.addElement(fis3);
		Enumeration e = vector.elements();// 获取Vector对象中的元素
		// 将Enumeration对象中的流合并
		SequenceInputStream sis = new SequenceInputStream(e);
		FileOutputStream out = new FileOutputStream("stream.txt");
		int len;
		byte[] buf = new byte[1024]; // 创建一个大小为1024个字节数组的缓冲区
		while ((len = sis.read(buf)) != -1) {
			out.write(buf, 0, len);
		}
		sis.close();
		out.close();
	}
}
