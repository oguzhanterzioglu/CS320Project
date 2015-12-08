
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
