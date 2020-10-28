import java.awt.*;
import java.awt.event.*;
public class Example04 {
	public static void main(String[] args) {
		Frame f = new Frame("我的窗体!");
		f.setSize(400, 300);
		f.setLocation(300, 200);
		f.setVisible(true);
		Button btn = new Button("EXIT"); // 创建按钮组件对象
		f.add(btn); // 把按钮对象加载到窗口上
		// 用内部类的方式为按钮组件注册监听器
		btn.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
	}
}
