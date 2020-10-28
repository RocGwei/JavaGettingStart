public class Example18 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("source.txt"));// 对输入流进程重定向
		System.setOut(new PrintStream("target.txt"));// 对输出流进程重定向
		// 读取键盘输入的字符
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = br.readLine()) != null) { // 判断读取到的一行是否有数据
			System.out.println(line); // 打印读取到的一行数据
		}
	}
}
