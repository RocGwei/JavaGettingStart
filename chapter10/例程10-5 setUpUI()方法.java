private void setUpUI() {               // 初始化Swing窗口
		// 初始化窗口
		setTitle("GUI聊天");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);             // 设置窗口的大小
		setResizable(false);           // 窗口大小不可调整
		setLocationRelativeTo(null); // 窗口居中
		// 窗口的NORTH部分
		stateLB = new JLabel("当前还未启动监听");
		stateLB.setHorizontalAlignment(JLabel.RIGHT);
		// 窗口的CENTER部分
		centerTextArea = new JTextArea();     // 聊天记录显示区域
		centerTextArea.setEditable(false);
		centerTextArea.setBackground(new Color(211, 211, 211));
		// 窗口的SOUTH部分
		southPanel = new JPanel(new BorderLayout());
		inputTextArea = new JTextArea(5, 20);// 内容输入区域
		bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 5));
		ipTextField = new JTextField("127.0.0.1", 8);
		remotePortTF = new JTextField(String.valueOf(DEFAULT_PORT), 3);
		sendBT = new JButton("发送");
		clearBT = new JButton("清屏");
		bottomPanel.add(ipTextField);
		bottomPanel.add(remotePortTF);
		bottomPanel.add(sendBT);
		bottomPanel.add(clearBT);
		southPanel.add(new JScrollPane(inputTextArea), BorderLayout.CENTER);
		southPanel.add(bottomPanel, BorderLayout.SOUTH);
		// 添加窗口NORTH、CENTER、SOUTH部分的组件
		add(stateLB, BorderLayout.NORTH);
		add(new JScrollPane(centerTextArea), BorderLayout.CENTER);
		add(southPanel, BorderLayout.SOUTH);
		setVisible(true);
	}
