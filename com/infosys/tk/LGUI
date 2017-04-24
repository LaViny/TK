public class LGUI {
	JFrame jFrame = new JFrame();
	private ImageIcon icon = null;
	private JLabel jLabel = null, userName = null, pwd = null;
	private JTextField usrArea = null;
	private JPasswordField pwdArea = null;
	private JButton regButton = null, logButton = null, restButton = null;

	/**
	 * 无参构造
	 */
	public ServerLoginUI() {
		init();
		packageComponent();
		addListener();
		showFrame();
	}

	/**
	 * 初始化组件
	 */
	public void init() {
		// 初始化图片信息
		icon = new ImageIcon(ChatClientServer.class.getClassLoader().getResource("Images/title.png"));
		// 存入jlabel中
		jLabel = new JLabel(icon);
		// 初始化用户名密码。
		Font font = new Font("宋体", 20, 20);
		userName = new JLabel("用户名:");
		userName.setFont(font);
		userName.setForeground(Color.BLUE);
		Color color = new Color(0, 240, 0);
		pwd = new JLabel("密  码:");
		pwd.setFont(font);
		pwd.setForeground(Color.blue);
		// 文本框，密码框
		usrArea = new JTextField();
		FieldBorder border = new FieldBorder(Color.LIGHT_GRAY, Color.LIGHT_GRAY,
				Color.LIGHT_GRAY, Color.LIGHT_GRAY);
		usrArea.setBorder(border);
		pwdArea = new JPasswordField();
		pwdArea.setBorder(border);
		// 注册按钮，重置按钮
		font = new Font("宋体", 20, 12);
		logButton = new JButton("登录");

		logButton.setFont(font);
		regButton = new JButton("注册");
		restButton = new JButton("重置");
		restButton.setFont(font);
	}

	/**
	 * 组装组件
	 */
	public void packageComponent() {
		// 设置弹出图片为空
		jFrame.setLayout(null);
		// 添加图片
		jFrame.add(jLabel);
		// 设置图片位置
		jLabel.setBounds(0, 0, 320, 126);
		// 将用户名密码加入窗口。
		jFrame.add(userName);
		userName.setBounds(40, 60, 100, 200);
		jFrame.add(pwd);
		pwd.setBounds(40, 100, 100, 200);
		// 将用户名，密码文本框加入窗口
		jFrame.add(usrArea);
		usrArea.setBounds(110, 150, 150, 25);
		jFrame.add(pwdArea);
		pwdArea.setBounds(110, 190, 150, 25);
		// 将登录，注册，重置按钮加入窗口。
		jFrame.add(logButton);
		logButton.setBounds(40, 250, 60, 30);
		jFrame.add(restButton);
		restButton.setBounds(200, 250, 60, 30);
	}

	/**
	 * 添加事件。关闭窗口，登录，重置，等等。
	 */
	public void addListener() {
		// 设置关闭窗口按钮事件。
		jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);

		// 登录事件
		logButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 查看用户是否登录成功。
				String key = usrArea.getText();
				String value = pwdArea.getText();
				try {
					boolean b = ParseProperties.checkLogin(key, value);
					if (b) {
						ServerChatUI chatServerUI = new ServerChatUI(key);
						jFrame.dispose();
					} else {
						JOptionPane.showMessageDialog(null, "用户名或密码错误");
					}
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		// 重置按钮
		restButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				usrArea.setText("");
				pwdArea.setText("");
			}
		});
	}

	/**
	 * 显示一个窗口
	 */
	public void showFrame() {
		// 获取本机屏幕的宽,高
		int x = (int) jFrame.getToolkit().getScreenSize().getWidth();
		int y = (int) jFrame.getToolkit().getScreenSize().getHeight();
		// 设置窗口的弹出位置。默认是又上角。
		int frameWidth = (x - 320) / 2;
		int frameHeight = (y - 350) / 2;
		jFrame.setLocation(frameWidth, frameHeight);
		// 设置窗口的尺寸
		jFrame.setSize(320, 350);
		Color bgColor = new Color(255, 0, 0);
		jFrame.setBackground(bgColor);
		jFrame.setTitle("BrotherTalk");
		// 设置窗口的可见性。
		jFrame.setVisible(true);
		// 设置窗口不可拓展。
		jFrame.setResizable(false);
	}

	public void disFrame() {
		jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		ServerLoginUI chatFram = new ServerLoginUI();
	}
}
