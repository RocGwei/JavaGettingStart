import java.io.*;
class Example29 {
	public static void main(String[] args) {
		File file = new File("E:\\cn"); // 这是一个代表目录的File对象
		if (file.exists()) {
			System.out.println(file.delete());
		}
	}
}
