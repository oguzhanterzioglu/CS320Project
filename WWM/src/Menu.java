
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
	public void changeScreen() throws IOException {
		
		currentScreen.setIcon(getImage("image/ana ekran soru paneli.png"));
		revalidate();
	}
	
	public void jokerPhone() throws IOException{
		currentQuestion.setText("");
		if (moneyTree.getIcon() != null) moneyTree.setIcon(null);
		phoneLogo.setIcon(getPhoneImage());
		phoneAnswer.setForeground(Color.white);
		phoneAnswer.setFont(new Font("Serif", Font.PLAIN, 18));
		phoneAnswer.setText("<html>Hmm, I think its: <br>" + (question.getChoices()[question.getCorrectChoice()]) + "</html>");
		secondJokerCross.setIcon(getCrossImage());
		revalidate();
		
	}
	
	public ImageIcon getMoneyTree() throws IOException {
		
		ImageIcon img = new ImageIcon(ImageIO.read(new File("image/panel.png")).getScaledInstance(190, 270, Image.SCALE_SMOOTH));
		
		return img;
	}
	
	public ImageIcon getPhoneImage() throws IOException {
		
		ImageIcon img = new ImageIcon(ImageIO.read(new File("image/phone.png")).getScaledInstance(40, 40, Image.SCALE_SMOOTH));
		
		return img;
	}
	public void joker50() throws IOException  {
		currentQuestion.setText("");
		if (moneyTree.getIcon() != null) moneyTree.setIcon(null);
		try {
			currentScreen.setIcon(getImage("image/yuzde50.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int counter = 0;
		int prev = 0;
		while(counter<2) {
			
			int i = new Random().nextInt(question.getChoices().length);
			if (i != question.getCorrectChoice() && i!=prev) {
				prev = i;
				question.getChoices()[i] = "";
				counter++;
			}	
			
		}
		firstJokerCross.setIcon(getCrossImage());

		show();
	}
	public void jokerAudience() throws IOException {
		
		currentQuestion.setText("");
		moneyTree.setIcon(null);
		if(question.getCorrectChoice() == 0)	audienceImage.setIcon(getAudienceImage("image/seyirciA.png"));
		else if(question.getCorrectChoice() == 1) audienceImage.setIcon(getAudienceImage("image/seyirciB.png"));
		else if(question.getCorrectChoice() == 2) audienceImage.setIcon(getAudienceImage("image/seyirciC.png"));
		else if(question.getCorrectChoice() == 3) audienceImage.setIcon(getAudienceImage("image/seyirciD.png"));
		thirdJokerCross.setIcon(getCrossImage());

		revalidate();
	}
	
	public ImageIcon getCrossImage() throws IOException {
		
		ImageIcon img = new ImageIcon(ImageIO.read(new File("image/cross.png")).getScaledInstance(40, 30, Image.SCALE_SMOOTH));
		
		return img;
	}
	
	public ImageIcon getImage(String filename) throws IOException {
		
		ImageIcon img = new ImageIcon(ImageIO.read(new File(filename)).getScaledInstance(width, height-25, Image.SCALE_SMOOTH));
		
		return img;
	}
	public ImageIcon getAudienceImage(String filename) throws IOException{
		
		ImageIcon img = new ImageIcon(ImageIO.read(new File(filename)).getScaledInstance(200, 250, Image.SCALE_SMOOTH));
		
		return img;
	}

	public void showWrong(int index) throws IOException {
		try
	    {
	        clip = AudioSystem.getClip();
	        clip.open(AudioSystem.getAudioInputStream(new File("sound/lose.wav")));
	        clip.start();
	    }
	    catch (Exception exc)
	    {
	        exc.printStackTrace(System.out);
	    }		
		
		switch (index) {
			case 0:
				currentScreen.setIcon(getImage("image/asikkipaneli.png"));
				break;
			case 1:
				currentScreen.setIcon(getImage("image/bsikkipaneli.png"));
				break;
			case 2:
				currentScreen.setIcon(getImage("image/csikkipaneli.png"));
				break;
			case 3:
				currentScreen.setIcon(getImage("image/dsikkipaneli.png"));
				break;
		}
		
		revalidate();
	}

	public void showCorrect() throws IOException {
		switch(question.getCorrectChoice()) {
		case 0:
			currentScreen.setIcon(getImage("image/asikkidogru.png"));
			break;
		case 1:
			currentScreen.setIcon(getImage("image/bsikkidogru.png"));
			break;
		case 2:
			currentScreen.setIcon(getImage("image/csikkidogru.png"));
			break;
		case 3:
			currentScreen.setIcon(getImage("image/dsikkidogru.png"));
			break;	
		}
		
		revalidate();
		
	}

	public void showVictory(int prize) {
		
		this.prize.setText("Your Prize: " + prize);
		try {
			mainScreen();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void wrongAnswer(){

		this.prize.setText("Your Prize: " + game.getPrize(true));
		try {
			mainScreen();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void toggleAnswer() {
		if(question.getCorrectChoice() == 0) {
			if (!choiceA.getText().equals(""))
				choiceA.setText("");
			else
				choiceA.setText("A) " + question.getChoices()[question.getCorrectChoice()]);
		}
		else if(question.getCorrectChoice() == 1) {
			if (!choiceB.getText().equals(""))
				choiceB.setText("");
			else
				choiceB.setText("B) " + question.getChoices()[question.getCorrectChoice()]);
		}
		else if(question.getCorrectChoice() == 2) {
			if (!choiceC.getText().equals(""))
				choiceC.setText("");
			else
				choiceC.setText("C) " + question.getChoices()[question.getCorrectChoice()]);
		}
		else if(question.getCorrectChoice() == 3) {
			if (!choiceD.getText().equals(""))
				choiceD.setText("");
			else
				choiceD.setText("D) " + question.getChoices()[question.getCorrectChoice()]);
		}

		revalidate();
	}
}

