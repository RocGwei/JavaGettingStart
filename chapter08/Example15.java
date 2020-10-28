import java.io.*;
public class Example15 {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("d:\\dataStream.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);
		dos.writeByte(12);                       // 写一个字节
		dos.writeChar('1');                     // 写一个字符
		dos.writeBoolean(true);                // 写一个布尔值
		dos.writeUTF("同学，你好");             // 写一个转换成UTF-8的字符串
		dos.close();                             // 关闭流
		FileInputStream fis = new FileInputStream("d:\\dataStream.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		System.out.println(dis.readByte());     // 读一个字节
		System.out.println(dis.readChar());     // 读一个字符
		System.out.println(dis.readBoolean()); // 读一个布尔值
		System.out.println(dis.readUTF());      // 读一个转换成UTF-8编码的字符串
		dis.close();                                // 关闭流
	}
}
