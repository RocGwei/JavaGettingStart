import java.io.*;
public class Example20 {
	public static void main(String[] args) throws Exception {
		FileInputStream in = new FileInputStream("source.txt"); 
		ByteArrayOutputStream bos = new ByteArrayOutputStream(); //创建一个字节数组缓冲区
		FileOutputStream out = new FileOutputStream("target.txt");
		// 下面的代码是循环读取缓冲区中的数据，并将数据一次性写入文件
		int b;
		while ((b = in.read()) != -1) {
			bos.write(b);
		}
		in.close();
		bos.close();
		out.write(bos.toByteArray());//将缓冲区中的数据一次性写入文件
		out.close();
	}
}
