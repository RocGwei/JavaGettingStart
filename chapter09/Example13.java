import java.awt.*;
public class Example13 {
	public static void main(String[] args) {
		Frame f = new Frame("hello");
		f.setLayout(null); // 取消 frame的布局管理器
		f.setSize(300, 150);
		Button btn1 = new Button("press");
		Button btn2 = new Button("pop");
		// btn1.setLocation(40, 60);设置按钮组件的坐标
		// btn1.setSize(100, 30);设置按钮组件的长宽
		btn1.setBounds(40, 60, 100, 30);
		// btn1.setLocation(140, 90);设置按钮组件的坐标
		// btn1.setSize(100, 30);设置按钮组件的长宽
		btn2.setBounds(140, 90, 100, 30);
         // 在窗口中添加按钮
		f.add(btn1);
		f.add(btn2);
		f.setVisible(true);
	}
}
