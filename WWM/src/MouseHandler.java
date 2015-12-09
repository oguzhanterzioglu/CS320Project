
public class MouseHandler implements MouseListener {

@Override
public void mouseClicked(MouseEvent e) {
	
	 Menu menu = (Menu)e.getSource();
	 
	 int mouseX = e.getX();
	 int mouseY = e.getY();
	 
	 if (mouseX > 100 && mouseX < 180 && mouseY > 20 && mouseY < 60 && menu.gameStarted) {
			menu.game.withdraw();
		
	 }
	 
	 if(mouseX > 270 && mouseX < 530 && mouseY > 460 && mouseY < 540 && !menu.gameStarted) {
		
			try {
				menu.changeScreen();
				menu.gameStarted = true;
				menu.game.start();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	}
	else if(mouseX > 531 & mouseX < 602 & mouseY > 25 & mouseY < 63 && !menu.game.didUsejoker50 && menu.gameStarted)
		try {
			menu.game.use50joker();
		} catch (IOException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		 else if(mouseX > 625 & mouseX < 695 & mouseY > 25 & mouseY < 63 && !menu.game.didUseJokerPhone && menu.gameStarted) {
		 
			try {
				menu.game.usePhonejoker();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	 }
 else if(mouseX > 719 & mouseX < 788 & mouseY > 25 & mouseY < 63 && !menu.game.didUseJokerAudience && menu.gameStarted){

		try {
			menu.game.useAudinceJoker();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	 }
	 
	else if(mouseX > 12 && mouseX < 81 && mouseY > 25 && mouseY < 63) {
		
		try {
			menu.showLevel();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
        else {
		 int selected = -1;
		 
		 if(mouseX > 65 && mouseX < 380 && mouseY > 450 && mouseY < 495) selected = 0;
		 else if(mouseX > 420 && mouseX < 735 && mouseY > 450 && mouseY < 495) selected = 1;
		 else if(mouseX > 65 && mouseX < 380 && mouseY > 525 && mouseY < 570) selected = 2;
		 else if(mouseX > 420 && mouseX < 735 && mouseY > 525 && mouseY < 570) selected = 3;

		 try {
			 if(selected != -1)
			menu.game.selectQuestion(selected);
		} catch (IOException | InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	 }
}
