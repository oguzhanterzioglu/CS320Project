import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main extends JFrame {

    public Main() throws IOException {

    	setTitle("Kim Milyoner Olmak İster?");  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setResizable(false);
        setLocationRelativeTo(null);
        Menu menu = new Menu(800, 600);
        add(menu);
        Game game = new Game(menu);
        menu.game = game;
    }
 
    
