import java.io.RandomAccessFile;
public class Example31 {
	public static void main(String[] args) throws Exception {
		RandomAccessFile raf = new RandomAccessFile("time.txt", "rw");
		int times = 0; // int类型的变量表示试用次数
		times = Integer.parseInt(raf.readLine()); // 第一次读取文件时times为5
		if (times > 0) {
			// 试用一次，次数减少一次
			System.out.println("您还可以试用" + times-- + "次！");
			raf.seek(0); // 使记录指针指向文件的开头
			raf.writeBytes(times + ""); // 将剩余的次数再次写入文件
		} else {
			System.out.println("软件试用次数已到"); // 当time<=0,告诉用户试用期已到
		}
		raf.close(); // 关闭RandomAccessFile对象
	}
}
