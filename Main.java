import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class Main extends JFrame {
	private static final long serialVersionUID = 1L;

	public Main() {
		setLayout(new GridLayout(8, 8, 1, 1));
		for (int i = 0; i < 64; i++) {
			Key key = new Key(i);
			key.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					Key key = (Key) e.getSource();
					key.setBackground(Color.black);
					Thread th = new Thread() {

						@Override
						public void run() {
							try {
								Thread.sleep(2000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}

							key.setBackground(Color.white);
						}

					};
					th.start();
				}

			});
			add(key);
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Main();
	}
}
