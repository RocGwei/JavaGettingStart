import java.io.*;
public class Example11 {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("Example09.java");	// 创建字符输入流
		FileWriter fw = new FileWriter("copy.java");	// 创建字符输出流
		LineNumberReader lr = new LineNumberReader(fr);	// 包装
		lr.setLineNumber(0); // 设置读取文件的起始行号
		String line = null;
		while ((line = lr.readLine()) != null) {
			fw.write(lr.getLineNumber() + ":" + line); // 将行号写入到文件中
			fw.write("\r\n");							// 写入换行
		}
		lr.close();
		fw.close();
	}
}
