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
