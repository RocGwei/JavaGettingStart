public class Example14 {
	public static void main(String[] args) throws Exception {
		Runtime rt = Runtime.getRuntime();       //创建一个Runtime实例对象
		Process process = rt.exec("notepad.exe");// 得到表示进程的Process对象
		Thread.sleep(3000);          // 程序休眠3秒
		process.destroy();           // 杀掉进程
	}
}
