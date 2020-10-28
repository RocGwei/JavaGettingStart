import java.io.*;
public class Example23 {
	public static void main(String[] args) throws Exception {
		// 下面的代码是创建了两个流对象in1、in2
		FileInputStream in1 = new FileInputStream("stream1.txt");
		FileInputStream in2 = new FileInputStream("stream2.txt");
		// 创建一个序列流，合并两个字节流in1和in2
		SequenceInputStream sis = new SequenceInputStream(in1, in2);
		FileOutputStream out = new FileOutputStream("stream.txt");
		int len;
		byte[] buf = new byte[1024];  // 创建一个1024个字节数组作为缓冲区
		// 下面的代码用于循环读取三个流中的文件
		while ((len = sis.read(buf)) != -1) {
			out.write(buf, 0, len);      // 将缓冲区中的数据输出
              out.write("\r\n".getBytes());
		}
		sis.close();
		out.close();
	}
}
