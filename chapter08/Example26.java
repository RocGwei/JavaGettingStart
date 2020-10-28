import java.io.File;
public class Example26 {
	public static void main(String[] args) throws Exception {
		File file = new File("d:\\cn\\itcast\\chapter05");  // 创建File对象
		if (file.isDirectory ()) { // 判断File对象对应的目录是否存在
			String[] names = file.list (); // 获得目录下的所有文件的文件名
				for (String name : names) {
					System.out.println(name);	// 输出文件名
				}
		}
	}
}
