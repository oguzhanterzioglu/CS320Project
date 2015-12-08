
private int width;
	private int height;
	public Game game;
	private JLabel currentScreen;
	private JLabel questionLabel;
	private JLabel choiceA;
	private JLabel choiceB;
	private JLabel choiceC;
	private JLabel choiceD;
	private JLabel audienceImage;
	private JLabel firstJokerCross;
	private JLabel secondJokerCross;	
	private JLabel thirdJokerCross;
	private JLabel phoneLogo;
	private JLabel phoneAnswer;
	private JLabel moneyTree;
	private JLabel currentQuestion;
	public JLabel time;
	private JLabel prize;
	Clip clip;
	
	public boolean gameStarted =false;

	private Question question;
	private JLabel timerLabel;
	
	public Question getQuestion() {
		return question;
	}

	public Menu(int w, int h) throws IOException {
		width = w;
		height = h;
		this.addMouseListener(new MouseHandler());
		
		questionLabel = new JLabel("");
		questionLabel.setForeground(Color.white);
		questionLabel.setFont(new Font("Serif", Font.PLAIN, 18));
		questionLabel.setBounds(100,260, 700, 200);
		
		timerLabel = new JLabel("");
		timerLabel.setForeground(Color.white);
		timerLabel.setFont(new Font("Serif", Font.PLAIN, 26));
		timerLabel.setBounds(380,10, 200, 50);
		
		choiceA = new JLabel("");
		choiceA.setForeground(Color.white);
		choiceA.setFont(new Font("Serif", Font.PLAIN, 18));
		choiceA.setBounds(100,440, 200, 50);

		choiceB = new JLabel("");
		choiceB.setForeground(Color.white);
		choiceB.setFont(new Font("Serif", Font.PLAIN, 18));
		choiceB.setBounds(460, 440, 200, 50);

		choiceC = new JLabel("");
		choiceC.setForeground(Color.white);
		choiceC.setFont(new Font("Serif", Font.PLAIN, 18));
		choiceC.setBounds(100, 515, 200, 50);

		choiceD = new JLabel("");
		choiceD.setForeground(Color.white);
		choiceD.setFont(new Font("Serif", Font.PLAIN, 18));
		choiceD.setBounds(460,515, 200, 50);
