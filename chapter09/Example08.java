import java.awt.*;
import java.awt.event.*;
public class Example08 {
	public static void main(String[] args) {
		final Frame f = new Frame("Flowlayout");// 创建一个名为Flowlayout的窗体
		// 设置窗体中的布局管理器为FlowLayout，所有组件左对齐，水平间距为20，垂直间距为30
		f.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 30));
		f.setSize(200, 300);                     // 设置窗体大小
		f.setLocation(300, 200);                // 设置窗体显示的位置
		Button but1 = new Button("第1个按钮");// 创建第1个按钮
		f.add(but1);                              // 把"第1个按钮"添加到f窗口
		// 下面的代码是每点击一次“第1个按钮”就向窗体中添加一个按钮
		but1.addActionListener(new ActionListener() { // 动作事件为第1个按钮添加点击事件
			private int num = 1;                           // 定义变量num，记录按钮的个数
			public void actionPerformed(ActionEvent e) {
				f.add(new Button("第" + ++num + "个按钮"));// 向窗体中添加新按钮
				// f.setVisible(true);                       // 刷新窗体显示新按钮
			}
		});
		f.setVisible(true); // 设置窗体可见
	}
}
