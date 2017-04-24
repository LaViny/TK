/**
 * 
 * @author shannan.hu
 * @version 1.0
 * @since 2017.04.19 this is a server ui component.
 */
public class CHUI extends JFrame {

	private static final int WINDOW_WIDTH = 600;
	private static final int WINDOW_HEIGHT = 550;
	private JLabel welcomeLabel = null, imgJLabel = null;
	private JTextArea showFieldArea = null, inputFieldArea = null;
	private JButton sendButton = null;
	private JPanel showJPanel = null, inputJPanel;

	public ServerChatUI(String key) {
		setComponent(key);
		addComponent();
		addListenner();
		showServerUI();
	}

	public void setComponent(String key) {
		this.setTitle("正在和***聊天");
		// 欢迎语
		welcomeLabel = new JLabel("欢迎你" + key);
		Font font = new Font("宋体", JLabel.EAST, 20);
		welcomeLabel.setFont(font);
		welcomeLabel.setForeground(Color.blue);
		// 加入图片
		ImageIcon image = new ImageIcon(ServerChatUI.class.getClassLoader().getResource("Images/west.png"));
		imgJLabel = new JLabel(image);
		// 设置显示输入框
		showJPanel = new JPanel();

		showFieldArea = new JTextArea(30, 32);
		showFieldArea.setBackground(Color.LIGHT_GRAY);
		showFieldArea.setEditable(false);
		showFieldArea.setLineWrap(true);
		showFieldArea.setAutoscrolls(true);
		showFieldArea.setWrapStyleWord(true);
		// 设置输入框
		inputJPanel = new JPanel();

		inputFieldArea = new JTextArea(5, 32);
		inputFieldArea.setWrapStyleWord(true);
		inputFieldArea.setLineWrap(true);
		inputFieldArea.setAutoscrolls(true);
		FieldBorder fieldBorder = new FieldBorder(Color.LIGHT_GRAY,
				Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY);
		inputFieldArea.setBorder(fieldBorder);
		// 添加按钮
		sendButton = new JButton("发送消息");
	}

	public void addComponent() {
		this.setLayout(null);// 设置布局为空，没有默认布局
		this.add(welcomeLabel);
		welcomeLabel.setBounds(425, 370, 200, 20);
		this.add(imgJLabel);
		imgJLabel.setBounds(425, 10, 130, 300);
		// 为显示输入框添加布局
		showJPanel.add(new JScrollPane(showFieldArea));
		this.add(showJPanel);
		showJPanel.setBounds(10, 10, 380, 300);
		// 为输入文本框添加布局
		inputJPanel.add(new JScrollPane(inputFieldArea));
		this.add(inputJPanel);
		inputJPanel.setBounds(10, 330, 380, 100);
		// this.add(inputFieldArea);
		inputFieldArea.setBounds(10, 330, 380, 100);
		// 添加按钮
		this.add(sendButton);
		sendButton.setBounds(290, 450, 90, 25);
	}

	public void addListenner() {
		// 默认关闭窗口事件
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		// 发送消息事件触发
		sendButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				SimpleDateFormat simp = new SimpleDateFormat();
				Date date = new Date();
				simp.format(date);
				String msg = inputFieldArea.getText();
				showFieldArea.append("客户端说：" + date + "\n" + msg + "\n");
				inputFieldArea.setText("");
			}
		});
	}

	public void showServerUI() {

		int localWindowScreenWidth = (int) this.getToolkit().getScreenSize()
				.getWidth();
		int localWindowScreenHeight = (int) this.getToolkit().getScreenSize()
				.getHeight();

		int showInCenterWidth = (localWindowScreenWidth - WINDOW_WIDTH) / 2;
		int showIncenterHeight = (localWindowScreenHeight - WINDOW_HEIGHT) / 2;
		// 设置聊天窗口的，宽和高
		this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		// 设置聊天窗口弹出时的位置。
		this.setLocation(showInCenterWidth, showIncenterHeight);
		this.setVisible(true);
		this.setResizable(false);
	}

	public static void main(String[] args) {
	}
}
