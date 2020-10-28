// 定义PCI接口
interface PCI {
	void start(); // 定义抽象方法start()
	void stop();  // 定义抽象方法stop()
}
// 定义NetWorkCard类实现PCI接口
class NetWorkCard implements PCI {
     // 实现 start()方法
	public void start() {
		System.out.println("Send...");
	}
     // 实现stop()方法
	public void stop() {
		System.out.println("NetWork Stop");
	}
}
// 定义SoundCard类实现PCI接口
class SoundCard implements PCI {
     // 实现start()方法
	public void start() {
		System.out.println("Du du...");
	}
     // 实现stop()方法
	public void stop() {
		System.out.println("Sound Stop");
	}
}
// 定义MainBoard类
class MainBoard {
     // 定义一个userPCICard()方法，接收PCI类型的参数
	public void usePCICard(PCI p) {
		p.start(); // 调用传入对向的start()方法
		p.stop();   // 调用传入对象的stop()方法
	}
}
  // 定义Assembler类
 class Assembler {
	public static void main(String[] args) {
		MainBoard mb = new MainBoard();      // 创建MainBoard类的实例对象 
		NetWorkCard nc = new NetWorkCard(); // 创建NetWorkCard类的实例对象nc
		mb.usePCICard(nc); // 调用MainBoard对象的usePCICard()方法,将nc作为参数传入
		SoundCard sc = new SoundCard();     // 创建NetWorkCard类的实例对象sc
		mb.usePCICard(sc); // 调用MainBoard对象的usePCICard()方法，将sc作为参数传入
	}
}
