public class GuiChat extends JFrame {
	private static final int DEFAULT_PORT = 8899;
	// 把主窗口分为NORTH、CEMTER和SOUTH三个部分
	private JLabel stateLB; // 显示监听状态
	private JTextArea centerTextArea;       // 显示聊天记录
	private JPanel southPanel;               // 最下面的面板
	private JTextArea inputTextArea;        // 聊天输入框
	private JPanel bottomPanel;              // 放置 IP输入框，按钮等
	private JTextField ipTextField;         // IP输入框
	private JTextField remotePortTF;        // 端口号输入框
	private JButton sendBT;                   // 发送按钮
	private JButton clearBT;                  // 清除聊天记录按钮
	private DatagramSocket datagramSocket; // 用于后面功能的实现
}
