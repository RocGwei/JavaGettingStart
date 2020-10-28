import java.io.*;
public class Example34 {
	public static void main(String[] args) throws Exception {
		// 创建InputStreamReader对象
		Reader reader = new InputStreamReader(new FileInputStream("E:/1.txt"),
				"GBK");
		// 创建OutputStreamWriter对象
		Writer writer = new OutputStreamWriter(new FileOutputStream("E:/2.txt",
				true), "UTF-8");
		char[] chs = new char[100]; // 定义一个字符数组
		int len;
		len = reader.read(chs); // 将文件的内容读取到字符数组
		String string = new String(chs, 0, len); // 使用字符数组创建字符串
		writer.write(string);  // 向目标文件写入字符串
		reader.close();
		writer.close();
	}
}
