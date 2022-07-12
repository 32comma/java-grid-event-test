import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Key extends JPanel {
	private static final long serialVersionUID = 1L;
	private int reference;
	
	public int getReference() {
		return reference;
	}

	public void setReference(int reference) {
		this.reference = reference;
	}

	public Key(int reference) {
		this.reference = reference;
		System.out.println(reference);
		this.setBackground(Color.white);
	}

	

}
