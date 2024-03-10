package templateFrame;

import java.awt.Graphics;

import javax.swing.JFrame;

public class Frame extends JFrame {

	public Frame(String title) {
		super(title);
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 this.setSize(300,300);
		 this.setVisible(true);

	}
	
	@Override
	public void paint(Graphics graphics) {
		super.paint(graphics);
		 String msg = "I rule!!";
		 graphics.drawString(msg, 100, 100);	
	}
	
	public static void main(String[] args) {
		Frame myFrame = new Frame("Head First Design Patterns");

	}
}
