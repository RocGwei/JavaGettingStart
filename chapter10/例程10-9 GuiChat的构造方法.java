public class GuiChat {
	public GuiChat() {
		setUpUI();
		initSocket();
		setListener();
	}
	public static void main(String[] args) {
		new GuiChat();
	}
}
