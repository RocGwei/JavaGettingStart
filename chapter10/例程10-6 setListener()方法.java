private void setListener() {
          // 为sendBT按钮添加事件监听器
		sendBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 获取发送的目标ip地址和端口号
				final String ipAddress = ipTextField.getText();
				final String remotePort = remotePortTF.getText();
				// 判断ip地址和端口号是否为空
				if (ipAddress == null || ipAddress.trim().equals("")
						|| remotePort == null || remotePort.trim().equals("")) {
					JOptionPane.showMessageDialog(GuiChat.this, "请输入IP地址和端口号");
					return;
				}
				if (datagramSocket == null || datagramSocket.isClosed()) {
					JOptionPane.showMessageDialog(GuiChat.this, "监听不成功");
					return;
				}
				// 获得需要发送的内容
				String sendContent = inputTextArea.getText();
				byte[] buf = sendContent.getBytes();
				try {
					// 将发送的内容显示在自己的聊天记录中
					centerTextArea.append("我对 " + ipAddress + ":" + remotePort
							+ " 说：\n" + inputTextArea.getText() + "\n\n");
					// 添加内容后，使滚动条自动滚动到最底端
					centerTextArea.setCaretPosition(centerTextArea.getText()
							.length());
					// 发送数据
					datagramSocket.send(new DatagramPacket(buf, buf.length,
							InetAddress.getByName(ipAddress), Integer
									.parseInt(remotePort)));
					inputTextArea.setText("");
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(GuiChat.this, "出错了,发送不成功");
					e1.printStackTrace();
				}
			};
		});
         // 为clearBT按钮添加事件监听器
		clearBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				centerTextArea.setText(""); // 清空聊天记录的内容
			}
		});
	}
