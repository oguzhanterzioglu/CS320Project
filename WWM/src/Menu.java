
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
		audienceImage = new JLabel("");
		audienceImage.setBounds(500,80,200,250);
		phoneLogo = new JLabel("");
		phoneLogo.setBounds(80, 80, 50, 50);
		phoneAnswer = new JLabel("");
		phoneAnswer.setBounds(80, 130, 120, 70);
		
		time = new JLabel("");
		time.setBounds(385,480, 35, 35);
		time.setForeground(Color.orange);
		time.setFont(new Font("Serif", Font.PLAIN, 32));
		
		firstJokerCross = new JLabel("");
		firstJokerCross.setBounds(540, 22, 50, 30);
		secondJokerCross = new JLabel("");
		secondJokerCross.setBounds(630, 22, 50, 30);
		thirdJokerCross = new JLabel("");
		thirdJokerCross.setBounds(730, 22, 50, 30);
		
		moneyTree = new JLabel("");
		moneyTree.setBounds(10,60, 190, 270);
		currentQuestion = new JLabel("");
		currentQuestion.setBounds(15, 60, 200, 50);
		currentQuestion.setForeground(Color.white);
		currentQuestion.setFont(new Font("Serif", Font.PLAIN, 18));
		
		prize = new JLabel("Your Prize: 0");
		prize.setBounds(225, 325, 500, 75);
		prize.setForeground(Color.white);
		prize.setFont(new Font("Serif", Font.PLAIN, 44));

		currentScreen = new JLabel(getImage("image/ana ekran.png"));
		currentScreen.add(questionLabel);
		currentScreen.add(timerLabel);
		currentScreen.add(choiceA);
		currentScreen.add(choiceB);
		currentScreen.add(choiceC);
		currentScreen.add(choiceD);
		currentScreen.add(audienceImage);
		currentScreen.add(firstJokerCross);
		currentScreen.add(secondJokerCross);
		currentScreen.add(thirdJokerCross);
		currentScreen.add(phoneAnswer);
		currentScreen.add(phoneLogo);
		currentScreen.add(time);
		currentScreen.add(currentQuestion);
		currentScreen.add(moneyTree);
		currentScreen.add(prize);
		this.add(currentScreen);
	}
         public void setTime(int time) {
		
		timerLabel.setText(""+(15 - time));
	 }
public void showLevel() throws IOException{
		moneyTree.setIcon(getMoneyTree());
		currentQuestion.setText("Current question:  " + (game.currentQuestion+1) );
		
		revalidate();
	}
	
	public void show() {
		
		if(game.currentQuestion == 0) {
			try
		    {
		        clip = AudioSystem.getClip();
		        clip.open(AudioSystem.getAudioInputStream(new File("sound/sound.wav")));
		        clip.start();
		    }
		    catch (Exception exc)
		    {
		        exc.printStackTrace(System.out);
		    }
			
		}
else {
			clip.stop();

		}
		prize.setText("");
	    audienceImage.setIcon(null);
		phoneLogo.setIcon(null);
		phoneAnswer.setText("");
		timerLabel.setText("");
		questionLabel.setText(question.getQuestion());
		choiceA.setText("A) " + question.getChoices()[0]);
		choiceB.setText("B) " + question.getChoices()[1]);
		choiceC.setText("C) " + question.getChoices()[2]);
		choiceD.setText("D) " + question.getChoices()[3]);
		try {
			currentScreen.setIcon(getImage("image/ana ekran soru paneli.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		revalidate();
	}

	public void setQuestion(Question question) {
		
		this.question = question;
	}
	
	public void mainScreen() throws IOException {
		
		questionLabel.setText("");
		choiceA.setText("");
		choiceB.setText("");
		choiceC.setText("");
		timerLabel.setText("");
		choiceD.setText("");
		secondJokerCross.setIcon(null);
		firstJokerCross.setIcon(null);
		thirdJokerCross.setIcon(null);
		audienceImage.setIcon(null);
		phoneLogo.setIcon(null);
		phoneAnswer.setText("");
		currentQuestion.setText("");
		if (moneyTree.getIcon() != null) moneyTree.setIcon(null);
		gameStarted = false;
		game.restart();
		currentScreen.setIcon(getImage("image/ana ekran.png"));
		revalidate();
	}
	
