import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.Timer;

public class Game {

	public QuestionPool questionpool;
	public Menu menu;
	public int currentQuestion;
	public boolean didUsejoker50;
	public boolean didUseJokerPhone;
	public boolean didUseJokerAudience;
	private Timer timer;
	private Timer timer2;
	private Timer blinktimer;
	private Timer remaining;
	private int timertick;
	
	private int prizes[] = new int[12];
	
	public Game(Menu m) {
		prizes[0] = 500;
		prizes[1] = 1000;
		prizes[2] = 2000;
		prizes[3] = 3000;
		prizes[4] = 5000;
		prizes[5] = 7500;
		prizes[6] = 15000;
		prizes[7] = 30000;
		prizes[8] = 60000;
		prizes[9] = 125000;
		prizes[10] = 250000;
		prizes[11] = 1000000;
		
		timertick = 0;
		menu = m;
		remaining = new Timer(1000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				timertick++;
				menu.setTime(timertick);
				if (timertick >= 15) {

					try {
						menu.mainScreen();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					remaining.stop();
				}
			}
		});
		remaining.setInitialDelay(1000);

		questionpool = new QuestionPool();
	}
public void start() {
		timertick = 0;
		remaining.start();
		menu.setQuestion(questionpool.getQuestion(currentQuestion));
		menu.show();
	}

	public void restart() {
		timertick = 0;
		currentQuestion = 0;
		didUsejoker50 = false;
		didUseJokerPhone = false;
		didUseJokerAudience = false;
	}
	
	public int getPrize(boolean fail) {
		if (fail) {
			if (currentQuestion > 6)
				return prizes[6];
			else if (currentQuestion > 1)
				return prizes[1];
			else
				return 0;
		}
		else {
			return prizes[currentQuestion-1];
		}
		
	}
 
	public Question getCurrentQuestion() {
		return menu.getQuestion();
	}

	public void selectQuestion(int index) throws IOException, InterruptedException {
		if (index != getCurrentQuestion().getCorrectChoice()) {
			menu.showWrong(index);

			blinktimer = new Timer(500, new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					menu.toggleAnswer();
				}
			});
			
			blinktimer.start();
			
			timer2 = new Timer(1000, new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					menu.showVictory(getPrize(true));
					timer.stop();
				}
			});
			
			timer = new Timer(5000, new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					blinktimer.stop();
					menu.wrongAnswer();
					timer.stop();
				}
			});

			remaining.stop();
			timer.start();
		}
		else {
			menu.showCorrect();

			timer = new Timer(1000, new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Game.this.nextQuestion();
					timer.stop();
				}
			});
			timer.start();
		}
	}

	public void usePhonejoker() throws IOException{

		didUseJokerPhone = true;
		menu.jokerPhone();
	}
	public void use50joker() throws IOException{

		didUsejoker50 = true;
		menu.joker50();
	}

	public void useAudinceJoker() throws IOException{

		didUseJokerAudience = true;
		menu.jokerAudience();
	}
	public void nextQuestion() {
		currentQuestion++;
		timertick = 0;

		if (checkWin()) {
			remaining.stop();
			menu.showVictory(getPrize(false));
		}
		else {
			menu.setQuestion(questionpool.getQuestion(currentQuestion));
			menu.show();
			remaining.stop();
			remaining.start();
		}
	}

	public boolean checkWin() {
		if (currentQuestion >= questionpool.questionPool.size()) {
			return true;
		}
		else {
			return false;
		}
	}

	public void withdraw() {

		menu.showVictory(getPrize(true));

		remaining.stop();
		
		
		timer = new Timer(5000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					menu.mainScreen();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				timer.stop();
			}
		});
	}
}
