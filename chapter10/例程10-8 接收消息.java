private void startListen() {
		new Thread() {
			private DatagramPacket p;
			public void run() {
				byte[] buf = new byte[1024];
				// 创建DatagramPacket
				p = new DatagramPacket(buf, buf.length);
				while (!datagramSocket.isClosed()) {
					try {
						datagramSocket.receive(p); // 接收聊天消息
						// 添加到聊天记录框
						centerTextArea.append(p.getAddress().getHostAddress()
								+ ":"
								+ ((InetSocketAddress) p.getSocketAddress())
										.getPort() + " 对我说：\n"
								+ new String(p.getData(), 0, p.getLength())
								+ "\n\n");
						// 使滚动条自动滚动到最底端
						centerTextArea.setCaretPosition(centerTextArea
								.getText().length());
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}.start();
	}
}
