public class Main extends JFrame {

    public Main() throws IOException {

    	setTitle("Kim Milyoner Olmak ƒ∞ster?");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setResizable(false);
        setLocationRelativeTo(null);
        Menu menu = new Menu(800, 600);
        add(menu);
        Game game = new Game(menu);
        menu.game = game;
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                Main ps = null;
				try {
					ps = new Main();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                ps.setVisible(true);
            }
        });
    }
}
