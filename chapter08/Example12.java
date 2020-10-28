import java.io.*;
public class Example12 {
	public static void main(String[] args) throws Exception {
		FileInputStream in = new FileInputStream("src.txt");// 创建字节输入流
		InputStreamReader isr = new InputStreamReader(in); // 将字节流输入转换成字符输入流
		BufferedReader br = new BufferedReader(isr); // 对字符流对象进行包装
		FileOutputStream out = new FileOutputStream("des.txt");
          // 将字节输出流转换成字符输出流
		OutputStreamWriter osw = new OutputStreamWriter(out);
		BufferedWriter bw = new BufferedWriter(osw); // 对字符输出流对象进行包装
		String line;
		while ((line = br.readLine()) != null) { // 判断是否读到文件末尾
			bw.write(line); // 输出读取到的文件
		}
		br.close();
		bw.close();
	}
}
