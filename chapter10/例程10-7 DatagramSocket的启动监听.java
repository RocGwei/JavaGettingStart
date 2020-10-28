private void initSocket() {
		int port = DEFAULT_PORT;
		while (true) {
			try {
				if (datagramSocket != null && !datagramSocket.isClosed()) {
					datagramSocket.close();
				}
				try { // 判断端口号是否在1-65535之间
					port = Integer.parseInt(JOptionPane.showInputDialog(this,
							"请输入端口号", "端口号", JOptionPane.QUESTION_MESSAGE));
					if (port < 1 || port > 65535) {
						throw new RuntimeException("端口号超出范围");
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null,
							"你输入的端口不正确，请输入1-65535之间的数");
					continue; // 端口不正确重新填写
				}
				// 启动DatagramSocket
				datagramSocket = new DatagramSocket(port);
				startListen(); // 调用startListen方法
				// 在stateLB中显示程序监听的端口号
				stateLB.setText("已在 " + port + " 端口监听");
				break;
			} catch (SocketException e) { // 端口号被占用重新填写
				JOptionPane.showMessageDialog(this, "端口已被占用，请重新设置端口");
				stateLB.setText("当前还未启动监听");
			}
		}
	}
